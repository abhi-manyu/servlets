package org.sessionmanaging.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logoutservlet")
public class Logout extends HttpServlet
{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		Cookie loginUserNameCookie=null;
		Cookie loginPasswordCookie=null;
		Cookie[] cks=request.getCookies();
		if(cks[0].getName().equals("username") && 
				cks[1].getName().equals("password"))
		{
			loginUserNameCookie=cks[0];
			loginPasswordCookie=cks[1];
		}
		
		if(loginUserNameCookie!=null || loginPasswordCookie!=null)
		{
			loginUserNameCookie.setMaxAge(0);
			loginPasswordCookie.setMaxAge(0);
		}
		response.sendRedirect("index.html");
	}

}
