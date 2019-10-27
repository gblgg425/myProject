<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>老师个人考勤信息</title>
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
		action="${pageContext.request.contextPath}/user/query/teacherKaoqin1">
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong class="icon-reorder"> 老师个人考勤信息</strong>
			</div>
			请输入你的教师证号：<input type="text" name="tno"> <input type="submit"
				value="查询">
			<hr>
			<table class="table table-hover text-center">
				<tr>
					<th width="120">序号</th>
					<td>教师证号</td>
					<td>姓名</td>
					<td>考勤情况</td>
				</tr>

				<th>${tkq.tId}</th>
				<th>${tkq.tNo}</th>
				<th>${tkq.tName}</th>
				<th>${tkq.kq.tcontion}</th>

			</table>
		</div>
	</form>
</body>
</html>