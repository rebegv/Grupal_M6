<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <head>
        <meta charset="UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Archivo+Black&display=swap">
        <title>Contacto</title>
        <script src="validarContacto.js"></script>
    </head>
</head>
<body>
<%@include file="navbar.jsp" %>


<div class = "container my-3">
    <div class="text-center my-5">
        <h2>
            Formulario de Contacto
        </h2>
    </div>
    <form action = "guardarContacto" method = "POST" id="contactoForm">
        <div class="mb-3">
            <label for="nombre" class="form-label">Nombre y Apellido</label>
            <input type="text" class="form-control" id= "nombre" name="nombre" pattern="^(?!\s*$).+" title="El campo Nombre y Apellido no puede estar vacío" required>
        </div>
        <div class="mb-3">
            <label for="correo" class="form-label">Correo</label>
            <input type="email" class="form-control" id="correo" name="correo" required>
        </div>
        <div class="mb-3">
            <label for="comentario" class="form-label">Comentario</label>
            <textarea type="text" class="form-control" id="comentario" name="comentario" pattern="^(?!\s*$).+" title="El campo Comentario no puede estar vacío" required>
    </textarea>
        </div>
        <button type="submit" id="submit"  class="btn btn-primary">Enviar</button>
    </form>
</div>

<div class="container my-5">
    <%@include file="footer.jsp" %>
</div>
<script>
    document.getElementById("contactoForm").addEventListener("submit", function (event){
        //event.preventDefault();
        alert("Su comentario ha sido exitosamente enviado.");
    });
</script>
</body>
</html>
