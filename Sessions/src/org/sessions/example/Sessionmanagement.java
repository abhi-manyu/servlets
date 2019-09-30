package org.sessions.example;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Sessionmanagement")
public class Sessionmanagement extends HttpServlet
{

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			   throws ServletException, IOException
	{
		String username =request.getParameter("unm");
		String password= request.getParameter("pass");
		if(password!=null && password.equals("abhi"))
		{
			HttpSession s= request.getSession();
			s.setAttribute("usname",username);
			s.setAttribute("pas", password);
			//s.invalidate();
			response.sendRedirect("Welcome");
		}
	}

}
