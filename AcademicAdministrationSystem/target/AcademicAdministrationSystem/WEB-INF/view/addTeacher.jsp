<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/pintuer.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/admin.css">
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
</head>

<body>
	<div class="panel admin-panel">
		<div class="panel-head" id="add">
			<strong><span class="icon-pencil-square-o"></span>增加教师</strong>
		</div>
		<div class="body-content">
			<form method="post" class="form-x"
				action="${pageContext.request.contextPath}/user/query/addtTeacher1">

				<div class="form-group">
					<div class="label">
						<label>编号：</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" id="tno" name="tno"
							placeholder="请输入编号" />
						<div class="tips"></div>
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>姓名：</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" id="tname"
							name="tname" placeholder="请输入姓名" />
						<div class="tips"></div>
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>性别：</label>
					</div>
					<div class="field">
						<select id="tsex" name="tsex" class="input w50">
							<option>男</option>
							<option>女</option>
						</select>
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>年龄：</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" id="tage"
							name="tage" placeholder="请输入年龄" />
						<div class="tips"></div>
					</div>
				</div>


				<div class="form-group">
					<div class="label">
						<label>职称：</label>
					</div>
					<div class="field">
						<select id="tpos" name="tpos" class="input w50">
							<option>普通教师</option>
							<option>班主任</option>
							<option>教导主任</option>

						</select>
						<div class="tips"></div>
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label></label>
					</div>
					<div class="field">
						<button class="button bg-main icon-check-square-o" type="submit"
							onclick="return check();">提交</button>
					</div>
				</div>
			</form>
		</div>
	</div>

</body>
<script type="text/javascript">
	function check() {
		var tno = $('#tno').val();
		var tname = $('#tname').val();
		var tage = $('#tage').val();
		if (tno =='') {
			alert("这个ID不得行!");
			return false;
		} else if(tname==''){
			alert("这个name不得行!");
			return false;
		}else if(tage==''){
			alert("这个age不得行!");
			return false;
		}else{
			return true;
			
		}
	}
</script>
</html>