<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>首页</title>
	<link rel="stylesheet" type="text/css" href="../../plugins/jquery-easyui-1.4.3/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../plugins/jquery-easyui-1.4.3/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="../../plugins/jquery-easyui-1.4.3/demo/demo.css">
    <script type="text/javascript" src="../../plugins/jquery-easyui-1.4.3/jquery.min.js"></script>
    <script type="text/javascript" src="../../plugins/jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="pages/home/home.js"></script>
</head>
 <body class="easyui-layout">
    <div class="north" data-options="region:'north',split:true" style="height:100px;"></div>
    <div data-options="region:'south',split:true" style="height:50px;text-align: center;padding:10px 0;">
    		&copy; 2016 <span title="fenyou">FenYou</span>, Inc.
    		<a href="https://fenyou.com" style="text-decoration: none; color: #5f6163;font-weight: bold">FenYou集团</a>
    </div>
    <div data-options="region:'west',title:'首页',split:true" style="width:150px;">
    <div id="div-tree" class="easyui-panel">
	<!-- <ul class="easyui-tree" data-options="url:'tree_data2.json',method:'get',animate:true"></ul> -->
	<ul id="tree"></ul>
	</div>
    </div>
    <div data-options="region:'center',title:''" style="padding:5px;background:#eee;"></div>
</body>
</html>