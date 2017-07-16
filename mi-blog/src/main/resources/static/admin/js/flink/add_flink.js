function saveAdd(){
	if(validateAdd()){
		$.ajax({
	        url : '/admin/flink/save',
	        data : $("#addForm").serialize(),
	        success  : function(data) {
	        	if(data.code == '200'){
	        		$('#addModal').modal('hide');
	            	loadList();
	            	autoCloseAlert(data.msg,1000);
                    closeAddWindow();
	        	}else{
	        		autoCloseAlert(data.msg,1000);
	        	}
			}
	    });
	}
}

// 校验新增banner输入框
function validateAdd(){
	var siteName = $("#siteName").val();
	if(!isEmpty(siteName)){
		if(isSpecialSymbols(siteName)){
			autoCloseAlert("名称不能包含特殊符号",1000);
			return false;
		}
	}else{
		autoCloseAlert("名称不能为空",1000);
		return false;
	}
	
	var siteUrl = $("#siteUrl").val();
	if(isEmpty(siteUrl)){
		autoCloseAlert("地址不能为空",1000);
		return false;
	}
	
	var siteDesc = $("#siteDesc").val();
	if(isEmpty(siteDesc)){
		autoCloseAlert("描述不能为空",1000);
		return false;
	}
	
	var sort = $("#sort").val();
	if(isEmpty(sort)){
		autoCloseAlert("排序不能为空",1000);
		return false;
	}
	
	return true;
}


function getRootPath() {
	//获取当前网址，如：
	var curWwwPath = window.document.location.href;
	//获取主机地址之后的目录，如： xx/xx.jsp
	var pathName = window.document.location.pathname;
	var pos = curWwwPath.indexOf(pathName);
	//获取主机地址，如： http://localhost:8080
	var localhostPaht = curWwwPath.substring(0, pos);
	//获取带"/"的项目名，如：/xx
	var projectName = pathName.substring(0,
			pathName.substr(1).indexOf('/') + 1);
	return (localhostPaht + projectName + "/uploads/");
}

//关闭新增窗口
function closeAddWindow(){
	$('#addModal').modal('hide');
}

