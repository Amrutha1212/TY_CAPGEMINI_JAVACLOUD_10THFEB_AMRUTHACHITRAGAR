<%@page import="com.tyss.springmvc.beans.Login"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Employee</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<%
if(session.getAttribute("admin") == null)
	response.sendRedirect("./logout");
%>
<header class = "card-header text-center">Employee Management Portal</header>
<div class = " text-right">
	<a href="./welcome" class = "btn btn-primary">HOME</a>
    
	<a href="./logout" class = "btn btn-danger">LOGOUT</a>
	</div><br>
	<div class = "text-center"><a
		href="./list" class = "btn btn-link">LIST
		the Employees</a>
		</div>
	<br>
	<h2>${message}</h2>
	<div class = "form-group text-center">
	<form action="./add" method = "POST" >
		<input type="hidden" name="id" value="${id}"> 
		Employee Name: <input type="text" name="name" value = "${name}" placeholder = "Employee Name"><br>
		Official Email: <input type="text" name="mail" value = "${mail}" placeholder = "Official EmailID"><br>
		Date Of Birth: <input type="date" name="dob" value = "${dob}"><br> 
				Joining Date: <input type="date" name="joined" value = "${joined}"><br> 
		Department ID:<input type="text" name="deptid" value = "${deptid}" placeholder = "Department ID"><br> 
		Designation: <input type="text" name="designation" value = "${designation}" placeholder = "Designation"><br> 
		Salary:<input type="text" name="salary" value = "${salary}" placeholder = "Salary"><br>
		Manager ID:<input type="text" name="managerid" value = "${managerid}" placeholder = "Manager ID"><br>
		Mpbile:<input type="text" name="mobile" value = "${mobile}" placeholder = "Mobile"><br>
		Password:<input type="text" name="password" value = "${password}" placeholder = "Password"><br> <br>
		<input type="submit" value="ADD" class = "btn btn-success">
	</form>
	</div>
</body>
</html>