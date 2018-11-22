<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TM Attendance Login</title>

<link rel="stylesheet" href="css/login.css">
</head>
<body>


	<hgroup>
		<h1>TM Attendance System</h1>
		<h3>Maharishi University Of Management</h3>
	</hgroup>
	<form:form modelAttribute="login" action="/login">
		<div class="group">
			<form:input path="u_name" />
			<span class="highlight"></span><span class="bar"></span> <label>Username</label>
		</div>
		<p><form:errors path="u_name" cssClass="error" /></p>
		<div class="group">
			<form:password path="pass" />
			<span class="highlight"></span><span class="bar"></span> <label>Password</label>
		</div>
		<p><form:errors path="pass" cssClass="error" /></p>
		<form:button name="select" value="submit" class="button buttonBlue">
			Login
			<div class="ripples buttonRipples">
				<span class="ripplesCircle"></span>
			</div>
		</form:button>
	</form:form>

	<footer>
		<a href="https://www.mum.edu/" target="_blank"> <img
			src="<spring:url value='images/logo_mum.jpg' />" />
		</a>
	</footer>

	<script type="text/javascript" src="js/login.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

</body>
</html>