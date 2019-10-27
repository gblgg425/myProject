<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>老师考勤信息</title>
<!-- 分页的标签库 -->
<%@ taglib prefix="itcast" uri="http://itcast.cn/common/"%>
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
	<div class="panel admin-panel">
		<div class="panel-head">
			<strong class="icon-reorder"> 教师考勤情况</strong>
		</div>
		<div class="padding border-bottom">
			<a class="button border-yellow" href="${pageContext.request.contextPath }/user/add/tKaoQinAll"><span
				class="icon-plus-square-o"></span> 添加内容</a>
		</div>
		<table class="table table-hover text-center">
			<tr>
				<th width="5%">序号</th>
				<th>教师证号</th>
				<th>姓名</th>
				<th>考勤情况</th>
				<th width="250">操作</th>
			</tr>
			<c:forEach items="${list }" var="tk" varStatus="vs">
				<tr>
					<td>${vs.count }</td>
					<td>${tk.tNo }</td>
					<td>${tk.tName }</td>
					<td>${tk.kq.tcontion }</td>
					<td>
						<div class="button-group">
							<a type="button" class="button border-main" href="${pageContext.request.contextPath }/user/update/tKaoQinAll?tno=${tk.tNo }?tname=${tk.tName }"><span
								class="icon-edit"></span>修改</a> <a class="button border-red"
								href="javascript:void(0)" onclick="del(${tk.tId})"><span
								class="icon-trash-o"></span> 删除</a>
						</div>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	<div align="center">
		<itcast:page url="${pageContext.request.contextPath }/user/query/teacherKaoqinAll?page =${page.page }" />
	</div>
	<script>
		function del(id) {
			if (confirm("您确定要删除吗?")) {
				alert(id)
				$.ajax({
					url:"${pageContext.request.contextPath}/user/deleteRole",
					async:true,
					data:{rid:id},
					type:"post",
					success:function(data){
						if(data=="success"){
							window.location.reload();
						};
					}
				});
			}
		}
	</script>


</body>
</html>