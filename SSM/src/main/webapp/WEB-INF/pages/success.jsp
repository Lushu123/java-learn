<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/9/4
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>成功</title>
</head>
<body>
    <h4>成功页面</h4>
    <c:forEach items="${accounts}" var="account">
        ${account.money}
    </c:forEach>
    ${accounts}
</body>
</html>
