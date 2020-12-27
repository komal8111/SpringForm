<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>



	<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.c4.5.2/js/bootstrap.min.js"></script>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="container">

	<button><a href="http://localhost:8080/add">Add Employee</a></button>
	
	<table   class="table table-striped">
		
			<tr>
				<td>ID</td>
				<td>FirstName</td>
				<td>LastName</td>
				<td>Salary</td>
				<td>Department</td>
				<td>Email</td>
				<td>Address</td>
				<td>Gender</td>
				<td>Edit</td>
				<td>Delete</td>
			</tr>
		
		<c:forEach  var="emp" items="${list}">
			
			<tr>
				<td>${emp.emp_id}</td>
				<td>${emp.emp_firstname}</td>
				<td>${emp.emp_lastname}</td> 
				<td>${emp.emp_salary}</td> 
				<td>${emp.emp_department}</td> 
				<td>${emp.emp_email}</td> 
				<td>${emp.emp_address}</td>
				<td>${emp.emp_gender}</td> 
				 
				<td><button><a href="http://localhost:8080/${emp.emp_id}">Edit Employee</a></button></td>
				
				<td><button><a href="http://localhost:8080/delete/${emp.emp_id}">delete Employee</a></button></td>
				
			</tr>
			
			
		</c:forEach>
		</table>
</body>
</html>