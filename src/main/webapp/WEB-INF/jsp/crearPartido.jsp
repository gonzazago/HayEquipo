<<<<<<< Upstream, based on branch 'master' of https://github.com/matalb23/HayEquipo
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Hay Equipo - Crear Partido</title>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<!-- Bootstrap core CSS -->
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<!-- Bootstrap theme -->
	<link href="css/bootstrap-theme.min.css" rel="stylesheet">
	<!-- Estilos Propios -->
	<link href="css/estilos.css" rel="stylesheet">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<!-- Slider -->
	<script src="js/jquery-1.11.3.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="home">Hay Equipo !</a>
			</div>
				<ul class="nav navbar-nav navbar-right">
					<li>
					    <a href="home"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>
					       Ir al Home
					     </a>
					 </li>
				</ul>
		</div>
	</nav>
	<div class="row">
	
		 <div class="col-md-6 col-md-offset-3">
			<form:form action="partidoCreado" method="POST" ModelAttribute="Partido" role="form">
					<div class="form-group">
						<form:hidden path="idPartido"/>
					</div>
					<div class="form-group">
						<label for="nombre">Cancha</label>
						<form:input class="form-control" id="cancha" path="cancha"/>
						<form:errors path="cancha"/>

					</div>
					<div class="form-group">
						<label for="apellido">Equipo 1</label>
						<form:input class="form-control" id="nombreEquipo1" path="nombreEquipo1" />
						<form:errors path="nombreEquipo1"/>
					</div>
					<div class="form-group">
						<label for="nomUsuario">Equipo 2</label>
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
=======
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
				 <div class="col-md-6 col-md-offset-3">
				 	<form:form action="partidoCreado" method="POST" ModelAttribute="Partido" role="form" >
						<div class="form-group">
							<label for="nombre">Cancha</label>
							<form:input class="form-control" id="cancha" path="cancha" />
 							<form:errors path="cancha"/>
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
	</div>
				 

</body>
>>>>>>> 4161884 Ultimos cambios 
</html>