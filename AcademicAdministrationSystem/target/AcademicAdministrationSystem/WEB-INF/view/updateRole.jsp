<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改角色</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/pintuer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/admin.css">
<script src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
<script src="${pageContext.request.contextPath }/js/pintuer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
</head>
<body>

<div class="panel admin-panel">
  <div class="panel-head"><strong class="icon-reorder"> 用户列表</strong></div>
  <div class="padding border-bottom">  
  <a class="button border-yellow" href=""><span class="icon-plus-square-o"></span> 添加内容</a>
  </div> 
  <table class="table table-hover text-center">
    <tr>
      <th width="5%">序号</th>     
      <th>用户名</th>  
      <th>角色</th>     
      <th width="250">操作</th>
    </tr>
   <c:forEach items="${UserAll}" var="user" varStatus="vs">
    <tr>
      <td>${vs.count }</td>      
      <td>${user.uName }</td>  
      <td>${user.role}</td>      
      <td>
      <div class="button-group">
      <a type="button" class="button border-main" href="#" onclick="change(${user.uId})"><span class="icon-edit"></span>修改</a>
       <a class="button border-red" href="javascript:void(0)" onclick="return del(${user.uId})"><span class="icon-trash-o"></span> 删除</a>
      </div>
      </td>
    </tr> 
    </c:forEach>
    
  </table>
</div>
<script>
function del(id){
	if(id==1){
		alert("该角色不能修改");
	}else if(confirm("您确定要删除吗?")){
		alert(id);
	}
}

function change(id){
	if(id==1){
		alert("该角色不能修改");
	}else if(confirm("您确定要修改吗?")){
		alert(id);
		$("#change").fadeToggle(1000);
	}
}

function subclose(){
	alert("确认提交")
	$("#change").style.display="none";
}
</script>

<div class="panel admin-panel margin-top" id="change" style="display: none;">
  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>修改内容</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="${pageContext.request.contextPath }/user/updateRole?id=uid" onsubmit="subclose()">   
      <input type="hidden" name="id"  value="" />  
      <div class="form-group">
        <div class="label">
          <label>ID：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="uid" value="" />         
          <div class="tips"></div>
        </div>
      </div> 
       <div class="form-group">
        <div class="label">
          <label>用户名：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="uname" value="" />         
          <div class="tips"></div>
        </div>
      </div>       
      <div class="form-group">
        <div class="label">
          <label>角色：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="role" value="" />         
        </div>
      </div>
     <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
        </div>
      </div>
    </form>
  </div>
</div>


</body>
</html>