<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:choose>
<c:when test="${ sessionScope.userId != null }">
<form action="/home_loan/addRequest" method="post">
<input type="text" name="userId" value="<%=session.getAttribute("userId") %>" hidden> <br><br>
 <input type="submit" value="continue">
</form>
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