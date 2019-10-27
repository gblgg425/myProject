<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/bootstrap-3.3.7-dist/css/bootstrap.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/pintuer.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/admin.css">
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
</head>
<body>
<div class="panel admin-panel margin-top">
  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>增加内容</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="${pageContext.request.contextPath }/user/addRole">   
      <input type="hidden" name="id"  value="" />  
      <div class="form-group">
        <div class="label">
          <label>教师证号：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="name" value="" data-validate="required:请输入用户名" />         
          <div class="tips"></div>
        </div>
      </div> 
      
       <div class="form-group">
        <div class="label">
          <label>姓名：</label>
        </div>
        <div class="field">
          <input type="password" class="input w50" name="pwd" value="" />         
          <div class="tips"></div>
        </div>
      </div>       
      <div class="form-group">
        <div class="label">
          <label>考勤：</label>
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