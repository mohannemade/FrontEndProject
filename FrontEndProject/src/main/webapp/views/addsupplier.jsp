<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:errors path="supplier1.*"></form:errors>
	<form action="${pageContext.request.contextPath}/addsupplier"
		method="post">

		Supplier Name: <input type="text" name="sName" /> 
		Supplier Address: <input type="text" name="sAddress" /> 
		Supplier Date: <input type="text" name="date"/>
		<input type="submit" value="Add Supplier" />

	</form>
</body>
</html>