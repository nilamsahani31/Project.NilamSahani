<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<font color="red"> <%
 if (request.getAttribute("msg") != null) {
 	out.println(request.getAttribute("msg"));
 }
 %>
	</font> HomePage

	<a href="aboutpage">About</a>
	<a href="servicepage">Service</a>
	<a href="contactpage">Contact</a>
	<a href="loginpage">LogOut</a>

</body>
</html>