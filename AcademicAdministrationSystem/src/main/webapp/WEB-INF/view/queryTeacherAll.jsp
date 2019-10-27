<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>所有老师信息</title>
<!-- 分页的标签库 -->
<%@ taglib prefix="itcast" uri="http://itcast.cn/common/"%>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/pintuer.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/admin.css">
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>


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
			<div class="padding border-bottom">
				<ul class="search">
					<li><a class="btn btn-info" style="width: 200px"
						href="${pageContext.request.contextPath}/user/query/addtTeacher">添加</a>
						<button name="update" class="btn btn-info" style="width: 200px"
							onclick="update()">全选</button>
						<button name="del1" class="btn btn-info" style="width: 200px"
							onclick="del1()">批量删除</button></li>
				</ul>
			</div>
			<table class="table table-hover text-center">
				<tr>

					<th width="120">序号</th>
					<th>姓名</th>
					<th>性别</th>
					<th>年龄</th>
					<th>职称</th>
					<th>操作1</th>
					<th>操作2</th>
				</tr>
				<c:forEach items="${teaAll }" var="teas" varStatus="vs">
					<tr>
						<td>${vs.count }</td>
						<td>${teas.tName }</td>
						<td>${teas.tSex }</td>
						<td>${teas.tAge }</td>
						<td>${teas.tPos }</td>

						<td><div class="button-group">
								<a class="button border-red " href="#"
									onclick="del2(${teas.tNo})"><span class="icon-trash-o"></span>删除</a>
							</div></td>

						<td><div class="button-group">
								<a class="button border-green "
									href="${pageContext.request.contextPath}/user/query/teacherInfo2?tno=${teas.tNo}"><span
									class="icon-edit"></span> 修改</a>
							</div></td>
					</tr>
				</c:forEach>

			</table>
		</div>
		<div align="center">
			<itcast:page
				url="${pageContext.request.contextPath }/user/query/teacherAllInfo?page =${page.page }" />
		</div>
	</form>
</body>
<script type="text/javascript">
function del2(id){
	if(flag=confirm("你确定要删除吗")){
		window.location.href="${pageContext.request.contextPath}/user/delete/teacherInfo?tNo="+id
	}
	/* if(flag){
		$.ajax({
			url:"${pageContext.request.contextPath}/user/delete/teacherInfo",
			async:true,
			data:{tNo:id},
			type:"post",
			success:function(data){
				if(data=="success"){
					alert(data);
					window.location.reload();
				}
			}
		});
	}; */
};


</script>
</html>