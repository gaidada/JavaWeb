<%--
  Created by IntelliJ IDEA.
  User: 92311
  Date: 2021/3/10
  Time: 0:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("key", "value");
%>
表达式脚本<%=request.getAttribute("ke")%><br/>
EL表达式输出${key}
</body>
</html>
