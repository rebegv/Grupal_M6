<%@page language="java" pageEncoding="UTF-8"%>

<html>
       <head>
              <meta charset="UTF-8">
              <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
              <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">
              <link rel="stylesheet" type="text/css" href="./css/stylesLogin.css">
              <link rel="stylesheet" type="text/css" href="./css/stylesFooter.css">
              <title> Login </title>
       </head>
       <body>
        <div>
           <%@include file="inicioLoginNav.jsp" %>
        </div>
        <div class="container mt-5">
            <div class="row justify-content-center">
              <div class="col-md-6">
                <div class="card">
                  <div class="card-header bg-warning text-white text-center">
                    <h4>Login</h4>
                  </div>
                  <div class="card-body">
                    <form>
                      <div class="form-group mt-4">
                        <label for="username">Usuario</label>
                        <input type="text" class="form-control" id="username" name="username" placeholder="Ingrese su usuario" required>
                      </div>
                      <div class="form-group mt-4">
                        <label for="password">Contraseña</label>
                        <input type="password" class="form-control" id="password" name="password" placeholder="Ingrese su contraseña" required>
                      </div>
                      <div class="form-group mt-4">
                        <button type="submit" class="btn btn-warning btn-block">Iniciar sesión</button>
                      </div>
                    </form>
                  </div>
                </div>
              </div>
            </div>
          </div>


       <div class="container my-5">
              <%@include file="footer.jsp" %>
       </div>
       </body>
       </html>

