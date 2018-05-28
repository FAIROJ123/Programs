<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="Javascript/login.js"></script>
</head>
<body>
	<form name="myform"  action="loginRegister" method="post"  >
		<table 
			style="background-color: gray; margin-left: 400px;">

			<tr>
				<td><h3 style="color:red;">${ErrorMessage }</h3>
					<h3 style="color:green;">${SuccessMessage }</h3></td>
			<tr>
				<td style="color: red"><h3>Login page</h3></td>

			</tr>
			<tr>
				<td>UserName:</td>
				<td><input type="text" name="name" ></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" ></td>
			</tr>
			<tr>
				<td><input type="submit" name="submit" value="login"
					style="color: green" onclick=" return loginvalidation();"></td>
				<td><a href="register.jsp">Registration</a></td>
			</tr>

		</table>
	</form>
</body>
</html>