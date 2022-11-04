package cl.awakelab.empresaprevencion.modelos.DAO;

import cl.awakelab.empresaprevencion.modelos.Capacitacion;
import cl.awakelab.empresaprevencion.modelos.ConexionSingletonMySQL;
import cl.awakelab.empresaprevencion.modelos.Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CapacitacionDAOImpl implements ICapacitacionDAO {

    private Connection conn = null;


    @Override
    public void create(Capacitacion c) {

        String sql = "insert into capacitacion (nombreCapacitacion, empresaCapacitacion, fechaCapacitacion, ciudadCapacitacion, cantidadCapacitacion) " +
                "values ('" + c.getNombreCapacitacion() + "', '" + c.getEmpresaCapacitacion() + "', '" + c.getFechaCapacitacion()
                + "', '" + c.getCiudadCapacitacion() + "', '" + c.getParticipantesCapacitacion() + "')";

        try {
            conn = ConexionSingletonMySQL.getConnection();
            Statement stm = conn.createStatement();
            stm.execute(sql);
            stm.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }

    }

    @Override
    public List<Capacitacion> readAll() {


        String sql = "select idCapacitacion, nombreCapacitacion, empresaCapacitacion, fechaCapacitacion, ciudadCapacitacion, cantidadCapacitacion  from capacitacion";
        List <Capacitacion> capacitaciones = new ArrayList<>();

        try {
            conn = ConexionSingletonMySQL.getConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {

                capacitaciones.add(new Capacitacion(rs.getInt("idCapacitacion"), rs.getString("nombreCapacitacion"), rs.getString("empresaCapacitacion"),
                rs.getString("fechaCapacitacion"), rs.getString("ciudadCapacitacion"), rs.getInt("cantidadCapacitacion")));

            }
            rs.close();
            stm.close();



        }   catch (SQLException e) {
            e.printStackTrace();

        }
        return capacitaciones;
    }




    @Override
    public Capacitacion readOne(int idCapacitacion) {
        String sql = "select select idCapacitacion, nombreCapacitacion, empresaCapacitacion, fechaCapacitacion, ciudadCapacitacion, cantidadCapacitacion from capacitacion where idCapacitacion = '"+ idCapacitacion +"'";
        Capacitacion c = null;

        try {

            conn = ConexionSingletonMySQL.getConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            if (rs.next()){

                c = new Capacitacion(rs.getInt("idCapacitacion"),
                        rs.getString("nombreCapacitacion"),
                        rs.getString("empresaCapacitacion"),
                        rs.getString("fechaCapacitacion"),
                        rs.getString("ciudadCapacitacion"),
                        rs.getInt("cantidadCapacitacion"));
            }

            rs.close();
            stm.close();

        } catch (SQLException e) {
            e.printStackTrace();


        } return c;

    }


    @Override
    public void update(Capacitacion c) {

        String sql = "update capacitacion set nombreCapacitacion = '" + c.getNombreCapacitacion() + "'," +
                "empresaCapacitacion = '" + c.getEmpresaCapacitacion() + "', fechaCapacitacion ='" + c.getFechaCapacitacion()
                + "', ciudadCapacitacion ='" + c.getCiudadCapacitacion() + "', cantidadCapacitacion ='" + c.getNombreCapacitacion()
                + "'where idUsuario ='" + c.getIdCapacitacion() + "'";

        try {

            conn = ConexionSingletonMySQL.getConnection();
            Statement stm = conn.createStatement();
            stm.execute(sql);
            stm.close();

        } catch (SQLException e) {

            e.printStackTrace();

        }


    }

    @Override
    public void delete(int idCapacitacion) {

        String sql = "delete from capacitacion where idCapacitacion = '"+ idCapacitacion +"'";


        try {

            conn = ConexionSingletonMySQL.getConnection();
            Statement stm = conn.createStatement();
            stm.execute(sql);
            stm.close();


        } catch (SQLException e) {
            e.printStackTrace();

        }




    }


}



