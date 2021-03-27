<%--
  Created by IntelliJ IDEA.
  User: 92311
  Date: 2021/3/11
  Time: 22:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${12==12}或${12 eq 12}<br/>
${12!=12}或${12 ne 12}<br/>
${12<12}或${12 lt 12}<br/>
${12>12}或${12 gt 12}<br/>
${12<=12}或${12 le 12}<br/>
${12>=12}或${12 ge 12}<br/>
<hr/>

${12==12 && 12>11} ${12==12 and 12>11}
${12==12 || 12>11} ${12==12 or 12>11}
${!true} ${not true}
</body>
</html>
