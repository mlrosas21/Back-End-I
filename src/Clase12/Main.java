package Clase12;


import org.apache.log4j.Logger;

import java.sql.*;

public class Main {
    // inicio el logger
    private static final Logger logger = Logger.getLogger(Clase11.Main.class);

    //creo la conexión a la base de datos
    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test","sa","");
    }

    // creo las sentencias sql
    // crear tabla
    private static final String crearTabla = "DROP TABLE IF EXISTS EMPLEADOS; CREATE TABLE EMPLEADOS "
            + "("
            + "ID INT PRIMARY KEY, "
            + "NOMBRE varchar(25) NOT NULL, "
            + "EDAD TINYINT,"
            + "NACIONALIDAD VARCHAR(25),"
            + "ALTURA FLOAT"
            + ")";

    // inserto los objetos
    private static final String insert1 = "INSERT INTO EMPLEADOS (ID, NOMBRE, EDAD, NACIONALIDAD, ALTURA) VALUES (1, 'Martin', 26, 'Argentina', 1.86)";
    private static final String insert2 = "INSERT INTO EMPLEADOS (ID, NOMBRE, EDAD, NACIONALIDAD, ALTURA) VALUES (2, 'Anto', 27, 'Argentina', 1.52)";
    private static final String insert3 = "INSERT INTO EMPLEADOS (ID, NOMBRE, EDAD, NACIONALIDAD, ALTURA) VALUES (3, 'Leia', 10, 'Uruguaya', 0.35)";

    // CRUD
    private static final String updateLeia = "UPDATE EMPLEADOS SET NACIONALIDAD='Perruna' WHERE NOMBRE='Leia'";
    private static final String removeId2 = "DELETE FROM EMPLEADOS WHERE ID=2";
    private static final String removeLeia = "DELETE FROM EMPLEADOS WHERE NOMBRE='Leia'";

    // queries
    private static final String querySelectAll = "SELECT * FROM EMPLEADOS";
    private static final String querySelectId3 = "Select * FROM EMPLEADOS WHERE ID=3";

    // creo el metodo para mostrar la información, pasándole como parámetro la query
    public static void verQuery (Connection connection, String consulta) throws SQLException {
        Statement stm = connection.createStatement();
        ResultSet resultado = stm.executeQuery(consulta);
        while(resultado.next()){
            System.out.println(resultado.getInt(1)+" "+resultado.getString(2)+" "+resultado.getString(3)+" "+resultado.getString(4)+" "+resultado.getFloat(5));
        }
    }

    public static void main(String[] args) throws Exception {
        Connection connection = null;
        try {
            connection = getConnection();
            Statement stm = connection.createStatement();
            stm.execute(crearTabla);
            stm.execute(insert1);
            stm.execute(insert2);
            stm.execute(insert3);
            verQuery(connection, querySelectAll);
            logger.info("Modificando nacionalidad de Leia");
            stm.execute(updateLeia);
            verQuery(connection, querySelectAll);
            verQuery(connection, querySelectId3);
            logger.info("Borrando ID 2");
            stm.execute(removeId2);
            verQuery(connection, querySelectAll);
            logger.info("Borrando Leia");
            stm.execute(removeLeia);
            verQuery(connection, querySelectAll);

        }catch (Exception e){
            logger.error(e);
        }
        finally{
            try {
                logger.info("Se cierra conexión a DB");
                connection.close();
            } catch (Exception e) {
                logger.error(e);
            }
        }
    }
}
