<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Yahoo from JSP</title>
</head>
<%
System.out.println("Dummy");
System.out.println(request.getParameter("name"));
Date date = new Date();
%>
<div>Current Date is <%=date%></div>
<body>
My first JSP ${name}
</body>
</html>