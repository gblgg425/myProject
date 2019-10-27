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
				<strong class="icon-reorder"> 成绩查询</strong>
			</div>
			<div class="padding border-bottom">
				<ul class="search">
					<li>
						<a class="btn btn-info" style="width: 200px" href="${pageContext.request.contextPath}/user/add/studentScore">添加</a>				
					</li>
				</ul>
			</div>
			<table class="table table-hover text-center">
				<tr>
					<th>学号</th>
					<th>姓名</th>
					<th>班级</th>
					<th>课程</th>
					<th>成绩</th>
					<th>操作</th>
				</tr>
				<c:forEach items="${ascore}" var="ascore">
				<c:forEach items="${ascore.course}" var="cou">
					
					<tr>
						<td>${ascore.sNo}</td>
						<td>${ascore.sName}</td>
						<td>${ascore.cbj.bname}</td>
						<td>${cou.cName}</td>
						<td>${cou.cj.score}</td>
						<td width="200px"><div class="button-group">
								<a class="button border-green " href="${pageContext.request.contextPath}/user/query/studenScore2?sno=${ascore.sNo}"
									><span class="icon-edit"></span> 修改</a>
							</div></td>
					</tr>
					</c:forEach>
				</c:forEach>
			</table>
		</div>
	</form>
</body>
</html>