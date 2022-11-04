<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: migue
  Date: 18-10-2022
  Time: 20:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Usuarios Registrados</title>
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
        <%@include file="barranav.jsp"%>

        <div class="container align-items-md-center" >

            <table class="table table-bordered">
                <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">NOMBRE COMPLETO</th>
                    <th scope="col">FECHA DE NACIMIENTO</th>
                    <th scope="col">RUN</th>
                    <th scope="col">TIPO</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach var="usuarios" items="${usuarios}">
                    <tr>
                        <td><c:out value="${usuarios.getIdUsuario()}"/></td>
                        <td><c:out value="${usuarios.getNombre()}"/></td>
                        <td><c:out value="${usuarios.getNacimiento()}"/></td>
                        <td><c:out value="${usuarios.getRun()}"/></td>
                        <td><c:out value="${usuarios.getTipo()}"/></td>

                        <td>
                         <form class="col-md-4" action="eliminarusuario" method="post">
                            <button title="eliminar" type="submit" class="btn btn-info"
                                    name = "id" value  = "${usuarios.getIdUsuario()}">
                                Eliminar
                            </button>
                         </form>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>






        </div>
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
                integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
                crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
                integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
                crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js"
                integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+"


        <%@include file="footer.jsp" %>




    </body>
</html>
