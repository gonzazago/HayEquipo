<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hay Equipo - Registrar Cancha</title>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- Bootstrap core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap theme -->
<link href="css/bootstrap-theme.min.css" rel="stylesheet">

<!-- Estilos Propios -->
<link href="css/estilos.css" rel="stylesheet">
<link href="css/footer.css" rel="stylesheet">
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
<body class="cuerpo-1">
<jsp:include page="headerUsuario.jsp" />
<div class="container-2">
	<div class="row">
				 <div class="col-md-6 col-md-offset-3">
			<form:form action="cancha" method="POST" ModelAttribute="Cancha" role="form">
					<div class="form-group">
						<form:hidden path="idCancha"/>
					</div>
					<div class="form-group">
						<label for="nombre">Nombre</label>
						<form:input class="form-control" id="nombre" path="nombre"/>
						<form:errors path="nombre"/>

					</div>
					<div class="form-group">
						<label for="provincia">Provincia</label>
						<form:input class="form-control" id="provincia" path="provincia" />
						<form:errors path="provincia"/>
					</div>
					<div class="form-group">
						<label for="localidad">Localidad</label>
						<form:input class="form-control" id="localidad" path="localidad" />
						<form:errors path="localidad"/>
					</div>
					<div class="form-group">
						<label for="calle">calle</label>
						<form:input class="form-control" id="calle" path="calle" />
						<form:errors path="calle"/>
					</div>
					<div class="form-group">
						<label for="numero">Numero</label>
						<form:input class="form-control" id="numero" path="numero" />
						<form:errors path="numero"/>
					</div>
					<div class="form-group">
						<label for="canchas">Canchas Disponibles</label>
						<form:input id="canchas" class="form-control" path="canchasDisponibles" />
						<form:errors path="canchasDisponibles"/>
					</div>
					<input type="submit" class="btn btn-inverse" value="Ingresar Cancha" />
				</form:form>
		</div>
	</div>
</div>
<jsp:include page="footer.jsp" />
</body>
</html>