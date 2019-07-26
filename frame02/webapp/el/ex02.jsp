<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String msg = "hello el";
		/* scope에 싣어줘야 출력된다*/
		pageContext.setAttribute("msg", msg);
		
		// 중복되어 있을 때 우선순위 
		// page > request > session > application
	%>
	<h1>동작</h1>
	<!-- null 출력X -->
	<p>${pageScope.msg }</p>
	<p>${requestScope.msg }</p>
	<p>${sesstionScope.msg }</p>
	<p>${applicationScope.msg }</p>
</body>
</html>