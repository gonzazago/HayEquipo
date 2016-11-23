<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hay Equipo - Crear Partido</title>
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
<body class="cuerpo-2">
<jsp:include page="headerUsuario.jsp" />

	<div class="row">
	
		 <div class="col-md-6 col-md-offset-3">
			<form:form action="partido" method="POST" ModelAttribute="Partido" role="form">
					<div class="form-group">
						<form:select class="form-control" path="cancha">
 							<form:option value="NONE" label="Selecciona la Cancha"/>
 							<form:options items="${listadoCanchas}"
 										  itemValue="nombre" 
 										  itemLabel = "nombre"/>
						</form:select>
					</div>
					<div class="form-group">
						<label for="apellido">Equipo Local</label>
						<form:input class="form-control" id="nombreEquipo1" path="nombreEquipo1" />
						<form:errors path="nombreEquipo1"/>
					</div>
					<div class="form-group">
						<label for="nomUsuario">Equipo Visitante</label>
						<form:input class="form-control" id="nombreEquipo2" path="nombreEquipo2" />
						<form:errors path="nombreEquipo2"/>
					</div>
					<div class="form-group">
						<label for="mail">Cantidad de jugadores</label>
						<form:input class="form-control" id="cantJugadores" path="cantJugadores" />
						<form:errors path="cantJugadores"/>
					</div>
					<div class="form-group">
						<label for="password">Fecha</label>
						<form:input id="fechaPartido" class="form-control" path="fechaPartido" />
						<form:errors path="fechaPartido"/>
					</div>
					<div class="form-group">
						<label for="password2">Horario</label>
						<form:input id="horarioPartido" class="form-control"	path="horarioPartido" />
						<form:errors path="horarioPartido"/>
					</div>
					<input type="submit" class="btn btn-inverse" value="Crear Partido" />
				</form:form>
			</div>
		</div>
</body>