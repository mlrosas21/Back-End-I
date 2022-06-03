package Clase13;

import java.sql.*;

public class Main {
    //creo la conexión a la base de datos
    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test","sa","");
    }

    // creo las sentencias sql
    // crear tabla
    private static final String CREAR_TABLA_SQL = "DROP TABLE IF EXISTS ODONTOLOGOS; CREATE TABLE ODONTOLOGOS "
            + "("
            + "ID INT PRIMARY KEY, "
            + "APELLIDO VARCHAR(50) NOT NULL, "
            + "NOMBRE VARCHAR(50) NOT NULL,"
            + "MATRICULA VARCHAR(25)"
            + ")";

    private static final String INSERT_SQL = "INSERT INTO ODONTOLOGOS (ID, APELLIDO, NOMBRE, MATRICULA) VALUES (?, ?, ?, ?)";

    private static final String UPDATE_SQL = "UPDATE ODONTOLOGOS SET MATRICULA=? WHERE MATRICULA=?";

    private static void verAll(Connection conex) throws Exception {
        String selectAll = "SELECT * FROM ODONTOLOGOS";
        Statement stmt = conex.createStatement();
        ResultSet rs = stmt.executeQuery(selectAll);
        while (rs.next()){
            System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3) + rs.getString(4));
        }
    }


    public static void main(String[] args) throws Exception {
        Connection conexion = null;
        try {
            Odontologo odontologo = new Odontologo("Rosas", "Martin", "ABC123");
            conexion = getConnection();
            Statement stmt = conexion.createStatement();
            stmt.execute(CREAR_TABLA_SQL);

            PreparedStatement ps = conexion.prepareCall(INSERT_SQL);
            ps.setInt(1, 1);
            ps.setString(2, odontologo.getApellido());
            ps.setString(3, odontologo.getNombre());
            ps.setString(4, odontologo.getMatricula());

            ps.execute();

            verAll(conexion);

            conexion.setAutoCommit(false);

            PreparedStatement ps1 = conexion.prepareCall(UPDATE_SQL);
            ps1.setString(1, "DEF456");
            ps1.setString(2, "ABC123");
            ps1.execute();
            int a = 4/0;

            conexion.commit();
            verAll(conexion);

        } catch (Exception e) {
            conexion.rollback();
            verAll(conexion);
        } finally {
            conexion.close();
        }
    }
}
