<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<input type="text" value="<%=session.getAttribute("userId") %>" hidden>
<h1> Bank Detail Added</h1>

<a href ="insertAddress.jsp">Click Here to Continue</a>
</body>
</html>