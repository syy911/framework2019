<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>자료형</th>
			<th>JAVA</th>
			<th>EL</th>
		</tr>
		<tr>
			<th>String</th>
			<td><%="abcd" %></td>
			<td>${"ABCD" }</td>
		</tr>
		<tr>
			<th>String</th>
			<td><%out.print("abcd"); %></td>
			<td>${'ABCD' }</td>
		</tr>
		<tr>
			<th>숫자(정수)</th>
			<td><%=1234+2 %></td>
			<td>${1234+2 }</td>
		</tr>
		<tr>
			<th>숫자(정수-나눗셈)</th>
			<td><%=5/2 %></td>
			<td>${5 div 2 }</td>
		</tr>
		<tr>
			<th>실수</th>
			<td><%=3.14 %></td>
			<td>${3.14}</td>
		</tr>
		<tr>
			<th>실수(연산)</th>
			<td><%=3.00000000001-1.0000000000009 %></td>
			<td>${3.00000000001-1.0000000000009}</td>
		</tr>
		<tr>
			<th>true/false</th>
			<td><%=true %></td>
			<td>${true }</td>
		</tr>
		<tr>
			<th>true/false</th>
			<td><%=3==2+1 %></td>
			<td>${3==2+1 }</td>
		</tr>
		<tr>
			<th>true/false(==,eq)</th>
			<td><%=3==2%></td>
			<td>${3 eq 2}</td>
		</tr>
		<tr>
			<th>true/false(&gt;,gt)</th>
			<td><%=3 > 2%></td>
			<td>${3 gt 2}</td>
		</tr>
		<tr>
			<th>true/false(&lt;,lt)</th>
			<td><%=3 < 2%></td>
			<td>${3 lt 2}</td>
		</tr>
		<tr>
			<th>true/false(&ge;,ge)</th>
			<td><%=3 >= 2%></td>
			<td>${3 ge 2}</td>
		</tr>
		<tr>
			<th>true/false(&le;,le)</th>
			<td><%= 3<= 2%></td>
			<td>${3 le 2}</td>
		</tr>
		<tr>
			<th>null</th>
			<td><%
				String msg=null;
				out.print(msg);
			%></td>
			<td>${msg}</td>
		</tr>
	</table>
</body>
</html>