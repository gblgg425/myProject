<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>等待页面</title>
<script type="text/javascript">
	window.onload = function(){
		var time = 5;
		var secondEle = document.getElementById("second");
		var timer = setInterval(function(){
			secondEle.innerHTML = time;
			time--;
			if(time==0){
				clearInterval(timer);
				location.href="${pageContext.request.contextPath }/gologin";
			}
				
		},1000);
	}
</script>

</head>
<body>
密码修改成功<span style="color:red" id="second">5</span>秒钟后跳转，如不跳转点击<a href="${pageContext.request.contextPath }/gologin" >这里</a>!



</body>

</html>