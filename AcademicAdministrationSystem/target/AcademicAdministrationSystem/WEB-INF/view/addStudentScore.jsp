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
    <form method="post" class="form-x" action="${pageContext.request.contextPath}/user/add/addStudentScore1">  
      
       <div class="form-group">
	    <div class="label">
	      <label>学生编号：</label>
	    </div>
	    <div class="field">
	      <input type="text" class="input w50" id="fk_cjsid" name="fk_cjsid" placeholder="请输入学生编号" />
	      <div class="tips"></div>
	    </div>
	  </div>
	  <div class="form-group">
	    <div class="label">
	      <label>课程编号：</label>
	    </div>
	    <div class="field">
	      <input type="text" class="input w50" value="" id="fk_cjcid" name="fk_cjcid" placeholder="请输入课程编号" />
	      <div class="tips"></div>
	    </div>
	  </div>
	  <div class="form-group">
	    <div class="label">
	      <label>成绩：</label>
	    </div>
	    <div class="field">
	      <input type="text" class="input w50" value="" id="score" name="score" placeholder="请输入成绩" />
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
				alert("请输入学生编号");
			}
		}else if(id="cname"){
			var a = $(this).val();
			if(a==null){
				alert("请输入课程编号");
			}
		}else if(id="score"){
			var a = $(this).val();
			if(a==null){
				alert("请输入成绩");
			}
		}	
	})
})
</script>
</html>