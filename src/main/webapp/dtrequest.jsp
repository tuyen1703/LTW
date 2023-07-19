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
		String hoten = request.getParameter("hoten");
		out.print("Họ tên là: "+hoten);
		String ipdd = request.getRemoteAddr();
		String kieudl = request.getContentType();
		out.print("Địa chỉ IP: "+ipdd);
		out.print("Content type: "+kieudl);
		
	%>
</body>
</html>