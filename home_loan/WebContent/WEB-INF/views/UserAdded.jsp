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
<h1>hello ${user.firstName} ${user.userId}</h1>
<br><br>
<a href ="typeOfEmployment.jsp">Select type of Employment</a>

</body>
</html>