<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="config.css">
 	<link rel="stylesheet" type="text/css" href="../../plugins/jquery-easyui-1.4.3/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="../../plugins/jquery-easyui-1.4.3/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="../../plugins/jquery-easyui-1.4.3/demo/demo.css">
    <script type="text/javascript" src="../../plugins/jquery-easyui-1.4.3/jquery.min.js"></script>
    <script type="text/javascript" src="../../plugins/jquery-easyui-1.4.3/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="config.js"></script>
</head>
<body>
		<table class="easyui-datagrid" title="DataGrid with Toolbar" style="width:700px;height:250px"
		data-options="rownumbers:true,singleSelect:true,url:'datagrid_data1.json',method:'get',toolbar:toolbar">
			<thead>
			<tr>
			<th data-options="field:'itemid',width:80">Item ID</th>
			<th data-options="field:'productid',width:100">Product</th>
			<th data-options="field:'listprice',width:80,align:'right'">List Price</th>
			<th data-options="field:'unitcost',width:80,align:'right'">Unit Cost</th>
			<th data-options="field:'attr1',width:240">Attribute</th>
			<th data-options="field:'status',width:60,align:'center'">Status</th>
			</tr>
			</thead>
		</table>
</body>
</html>