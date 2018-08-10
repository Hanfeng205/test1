<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <title>商品信息</title>
<#--layui组件样式-->
    <link rel="stylesheet" href="${ctx!}/plugins/layui/css/layui.css"  media="all">
    <!-- easyui组件样式 -->
    <link rel="stylesheet" type="text/css" href="static/plugins/easyui/easyui.css">
    <link rel="stylesheet" type="text/css" href="static/plugins/easyui/icon.css">
    <!-- easyui js 文件 -->
    <script type="text/javascript" src="static/plugins/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="static/plugins/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="js/easyui-lang-zh_CN.js"></script>
    <link rel="stylesheet" href="${ctx!}/plugins/layui/css/layui.mobile.css"  media="all">

</head>

<body>
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
    <legend>新增商品</legend>
</fieldset>
<form class="layui-form" action="addMerch">
    <div class="layui-form-item">
        <label class="layui-form-label">商品名称</label>
        <div class="layui-input-block">
            <input type="text" name="merch_name" lay-verify="title" autocomplete="off" placeholder="请输入商品名称" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">商品价格</label>
        <div class="layui-input-block">
            <input type="text" name="merch_price" lay-verify="number" autocomplete="off" placeholder="请输入商品价格" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">商品数量</label>
        <div class="layui-input-block">
            <input type="text" name="merch_num" lay-verify="number" autocomplete="off" placeholder="请输入商品数量" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit="" lay-filter="demo1">立即提交</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</form>
</body>
</html>