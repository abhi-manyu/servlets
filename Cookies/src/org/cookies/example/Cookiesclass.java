package org.cookies.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cookiesclass")
public class Cookiesclass extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		PrintWriter pw=response.getWriter();
		String username=request.getParameter("unm");
		String password=request.getParameter("pas");
		if(password.equals("abhi"))
		{
			Cookie cookie1=new Cookie("usnm", username);
			Cookie cookie2=new Cookie("pasw",password);
			//cookie1.setMaxAge(5);
			response .addCookie(cookie1);
			response.addCookie(cookie2);
			pw.println("<html><body>"
					+ "<a href=./welcome>click here</a>"
					+ "</body></html>");
		}
		else
		{
			pw.println("<html><body><h2>failed</h2></body></html>");
		}
	}
}
