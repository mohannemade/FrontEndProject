<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Custom Login Page</h3>
	<form name='loginForm' action="<c:url value='login'/>" method="POST">

	<table>
	<tr>
	<td>User Name:</td>
	<td><input type="text" name="username" value=""/></td>
	</tr>
	<tr>
	<td>Password: </td>
	<td><input type="password" name="password" /></td>
	</tr>
	<tr>
	<td><input type="submit" name="sumbit" value="SUBMIT" /></td>
	<td><input type="reset" name="reset" />
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/></td>
	</table>
		
	
	
	</form>
</body>
</html>