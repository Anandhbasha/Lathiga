<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add NewStudent</title>
</head>
<body>
	<h2>Add NewStudent</h2>
	<form action="AddStudentServlet" method='post'>
		Name:<input type="text" placeholder="Enter the Name" name="name">
		Email:<input type="email" placeholder="Enter the email" name="email">
		Mobile:<input type="text" placeholder="Enter the MobileNumber" name="mobile">
		Course:<input type="text" placeholder="Enter the Course Name" name="course">
		<input type="submit" value="Add">
	</form>	
</body>
</html>