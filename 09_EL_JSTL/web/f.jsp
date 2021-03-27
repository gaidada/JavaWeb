<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: 92311
  Date: 2021/3/11
  Time: 22:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Map<String, Object> map = new HashMap<>();
    map.put("a.a.a", "aavalue");
    map.put("b+b+b", "bbvalue");
    map.put("ccc", "ccvalue");
    request.setAttribute("map", map);
%>
${map['a.a.a']}
${map['b+b+b']}
</body>
</html>
