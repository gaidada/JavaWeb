<%--
  Created by IntelliJ IDEA.
  User: 92311
  Date: 2021/3/9
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
头部信息<br/>
主体内容<br/>

<jsp:include page="/include/footer.jsp">
    <jsp:param name="username" value="bbj"/>
    <jsp:param name="password" value="123"/>
</jsp:include>
</body>
</html>
