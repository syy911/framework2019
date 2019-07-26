<%@page import="com.bit.entity.JavaBean"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%
	String[] strs={"ab", "abc", "abcd", "abcde"}; 	

	ArrayList<String> alist = new ArrayList<String>();
	alist.add("AB");
	alist.add("ABC");
	alist.add("ABCD");
	alist.add("ABCDE");
	
	//Hash는 순서가 없다.
	HashSet<String> hset = new HashSet<String>();
	hset.add("a");
	hset.add("ab");
	hset.add("abc");
	hset.add("abcd");
	
	HashMap<String, String> hmap=new HashMap<String, String>();
	hmap.put("key1", "val1");
	hmap.put("key2", "val2");
	hmap.put("key3", "val3");
	hmap.put("key4", "val4");
	
	JavaBean bean= new JavaBean();
	bean.setSu1(1234);
	bean.setSu2(3.14);
	bean.setCh('A');
	bean.setBoo(true);
	bean.setMsg("bean object");
	bean.setNalja(new Date());
//	pageContext.setAttribute("strs", strs); ${strs[0]}
//	pageContext.setAttribute("list", alist);${list.get(0)}
//	pageContext.setAttribute("list", hset);	${list[0]}
//	pageContext.setAttribute("map", hmap);	${map.key1}
	pageContext.setAttribute("bean", bean);
%>
<body>
	<h1>자료 표현</h1>
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