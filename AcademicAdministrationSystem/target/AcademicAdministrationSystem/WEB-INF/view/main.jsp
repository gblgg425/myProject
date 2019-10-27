<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://shiro.apache.org/tags" prefix="shiro"%>

<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title>教务管理系统</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/pintuer.css">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/admin.css">
<script src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
</head>
<body style="background-color: #f2f9fd;">
	<div class="header bg-main">
		<div class="logo margin-big-left fadein-top">
			<h1>
				<img src="images/y.jpg" class="radius-circle rotate-hover"
					height="50" alt="" />教务管理系统
			</h1>
		</div>
		<div class="head-l">
			<a class="button button-little bg-green" href="" target="_blank"><span
				class="icon-home"></span> 前台首页</a> &nbsp;&nbsp;<a href="##"
				class="button button-little bg-blue"><span class="icon-wrench"></span>
				清除缓存</a> &nbsp;&nbsp;<a class="button button-little bg-red"
				href="${pageContext.request.contextPath }/gologin"><span class="icon-power-off"></span> 退出登录</a>
		</div>
	</div>
	<div class="leftnav">
		<div class="leftnav-title">
			<strong><span class="icon-list"></span>菜单列表</strong>
		</div>
		<h2>
			<span class="icon-user"></span>学生模块
		</h2>
		<ul style=display:none>
		<shiro:hasRole name="学生">
			<li>
			<a href="${pageContext.request.contextPath }/user/query/studenScore" target="right"><span
					class="icon-caret-right"></span>成绩查询</a></li>
			<li>
			<a href="${pageContext.request.contextPath }/user/query/courseInfo" target="right"><span
					class="icon-caret-right"></span>选课信息</a></li>
			<li>
			<a href="${pageContext.request.contextPath }/user/query/studentKaoqin" target="right"><span
					class="icon-caret-right"></span>考勤信息</a></li>
			<li>
			<a href="${pageContext.request.contextPath }/user/query/studentInfo" target="right"><span
					class="icon-caret-right"></span>个人信息</a></li>
			</shiro:hasRole>
		</ul>
		
		<h2>
			<span class="icon-user"></span>教师模块
		</h2>
		<ul style=display:none>
		<shiro:hasAnyRoles name="授课老师,班主任,教务主任,校长">
			<li><a href="${pageContext.request.contextPath }/user/query/teacherKaoqin" target="right"><span
					class="icon-caret-right"></span>教师个人考勤信息</a></li>
			<li><a href="${pageContext.request.contextPath }/user/query/studentScore" target="right"><span
					class="icon-caret-right"></span>学生成绩管理</a></li>
			<li><a href="${pageContext.request.contextPath}/user/query/studentCourse" target="right"><span
					class="icon-caret-right"></span>学生选课信息</a></li>
		</shiro:hasAnyRoles>
		<shiro:hasAnyRoles name="班主任,教务主任,校长">
			<li><a href="${pageContext.request.contextPath}/user/query/teacherInfo" target="right"><span
					class="icon-caret-right"></span>老师信息查询</a></li>
			<li><a href="${pageContext.request.contextPath }/user/query/studentInfoAll" target="right"><span
					class="icon-caret-right"></span>学生信息管理</a></li>
			<li><a href="${pageContext.request.contextPath }/user/query/classInfo" target="right"><span
					class="icon-caret-right"></span>班级信息查询</a></li>
			<li><a href="${pageContext.request.contextPath }/user/query/studentKaoqinAll" target="right"><span
					class="icon-caret-right"></span>学生考勤信息</a></li>
		</shiro:hasAnyRoles>
		<shiro:hasAnyRoles name="教务主任,校长">
			<li><a href="${pageContext.request.contextPath }/user/query/teacherAllInfo" target="right"><span
					class="icon-caret-right"></span>教师信息管理</a></li>
		</shiro:hasAnyRoles>
		<shiro:hasAnyRoles name="校长">
			<li><a href="${pageContext.request.contextPath }/user/query/teacherKaoqinAll" target="right"><span
					class="icon-caret-right"></span>全体教师考勤信息</a></li>
		</shiro:hasAnyRoles>
		</ul>					
		
		<h2>
			<span class="icon-cog"></span>系统设置
		</h2>
		<ul style=display:block>
			<li><a href="${pageContext.request.contextPath }/syset/updatePwd?username=${username}" target="right"><span
					class="icon-caret-right"></span>登录密码修改</a></li>
			<li><a href="${pageContext.request.contextPath }/syset/updateRole" target="right"><span
					class="icon-caret-right"></span>用户角色修改</a></li>
			<li><a href="${pageContext.request.contextPath }/syset/adminInfo" target="right"><span
					class="icon-caret-right"></span>管理员信息</a></li>
		</ul>
	</div>
	<script type="text/javascript">
		$(function() {
			$(".leftnav h2").click(function() {
				$(this).next().slideToggle(200);
				$(this).toggleClass("on");
			})
			$(".leftnav ul li a").click(function() {
				$("#a_leader_txt").text($(this).text());
				$(".leftnav ul li a").removeClass("on");
				$(this).addClass("on");
			})
		});
	</script>
	<ul class="bread">
		<li><a href="{:U('Index/info')}" target="right" class="icon-home">
				首页</a></li>
		<li><a href="##" id="a_leader_txt">网站信息</a></li>
		<li><b>当前语言：</b><span style="color: red;">中文</php></span>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;切换语言：<a href="##">中文</a> &nbsp;&nbsp;<a
			href="##">英文</a></li>
	</ul>
	<div class="admin">
		<iframe scrolling="auto" rameborder="0" src="index.jsp" name="right"
			width="100%" height="100%"></iframe>
	</div>
	<div style="text-align: center;"></div>
</body>
</html>