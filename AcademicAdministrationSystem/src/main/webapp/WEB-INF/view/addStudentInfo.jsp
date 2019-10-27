<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/pintuer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
</head>

<body>
<div class="panel admin-panel">
  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>增加学生信息</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="${pageContext.request.contextPath}/user/add/addStudent1">  
      
       <div class="form-group">
	    <div class="label">
	      <label>学号：</label>
	    </div>
	    <div class="field">
	      <input type="text" class="input w50" id="sno" name="sno" placeholder="请输入学号" />
	      <div class="tips"></div>
	    </div>
	  </div>
      <div class="form-group">
        <div class="label">
          <label>姓名：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" id="sname"  name="sname"placeholder="请输入姓名" />
          <div class="tips"></div>
        </div>
      </div>
	  <div class="form-group">
	    <div class="label">
	      <label>性别：</label>
	    </div>
	    <div class="field">
	      <input type="text" class="input w50" value="" id="ssex" name="ssex" placeholder="请输入性别" />
	      <div class="tips"></div>
	    </div>
	  </div>
	  <div class="form-group">
	    <div class="label">
	      <label>年龄：</label>
	    </div>
	    <div class="field">
	      <input type="text" class="input w50" value="" id="sage" name="sage" placeholder="请输入年龄" />
	      <div class="tips"></div>
	    </div>
	  </div>
	  <div class="form-group">
	    <div class="label">
	      <label>籍贯：</label>
	    </div>
	    <div class="field">
	      <input type="text" class="input w50" value="" id="saddress" name="saddress" placeholder="请输入籍贯" />
	      <div class="tips"></div>
	    </div>
	  </div>
	 <div class="form-group">
	    <div class="label">
	      <label>班级编号：</label>
	    </div>
	    <div class="field">
	      <input type="text" class="input w50" value="" id="sbid" name="sbid" placeholder="请输入班级编号" />
	      <div class="tips"></div>
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
<script type="text/javascript">
 $(function(){
	$("input").change(function(){
		var id = $(this).attr("id");
		if(id=="sno"){
			var a = $(this).val();
			if(a==null){
				alert("请输入学号");
			}
		}else if(id=="sname"){
			var a = $(this).val();
			if(a==null){
				alert("请输入姓名");
			}
		}else if(id="ssex"){
			var a = $(this).val();
			if(a==null){
				alert("请输入性别");
			}
		}else if(id="sage"){
			var a = $(this).val();
			if(a==null){
				alert("请输入年龄");
			}
		}else if(id="saddress"){
			var a = $(this).val();
			if(a==null){
				alert("请输入籍贯");
			}
		}else if(id="sbid"){
			var a = $(this).val();
			if(a==null){
				alert("请输入班级编号");
			}
		}
		
	})
})
</script>
</html>