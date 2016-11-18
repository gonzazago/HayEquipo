<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hay Equipo - Home</title>
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
<div class="contenedor">	
		<div class="container">
    		<div id="slides">
   				<img src="images/example-slide-1.jpg" alt="Photo by: Missy S Link: http://www.flickr.com/photos/listenmissy/5087404401/">
    			<img src="images/example-slide-2.jpg" alt="Photo by: Daniel Parks Link: http://www.flickr.com/photos/parksdh/5227623068/">
      			<img src="images/example-slide-3.jpg" alt="Photo by: Mike Ranweiler Link: http://www.flickr.com/photos/27874907@N04/4833059991/">
      			<img src="images/example-slide-4.jpg" alt="Photo by: Stuart SeegerLink: http://www.flickr.com/photos/stuseeger/97577796/">
    		</div>
  			</div>
		<div class="intro-unit">
			<div class="separador">
				<div class="encabezado"> <h1> Partidos del Dia usuario: ${idUsuario}</h1>	 </div>
			</div>	
			<a name="partidos"></a>
			<table class="table table-hover">
			  <th>Cancha</th>
			  <th>Horario</th>
			  <th>Local</th>
			  <th>Visitante</th>
			  <th>Fecha</th>
			  <th>Estado</th>
			  <th>Resultado</th>
			  <tr>
			  	<c:forEach items="${partidos}" var="partido">
			  	<td>${partido.cancha}</td>
			  	<td>${partido.horarioPartido}</td>
			  	<td>${partido.nombreEquipo1}</td>
			  	<td>${partido.nombreEquipo2}</td>
			  	<td>${partido.fechaPartido}</td>
			  	<td>${partido.estado}</td>
			  	<td>${partido.resultado}</td>
			  	<td>
			  		<a href="unirse?id=${partido.idPartido}">Unirse a partido</a>
			  	</td>
			  </tr>
			  </c:forEach>
			  				  
			  </tr>
			</table>
			<div class="separador">
				<div class="encabezado"> <h1> Jugadores</h1> </div>
			</div>	
			<a name="jugadores"></a>
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
				<div class="encabezado"> <h1>canchas</h1> </div>
			</div>	
			<a name="canchas"></a>
			<table class="table table-hover">
			  <th>Nombre</th>
			  <th>Provincia</th>
			  <th>Localidad</th>
			  <th>Calle</th>
			  <th>Numero</th>
			  <th>Canchas Disponibles</th>
			  <tr>
			  <c:forEach items="${canchas}" var="cancha">
			  	<td>${cancha.nombre}</td>
			  	<td>${cancha.provincia}</td>
			  	<td>${cancha.localidad}</td>
			  	<td>${cancha.calle}</td>
			  	<td>${cancha.numero}</td>
			  	<td>${cancha.canchasDisponibles}</td>
			  	<td>
			  		<a href="unirse?id=${cancha.idCancha}">Ver Cancha</a>
			  	</td>
			  </tr>
			  </c:forEach>
			</table>
		<div class="separador">
				<div class="encabezado"> <h1>Equipos</h1> </div>
			</div>	
			<a name="equipos"></a>
			<table class="table table-hover">
			  <th>Partido</th>
			  <th>Horario</th>
			  <th>Cancha</th>
			  <th>Estado</th>
			  <th>Resultado</th>
			  <tr>
			  	<td>${partido }</td>
			  	<td>20:00 hs</td>
			  	<td>Cancha Prueba</td>
			  	<td>Terminado</td>
			  	<td>Gano Equipo 1</td>
			  	<td>
			  		<a href="unirse?id=${idEquipo}">Ver Equipo</a>
			  	</td>
			  				  	
			  </tr>
			</table>
		</div>

</div>
</body>
</html>