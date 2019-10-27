<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>教师个人信息查询</title>
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
	<form
		action="${pageContext.request.contextPath}/user/query/teacherInfo1">
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong class="icon-reorder"> 教师个人信息</strong>
			</div>
			请输入你的教师证号：<input type="text" name="tno"> <input type="submit"
				value="查询">
			<hr>
			<table class="table table-hover text-center">

				<tr>
					<th width="20%">个人编号</th>
					<th width="20%">个人姓名</th>
					<th width="20%">性别</th>
					<th width="20%">年龄</th>
					<th width="20%">职位</th>

				</tr>


				<th>${t.tNo}</th>
				<th>${t.tName}</th>
				<th>${t.tSex}</th>
				<th>${t.tAge}</th>
				<th>${t.tPos}</th>




			</table>
		</div>
	</form>
</body>
</html>