<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import="com.fameena.model.LoginModel" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h1>Welcome you are inside </h1>
<%

LoginModel userdetails=(LoginModel)session.getAttribute("model");
out.println(userdetails);

%>
<h3>Welcome</h3>
${model.username}
</body>
</html>