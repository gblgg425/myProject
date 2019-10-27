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
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/pintuer.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath }/css/admin.css">
<script src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
<script src="${pageContext.request.contextPath }/js/pintuer.js"></script>
</head>
<body>
	<form method="post" action="${pageContext.request.contextPath }/user/query/courseInfo1">
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong class="icon-reorder">学生选课查询</strong>
			</div>
			<table class="table table-hover text-center">
				<tr>
					
					<th>学号</th>
					<th>姓名</th>
					<th>课程</th>
					
				</tr>
				<c:forEach items="${asc}" var="asc">
				<c:forEach items="${asc.course}" var="cou">
					<tr>
						
						<td>${asc.sNo}</td>
						<td>${asc.sName}</td>
						<td>${cou.cName}</td>
						
					</tr>
					</c:forEach>
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
	
</body>
</html>