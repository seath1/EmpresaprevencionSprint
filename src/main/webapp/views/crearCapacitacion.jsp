<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>REGISTRATE TU CAPACITACION AQUI</title>
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

            <form action="crearcapacitacion" method="post">
                <div class="form-row">
                    <div class="col-md-6 mb-3">
                        <label for="validationDefault01">Nombre Capacitacion:</label>
                        <input type="text" name="nombreCapacitacion" class="form-control" id="validationDefault01" required>
                    </div>
                    <div class="col-md-6 mb-3">
                        <label for="validationDefault02">Empresa Capacitacion:</label>
                        <input type="text" name="empresaCapacitacion" class="form-control" id="validationDefault02"  required>
                    </div>
                </div>

                <div class="col-md-6 mb-3">
                    <label for="validationDefault03">Fecha Capacitacion:</label>
                    <input type="date" name="fechaCapacitacion" class="form-control" id="validationDefault03" >
                </div>

                <div class="col-md-3 mb-3">
                    <label for="validationDefault04">Ciudad Capacitacion</label>
                    <select class="custom-select" name="ciudadCapacitacion" id="validationDefault04" required>
                        <option selected disabled value="">Seleccione...</option>
                        <option>Antofagasta</option>
                        <option>Santiago</option>
                        <option>Concepcion</option>
                    </select>
                </div>
                <div class="col-md-6 mb-3">
                    <label for="validationDefault05">Cantidad Participantes Capacitacion</label>
                    <input type="text" name="cantidadCapacitacion" class="form-control" id="validationDefault05" >
                </div>

                <button class="btn btn-info" type="submit">Registrar</button>
            </form>
        </div>

        <%@include file="footer.jsp" %>

        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>

    </body>
</html>