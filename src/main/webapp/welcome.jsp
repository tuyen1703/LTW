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
	 String u = request.getParameter("username");
	 String p = request.getParameter("password");
	 out.print("User: "+ u + "; Password: " + p);
	 session.setAttribute("user", u);
	 session.setAttribute("password", p);
	%>
	<a href="second.jsp">second jsp page</a>
</body>
</html>