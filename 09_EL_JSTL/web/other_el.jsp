<%--
  Created by IntelliJ IDEA.
  User: 92311
  Date: 2021/3/11
  Time: 23:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
输出请求参数：${param.username}<br/>
${paramValues.username[1]}<br/>
<hr/>
${header['User-Agent']}<br/>
${header.Connection}<br/>
${cookie.JSESSIONID.name}
${cookie.JSESSIONID.value}
<hr/>
${initParam.username}
</body>
</html>
