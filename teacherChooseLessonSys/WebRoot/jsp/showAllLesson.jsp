<%@ page language="java" import="java.util.*" pageEncoding="utf-8" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>选课界面</title>
    
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
    <table id="showAllLesson" border="1">
    	<tr>
    		<th>年级</th>
    		<th>专业</th>
    		<th>专业人数</th>
    		<th>课程名称</th>
    		<th>选修类型</th>
    		<th>学分</th>
    		<th>学时</th>
    		<th>实验学时</th>
    		<th>上机学时</th>
    		<th>起讫周序</th>
    		<th>备注</th>
    		<th>任课教师</th>
    	</tr>
    	<c:forEach items="${lessonList}" var="item">
    		<tr>
    			<td>${item.gread}</td>
    			<td>${item.subject}</td>
    			<td>${item.professionalNumber}</td>
    			<td>${item.className}</td>
    			<td>${item.type}</td>
    			<td>${item.credit}</td>
    			<td>${item.hours}</td>
    			<td>${item.experimentClass}</td>
    			<td>${item.onComputerClassHour}</td>
    			<td>${item.theOrderOfWeeks}</td>
    			<td>${item.remark}</td>
    			<td>${item.teacher}</td>
    		</tr>
    	</c:forEach>
    </table>
  </body>
</html>
