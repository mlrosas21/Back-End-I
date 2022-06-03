package Clase11;

import org.apache.log4j.Logger;

import java.sql.*;

public class Main {
    // inicio el logger
    private static final Logger logger = Logger.getLogger(Main.class);

    //creo la conexión a la base de datos
    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test","sa","");
    }

    // creo las sentencias sql
    // crear tabla
    private static final String crearTabla = "DROP TABLE IF EXISTS FIGURAS; CREATE TABLE FIGURAS "
            + "("
            + "ID INT PRIMARY KEY, "
            + "TIPO varchar(20) NOT NULL, "
            + "COLOR varchar(20) NOT NULL "
            + ")";

    // inserto los objetos
    private static final String insert1 = "INSERT INTO FIGURAS (ID, TIPO, COLOR) VALUES (1, 'circulo', 'rojo')";
    private static final String insert2 = "INSERT INTO FIGURAS (ID, TIPO, COLOR) VALUES (2, 'circulo', 'azul')";
    private static final String insert3 = "INSERT INTO FIGURAS (ID, TIPO, COLOR) VALUES (3, 'circulo', 'amarillo')";
    private static final String insert4 = "INSERT INTO FIGURAS (ID, TIPO, COLOR) VALUES (4, 'circulo', 'rojo')";
    private static final String insert5 = "INSERT INTO FIGURAS (ID, TIPO, COLOR) VALUES (5, 'circulo', 'violeta')";

    // query
    private static final String querySelectAll = "SELECT * FROM FIGURAS WHERE TIPO='circulo' AND COLOR='rojo'";

    // creo el metodo para mostrar la información, pasándole como parámetro la query
    public static void verQuery (Connection connection, String consulta) throws SQLException {
        Statement stm = connection.createStatement();
        ResultSet resultado = stm.executeQuery(consulta);
        while(resultado.next()){
            System.out.println(resultado.getInt(1)+resultado.getString(2)+resultado.getString(3));
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
            stm.execute(insert4);
            stm.execute(insert5);
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
