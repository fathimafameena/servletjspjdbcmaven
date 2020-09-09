<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
     <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body bgcolor="yellow">
<div align="center"><h1 align="center">WELCOME TO GRAND VENETIAN</h1>
<a href="AboutUs.jsp">ABOUT US</a></div><br><hr>
<div align="center">
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