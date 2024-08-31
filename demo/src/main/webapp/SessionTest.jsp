<%--
  Created by IntelliJ IDEA.
  User: danya
  Date: 17.07.2024
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SessionTest</title>
</head>
<body>
        <%@ page import="SomePackage.Cart"%>

        <%Cart cart = (Cart) session.getAttribute("cart");%>
        <p>Price: <%=cart.getPrice()%> </p>
</body>
</html>
