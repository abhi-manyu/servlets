package org.servletcontext.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContext extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			 throws ServletException, IOException
	{
		PrintWriter pw=response.getWriter();
        javax.servlet.ServletContext sc=getServletContext();
        if(sc.getInitParameter("username").equals("abhi") &&
        		sc.getInitParameter("password").equals("manyu"))
        {
        	pw.println("<html><body><h2 style='color:green'>u r logged in</h2>"
        			+ "</body></html>");
        	sc.setAttribute("uname", sc.getInitParameter("username"));
        	sc.setAttribute("paswo", sc.getInitParameter("password"));
        }
        else
        {
        	pw.println("<html><body><h2 style='color:red'>login attempt failed</h2>"
        			+ "</body></html>");
        }

	}

}
