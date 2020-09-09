<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import="com.fameena.model.LoginModel" %>

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
<div align="center"><h1>Grand Venetian Apartments</h1></div>
<%

LoginModel userdetails=(LoginModel)session.getAttribute("model");

%>
<div align="center">
<h3>Welcome</h3>
<p style="font-color:green;">${model.username}</p>
</div>

<div align="center">
<form action="details" method="post">
<label>Enter your ID</label>
<input type="text" name="id">
<input type="submit" value="CLick to see your Apartment Details">

</form>
</div>



</div>
</body>
</html>