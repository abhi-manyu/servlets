package org.servletcontext.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/secondservlet")
public class SecondServlet extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			  throws ServletException, IOException
	{
		// getting the preset values in context param of the servlet
		PrintWriter pw=response.getWriter();
		ServletContext sc=getServletContext();
		pw.println("the username is : "+sc.getAttribute("uname"));
		pw.println("the password : "+sc.getAttribute("paswo"));
	}


}
