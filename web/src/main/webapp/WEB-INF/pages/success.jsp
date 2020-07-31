<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020-07-29
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
success<br>
<h3>添加</h3><br>
<form action="insert" method="post">

 username    <input  name="username" type="text"><br>
 password    <input  name="password" type="password"><br>
 money    <input  name="money" type="text"><br>
    <input type="submit" value="提交"><br>
</form>
<hr>
<table border="1px" align="center">
    <tr>
        <td>id</td>
        <td>username</td>
        <td>password</td>
        <td>money</td>
    </tr>
    <c:forEach items="${accounts}" var="item">
    <tr>
        <td>${item.id}</td>
        <td>${item.username}</td>
        <td>${item.password}</td>
        <td>${item.money}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
