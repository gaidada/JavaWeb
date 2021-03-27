<%--
  Created by IntelliJ IDEA.
  User: 92311
  Date: 2021/3/11
  Time: 22:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%=request.getScheme()%><br/>
${pageContext.request.scheme}<br/>
<%=request.getServerName()%><br/>
${pageContext.request.serverName}<br/>
<%=request.getServerPort()%><br/>
${pageContext.request.serverPort}<br/>
<%=request.getContextPath()%><br/>
${pageContext.request.contextPath}<br/>
<%=request.getMethod()%><br/>
${pageContext.request.method}<br/>
<%=request.getRemoteHost()%><br/>
${pageContext.request.remoteHost}<br/>
<%=session.getId()%><br/>
${pageContext.session.id}
</body>
</html>
