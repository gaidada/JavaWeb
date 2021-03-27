<%@ page import="java.util.ArrayList" %>
<%@ page import="com.pojo.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 92311
  Date: 2021/3/9
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息</title>
    <style>
        table {
            border: 1px red solid;
            width: 600px;
            border-collapse: collapse;
        }

        td {
            border: 1px red solid;
        }
    </style>
</head>
<body>
<%
    List<Student> stuList = (List<Student>) request.getAttribute("stuList");
%>
<table>
    <tr>
        <td>ID</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>电话</td>
    </tr>
    <%
        for (Student student : stuList) {
    %>
    <tr>
        <td><%=student.getId()%>
        </td>
        <td><%=student.getName()%>
        </td>
        <td><%=student.getAge()%>
        </td>
        <td><%=student.getPhone()%>
        </td>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
