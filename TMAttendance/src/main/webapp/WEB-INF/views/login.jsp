<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"  %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TM Attendance Login</title>
</head>
<body>
		
	<form:form modelAttribute = "login" >
	<form:input path="u_name" placeholder="Username" />
	<br>
	<form:password path="pass" placeholder="Password" />
	</form:form> 
	
</body>
</html>