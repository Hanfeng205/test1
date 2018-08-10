<!DOCTYPE html>
    <head>
        <meta charset="utf-8">
        <title>商品信息</title>
    <#--layui组件样式-->
    <link rel="stylesheet" href="${ctx!}/plugins/layui/css/layui.css"  media="all">
    <script src="//plugins/layui/css/layui.js" charset="utf-8"></script>
    <!-- easyui组件样式 -->
    <link rel="stylesheet" type="text/css" href="static/plugins/easyui/easyui.css">
    <link rel="stylesheet" type="text/css" href="static/plugins/easyui/icon.css">
    <!-- easyui js 文件 -->
    <script type="text/javascript" src="static/plugins/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="static/plugins/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="js/easyui-lang-zh_CN.js"></script>
    <#--bootscript-->
    <script type="text/javascript" src="http://libs.baidu.com/jquery/1.7.2/jquery.min.js"></script>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
<#--
    <link rel="stylesheet" href="${ctx!}/plugins/layui/css/layui.mobile.css"  media="all">
-->
</head>

<body>
<div>
    <div style="display: inline;margin: 2% 2%;width: 98%;">
        <div>
            <form action="addMerchInfo" name="addMerchForm">
                <button class="layui-btn">增加</button>
            </form>
        </div>
        <div>
            <button class="layui-btn">编辑</button>
        </div>
        <div>
            <form action="deleMerch" name="deleMerch">
                <button class="layui-btn">删除</button>
            </form>
        </div>
    </div>

<table class="layui-table" style="margin: 1% 2% 2% 2%;width:96%;">
    <thead>
    <tr>
        <th></th>
        <th>商品ID</th>
        <th>商品名称</th>
        <th>商品价格</th>
        <th>商品数量</th>

    </tr>
    </thead>
    <tbody>
    <#list merchList as list>
    <tr>
        <td><input type="checkbox"></td>
        <td>${list.merch_id}</td>
        <td>${list.merch_name }</td>
        <td>${list.merch_price}</td>
        <td>${list.merch_num}</td>
    </tr>
    </#list>
    </tbody>
</table>
</div>

</body>
</html>