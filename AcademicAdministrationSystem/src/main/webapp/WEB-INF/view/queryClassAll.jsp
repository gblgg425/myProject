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
	<form method="post" action="${pageContext.request.contextPath}/user/query/addclass">
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong class="icon-reorder"> 班级信息</strong>
			</div>
			<table class="table table-hover text-center">
				<tr>
					<th width="120">序号</th>
					<th>班级号</th>
					<th>班级名</th>
					<th>班级人数</th>
					<th>班主任</th>
					<th>操作1</th>
					<th>操作2</th>
				</tr>
				<c:forEach items="${ClassAll}" var="aclass" varStatus="vs">
					<tr>
						<td>${vs.count }</td>
						<td>${aclass.bno }</td>
						<td>${aclass.bname }</td>
						<td>${aclass.bnum }</td>
						<td>${aclass.bzr}</td>
						<td><div class="button-group">
								<a type="button" class="button border-main" href="${pageContext.request.contextPath}/user/query/classInfoByid?id=${aclass.bno }"
									><span class="icon-edit"></span>修改</a>
								<a class="button border-red" href="javascript:void(0)"
									onclick="return del(17)"><span class="icon-trash-o"></span>
									删除</a>
							</div></td>
						<td><div class="button-group">
								<a class="button border-green "
									href="${pageContext.request.contextPath}/user/query/classstudent?cno=${aclass.bno }"><span
									class="icon-search"></span> 查看班级学生名单</a>
							</div></td>
					</tr>
				</c:forEach>
				<tr bgcolor="#87CEFA">
					<th width="120">添加班级</th>
					<th><input type="text" name="no"></th>
					<th><input type="text" name="name"></th>
					<th><input type="text" name="num"></th>
					<th><input type="text" name="bz"></th>
					<th><a type="submit" class="button border-main"
									><span class="icon-edit"></span>添加</a></th>
					<th></th>
				</tr>
			</table>
		</div>
	</form>
	<div class="panel admin-panel margin-top" id="change">
		<div class="panel-head" id="add">
			<strong><span class="icon-pencil-square-o"></span>修改内容</strong>
		</div>
		<div class="body-content">
			<form class="form-x" action="${pageContext.request.contextPath}/user/update/updateClass" method="post">
				<div class="form-group">
					<div class="label">
						<label>ID：</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" name="bid" value="${ClassByid.bno }" readonly="readonly"/>
						<div class="tips"></div>
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>班级名：</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" name="bname" value="${ClassByid.bname }" />
						<div class="tips"></div>
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>班级人数：</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" name="bnum" value="${ClassByid.bnum }" />
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>班主任：</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" name="bbzr" value="${ClassByid.bzr }" />
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label></label>
					</div>
					<div class="field">
						<button class="button bg-main icon-check-square-o" type="submit">
							提交</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</body>
<script type="text/javascript">
function del2(id){
	var flag=confirm("你确定要删除吗");
	if(flag){
		$.ajax({
			url:"${pageContext.request.contextPath}/user/delete/teacherInfo",
			async:true,
			data:{tNo:id},
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
</html>