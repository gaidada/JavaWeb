<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>购物车</title>
    <%@ include file="/pages/common/head.jsp" %>
    <script type="text/javascript">
        $(function () {
            $("a.deleteItem").click(function () {
                return confirm("确定删除[" + $(this).parent().parent().find("td:first").text() + "]吗")
            });
            $("#clearCart").click(function () {
                return confirm("确定清空吗？")
            });
            //输入框绑定事件
            $(".updateCount").change(function () {
                //获取商品名称
                var name = $(this).parent().parent().find("td:first").text();
                //获取商品数量
                var count = this.value;
                var id = $(this).attr("bookId");
                if (confirm("确认[" + name + "]修改数量为" + count + "吗？")) {
                    //发起请求，给服务器保存修改
                    location.href = "cartServlet?action=updateCount&count=" + count + "&id=" + id;
                } else {
                    //defaultValue属性是表单项daom对象的属性，表示默认value属性的值
                    this.value = this.defaultValue;
                }
            });
        });
    </script>
</head>
<body>

<div id="header">
    <img class="logo_img" alt="" src="static/img/logo.gif">
    <span class="wel_word">购物车</span>
    <%@include file="/pages/common/login_sucess_menu.jsp" %>
</div>

<div id="main">

    <table>
        <tr>
            <td>商品名称</td>
            <td>数量</td>
            <td>单价</td>
            <td>金额</td>
            <td>操作</td>
        </tr>

        <%--购物车为空--%>
        <c:if test="${empty sessionScope.cart.items}">
        <tr>
            <td colspan="5"><a href="index.jsp">购物车为空，浏览商品</a></td>
        </tr>
    </table>
    </c:if>

    <%--购物车不为空--%>
    <c:if test="${not empty sessionScope.cart.items}">

        <c:forEach items="${sessionScope.cart.items}" var="entry">
            <tr>
                <td>${entry.value.name}</td>
                <td><input class="updateCount" type="text" bookId="${entry.value.id}" style="width: 60px;"
                           value="${entry.value.count}"></td>
                <td>${entry.value.price}</td>
                <td>${entry.value.totalPrice}</td>
                <td><a class="deleteItem" href="cartServlet?action=deleteItem&id=${entry.value.id}">删除</a></td>
            </tr>
        </c:forEach>
        </table>
        <div class="cart_info">
            <span class="cart_span">购物车中共有<span class="b_count">${sessionScope.cart.totalCount}</span>件商品</span>
            <span class="cart_span">总金额<span class="b_price">${sessionScope.cart.totalPrice}</span>元</span>
            <span class="cart_span"><a id="clearCart" href="cartServlet?action=clear">清空购物车</a></span>
            <span class="cart_span"><a href="orderServlet?action=createOrder">去结账</a></span>
        </div>
    </c:if>

</div>

<%@ include file="/pages/common/footer.jsp" %>
</body>
</html>