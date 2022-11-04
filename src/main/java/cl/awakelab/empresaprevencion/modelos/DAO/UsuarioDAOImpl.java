package cl.awakelab.empresaprevencion.modelos.DAO;

import cl.awakelab.empresaprevencion.modelos.ConexionSingletonMySQL;
import cl.awakelab.empresaprevencion.modelos.Usuario;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOImpl implements IUsuarioDAO {

        private Connection conn = null;


    @Override
    public void create(Usuario u) {

        String sql = "insert into usuario (nombreUsuario, nacimientoUsuario, runUsuario, tipoUsuario) values ('" +
                u.getNombre() + "', '"  + u.getNacimiento() + "', '" + u.getRun() + "', '" + u.getTipo() + "')";

        try {
            conn = ConexionSingletonMySQL.getConnection();
            Statement stm = conn.createStatement();
            stm.execute(sql);
            stm.close();

        }   catch (SQLException e) {
                e.printStackTrace();

        }

    }

    @Override
    public List<Usuario> readAll() {

        String sql = "select idUsuario, nombreUsuario, nacimientoUsuario, runUsuario, tipoUsuario from usuario";
        List <Usuario> users = new ArrayList<>();

        try {
            conn = ConexionSingletonMySQL.getConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {

                users.add(new Usuario(rs.getInt("idUsuario"), rs.getString("nombreUsuario"), rs.getString("nacimientoUsuario"),
                        rs.getInt("runUsuario"), rs.getString("tipoUsuario")));

            }
            rs.close();
            stm.close();



        }   catch (SQLException e) {
                e.printStackTrace();

        }
        return users;

    }



    @Override
    public Usuario readOne(int idUsuario) {
        String sql = "select idUsuario, nombreUsuario, nacimientoUsuario, runUsuario, tipoUsuario from usuario where idUsuario = '"+ idUsuario +"'";
        Usuario u = null;

        try {

            conn = ConexionSingletonMySQL.getConnection();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            if (rs.next()){

                u = new Usuario(rs.getInt("idUsuario"),
                        rs.getString("nombreUsuario"),
                        rs.getString("nacimientoUsuario"),
                        rs.getInt("runUsuario"),
                        rs.getString("tipo"));

            }

            rs.close();
            stm.close();

            } catch (SQLException e) {
                e.printStackTrace();


        } return u;

     }


     @Override
    public void update(Usuario u) {
        String sql = "update usuario set nombreUsuario = '" + u.getNombre() + "'," +
                "nacimientoUsuario = '" + u.getNacimiento() + "', runUsuario ='" +
                u.getRun() + "'where idUsuario ='" + u.getIdUsuario() + "'";


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
    public void delete(int id) {

        String sql = "delete from usuario where idUsuario = '"+ id +"'";


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
