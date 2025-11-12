package com.demo;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DeleteStudentServlet extends HttpServlet{
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String sid = request.getParameter("id");
		int id = Integer.parseInt(sid);
		
		int status = StudentDAO.deleteStudentById(id);
		if(status>0) {
			out.print("<h3>Deleted Succesfully</h3>");
			request.getRequestDispatcher("index.jsp").include(request, response);
		}
		else {
			out.print("<h3>Unable to Delete</h3>");
		}
		out.close();
	}
}