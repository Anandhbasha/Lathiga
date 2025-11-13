package com.demo;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;

public class AddStudentServlet extends HttpServlet{
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		String course = req.getParameter("course");
		
		StudentModel  s =new StudentModel();
		s.setName(name);
		s.setEmail(email);
		s.setMobile(mobile);
		s.setCourse(course);
		
		int status = 0;
		try {
			status = StudentDAO.addStudent(s);
			if(status>0) {
				out.println("<h3>Student Added Succesfully</h3>");
				req.getRequestDispatcher("index.jsp").include(req, res);
			}else {
				out.println("<h3>Unable to Add Student</h3>");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}