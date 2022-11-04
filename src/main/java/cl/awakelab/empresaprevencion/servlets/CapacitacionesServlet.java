package cl.awakelab.empresaprevencion.servlets;

import cl.awakelab.empresaprevencion.modelos.Capacitacion;
import cl.awakelab.empresaprevencion.modelos.DAO.CapacitacionDAOImpl;
import cl.awakelab.empresaprevencion.modelos.DAO.UsuarioDAOImpl;
import cl.awakelab.empresaprevencion.modelos.Usuario;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "CapacitacionesServlet", value = "/capacitaciones")

public class CapacitacionesServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        CapacitacionDAOImpl capacitacionDAO =  new CapacitacionDAOImpl();
        List<Capacitacion> capacitaciones = capacitacionDAO.readAll();
        request.setAttribute("capacitaciones", capacitaciones);
        getServletContext().getRequestDispatcher("/views/capacitaciones.jsp").forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request,response);

    }
}
