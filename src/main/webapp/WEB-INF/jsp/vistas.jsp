<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hay Equipo - Home</title>
<%@taglib uri="http://www.springframework.org/tags/form" prefix ="form" %>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet" >
    <!-- Bootstrap theme -->
    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
    <!-- Fotorama Slider css -->
    <link href="css/fotorama.css" rel="stylesheet">
    <!-- Estilos Propios -->
    <link href="css/estilos.css" rel="stylesheet" >
    
    <!--  Java Script -->
    <!-- Fotorama Slider JavaScript -->
    <script type="text/javascript" src="js/fotorama.js"></script>
    <!-- Jquery -->
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js" ></script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Hay Equipo !</a>
    </div>
    
    <div class="collapse navbar-collapse">
      <ul class="nav navbar-nav">
        <li><a href="#">Partidos</a></li>
        <li><a href="#">Canchas</a></li>
      </ul>
      <form class="navbar-form navbar-left">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="Buscar..">
        </div>
        <button type="submit" class="btn btn-default">
        	<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
		</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="loggin.jsp">Iniciar Sesion</a></li> 
      </ul>
    </div>
  </div>
</nav>
		
<div class="container contenedor">
	  <div class="row">
  			<div class="col-md-8">
  				<div class="fotorama" data-width="700" data-ratio="700/467" data-max-width="100%">
      				<div class="item"><img src="images/img1.jpg"></div>
      				<div class="item"><img src="images/img2.jpg"></div>
      				<div class="item"><img src="images/img3.jpg"></div>
     			</div>

  			
  	 		</div>
  			<div class="col-md-4">
  				<form:form action="bienvenido" method="POST" ModelAttribute ="Usuario" role="form">
  					<div class="form-group">
  						<label for="apellido">Nombre</label>
    					<form:input class="form-control" id="nombre" path="nombre"/>
    					
  					</div>
  					<div class="form-group">
    					<label for="apellido">Apellido</label>
    					<form:input class="form-control" id="apellido" path="apellido"/>
  					</div>
  					<div class="form-group">
    					<label for="nomUsuario">Nombre Usuario</label>
    					<form:input class="form-control" id="nomUsuario" path="nomUsuario"/>
  					</div>
  					<div class="form-group">
    					<label for="mail">Mail</label>
    					<form:input class="form-control" id="mail" path="mail"/>
  					</div>
  					<div class="form-group">
	    				<label for="password">Contraseña</label>
    					<form:password   id="password" class="form-control" path="password" />
  					</div>
  					<div class="form-group">
	    				<label for="password2">Reingrese Contraseña</label>
    					<form:password   id="password2" class="form-control" path="password2" />
  					</div>
  						<input type="submit" class="btn btn-inverse" value="Registrarse"/>
					</form:form>
			</div>
	  </div>
</div>
</body>
</html>