<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑页面</title>
</head>
<body>
	<div style="width:500px;margin:0px auto;text-align:center">
		
		
		<div style="text-align:center;margin-top:40px">
			
			<form method="post" action="updateCategory">
				分类名称： <input name="name" value="${c.name}" type="text"> <br><br>
				<input type="hidden" value="${c.id}" name="id">
				<input type="submit" value="修改分类">
			</form>
	
		</div>	
	</div>

</body>
</html>