<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<input type="text" value="<%=session.getAttribute("userId")%>">
<h1>Property Details Added</h1>
<a href="insertPropertyAddress.jsp">Enter Property Address</a>
</body>
</html>