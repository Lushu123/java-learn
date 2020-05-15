<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/28
  Time: 20:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>fileupload</title>
</head>
<body>
    <form action="text/fileuploads" method="post" enctype="multipart/form-data">
        选择文件：<input type="file" name="fileupload"><br>
        <input type="submit" value="提交">
    </form>
    <br>
    <form action="annotation/login1" method="post">
        用户名：<input type="text" name="username">
        密码：<input type="password" name="password">
        <input type="submit" value="提交">
    </form>
    <br>
    <a href="annotation/requestMapping">requestMapping测试</a>
    <a href="user/register">注册</a>
    <hr>
    <br>
    <h3>数据绑定测试</h3>
    <a href="DataBindingTest/pathVariableTest/5">@PathVariable测试</a><br>
    <a href="DataBindingTest/requestHeaderTest">@RequestHeader测试</a><br>


<script src="js/jquery-3.4.1.min.js"></script>
</body>
</html>
