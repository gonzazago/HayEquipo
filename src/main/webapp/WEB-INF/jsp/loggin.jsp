<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hay Equipo - Iniciar Sesion</title>
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
			<a class="navbar-brand" href="#">Hay Equipo !</a>
		</div>
			<ul class="nav navbar-nav navbar-right">
				<li>
				    <a href="home"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>
				       Ir a inicio
				     </a>
				 </li>
			</ul>
		</div>
	</div>
</nav>
<div class="row">
	<div id="contenedor-registrarse">
		 <div class="col-md-6 col-md-offset-3">
				<form:form action="inicioSesion" method="POST" ModelAttribute="Loggin" role="form">
					<div class="form-group">
						<label for="usuario">Nombre Usuario</label>
						<form:input class="form-control" id="usuario" path="usuario" />
						<form:errors path="usuario"/>
					</div>
					<div class="form-group">
						<label for="password">Contraseña</label>
						<form:password id="password" class="form-control" path="password" />
						<form:errors path="password"/>
					</div>
					<input type="submit" class="btn btn-inverse" value="Iniciar Sesion" />
				</form:form>
			</div>
		</div>
	</div>
	<div class="panel panel-default">
  <div class="panel-body">
    <p class="text-center">Si no tienes usuarios puedes registrarte haciendo click <a href="registrarse">aqui</a></p>
  </div>
</div>
</body>
</html>