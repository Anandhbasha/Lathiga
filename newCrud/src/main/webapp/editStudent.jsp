<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.demo.StudentDAO,com.demo.StudentModel" %>
    <%
    int id = Integer.parseInt(request.getParameter("id"));
    StudentModel s = StudentDAO.getStudentById(id);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Student</title>
</head>
<body>
	<h2>Edit Student</h2>
	<form action="EditStudentServlet" method='post'>
		<input type="hidden" name="id" value="<%=s.getId() %>">
		Name:<input type="text" name="name" value="<%=s.getName()%>">
		Email:<input type="email"  name="email" value="<%=s.getEmail() %>">
		Mobile:<input type="text" value="<%=s.getMobile() %>" name="mobile">
		Course:<input type="text" value="<%=s.getCourse() %>" name="course">
		<input type="submit" value="Update">
	</form>
</body>
</html>