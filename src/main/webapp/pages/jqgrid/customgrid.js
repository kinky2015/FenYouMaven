$.extend($.fn.datagrid.methods, {
    autoMergeCells: function (jq, fields) {
        return jq.each(function () {
            var target = $(this);
            if (!fields) {
                fields = target.datagrid("getColumnFields");
            }
            var rows = target.datagrid("getRows");
            var i = 0,
            j = 0,
            temp = {};
            var rowstemp={};
            for(i;i<fields.length;i++){
            	var field = fields[i];
            	var tf = temp[field];
            	if(!tf){
            		tf=temp[field]={};
            	}
            	
        		var newrows = loop(tf,rows,field);
        		if(newrows){
        			rows=newrows;
        		}
            }
            $.each(temp, function (field, colunm) {
                $.each(colunm, function () {
                    var group = this;
 
                    if (group.length > 1) {
                        var before,
                        after,
                        megerIndex = group[0];
                        for (var i = 0; i < group.length; i++) {
                            before = group[i];
                            after = group[i + 1];
                            if (after && (after - before) == 1) {
                                continue;
                            }
                            var rowspan = before - megerIndex + 1;
                            if (rowspan > 1) {
                                target.datagrid('mergeCells', {
                                    index: megerIndex,
                                    field: field,
                                    rowspan: rowspan
                                });
//                                target.datagrid('insertRow',{
//                                	index:before+1,
//                                	row:{productid:"5",
//                                    	productname:"2",
//                                    	unitcost:12.00,
//                                    	status:"4",
//                                    	listprice:35.50,
//                                    	attr1:"3",
//                                    	itemid:"2"
//                                    }
//                                });
                            }
                            if (after && (after - before) != 1) {
                                megerIndex = after;
                            }
                        }
                    }
                });
            });
        });
    }//
});



function  loop(tf,rows,field){
	var newrow=new Array();
	var temps={};
	$.each(rows,function(index,row){
		if(row){
			 var ttf = tf[row[field]];
			 if(!ttf){
				 ttf=tf[row[field]] = [index]; 
			 }else{
				 ttf.push(index);
				 temps[row[field]]=tf[row[field]];
			 }
		}
	});
	$.each(temps,function(f,c){
		
		$.each(c,function(k,v){
			newrow[v]=rows[v];
		})
	});
	
	return newrow;
}