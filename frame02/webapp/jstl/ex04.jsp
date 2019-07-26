<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Java의 Tokensier class와 유사(문자열 자르기) -->
	<c:set var="msgs" value="java,web,db,spring"></c:set>
	<c:forTokens items="${msgs }" delims="," var="msg">
		<p>${msg }</p>
	</c:forTokens>
	
	<p>begin</p>
	<c:import url="ex03.jsp"></c:import>	
	<p>end</p>
	
	<c:url value="target.jsp" var="target">
		<c:param name="id" value="admin"></c:param>
	</c:url>
	
	<c:redirect url="${target }"></c:redirect>
	
	<a href="${target }">link</a>
	<c:import url="https://www.naver.com"></c:import>
</body>
</html>