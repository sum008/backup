<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Homepage</title>
</head>
<body>
Its homepage <br>
<a href="<%=request.getContextPath() %>/Controller?page=Login">Loginnnn</a> <br>
<a href="<%=request.getContextPath() %>/Controller?page=Signup">Signupp</a> <br>
<a href="<%=request.getContextPath() %>/Controller?page=About">Aboutt</a> <br>
</body>
</html>