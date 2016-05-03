$(document).ready(function () {
	$('#dg').datagrid({
	    url:'pages/jqgrid/datagrid_data1.json',
	    columns:myColumns,
	    onLoadSuccess:autoMergeCell
	});
	//autoMergeCell();
	/*$('#dg').datagrid("autoMergeCells" , ['itemid','productid']);*/
});
function autoMergeCell(){
	$("#dg").datagrid('autoMergeCells', ['itemid','productid']);
	$('#dg').datagrid('footerSummery', ['listprice','unitcost']);
}
var myColumns = [[
                  {field:'itemid',title:'itemid',width:80},
                  {field:'productid',title:'productid',width:100},
                  {field:'attr1',title:'attr1',width:250},
                  {field:'listprice',title:'listprice',width:80,align:'right'},
                  {field:'unitcost',title:'unitcost',width:80,align:'right'},
                  {field:'status',title:'status',width:60,align:'center'}
                  ]];
