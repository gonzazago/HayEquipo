<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@taglib uri="http://www.springframework.org/tags/form" prefix ="form" %>
<title>Insert title here</title>
</head>
<body>
	<form:form action="saludo" method="POST" ModelAttribute ="persona">
		
			<label> nombre</label>
			
			<form:input path="nombre"/>
			
			<label>apellido<label>
			
			<form:input path="apellido"/>
			<input type="submit" value="Enviar"/>

		</form:form>
		
</body>
</html>