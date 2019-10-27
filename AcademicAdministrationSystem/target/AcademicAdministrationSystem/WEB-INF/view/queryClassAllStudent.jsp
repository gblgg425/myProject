<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>所有老师信息</title>
<link
	href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.css"
	rel="stylesheet">
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
				<strong class="icon-reorder"> 教师信息管理</strong>
			</div>
			<div class="padding border-bottom"></div>
			<table class="table table-hover text-center">
				<tr>
					<th width="120">序号</th>
					<th>学号</th>
					<th>姓名</th>
					<th>性别</th>
					<th>年龄</th>
					<th>住址</th>
					<th>班级</th>
				</tr>
				<c:forEach items="${ClassAllStudent }" var="classstu" varStatus="vs">
					<tr>
						<td>${vs.count }</td>
						<td>${classstu.sNo }</td>
						<td>${classstu.sName }</td>
						<td>${classstu.sSex }</td>
						<td>${classstu.sAge }</td>
						<td>${classstu.sAddress }</td>
						<td>${classstu.sBid }</td>
					</tr>
				</c:forEach>
			</table>

			<div class="button-group">
				<a class="button border-green"
					href="${pageContext.request.contextPath }/user/query/classInfo"><span
					class="el-icon-back"></span> 《《《返回班级列表页</a>
			</div>

		</div>
	</form>
</body>
</html>