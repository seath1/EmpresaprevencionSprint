package cl.awakelab.empresaprevencion.servlets;

import cl.awakelab.empresaprevencion.modelos.DAO.UsuarioDAOImpl;
import cl.awakelab.empresaprevencion.modelos.Usuario;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "UsuariosServlet", value = "/usuarios")
public class UsuariosServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        UsuarioDAOImpl usuarioDao =  new UsuarioDAOImpl();
        List <Usuario> usuarios = usuarioDao.readAll();
        request.setAttribute("usuarios", usuarios);
        getServletContext().getRequestDispatcher("/views/usuarios.jsp").forward(request, response);



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);


    }
}
