
<!-- Directive -->
<!-- language = "Scripting Language"
extends = "className"
import="importList"
session="true | flase"
autoFlush = "true |false"
contentTpe="ctinfo"
errorPage = "error_url"
info="information"
isELIgnored="true|false"
isThreadSafe="true|false" -->
<%@page import="java.util.*"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello world</h1>
	
	<!--  -->
	
	<!-- Declaration -->
	<%!
		int vals = 1;
	%>
	
	<!-- scriptlet -->
	<%
		out.println(4+5);
	%>
	
	<!-- Expression -->
	<%=
		vals
	%>
</body>
</html>