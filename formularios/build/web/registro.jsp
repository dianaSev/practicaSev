<%-- 
    Document   : registro
    Created on : 28/09/2021, 06:23:56 PM
    Author     : usuario
--%>

<%@page import="com.sun.xml.rpc.processor.modeler.j2ee.xml.string"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Registro Sevilla </title>
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
    <body>
        <%
            String matriculaAlumno=request.getParameter("matri");
            String nombreAlu=request.getParameter("nombre");
            String carreraAlu=request.getParameter("carrera");
            int edadAlu=Integer.parseInt(request.getParameter("edad"));
            String telAlu=request.getParameter("telefono");
            String correoAlu=request.getParameter("correo");
            String fechaAlu=request.getParameter("fecha");
            %>
            <div class="container">
                <div class="jumbotron">
                    <div class="alert-info">
                        <center>
                            <h3>Datos del alumno </h3>
                            <hr>
                            <h4> Matricula alumno : <%= matriculaAlumno %></h4>
                             <h4>Nombre del alumno : <%= nombreAlu %></h4>
                              <h4> carrera  alumno : <%= carreraAlu %></h4>
                               <h4> Edad alumno : <%= edadAlu %></h4>
                                <h4>Telefono alumno : <%= telAlu %></h4>
                                 <h4> Correo alumno : <%= correoAlu %></h4>
                                 <h4> Fechs alumno : <%= fechaAlu %></h4>
                             <hr>
                        </center>
                    </div>
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
