<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");

if(session.getAttribute("message")==null)
{
	response.sendRedirect("login.jsp");
}
else {
%>
	

		<h3>Hi ${message} </h3>
		<h3>Welcome to my Page</h3>
		<h3>If you want to Logout click on This Link</h3>
		
		<form action="Logout" method="post">
		<input type="submit" value="Logout"></input>
		</form>
		

		

	
	<%} %>
</body>
</html>