<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hay Equipo - Perfil</title>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap theme -->
<link href="css/bootstrap-theme.min.css" rel="stylesheet">

<!-- Estilos Propios -->
<link href="css/estilos.css" rel="stylesheet">
<link href="css/parallax.css" rel="stylesheet">
<link rel="stylesheet" href="css/example.css">
<link rel="stylesheet" href="css/font-awesome.min.css">

<!-- Slider -->
<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/java.js"></script>
<script src="js/parallax.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.slides.min.js"></script>

</head>
<body class="cuerpo">
<jsp:include page="header.jsp" />
<div class="container-2">
	<div class="row">
		<div class="list-group col-xs-6 col-md-4">
			 <a href="modificarDatos" class="list-group-item active">
    			Modificar Datos
  			</a>
  			<a href="crearPartido" class="list-group-item">Crear Partido</a>
  			<a href="registrarCancha" class="list-group-item">Crear Cancha</a>
  			<a href="#pendientes" class="list-group-item">Crear Equipo</a>
  			<a href="#unirseEquipo" class="list-group-item">Unirme a equipo</a>	
		</div>
		<div class= "col-xs-12 col-sm-6 col-md-8">
			<div class="separador">
					<div class="encabezado"> <h1>Historial de Partidos</h1> </div>
				</div>	 	
					<table class="table table-hover">
			  				<th>Partido</th>
			  				<th>Horario</th>
			  				<th>Cancha</th>
			  				<th>Estado</th>
			  				<th>Resultado</th>
			  			<tr>
				  			<td>Partido Prueba</td>
				  			<td>20:00 hs</td>
					  		<td>Cancha Prueba</td>
					  		<td>Terminado</td>
			  				<td>Gano Equipo 1</td>			  				  	
			  			</tr>
					</table>
				<div class="separador">
					<div class="encabezado"> <h1> Partidos del Dia</h1>	 </div>
				</div>	
					<table class="table table-hover">
			  				<th>Partido</th>
			  				<th>Horario</th>
			  				<th>Cancha</th>
			  				<th>Estado</th>
			  				<th>Resultado</th>
			  			<tr>
				  			<td>Partido Prueba</td>
				  			<td>20:00 hs</td>
					  		<td>Cancha Prueba</td>
					  		<td>Terminado</td>
			  				<td>Gano Equipo 1</td>			  				  	
			  			</tr>
					</table>
			</div>
	</div>
</div>


</body>
</html>