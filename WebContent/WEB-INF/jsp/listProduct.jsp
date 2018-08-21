<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table align='center' border='1' cellspacing='0'>
	    <tr>
	        <td>id</td>
	        <td>name</td>
	        <td>price</td>
	        <td>编辑</td>
	        <td>删除</td>
	    </tr>
	    <c:forEach items="${ps}" var="c" varStatus="st">
	        <tr>
	            <td>${c.id}</td>
	            <td>${c.name}</td>
	            <td>${c.price}</td>  
	            <td><a href="editProduct?id=${c.id}">编辑</a></td> 
	            <td><a href="deleteProduct?id=${c.id}">删除</a></td>  
	        </tr>
	    </c:forEach>
	</table>

	<div style="text-align:center">
		<a href="?start=0">首  页</a>
		<a href="?start=${page.start-page.count}">上一页</a>
		<a href="?start=${page.start+page.count}">下一页</a>
		<a href="?start=${page.last}">末  页</a>
	</div>
	
	<div style="text-align:center;margin-top:40px">
    	<form method="post" action="addProduct">
    		产品名称:<input name="name" value="" type="text"/> <br><br>
    		产品价格:<input name="price" value="" type="text"/> <br><br>
    		<input type="submit" value="增加产品">
    	</form>
    </div>
	
	
</body>
</html>