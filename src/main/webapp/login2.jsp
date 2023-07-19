<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String user = request.getParameter("account");
	String password = request.getParameter("matkhau");
	out.print("Username: " + user + "; Password: " + password);
	%>
</body>
</html>