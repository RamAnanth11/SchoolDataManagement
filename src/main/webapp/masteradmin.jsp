<%@page import="com.school.sdm.dto.Admin"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JANSchool/MasterMenu </title>
</head>
<body>
	<%Admin admin = (Admin) session.getAttribute("master");
	if(admin!= null)
	%>
	<h1>This is Message for Master Admin</h1>
	<%
	else{
	%>
	<h1>Login to access Master Admin Functions</h1>
	<a href = "adminLogin.jsp"><h1>To Login as a Admin</h1></a>
	<%} %>
</body>
</html>