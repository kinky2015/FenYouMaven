<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
HttpSession sessions = request.getSession();
%>
<!DOCTYPE html>
<html>
<head>
    <title>jqgrid Demo</title>
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    
  <link rel="stylesheet" href="pages/login/login.css" type="text/css"></link>
  <script type="text/javascript" src="plugins/jquery2.1.4min/jquery-2.1.4.min.js"></script>
    <!-- This is the Javascript file of jqGrid -->   
    <script type="text/ecmascript" src="plugins/jqGrid/js/jquery.jqGrid.min.js"></script>
    <!-- This is the localization file of the grid controlling messages, labels, etc. -->
    <!-- We support more than 40 localizations -->
    <script type="text/ecmascript" src="plugins/jqGrid/js/i18n/grid.locale-en.js"></script>
    <!-- A link to a jQuery UI ThemeRoller theme, more than 22 built-in and many more custom -->
    <link rel="stylesheet" type="text/css" media="screen" href="plugins/jqGrid/css/jquery-ui.css" />
    <!-- The link to the CSS that the grid needs -->
    <link rel="stylesheet" type="text/css" media="screen" href="plugins/jqGrid/css/ui.jqgrid.css" />
  <script type="text/javascript" src="pages/jqgrid/gridfoot.js"></script>
  </head>
  <body>
	 <table id="jqGrid"></table>
    <div id="jqGridPager"></div> 	
  </body>
</html>