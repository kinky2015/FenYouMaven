	$(function() {
		
		$.ajax({
			type : "post",
			url : "../../loadTree.do",
			dataType:"JSON",
			success : function(data){
				$("#ttree").tree({
					data : data
				});
			}
		});
		
		
		/*$("#ttree").tree({
			url:"../../loadTree.do"
			loadFilter: function(data){
				return data.node;
			}
		});*/
	});