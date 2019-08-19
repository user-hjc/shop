//修改
function editDialog() {

    //获取数据  返回所有被选中的行 getSelections
    var rows = $("#data").datagrid('getSelections');
    //先判断是否选中一行数据
    if (1 != rows.length) {
        //弹出框
        $.messager.alert('警告', '请选择一条且只能选择一条数据');
        return;
    }

    //获取到一条已选择的数据
    var row1 = rows[0];
    //打开页面
    $("#addDialog").dialog('open').dialog('setTitle', '新增用户');
    //把数据加载到form表单中显示  
    $("#myform").form('load', row1);
    url = 'saveBook.do?bid=' + row1.bid;

}


//打开页面框
function openDialog() {
    //获取dialog的id
    $("#myDialog").dialog('open').dialog('setTitle', '添加数据');
}

//关闭
function cancelDialog() {

    $("#myDialog").dialog('close');
}


//添加函数
function addDialog() {
    //submit 提交方法
    $('#myform').form('submit', {
        url: 'addCar.do',
        //在提交之前触发，返回false可以终止提交
        onSubmit: function () {
            //对表单校验 validate
            return $("#myform").form('validate');
        },
        success: function (data) {
            alert("成功！！");
            //关闭当前窗口
            $("#myDialog").dialog('close');
            //刷新表格数据
            $("#data").datagrid('reload');

        }
    });


}


function OpenTab(Text, URL) {
    if ($("#MenusTabs").tabs('exists', Text)) {
        $("#MenusTabs").tabs('select', Text);
    } else {
        var Content = "<iframe frameborder='0' scrolling='auto' style='width:100%;height:100%' src=" + URL + "></iframe>";
        $("#MenusTabs").tabs('add', {
            title: Text,
            closable: true,
            content: Content
        });
    }
}

$(function () {


    /*var TreeMenusDatas=[{
        text:"图书馆图书系统",
        children:[{
            text:"小说图书信息",
            attributes:{
                url:"list.jsp"
            }
        }]
    }];
    
    $("#TreeMenus").tree({
        data:TreeMenusDatas,
        lines:true,
        onClick:function(node){
            if( node.attributes ){
                OpenTab( node.text, node.attributes.url );
            }
        }
    });*/
});