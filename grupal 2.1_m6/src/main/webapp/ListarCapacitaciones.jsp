
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <head>
        <meta charset="UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Archivo+Black&display=swap">
        <title>Listar Capacitaciones</title>
    </head>
</head>
<body>

<%@include file="navbar.jsp" %>

<div class="text-center my-5">
    <h2>
        Lista de Capacitaciones
    </h2>
</div>

<div class="table-container d-flex justify-content-center align-items-center">
    <table class="table table-dark table-hover">
        <thead>
        <tr>
            <th scope="col">Rut Cliente</th>
            <th scope="col">Dia</th>
            <th scope="col">Hora</th>
            <th scope="col">Lugar</th>
            <th scope="col">Duración</th>
            <th scope="col">Cantidad de Asistentes</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td><%= request.getParameter("rutCliente")%></td>
            <td><%= request.getParameter("dia")%></td>
            <td><%= request.getParameter("hora")%></td>
            <td><%= request.getParameter("lugar")%></td>
            <td><%= request.getParameter("duracion")%></td>
            <td><%= request.getParameter("cantAsistentes")%></td>
        </tr>
        </tbody>
    </table>
</div>

<div class="container my-5">
    <%@include file="footer.jsp" %>
</div>
</body>
</html>