package org.servletConfig.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigs extends HttpServlet
{
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter pw=response.getWriter();
		ServletConfig sc=getServletConfig();
		pw.println("ur mail id is : "+sc.getInitParameter("mail"));
		pw.println("ur address is : "+sc.getInitParameter("address"));
	}


}
