<%-- 
    Document   : calcularvel
    Created on : 1/10/2021, 04:54:35 PM
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Velocidad </title>
        <!-----------------------------BOOTSTRAP----------------------------->
                <!--Icono-->
		<link rel="Icon" type="img/png" href="img/logoicono.png">
		<!-- Google font -->
		<link href="https://fonts.googleapis.com/css?family=Montserrat:400,500,700" rel="stylesheet">
		<!-- Bootstrap -->
		<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css"/>
		<!-- Slick -->
		<link type="text/css" rel="stylesheet" href="css/slick.css"/>
		<link type="text/css" rel="stylesheet" href="css/slick-theme.css"/>
		<!-- nouislider -->
		<link type="text/css" rel="stylesheet" href="css/nouislider.min.css"/>
		<!-- Font Awesome Icon -->
		<link rel="stylesheet" href="css/font-awesome.min.css">
		<!-- Custom stlylesheet -->
		<link type="text/css" rel="stylesheet" href="css/style.css"/>
		<!--Ventanas emergentes-->
		<link rel="stylesheet" type="text/css" href="css/ventanas.css">
<!-----------------------------/BOOTSTRAP----------------------------->
    
    
    </head>
    <body style="background-color: #1b6d85;">
    <marquee><h1>Resultado de calcular velocidad </h1></marquee>
    <hr>
    <div class="container">
        <div class="jumbotron">
            <center>
                <h3> Resultado de velocidad y datos captureados </h3>
                <%
                    float aceleracionCap=Float.parseFloat(request.getParameter("aceleracion"));
                    float tiempoCap=Float.parseFloat(request.getParameter("tiempo"));
                    float velocidad=aceleracionCap*tiempoCap;
                    
String nombreAlu="Diana Sevilla ";
String nombreUACM="UACM";

                %>
                
                <hr>
                <h4> Aceleracion es: <%= aceleracionCap %></h4>
                <h4> Tiempo es: <%= tiempoCap %></h4>
                <hr>
                <h3> Velocidad es: <%= velocidad %></h3>
                <hr>
                <h4> Autor : <%= nombreAlu %> Universidad :<%= nombreUACM %></h4>
               
            
            </center>
        </div>
    </div>
    
    <!-- js Plugins -->
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script src="js/slick.min.js"></script>
		<script src="js/nouislider.min.js"></script>
		<script src="js/jquery.zoom.min.js"></script>
		<script src="js/main.js"></script>
        <script type="text/javascript" src="js/municipios.js"></script>
    	<script type="text/javascript" src="js/select_estados.js"></script>
<!-- /js Plugins -->
        
        
    </body>
</html>
