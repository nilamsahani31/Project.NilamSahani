<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<font color="red">
<%
if(request.getAttribute("msg")!=null){
	out.println(request.getAttribute("msg"));
}
%>
</font>

// user<br></br>

<form action="loginpage" method="post">
username<input type="text" name="username">
password<input type="password" name="password">
<input type="submit" value="login">
<input type="reset" value="reset">

<a href="home.jsp">CreateAccount</a>

</form>
<br></br>
// Admin<br></br>

<form action="loginpage" method="post">
username<input type="text" name="username">
password<input type="password" name="password">
<input type="submit" value="login">
<input type="reset" value="reset">

</form>
</body>
</html>