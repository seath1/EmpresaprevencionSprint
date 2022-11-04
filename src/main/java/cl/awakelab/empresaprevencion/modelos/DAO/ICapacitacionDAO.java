 package cl.awakelab.empresaprevencion.modelos.DAO;

 import cl.awakelab.empresaprevencion.modelos.Capacitacion;
 import cl.awakelab.empresaprevencion.modelos.Usuario;

 import java.util.List;

 public interface ICapacitacionDAO {

        public void create (Capacitacion c);
        public List<Capacitacion> readAll();
        public Capacitacion readOne (int id);
        public void update (Capacitacion c);
        public void delete (int id);

}


