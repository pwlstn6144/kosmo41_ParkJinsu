<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP/Servlet 13-2</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		
		session.invalidate();
		
		response.sendRedirect("login.html");
	%>
</body>
</html>