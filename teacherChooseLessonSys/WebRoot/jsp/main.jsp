<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 
  <head>
    <base href="<%=basePath%>">
    
    <title>教师选课系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  	 <font>您好！欢迎您信任并使用这款软件</font>
  	 <br/>
  	 
  	 <form action="servlet/DoMainServlet" method="post">
     	<input type="submit" id="ksxk" value="开始选课" ></input>
     	<input type="hidden" id="flag" name="flag" value="1"></input>
     </form>
     <br/>
     
     <input type="button" id="tjjg" value="统计结果"></input>
     <br/>
     <input type="button" id="kbcx" value="课表查询"></input>
     <br/>
     <input type="button" id="sz" value="设置"></input>
     <br/>
     <input type="button" id="tc" value="退出"></input>
</html>
