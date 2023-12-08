<%@ page import="entity.Customer" %>
<%@ page import="run.Runner" %>
<%@ page import="servlets.FirstServlet" %>
<%@ page import="util.Util" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 07.12.2023
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index page</title>
</head>
<body>
<%= Runner.getCustomer().toString() %>
<% new Util().count(session);%>
<%= "<br>" + "Count = " + session.getAttribute("count") + "</br>"%>
</body>
</html>
