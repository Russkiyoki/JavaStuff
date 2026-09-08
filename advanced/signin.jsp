<%@ page language ="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<title>User Sign In</title>
</head>

<body>
	<h1>User Login</h1>
	<form method = "post" action="authenticate.jsp">
		<label for="username">Username:</label>
		<input type="text" id="username" name="username">
		<label for="password">Password:</label>
		<input type="password" id="password" name="password">
		<input type="submit" value="Sign in">
	</form>
</body>
</html>
