<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:errors path="product1.*"></form:errors>
	<form:errors path="supplier.*"></form:errors>
	<form action="${pageContext.request.contextPath}/success" method="post">

		Product Name: <input type="text" name="pName" /> 
		Product Cost: <input type="text" name="pCost" /> 
		Supplier Id: <input type="text" name="sId" /> 
		<input type="submit" value="Product Insert" />
	</form>
	<a href="<c:url value='logout'/>">Logout</a>

</body>
</html>
