<%--
  Created by IntelliJ IDEA.
  User: 92311
  Date: 2021/3/8
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>scope.jsp页面</h1>
<%
    pageContext.setAttribute("key", "pageContext");
    request.setAttribute("key", "request");
    session.setAttribute("key", "session");
    application.setAttribute("key", "application");
%>
pageContext值：<%=pageContext.getAttribute("key")%><br/>
request：<%=request.getAttribute("key")%><br/>
session：<%=session.getAttribute("key")%><br/>
application：<%=application.getAttribute("key")%><br/>
<%
//    request.getRequestDispatcher("/scope2.jsp").forward(request, response);
%>
<jsp:forward page="/scope2.jsp"></jsp:forward>
</body>
</html>
