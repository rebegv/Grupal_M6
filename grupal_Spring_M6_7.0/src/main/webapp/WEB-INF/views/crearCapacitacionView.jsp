<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <head>
        <meta charset="UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Archivo+Black&display=swap">
        <title>Crear Capacitaciones</title>
    </head>
</head>
<body>
<%@include file="navbar.jsp" %>

<div class = "container my-3">
    <div class="text-center my-5">
        <h2>
            Formulario para Crear Capacitación
        </h2>
    </div>
    <form action="<c:url value='/guardarCapacitacion' />" method="POST" id="crearCapacitacionForm">
        <div class="mb-3 row">
            <label for="rutCliente" class="col-sm-2 col-form-label">Rut Cliente</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="rutCliente" name="rutCliente"  pattern="^\d{7,8}-[0-9kK]$"  placeholder="ej: 11111111-1" required>
            </div>
        </div>

        <div class="mb-3 row">
            <label for="dia" class="col-sm-2 col-form-label">Dia</label>
            <div class="col-sm-10">
                <select class="form-select" id="dia" name="dia" required>
                    <option value="">Selecciona un día</option>
                    <option value="Lunes">Lunes</option>
                    <option value="Martes">Martes</option>
                    <option value="Miércoles">Miércoles</option>
                    <option value="Jueves">Jueves</option>
                    <option value="Viernes">Viernes</option>
                    <option value="Sábado">Sábado</option>
                    <option value="Domingo">Domingo</option>
                </select>
            </div>
        </div>

        <div class="mb-3 row">
            <label for="hora" class="col-sm-2 col-form-label">Hora</label>
            <div class="col-sm-10">
                <select class="form-select" id="hora" name="hora" required>
                    <option value="">Selecciona una hora</option>
                    <option value="09:00">09:00</option>
                    <option value="10:00">10:00</option>
                    <option value="11:00">11:00</option>
                    <option value="12:00">12:00</option>
                    <option value="13:00">13:00</option>
                    <option value="14:00">14:00</option>
                    <option value="15:00">15:00</option>
                    <option value="16:00">16:00</option>
                    <option value="17:00">17:00</option>
                    <option value="18:00">18:00</option>
                    <option value="19:00">19:00</option>
                </select>
            </div>
        </div>

        <div class="mb-3 row">
            <label for="lugar" class="col-sm-2 col-form-label">Lugar</label>
            <div class="col-sm-10">
                <select class="form-select" id="lugar" name="lugar" required>
                    <option value="">Selecciona un lugar</option>
                    <option value="Valparaiso">Valparaíso</option>
                    <option value="Santiago">Santiago</option>
                    <option value="Concepción">Concepción</option>
                </select>
            </div>
        </div>

        <div class="mb-3 row">
            <label for="duracion" class="col-sm-2 col-form-label">Duración</label>
            <div class="col-sm-10">
                <select class="form-select" id="duracion" name="duracion" required>
                    <option value="">Selecciona una duración</option>
                    <option value="60 min">60 min</option>
                    <option value="120 min">120 min</option>
                    <option value="180 min">180 min</option>
                </select>
            </div>
        </div>

        <div class="mb-3 row">
            <label for="cantAsistentes" class="col-sm-2 col-form-label">Cantidad Asistentes</label>
            <div class="col-sm-10">
                <input type="number" class="form-control" id= "cantAsistentes" name="cantAsistentes" min="10" max="30" placeholder="Min 10 - Max 30" required>
            </div>
        </div>
        <button type="submit" class="btn btn-primary">Enviar</button>
    </form>
</div>

<div class="container my-5">
    <%@include file="footer.jsp" %>
</div>
<script>
    document.getElementById("crearCapacitacionForm").addEventListener("submit", function (){

        alert("Su Capacitación ha sido exitosamente creada.");

    });
</script>
</body>
</html>
