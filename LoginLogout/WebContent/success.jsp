<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <%
    String usename=null;
    String passwo=null;
    Cookie[] cks=request.getCookies();
    if(cks!=null)
     { 
        if(cks[0].getName().equals("username") && cks[1].getName().equals("password"))
        {
         usename=cks[0].getValue();
         passwo=cks[1].getValue();
        }
    }
    if(usename==null)
    {
        RequestDispatcher rd=request.getRequestDispatcher("index.html");
        PrintWriter pw=response.getWriter();
        pw.println("<html><body>"+
        "<h2 style='color:red'>Access denied .. first log into ur account plz.</h2>"+
        "</body></html>");
       response.sendRedirect("index.html");
    }
    %>
    <h2>Hii u r logged in </h2>
    <h3> ur username : <%=usename %></h3>
    <h3>ur password : <%=passwo %></h3>
    <form action="./logoutservlet">
        <input type="submit" value="Logout" />
    </form>
  </body>
</html>