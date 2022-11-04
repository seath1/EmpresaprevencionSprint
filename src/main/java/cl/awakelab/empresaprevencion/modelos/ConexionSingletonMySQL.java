package cl.awakelab.empresaprevencion.modelos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSingletonMySQL {

    private static Connection conn = null;

    private ConexionSingletonMySQL() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/prevencion", "root", "root");
            if (conn != null) {
                System.out.println("Conexión correcta!");
            } else {
                System.out.println("Falló la conexión");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        if (conn == null) {
            new ConexionSingletonMySQL();
        }
        return conn;
    }




}
