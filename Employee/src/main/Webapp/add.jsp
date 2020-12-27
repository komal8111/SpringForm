<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form method="get" action="save" modelAttribute="employee">
	First Name:<form:input path="emp_firstname"/><br>
	Last Name:<form:input path="emp_lastname"/><br>
	Salary:<form:input path="emp_salary"/><br>
	Department:<form:select path="emp_department">
					<form:option value="Web Designer">Web Designer </form:option>
					<form:option value="Developer">Developer </form:option>
					<form:option value="Tester">Tester </form:option>
				</form:select>
	Email Id:<form:input path="emp_email"/><br>
	Address:<form:input path="emp_address"/><br>
	Gender:<form:radiobutton path="emp_gender" value="male"/>male<br>
			<form:radiobutton path="emp_gender" value="female"/>female<br>
	<input type="submit" value="submit">
</form:form>


</body>
</html>


