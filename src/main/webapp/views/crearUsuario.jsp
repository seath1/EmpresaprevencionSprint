<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>REGISTRATE AQUI</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <style>

            body {
                background-image: url(https://wallpaperaccess.com/full/3398643.jpg);
                background-position: center center;
                background-repeat: no-repeat;
                background-size: cover;
                background-attachment: fixed;
                color: azure;
            }

        </style>
    </head>

    <body>
        <%@include file="header.jsp" %>
        <%@include file="barranav.jsp" %>

        <div class="container">

            <form action="crearusuario" method="post">
                <div class="form-row">
                    <div class="col-md-6 mb-3">
                        <label for="validationDefault01">Nombre completo:</label>
                        <input type="text" name="nombreUsuario" class="form-control" id="validationDefault01" required>
                    </div>
                    <div class="col-md-6 mb-3">
                        <label for="validationDefault02">Fecha de nacimiento:</label>
                        <input type="date" name="nacimientoUsuario" class="form-control" id="validationDefault02"  required>
                    </div>
                </div>
                <div class="form-row">
                    <div class="col-md-6 mb-3">
                        <label for="validationDefault03">Rut:</label>
                        <input type="text" name="runUsuario" class="form-control" id="validationDefault03" >
                    </div>
                    <div class="col-md-3 mb-3">
                        <label for="validationDefault04">Tipo</label>
                        <select class="custom-select" name="tipoUsuario" id="validationDefault04" required>
                            <option selected disabled value="">Seleccione...</option>
                            <option>Cliente</option>
                            <option>Administrativo</option>
                            <option>Profesional</option>
                        </select>
                    </div>
                </div>

                <button class="btn btn-info" type="submit">Registrar</button>
            </form>
        </div>

        <%@include file="footer.jsp" %>

        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

    </body>
</html>
