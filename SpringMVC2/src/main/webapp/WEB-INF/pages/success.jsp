<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/25
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>欢迎${user1.username}登录本网站！</h3>
    <div>
        <span>账号：</span>${account.username}
    </div>
    <div>
        <span>密码：</span>${account.passworld}
    </div>
    <div>
        <span>金额：</span>${account.money}
    </div>
    <div>
        <span>日期：</span>${account.date}
    </div>
</body>
</html>
