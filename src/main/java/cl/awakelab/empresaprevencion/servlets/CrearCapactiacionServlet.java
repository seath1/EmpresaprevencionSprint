package cl.awakelab.empresaprevencion.servlets;

import cl.awakelab.empresaprevencion.modelos.Capacitacion;
import cl.awakelab.empresaprevencion.modelos.DAO.CapacitacionDAOImpl;
import cl.awakelab.empresaprevencion.modelos.DAO.UsuarioDAOImpl;
import cl.awakelab.empresaprevencion.modelos.Usuario;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "CrearCapactiacionServlet", value = "/crearcapacitacion")
public class CrearCapactiacionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/views/crearCapacitacion.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        CapacitacionDAOImpl capacitacionDAO = new CapacitacionDAOImpl();
        Capacitacion c = new Capacitacion(request.getParameter("nombreCapacitacion"),
                request.getParameter("empresaCapacitacion"),
                request.getParameter("fechaCapacitacion"),
                request.getParameter("ciudadCapacitacion"),
                Integer.parseInt(request.getParameter("cantidadCapacitacion")));
                capacitacionDAO .create(c);


        request.getRequestDispatcher("/views/crearCapacitacion.jsp").forward(request,response);




    }
}

