<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<%=session.getAttribute("userId")%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:choose>
<c:when test="${ sessionScope.userId != null }">

	<a href="logout" align="left"> <input type="button"
								value="LOGOUT"></a>

<h1>Welcome</h1>
</c:when>
<c:otherwise>
			<c:redirect url="UserLogin" />
		</c:otherwise>
		</c:choose>
</body>
</html>