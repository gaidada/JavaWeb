<%--
  Created by IntelliJ IDEA.
  User: 92311
  Date: 2021/3/9
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
1111
<%
    out.write("out输出1<br/>");
    out.flush();
    out.write("out输出2<br/>");
    out.print(121212);
    out.write(97);
    response.getWriter().write("response输出1<br/>");
    response.getWriter().write("response输出2<br/>");
%>
</body>
</html>
