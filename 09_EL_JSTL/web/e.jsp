<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: 92311
  Date: 2021/3/11
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    request.setAttribute("emptyNull", null);
    request.setAttribute("emptyStr","");
    request.setAttribute("emptyArr",new Object[]{});
    ArrayList<String> list = new ArrayList<>();
    request.setAttribute("emptyList",list);
    HashMap<String, Object> map = new HashMap<>();
    map.put("k1","v1");
    request.setAttribute("map",map);
%>
${empty emptyNull}<br/>
${empty emptyStr}<br/>
${empty emptyArr}<br/>
${empty emptyList}<br/>
${empty map}<br/>
</body>
</html>
