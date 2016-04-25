<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
HttpSession sessions = request.getSession();
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
	<title>Basic DataGrid - jQuery EasyUI Demo</title>
	<link rel="stylesheet" type="text/css" href="plugins/jquery-easyui-1.4.3/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="plugins/jquery-easyui-1.4.3/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="plugins/jquery-easyui-1.4.3/demo/demo.css">
	<script type="text/javascript" src="plugins/jquery-easyui-1.4.3/jquery.min.js"></script>
	<script type="text/javascript" src="plugins/jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="pages/jqgrid/customgrid.js"></script>
	<script type="text/javascript" src="pages/jqgrid/basegrid.js"></script>
</head>
<body>
	<h2>Basic DataGrid</h2>
	<p>The DataGrid is created from markup, no JavaScript code needed.</p>
	<div style="margin:20px 0;"></div>
	<!-- data-options="singleSelect:true,collapsible:true,url:'pages/jqgrid/datagrid_data1.json',method:'get'" -->
	<!-- <table id="dg" class="easyui-datagrid" title="Basic DataGrid" style="width:700px;height:250px"
	data-options="singleSelect:true,collapsible:true,url:'pages/jqgrid/datagrid_data1.json',method:'get'">
		<thead>
			<tr>
				<th data-options="field:'itemid',width:80">Item ID</th>
				<th data-options="field:'productid',width:100">Product</th>
				<th data-options="field:'listprice',width:80,align:'right'">List Price</th>
				<th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>
				<th data-options="field:'attr1',width:250">Attribute</th>
				<th data-options="field:'status',width:60,align:'center'">Status</th>
			</tr>
		</thead>
	</table> -->
	<table id="dg"></table>
 
</body>
</html>