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
	<h1>제어문</h1>
	<h2>조건문</h2>
	<c:set var="su1" value="100"></c:set>
	
	<!-- if문 else, else if가 없다. if안에 if는 가능  ne == not eq-->
	<c:if test="${3 le su1 }">
		<c:if test="${3 eq su1 }">
			<p>같다</p>
		</c:if>
		<c:if test="${3 ne su1 }">
			<p>같지않다</p>
		</c:if>
	</c:if>
	
	<c:choose>
		<c:when test="${su1 eq 0 }">0입니다</c:when>
		<c:when test="${su1 eq 1 }">1입니다</c:when>
		<c:when test="${su1 eq 2 }">2입니다</c:when>
		<c:otherwise>몰라</c:otherwise>
	</c:choose>
	
	
</body>
</html>