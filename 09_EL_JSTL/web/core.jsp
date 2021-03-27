<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.List" %>
<%@ page import="com.pojo.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 92311
  Date: 2021/3/13
  Time: 9:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--遍历1到10，输出
being设置开始的索引
end设置结束的索引
var表示循环的变量
--%>
<c:forEach begin="1" end="10" var="i">
    ${i}<br/>
</c:forEach>
<%--遍历Object数组
items表示遍历的集合
var表示当前遍历的数据
--%>
<%
    request.setAttribute("arr", new String[]{"10086", "10010", "10000"});
%>
<c:forEach items="${requestScope.arr}" var="item">
    ${item}<br/>
</c:forEach>
<%--遍历map--%>
<%
    HashMap<String, Object> map = new HashMap<>();
    map.put("k1", "v1");
    map.put("k2", "v2");
    map.put("k3", "v3");
    request.setAttribute("map", map);
%>
<c:forEach items="${requestScope.map}" var="entry">
    <h1>${entry.value}</h1>
</c:forEach>
<%--遍历List集合--%>
<%
    List<Student> studentList = new ArrayList<>();
    for (int i = 1; i <= 10; i++) {
        studentList.add(new Student(i, "username" + i, "password" + i, 18 + i, "138" + i));
    }
    request.setAttribute("stus", studentList);
%>
<table border="1px solid red">
    <tr>
        <th>编号</th>
        <th>用户名</th>
        <th>密码</th>
        <th>年龄</th>
        <th>电话</th>
    </tr>

    <c:forEach begin="2" end="7" step="2" varStatus="status" items="${requestScope.stus}" var="stu">
        <tr>
            <td>${stu.id}</td>
            <td>${stu.name}</td>
            <td>${stu.password}</td>
            <td>${stu.age}</td>
            <td>${stu.phone}</td>
            <td>${status.step}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
