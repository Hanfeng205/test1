<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <title>商品信息</title>
    <!-- easyui组件样式 -->
    <link rel="stylesheet" type="text/css" href="static/plugins/easyui/easyui.css">
    <link rel="stylesheet" type="text/css" href="static/plugins/easyui/icon.css">
    <!-- easyui js 文件 -->
    <script type="text/javascript" src="static/plugins/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="static/plugins/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="js/easyui-lang-zh_CN.js"></script>
</head>
<script type="text/javascript">
    $(function(){
        $('#datashow').datagrid({//datagrid：数据表格
            url:'/merchInfo',//一个URL从远程站点请求数据。
            columns:[[//colums:DataGrid列配置对象
                {field:'a',title:'a',width:80,checkbox:true},
                {field:'merch_id',title:'供药商编号',width:100},//hidden:true：隐藏
                {field:'merch_name',title:'供药商名称',width:100},
                {field:'merch_price',title:'联系方式',width:100},
                {field:'merch_num',title:'地址',width:100},
            ]],
            /*
            pagination:true,//如果为true，则在DataGrid控件底部显示分页工具栏。
            pageSize:10,//pageSize:在设置分页属性的时候初始化页面大小。
            pageList:[10,20,30],//pageList:在设置分页属性的时候 初始化页面大小选择列表。
            rownumbers:true,//rownumbers:如果为true，则显示一个行号列。
            toolbar: [{//新增
                iconCls: 'icon-add',
                text:'新增',
                handler: function(){
                    $('#addwindow').window('open');// open a window
                }
            },'-',{//删除
                iconCls: 'icon-remove',
                text:'删除',
                handler: function(){
                    var s=$('#datashow').datagrid('getSelections');
                    if(s.length>0){
                        $.messager.confirm('确认','您确认想要删除记录吗？',function(r){
                            if(r){
                                var ids=[];
                                for(var i=0;i<s.length;i++){
                                    ids.push(s[i].supplier_id);
                                }
                                $.ajax({
                                    url:'deleteSupplier',
                                    type:'post',
                                    dateType:'text',
                                    data:{supplier_ids:ids},
                                    success:function(resp){
                                        if(resp=="1"){
                                            $('#datashow').datagrid('reload');
                                        }else{

                                        }
                                    }
                                })
                            }
                            else{

                            }
                        });
                    }else{

                    }
                }
            },'-',{//修改
                iconCls: 'icon-edit',
                text:'修改',
                handler: function(){
                    var s = $('#datashow').datagrid('getSelections');
                    if(s.length==1){
                        $('#updatewindow').window('open');
                        $('#supplier_id1').textbox('setText',s[0].supplier_id)
                        $('#supplier_name1').textbox('setText',s[0].supplier_name)
                        $('#supplier_phone1').textbox('setText',s[0].supplier_phone)
                        $('#supplier_address1').textbox('setText',s[0].supplier_address)
                        $('#supplier_content1').textbox('setText',s[0].supplier_content)
                    }
                }
            },'-',{
                text:'<input id="search_inputs" type="text"/> <button id="search_button">搜索</button>'
            }
            ]
        */
        });
</script>
<body>
<h1>hello springboot!</h1>
<!-- 数据展示 -->
<table id="datashow"></table>

</body>
</html>