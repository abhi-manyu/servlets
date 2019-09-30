package org.cookies.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class Welcome extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			   throws ServletException, IOException
	{
		PrintWriter pw=response.getWriter();
		Cookie[] cks=request.getCookies();
		pw.println("username : "+cks[0].getValue()+
				"<br> password : "+cks[1].getValue());
	}

}
