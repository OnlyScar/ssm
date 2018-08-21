<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="width:500px;margin:0px auto;text-align:center">
		
		
		<div style="text-align:center;margin-top:40px">
			
			<form method="post" action="updateProduct">
				产品名称： <input name="name" value="${p.name}" type="text"> <br><br>
				<input type="hidden" value="${p.id}" name="id">
				产品价格:  <input name="price" value="${p.price}"> <br><br>
				<input type="submit" value="修改产品">
			</form>
	
		</div>	
	</div>
</body>
</html>