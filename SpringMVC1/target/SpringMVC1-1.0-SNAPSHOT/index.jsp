<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/25
  Time: 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>入门程序</h1>
    <a href="user/hello">check</a><br>

    <a href="user/param?username=123">请求参数绑定</a><br>

    <form method="post" action="user/saveAccount">
        用户名：<input name="username" type="text"><br>
        密码：<input name="passworld" type="text"><br>
        金额：<input name="money" type="text"><br>
        生日：<input name="date" type="text"><br>
        <input value="提交" type="submit"><br>
    </form>

</body>
</html>
