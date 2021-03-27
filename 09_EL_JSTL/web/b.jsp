<%--
  Created by IntelliJ IDEA.
  User: 92311
  Date: 2021/3/10
  Time: 0:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //往四个域中都保存了相同的key的数据
    request.setAttribute("key", "request");
    //pageContext.setAttribute("key", "pageContext");
    session.setAttribute("key", "session");
    application.setAttribute("key", "application");
%>
${key}
</body>
</html>
