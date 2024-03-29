<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP.Servlet 24-2</title>
</head>
<body>
	<c:set var="varName" value="varValue" />
	varName : <c:out value="${ varName }"></c:out><br>
	<br>
	<c:remove var="varName"/>
	varName : <c:out value="${ varName }"></c:out>
	
	<hr>
	
	<c:catch var="error">
		<%=2/0 %>
	</c:catch>
	<br>
	<c:out value="${ error }"></c:out>
	
	<hr>
	
	<c:if test="${1+2==3 }">
		1 + 2 = 3
	</c:if>
	
	<c:if test="${1+2!=3 }">
		1 + 2 != 3
	</c:if>
	
	<hr>
	
	<c:forEach var="fEach" begin="0" end="30" step="3">
		<c:out value="${fEach }"/>
	</c:forEach>
</body>
</html>