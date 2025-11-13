<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,com.demo.StudentDAO,com.demo.StudentModel"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Student List</h2>
	<a href="addStudent.jsp">Add New Student</a>
	<br>
	<table border="1">
		<thead>
			<th>ID</th>
			<th>Name</th>
			<th>Email</th>
			<th>Course</th>
			<th>Mobile</th>
		</thead>
		<tbody>
			<%
			List<StudentModel> list = StudentDAO.getAllStudents();
			for(StudentModel s:list){				
			%>
			<tr>
				<td><%=s.getId() %></td>
				<td><%=s.getName() %></td>
				<td><%=s.getEmail() %></td>
				<td><%=s.getCourse() %></td>
				<td><%=s.getMobile() %></td>
				<td><a href="editStudent.jsp?id=<%=s.getId() %>">Edit</a></td>
				<td><a href="DeleteStudentServlet ? id=<%=s.getId() %>">Delete</a></td>
			</tr>
			<%} %>
		</tbody>
	</table>
</body>
</html>