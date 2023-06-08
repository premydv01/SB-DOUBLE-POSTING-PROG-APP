<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Form</title>
</head>
<body>
  <font color='green'> ${msg}</font>
<h2>User Registration Form</h2>
<form:form action="creatUser" modelAttribute="user" method="POST">
<table>
	<tr>
		<td>UserName :</td>
		<td><form:input path="uname"/> </td>
	</tr>
	<tr>
		<td>Email :</td>
		<td><form:input path="email"/> </td>
	</tr>
	<tr>
		<td>Phone Number :</td>
		<td><form:input path="phno"/> </td>
	</tr>
	<tr>
		<td><input type="reset" value="Reset"></td>
		<td><input type="submit" value="Submit"></td>
	</tr>

</table>

</form:form>

</body>
</html>