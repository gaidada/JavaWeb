<%--
  Created by IntelliJ IDEA.
  User: 92311
  Date: 2021/3/11
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    pageContext.setAttribute("key1","pageContext1");
    pageContext.setAttribute("key2","pageContext2");
    request.setAttribute("key2","request");
    session.setAttribute("key2","session");
    application.setAttribute("key2","application");
%>

${requestScope.key2}
</body>
</html>
