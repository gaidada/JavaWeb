<%--
  Created by IntelliJ IDEA.
  User: 92311
  Date: 2021/3/21
  Time: 3:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="login" method="get">
    用户名：<input type="text" name="username"><br/>
    密码：<input type="password" name="password"><br/>
    验证码：<input type="text" style="width: 50px" name="code">
    <img src="kaptch.jpg" style="width: 100px;height: 30px;"><br/>
    <input type="submit" value="注册">
</form>
</body>
</html>
