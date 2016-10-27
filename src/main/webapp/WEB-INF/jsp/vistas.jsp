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
			<a name="partidos"></a>
			<table class="personalizada">
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
			  	<td>
			  		<a href="unirse">Unirse a partido</a>
			  	</td>
			  				  	
			  </tr>
			</table>
		
		</div>

</div>
</body>
</html>