package cl.awakelab.empresaprevencion.modelos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Singleton {

    public static void main (String[] args) {

        try {
            //paso 1: obtener conexion
            Connection conn = ConexionSingletonMySQL.getConnection();
            //paso 2: crear statement
            Statement stmt = conn.createStatement();
            //paso 3: ejecutar query
            ResultSet rs = stmt.executeQuery("select * from cliente");
            //paso 4: leer resultados registro a registro
            while(rs.next()){
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }
            //paso 5: cerrar conexion
            conn.close();
        } catch (SQLException exception){
            exception.printStackTrace();
        }






    }

}
