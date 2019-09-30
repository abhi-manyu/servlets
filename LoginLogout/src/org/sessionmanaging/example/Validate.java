package org.sessionmanaging.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/validate")
public class Validate extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		PrintWriter pw=response.getWriter();
		String uname=request.getParameter("un");
		String pass=request.getParameter("pas");
		
		if(pass!=null && pass.equals("manyu") &&
				uname!=null)
		{
			Cookie usernameCookie=new Cookie("username", uname);
			Cookie passwordCookie=new Cookie("password", pass);
			response.addCookie(usernameCookie);
			response.addCookie(passwordCookie);
			
			response.sendRedirect("success.jsp");
		}
		else
		{
			pw.println("<html><body>"
					+ "<h2 style='color:red'>log in failed !!!</h2>"
					+ "</body></html>");
		}
	}

}
