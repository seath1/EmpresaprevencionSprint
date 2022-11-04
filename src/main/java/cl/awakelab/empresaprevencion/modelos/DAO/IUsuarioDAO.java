package cl.awakelab.empresaprevencion.modelos.DAO;

import cl.awakelab.empresaprevencion.modelos.Usuario;

import java.util.List;

public interface IUsuarioDAO {


            public void create(Usuario u);
            public List<Usuario> readAll();
            public Usuario readOne (int id);
            public void update (Usuario u);
            public void delete (int id);





}
