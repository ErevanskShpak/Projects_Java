<%--
  Created by IntelliJ IDEA.
  User: danya
  Date: 16.07.2024
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
    <h1>Testing JSP</h1>
    <p>
        <%@ page import="java.util.Date" %>
        <%

            for(int i=0; i<10;++i) {
                out.println("Hello, i am: " + i);
            }
        %>

        <%="I am Negr"%>
        <%= new Date()%>
    </p>
</body>
</html>
