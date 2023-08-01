package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;


@WebServlet(name = "CrearCapacitacion", value = "/CrearCapacitacion")
public class CrearCapacitacion extends HttpServlet {

    public CrearCapacitacion() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("CrearCapacitacion.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        request.setAttribute("rutCliente", request.getParameter("rutCliente"));
        request.setAttribute("dia", request.getParameter("dia"));
        request.setAttribute("hora", request.getParameter("hora"));
        request.setAttribute("lugar", request.getParameter("lugar"));
        request.setAttribute("duracion", request.getParameter("duracion"));
        request.setAttribute("cantAsistentes", Integer.parseInt(request.getParameter("cantAsistentes")));


        request.getRequestDispatcher("CrearCapacitacion.jsp").forward(request,response);

    }

}
