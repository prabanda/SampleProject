<%@page import="com.te.springmvc.dto.EmployeeBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="Header.jsp"%>
<%
String msg = (String) request.getAttribute("msg");
 EmployeeBean bean=(EmployeeBean)request.getAttribute("errorMsg");
%>
    
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Delete an EmployeeInfo</title>
</head>
<body>
<h1>
<%
		if (!msg.isEmpty() & msg != null) {
		%>
		<%=msg%>
		<%
		}
		%>
</h1>
<form action="./delete" method="get">
<label>Emp_id:</label><br>
<input type="number" name="id"> <br>
<input type="submit" value="delete">
</form>
</body>
</html>