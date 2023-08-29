<%@page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Archivo+Black&display=swap">
    <title>Crear Usuario</title>
</head>
<body>
    <div>
        <%@include file="navbar.jsp" %>
    </div>

    <div class="container my-3">
        <div class="text-center my-5">
            <h2>Formulario para Crear Usuario</h2>
        </div>
        <form action="<c:url value='/guardarUsuario' />" method="POST" id="crearUsuarioForm">
            <div class="mb-3 row">
                <label for="nombre" class="col-sm-2 col-form-label">Nombre</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre" pattern="^(?!\\s*$).+" title="El campo usuario o contraseña no puede estar vacío" required>
                </div>
            </div>

            <div class="mb-3 row">
                <label for="contrasenia" class="col-sm-2 col-form-label">Contraseña</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" id="contrasenia" name="contrasenia" placeholder="Contraseña" pattern="^(?!\\s*$).+" title="El campo usuario o contraseña no puede estar vacío" required>
                </div>
            </div>

            <div class="mb-3 row">
                <label for="tipo" class="col-sm-2 col-form-label">Tipo de Usuario</label>
                <div class="col-sm-10">
                    <select class="form-select" id="tipo" name="tipo" required>
                        <c:forEach var="tipo" items="${tipos}">
                            <option value="${tipo}"><c:out value="${tipo}" /></option>
                        </c:forEach>
                    </select>
                </div>
            </div>

            <button type="submit" class="btn btn-primary">Enviar</button>
        </form>
    </div>

    <div class="container my-5">
        <%@include file="footer.jsp" %>
    </div>

    <script>
        document.getElementById("crearUsuarioForm").addEventListener("submit", function () {
            alert("El usuario ha sido creado exitosamente.");
        });
    </script>
</body>
</html>
