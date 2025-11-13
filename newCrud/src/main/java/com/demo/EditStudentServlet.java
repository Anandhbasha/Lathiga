package com.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class EditStudentServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String course = request.getParameter("course");
		
		StudentModel s = new StudentModel();
		s.setId(id);
		s.setName(name);
		s.setEmail(email);
		s.setMobile(mobile);
		s.setCourse(course);
		
		int status = StudentDAO.updateStudent(s);
		if(status>0) {
			out.print("<h3>Updated Succesfully</h3>");
			request.getRequestDispatcher("index.jsp").include(request, response);
		}
		else {
			out.print("<h3>Unable to Update</h3>");
		}
		out.close();
;	}
}
