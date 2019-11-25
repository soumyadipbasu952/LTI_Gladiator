<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form method="post" action="/home_loan/addBusiness" >
Pat_As_Per_Latest_ITR:<input type="text" name="patAsPerLatestItr" >
<br><br>
Deprication_In_Last_Three_Years:<input type="text" name="depreciationLast3Avg" >
<br><br>
Existing EMI:<input type="text" name="existingEmi" >
<br><br>
Type_Of_Employemnt:<input type="text" name="typeOfEmployment" value="self_employed/Business" >
<br><br>
<input type="text" name="userId" value="<%=session.getAttribute("userId") %>" hidden > 
<br><br>

<input type="submit" value = "Submit">
</form>
<!-- <a href="delete.jsp">Delete User</a><br><br>
<a href="UpdateUser.jsp">Update User</a><br><br> -->
<a href="Enquiry.jsp">Enquiry</a>

</center>
</body>
</html>

