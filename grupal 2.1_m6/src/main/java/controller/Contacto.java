package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "Contacto", value = "/Contacto")
public class Contacto extends HttpServlet {

    public Contacto() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("Contacto.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("nombreSalida", request.getParameter("nombre"));
        request.setAttribute("correoSalida", request.getParameter("correo"));
        request.setAttribute("comentarioSalida", request.getParameter("comentario"));

        System.out.println(request.getParameter("nombre"));
        System.out.println(request.getParameter("correo"));
        System.out.println(request.getParameter("comentario"));

        request.getRequestDispatcher("Contacto.jsp").forward(request, response);

    }

}