<%@page import="java.sql.Date"%>
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
	<h1>JSTL(JavaServer Pages Standard Tag Library)</h1>
	<ul>
		<li><c:out value="1234"></c:out></li>
		<li><c:out value="java"></c:out></li>
		<li><c:out value="${null }">jstl</c:out></li><!-- null값일 때 부여한 값으로, value값이 있으면 value가 출력  -->
	</ul>
	<c:set var="msg" value="abcd"></c:set>	<!-- default = page -->
	<ul>
		<li>${pageScope.msg }</li>
		<li>${requestScope.msg }</li>
		<li>${sessionScope.msg }</li>
		<li>${applicationScope.msg }</li>
		<li><c:out value="${msg }"></c:out></li>
	</ul>
	
	<jsp:useBean id="bean" class="com.bit.entity.JavaBean" scope="page"></jsp:useBean>
	<c:set target="${bean }" property="su1" value="1223"></c:set>	
	<c:set target="${bean }" property="su2" value="3.14"></c:set>
	<c:set target="${bean }" property="ch" value="@"></c:set>
	<c:set target="${bean }" property="boo" value="true"></c:set>
	<c:set target="${bean }" property="msg" value="abcde"></c:set>
	<c:set target="${bean }" property="nalja" value="<%=new java.util.Date() %>"></c:set>
	
	<ul>
		<li>${bean.su1 }</li>
		<li>${bean.su2 }</li>
		<li>${bean.ch }</li>
		<li>${bean.boo }</li>
		<li>${bean.msg }</li>
		<li>${bean.nalja }</li>
	</ul>
</body>
</html>



















