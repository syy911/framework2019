<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>입력페이지</h1>
	<form action="insert.action">
		<div>
			<label for="sub">sub</label>
			<input type="text" id="sub" name="sub"/>
		</div>
		<div>
			<label for="name">name</label>
			<input type="text" id="name" name="name"/>
		</div>
		<div>
			<textarea name="content" rows="5" cols="50"></textarea>
		</div>
		<div>
			<button type="submit">입력</button>
		</div>
	</form>
</body>
</html>