<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/pintuer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>


<link href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/pintuer.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/admin.css">
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
<script src="${pageContext.request.contextPath}/js/pintuer.js"></script>
</head>
<body>
	<form method="post" action="">
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong class="icon-reorder"> 学生信息查询</strong>
			</div>
			<div class="padding border-bottom">
				<ul class="search">
					<li>
						<a class="btn btn-info" style="width: 200px" href="${pageContext.request.contextPath}/user/add/studentInfo">添加</a>
						<button name="update" class="btn btn-info" style="width: 200px"
							onclick="update()">全选</button>
						<button name="del1" class="btn btn-info" style="width: 200px"
							onclick="del1()">批量删除</button>

					</li>
				</ul>
			</div>
			<table class="table table-hover text-center">
				<tr>
					<th>学号</th>
					<th>姓名</th>
					<th>性别</th>
					<th>年龄</th>
					<th>籍贯</th>
					<th>班级</th>
					<th>操作1</th>
					<th>操作2</th>
				</tr>
				<c:forEach items="${asi}" var="asi">
					<tr>
						<td>${asi.sNo}</td>
						<td>${asi.sName}</td>
						<td>${asi.sSex}</td>
						<td>${asi.sAge}</td>
						<td>${asi.sAddress}</td>
						<td>${asi.cbj.bname}</td>
						<td width="200px"><div class="button-group">
								<a class="button border-red " href="#"
									onclick="del2(${asi.sNo})"><span class="icon-trash-o"></span>删除</a>
							</div></td>
						
						<td width="200px"><div class="button-group">
								<a class="button border-green " href="${pageContext.request.contextPath}/user/query/studentInfo2?sno=${asi.sNo}"
									><span class="icon-edit"></span> 修改</a>
							</div></td>
					</tr>
					</c:forEach>
				
				<tr>
					<td colspan="8"><div class="pagelist">
							<a href="">上一页</a> <span class="current">1</span><a href="">2</a><a
								href="">3</a><a href="">下一页</a><a href="">尾页</a>
						</div></td>
				</tr>
			</table>
		</div>
	</form>
	<script type="text/javascript">
function del2(id){
	var flag=confirm("你确定要删除吗");
	if(flag){
		$.ajax({
			url:"${pageContext.request.contextPath}/user/delete/studentInfo",
			async:true,
			data:{sNo:id},
			type:"post",
			success:function(data){
				if(data=="success"){
					window.location.reload();
				};
			}
		});
	};
};


</script>
</body>
</html>