$(function() {
		$.ajax({
			type : "post",
			url : "../../loadTree.do",
			dataType:"JSON",
			success : function(data){
				$("#ttree").tree({
					data : data,
					onClick : function(node){
						 if ($("#tb").tabs('exists', node.text)) {
							 
					                $("#tb").tabs('select',node.text);
					            }else{
					            	$('#tb').tabs('add', {
					            		title:  node.text,
					            		href: node.attributes.url,
					            		closable: true
					            	});  
					       }
					}
				});
			}
		});
		$('#ctree').tree({
			data: [{
				text: '节点配置',
				state: 'open',
				iconCls:"icon-add",
				attributes:{
					"url":"../config/treeNodeConf.jsp"
					}
			}],
		onClick : function(node){
			 if ($("#tb").tabs('exists', node.text)) {
				 
		                $("#tb").tabs('select',node.text);
		            }else{
		            	$('#tb').tabs('add', {
		            		title:  node.text,
		            		href: node.attributes.url,
		            		closable: true
		            	});  
		       }
		
		}
		});
		
		$( "#accordion" ).accordion({
			 animate:false,
		      event: "click hoverintent"
		    });
});

