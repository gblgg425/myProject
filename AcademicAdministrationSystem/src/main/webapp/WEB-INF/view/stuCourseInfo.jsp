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
				<strong class="icon-reorder"> 选课查询</strong>
			</div>
			请输入你的学号：<input type="text" name="sno"> <input type="submit"
				value="查询">
			<hr>
			<table class="table table-hover text-center">
				<tr>
					
					<th>学号</th>
					<th>姓名</th>
					<th>课程</th>
				</tr>
				<c:forEach items="${sci}" var="sci">
				<c:forEach items="${sci.course}" var="cou">
					<tr>
						
						<td>${sci.sNo}</td>
						<td>${sci.sName}</td>
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
	<script type="text/javascript">
		function del(id) {
			if (confirm("您确定要删除吗?")) {

			}
		}

		$("#checkall").click(function() {
			$("input[name='id[]']").each(function() {
				if (this.checked) {
					this.checked = false;
				} else {
					this.checked = true;
				}
			});
		})

		function DelSelect() {
			var Checkbox = false;
			$("input[name='id[]']").each(function() {
				if (this.checked == true) {
					Checkbox = true;
				}
			});
			if (Checkbox) {
				var t = confirm("您确认要删除选中的内容吗？");
				if (t == false)
					return false;
			} else {
				alert("请选择您要删除的内容!");
				return false;
			}
		}
	</script>
</body>
</html>