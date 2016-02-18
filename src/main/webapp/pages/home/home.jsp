<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<title>首页</title>
    <link rel="stylesheet" type="text/css" href="home.css">
	<link rel="stylesheet" type="text/css" href="../../plugins/jquery-easyui-1.4.3/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../plugins/jquery-easyui-1.4.3/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="../../plugins/jquery-easyui-1.4.3/demo/demo.css">
    <script type="text/javascript" src="../../plugins/jquery-easyui-1.4.3/jquery.min.js"></script>
    <script type="text/javascript" src="../../plugins/jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="home.js"></script>
</head>
 <body class="easyui-layout">
    <div class="north" data-options="region:'north',split:true">
    	      <a id="config" class="configdiv" href="#">配置</a> 
    </div>
    <div class = "south" data-options="region:'south',split:true">
    		&copy; 2016 <span title="fenyou">FenYou</span>, Inc.
    		<a href="https://fenyou.com" class = "foot">FenYou集团</a>
    </div>
    <div class = "west" data-options="region:'west',title:'首页',split:true">
	<ul id="ttree" class="easyui-tree"></ul>
    </div>
    <div data-options="region:'center',title:'欢迎进入分忧平台！'">
    	<div id="tb" class="easyui-tabs" data-options="fit:true,border:false,plain:true">
				<div title="首页" style="padding:10px">关于本公司</div>
		</div>
    </div>
</body>
</html>