function saveEdit(){
	if(validateEdit()){
		$.ajax({
	        url : '/admin/flink/update',
	        data : $("#editForm").serialize(),
	        success  : function(data) {
	        	if(data.code == '200'){
	        		$('#editModal').modal('hide');
	            	loadList();
                    closeEditWindow();
	            	autoCloseAlert(data.msg,1000);
	        	}else{
	        		autoCloseAlert(data.msg,1000);
	        	}
			}
	    });
	}
}

function validateEdit(){
	var siteName = $("#siteName").val();
	if(!isEmpty(siteName)){
		if(isSpecialSymbols(siteName)){
			autoCloseAlert("合作伙伴名称不能包含特殊符号",1000);
			return false;
		}
	}else{
		autoCloseAlert("合作伙伴名称不能为空",1000);
		return false;
	}
	
	var siteUrl = $("#siteUrl").val();
	if(isEmpty(siteUrl)){
		autoCloseAlert("合作伙伴地址不能为空",1000);
		return false;
	}
	
	var siteDesc = $("#siteDesc").val();
	if(isEmpty(siteDesc)){
		autoCloseAlert("网站描述不能为空",1000);
		return false;
	}
	
	var sort = $("#sort").val();
	if(isEmpty(sort)){
		autoCloseAlert("排序不能为空",1000);
		return false;
	}
	
	return true;
}

//关闭编辑窗口
function closeEditWindow(){
	$('#editModal').modal('hide');
}