<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
String username1="";
String password1="";

//防止中文乱码
request.setCharacterEncoding("utf-8");

username1 = request.getParameter("username");
password1 = request.getParameter("password");

session.setAttribute("username", username1);

if("1120140950".equals(username1)&&"960701".equals(password1))
{
    
	//request.getRequestDispatcher("login_success.jsp").forward(request, response);
	//response.sendRedirect("login_success.jsp");
	response.sendRedirect("home.jsp");
}
else
{   //请求重定向
	response.sendRedirect("login_failure.jsp");	
}

%>
