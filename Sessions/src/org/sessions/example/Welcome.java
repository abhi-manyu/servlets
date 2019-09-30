package org.sessions.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Welcome")
public class Welcome extends HttpServlet
{

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		PrintWriter pw=response.getWriter();
		HttpSession s=request.getSession();
		pw.println("the username : "+s.getAttribute("usname"));
		pw.println("the password : "+s.getAttribute("pas"));
	}

}
