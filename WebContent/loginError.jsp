<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login to Grand Venetian</title>
</head>
<body bgcolor="yellow">
<div align="center"><h1 align="center">WELCOME TO GRAND VENETIAN</h1>
<a href="AboutUs.jsp">ABOUT US</a></div><br><hr>
<div align="center">
<h2 style="color:red;"> ***Wrong UserName or Password***</h2>
<p>Please login again with your correct Credentials or Contact Customer service 4699944917</p>
<h3 >Login to see your Details</h3><hr>
<form action="login" method="post">
<label>Enter your name:  </label>
<input type="text" name="uname"><br><br>
<label>Enter your password:  </label>
<input type="password" name="password"><br>
<br>
<input type="submit" value="Login">
</form>
</div>
</body>
</html>