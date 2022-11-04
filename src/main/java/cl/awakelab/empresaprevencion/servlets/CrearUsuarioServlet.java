package cl.awakelab.empresaprevencion.servlets;

import cl.awakelab.empresaprevencion.modelos.DAO.UsuarioDAOImpl;
import cl.awakelab.empresaprevencion.modelos.Usuario;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "CrearUsuarioServlet", value = "/crearusuario")
public class CrearUsuarioServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/views/crearUsuario.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UsuarioDAOImpl usuarioDAO = new UsuarioDAOImpl();
        Usuario u = new Usuario(request.getParameter("nombreUsuario"), request.getParameter("nacimientoUsuario"),
        Integer.parseInt(request.getParameter("runUsuario")), request.getParameter("tipoUsuario"));
        usuarioDAO.create(u);


        request.getRequestDispatcher("/views/crearUsuario.jsp").forward(request,response);





    }
}
