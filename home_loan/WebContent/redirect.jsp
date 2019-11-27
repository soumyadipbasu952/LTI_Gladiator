<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/home_loan/addRequest" method="post">
<input type="text" value="<%=session.getAttribute("userId") %>" hidden>
 <input type="submit" value="continue">
</form>
</body>
</html>