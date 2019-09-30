package org.servletConfig.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Sessionmanagement")
public class Sessionmanagement extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	
	{
		PrintWriter pw=response.getWriter();
		 String username = request.getParameter("unam");
		 String password=request.getParameter("pass");
		 if(username != null && password !=null && password.equals("abhi@manyu"))
		 {
			 pw.println("<html><body>"
			 		+ "<h2 style='color:green;'>u r logged in boddy !!!</h2>"
			 		+ "</body></html>");
		 }
		 else
		 {
			 pw.println("<html><body><h2 style='color:red ;'>"
			 		+ "log in failed</h2></body></html>");
		 }
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		doGet(req, resp);
	}


}
