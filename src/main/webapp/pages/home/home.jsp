<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>首页</title>
	<link rel="stylesheet" type="text/css" href="../../plugins/jquery-easyui-1.4.3/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../plugins/jquery-easyui-1.4.3/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="../../plugins/jquery-easyui-1.4.3/demo/demo.css">
    <script type="text/javascript" src="../../plugins/jquery-easyui-1.4.3/jquery.min.js"></script>
    <script type="text/javascript" src="../../plugins/jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
</head>
 <body class="easyui-layout">
    <div data-options="region:'north',title:'North Title',split:true" style="height:100px;"></div>
    <div data-options="region:'south',title:'South Title',split:true" style="height:100px;"></div>
    <div data-options="region:'east',title:'East',split:true" style="width:100px;"></div>
    <div data-options="region:'west',title:'West',split:true" style="width:100px;"></div>
    <div data-options="region:'center',title:'center title'" style="padding:5px;background:#eee;"></div>
</body>
</html>