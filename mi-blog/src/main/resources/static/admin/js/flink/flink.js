$(function() {
    $("#flink-manage-li").addClass("active");
    $("#flink-list-li").addClass("active");
    $("#flink-list-li").parent().addClass("in");
    var page = $("#current-page").val();
    if (page == null || page == 0) {
        page = 1;
    }
    $.ajax({
        url: '/admin/flink/initPage',
        data: 'page=' + page,
        success: function (data) {
            $("#total-num").text(data.totalCount);
            $("#total-page").text(data.totalPageNum);
            $("#current-page").text(data.page);
            if (data.totalCount > 0) {

                $.jqPaginator('#pagination', {
                    totalPages: data.totalPageNum,
                    totalCounts: data.totalCount,
                    visiblePages: 5,
                    currentPage: data.page,
                    prev: '<li class="prev"><a href="javascript:;">Previous</a></li>',
                    next: '<li class="next"><a href="javascript:;">Next</a></li>',
                    page: '<li class="page"><a href="javascript:;">{{page}}</a></li>',
                    onPageChange: function (num, type) {
                        $("#current-page").text(num);
                        loadList();
                    }
                });
            }else {
                loadList();
            }
        }
    });
});

// 跳转分页
function toPage(page) {
    $("#page").val(page);
    loadList();
}

// 加载菜单列表
function loadList() {
    var param = $("#keyword").val();
    // 收集参数
    var page = $("#now").val();
    if (isEmpty(page) || page == 0) {
        page = 1;
    }
    // 查询列表
    $.ajax({
        url: '/admin/flink/load',
        data: 'page=' + page+"&param="+param,
        success: function (data) {
            $("#dataList").html(data);
        }
    });

}
// 搜索
$("#search").on('click',function () {
    loadList();
});

// 删除栏目
$("#dataList").on('click','.delete',function () {
    var id = $(this).parent().data("id")

    new $.flavr({
        content: '确定要删除吗?',
        buttons: {
            primary: {
                text: '确定', style: 'primary', action: function () {

                    $.ajax({
                        url: '/admin/flink/delete',
                        data: 'id='+id,
                        success: function (data) {
                            if (data.code == '200') {
                                autoCloseAlert(data.msg, 1000);
                                loadList();
                            } else {
                                autoCloseAlert(data.msg, 1000);
                            }
                        }
                    });
                }
            },
            success: {
                text: '取消', style: 'danger', action: function () {

                }
            }
        }
    });
});

// 跳转栏目编辑页
$("#dataList").on('click','.edit',function () {
    var id = $(this).parent().data("id")
    $.ajax({
        url: '/admin/flink/editJump',
        data: 'id='+id,
        success: function (data) {
            $('#editContent').html(data);
            $('#editModal').modal('show');
            $('#editModal').addClass('animated');
            $('#editModal').addClass('flipInY');
        }
    });
});

// 跳转新增页面
$("#add").on("click",function () {
    $.ajax({
        url: '/admin/flink/addJump',
        success: function (data) {
            $('#addContent').html(data);
            $('#addModal').modal('show');
            $('#addModal').addClass('animated');
            $('#addModal').addClass('bounceInLeft');
        }
    });
});




