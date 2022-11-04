package cl.awakelab.empresaprevencion.servlets;

import cl.awakelab.empresaprevencion.modelos.DAO.UsuarioDAOImpl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "EliminarUsuarioServlet", value = "/eliminarusuario")
public class EliminarUsuarioServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Integer id = Integer.parseInt(request.getParameter("id"));
        UsuarioDAOImpl usuarioDAO = new UsuarioDAOImpl();
        usuarioDAO.delete(id);
        response.sendRedirect("usuarios");




    }
}
