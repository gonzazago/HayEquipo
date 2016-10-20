<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hay Equipo - Home</title>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap theme -->
<link href="css/bootstrap-theme.min.css" rel="stylesheet">

<!-- Estilos Propios -->
<link href="css/estilos.css" rel="stylesheet">
<link rel="stylesheet" href="css/example.css">
  <link rel="stylesheet" href="css/font-awesome.min.css">

<!-- Slider -->
<script src="js/jquery-1.11.3.min.js"></script>
<script src="js/java.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.slides.min.js"></script>

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
			<a class="navbar-brand" href="#">Hay Equipo !</a>
		</div>

		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li><a href="#partidos">Partidos</a></li>
				<li><a href="#">Canchas</a></li>
			</ul>
				<form class="navbar-form navbar-left">
					<div class="form-group">
						<input type="text" class="col-md-6 form-control" placeholder="Buscar..">
					</div>
					<button type="submit" class="btn btn-default">
						<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
					</button>
				</form>
			<ul class="nav navbar-nav">
				<li><a href="#partidos">Jugadores</a></li>
				<li><a href="#">Equipos</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li>
					<a  target="_blank" href="iniciarSesion">
					<span class="glyphicon glyphicon-user" aria-hidden="true"></span>
					 Iniciar Sesion
					</a>					
				</li>
				<li>
					<a  target="_blank" href="registrarse">
					<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
					 Registrate
					</a>
				</li>
			</ul>
		</div>
	</div>
	</nav>
<div id="intro" data-speed="4" data-type="background">
   <div class="intro-unit">
		<div class="container">
    		<div id="slides">
   				<img src="images/example-slide-1.jpg" alt="Photo by: Missy S Link: http://www.flickr.com/photos/listenmissy/5087404401/">
    			<img src="images/example-slide-2.jpg" alt="Photo by: Daniel Parks Link: http://www.flickr.com/photos/parksdh/5227623068/">
      			<img src="images/example-slide-3.jpg" alt="Photo by: Mike Ranweiler Link: http://www.flickr.com/photos/27874907@N04/4833059991/">
      			<img src="images/example-slide-4.jpg" alt="Photo by: Stuart SeegerLink: http://www.flickr.com/photos/stuseeger/97577796/">
    		</div>
  			</div>
	</div>
</div>	
	<div id="bloque1" data-speed="2" data-type="background">
		<div class="intro-unit">
			<a name="partidos"></a>
			<h2>Partidos</h2>
			<p>Aca van los partidos</p>
		</div>
	<div id="bloque-img1" data-speed="12" data-type="background"></div>

	</div>
</body>
</html>