$(function() {// 初始化内容
    $('#login').click(function () {
        var data = {};
        data = {'user':$('#user').val(),'pwd':$('#pwd').val()};
        console.log(data);
        $.ajax({
            type: "POST",//方法类型
            dataType: "json",//预期服务器返回的数据类型
            url: "/system/index",
            data: data,
            success: function (result) {
                console.log(result);//打印服务端返回的数据(调试用)
                if (result.resultCode == 0) {
                    alert(result.resultMsg);
                };
            },
            error : function() {
                alert("异常！");
            }
        })
    })
})