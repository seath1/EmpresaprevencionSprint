<%-- 
    Document   : index
    Created on : 06-10-2022, 21:19:07
    Author     : Rodrigo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

    <head>

        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>BIENVENIDO</title>
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

    <body >
        <%@include file="header.jsp" %>
        <%@include file="barranav.jsp" %>



            <menu class="lead" style="text-align: center">
                <p>DEJE DE PERDER Y COMIENCE A GANAR DE UNA VEZ POR TODAS.<br> En efecto, optimizar sus recursos es posible, mejorar las habilidades y capacidades de sus colaboradores también lo es, y utilizar los instrumentos  adecuados que le permitan hacer girar este círculo virtuoso, es la clave.</p>
                <iframe width="560" height="315" src="https://www.youtube.com/embed/abkBOGyOtR8" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
            </menu>



        <%@include file="footer.jsp" %>

    </body>

</html>
