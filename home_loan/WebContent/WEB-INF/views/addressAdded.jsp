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
<h1>${ud.userId}</h1>
<h2>Your Address has been Added</h2>
<a href="propertyDetails.jsp">Add Property Details</a>

</body>
</html>