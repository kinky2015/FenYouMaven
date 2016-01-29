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
	});