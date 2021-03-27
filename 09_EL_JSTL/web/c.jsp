<%@ page import="com.pojo.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: 92311
  Date: 2021/3/10
  Time: 0:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Person person = new Person();
    person.setName("gai");
    person.setPhones(new String[]{"10086", "10010", "10000"});
    List<String> cities = new ArrayList<>();
    cities.add("beijing");
    cities.add("shanghai");
    cities.add("guangzhou");
    person.setCities(cities);
    Map<String, Object> map = new HashMap<>();
    map.put("k1", "v1");
    map.put("k2", "v2");
    map.put("k3", "v3");
    person.setMap(map);
    pageContext.setAttribute("p", person);
%>
输出person：${p}<br/>
输出name属性：${p.name}<br/>
输出phones数组属性：${p.phones[1]}<br/>
输出cities list集合属性：${p.cities[0]}<br/>
输出map集合属性：${p.map.k1}<br/>
输出age：${p.age}
</body>
</html>
