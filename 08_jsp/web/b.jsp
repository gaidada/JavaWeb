<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.beans.JavaBean" %><%--
  Created by IntelliJ IDEA.
  User: 92311
  Date: 2021/3/7
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%! private Integer id;
    private String name;
    private static Map<String, Object> map;
%>
<%!
    static {
        map = new HashMap<String, Object>();
        map.put("key1", "value1");
        map.put("key2", "value2");
    }
%>
<%!
    public int abc() {
        return 123;
    }
%>
<%!
    public static class A {
        private int id;
    }
%>

<%=12%><br/>

<%=1.123%><br/>

<%="我是字符串"%>

<%=map%>
<%=request.getParameter("username")%>


<%
    int i = 11;
    if (i == 12) {
        System.out.println("i==12");
    } else {
        System.out.println("i!=12");
    }
%>
<table border="1" cellspacing="0">
    <%
        for (int j = 0; j < 10; j++) {
    %>
    <tr>
        <td>第<%=j%>行</td>
    </tr>
    <br/>
    <%
        }
    %>
</table>
<%
    String username = request.getParameter("username");
    System.out.println("用户名为" + username);
%>

<!--html注释-->

<%
    //单行java注释
    /*
    多行java注释
     */
%>

<%--这是jsp注释--%>
</body>
</html>
