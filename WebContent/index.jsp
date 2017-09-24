<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script  src="http://libs.baidu.com/jquery/1.7.2/jquery.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
$(document).ready(function(){
	$("button").click(function(){
		//alert("alert");
		$.post(
			"shop/allFoods",
			{shopId:1},
		 	function(result){
					 alert(result);
				}
			);
	  });
	});
	

</script>
</head>
<body>
<a href="helloworld">hello world</a>
<a href="showImage">showImage</a>
<form action="login" method="get">
<input name="firstName" value="jiang" type="text"/>
<input name="lastName" value="qianghua" type="text"/>
<input type="submit" value="Submit">
</form>
<div>add food</div>
<form action="shop/addShop" method="post">
	<input name="name" value="jiang你好" type="text"/>
	<input name="address" value="北京中关村" type="text"/>
	<input name="startTime" value="1499251214" type="text"/>
	<input name="endTime" value="1499251214" type="text"/>
	<input name="latitude" value="2343245" type="text"/>
	<input name="longitude" value="4124325" type="text"/>
	<input type="submit" value="Submit">
</form>
<div>all shop</div>
<form action="shop/allShops" method="post">
	<input type="submit" value="allShops">
</form>

<div>上传图片</div>
<form action="shop/foodImageUpload" method="post" enctype="multipart/form-data">
    选择文件:<input type="file" name="file">
    <input type="submit" value="上传"> 
</form>
<div>add food</div>
<form action="shop/addFood" method="post">
	<input name="name" value="尖椒肉丝" type="text"/>
	<input name="des" value="非常好吃" type="text"/>
	<input name="imageurl" value="http://www.badu.com" type="text"/>
	<input name="price" value="23.06" type="text"/>
	<input name="num" value="32" type="text"/>
	<input name="shopId" value="1" type="text"/>
	<input name="type" value="1" type="text"/>
	<input type="submit" value="Submit">
</form>
<div>all food</div>
<form action="shop/allFoods" method="post">
	<input name="shopId" value="1" type="text"/>
	<input type="submit" value="Submit">
</form>
<div>delete food</div>
<form action="shop/deleteFoodById" method="post">
	<input name="id" value="1" type="text"/>
	<input type="submit" value="Submit">
</form>
<div>test ajax</div>
<button onclick="onclick1">ajax submit</button>
<form action="shop/deleteFoodById" method="post">
	<input name="id" value="1" type="text"/>
	<input type="submit" value="Submit">
</form>
<div>添加订单</div>

</body>
</html>