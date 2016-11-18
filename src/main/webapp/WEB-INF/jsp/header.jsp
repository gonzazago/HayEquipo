<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

		<div class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li><a href="#partidos">Partidos</a></li>
				<li><a href="#canchas">Canchas</a></li>
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
				<li><a href="#equipos">Equipos</a></li>
				
			</ul>
			<ul class="nav navbar-nav navbar-right">
			<c:choose>
				<c:when test="${usuario == null}">
					<li><a href="iniciarSesion"> <span
						   class="glyphicon glyphicon-user" aria-hidden="true"></span>
		     			   Iniciar Sesion
		 			</a></li>
					<li><a 	href="registrarse"> <span
		       				class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
							Registrate
					</a></li>
				</c:when>
				<c:otherwise>
					<li><a href="home"><span class="glyphicon glyphicon-home" aria-hidden="true"></span>
				       	Ir a inicio
				     </a></li>
					<li><a 	href="perfil"> <span
							class="glyphicon glyphicon-user" aria-hidden="true"></span>
							Usuario: ${usuario}
					</a></li>
					<li><a 	href="logout"> <span
                       		class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
							Salir
					</a></li>
				</c:otherwise>
			</c:choose>
			</ul>
		</div>
	</div>
	</nav>