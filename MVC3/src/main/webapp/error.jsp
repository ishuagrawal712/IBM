<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ArrayList<String> list =(ArrayList<String>) request.getAttribute("errors");
for(String obj : list)
{
	out.println(obj+ "<br>");
}
%>
</body>
</html>