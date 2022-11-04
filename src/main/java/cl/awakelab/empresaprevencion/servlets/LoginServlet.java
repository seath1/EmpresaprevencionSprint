package cl.awakelab.empresaprevencion.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = request.getParameter("usuario");
        String clave = request.getParameter("clave");

        if(usuario.equals("admin") && clave.equals("1234")){
            getServletContext().getRequestDispatcher("/views/index.jsp").forward(request, response);
        }else{
            getServletContext().getRequestDispatcher("/views/login.jsp").forward(request, response);

        }
    }
}
