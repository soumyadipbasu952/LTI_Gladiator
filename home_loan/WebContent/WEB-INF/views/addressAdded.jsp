<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%=session.getAttribute("userId") %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${ud.userId}</h1>
<h2>Your Address has been Added</h2>
<a href="propertyDetails.jsp">Add Property Details</a>

</body>
</html>