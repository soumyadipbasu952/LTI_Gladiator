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
<form method="post" action="/home_loan/updateUser" >
Enter Username:<input type="text" name="userId" >
<br><br>
Enter First Name:<input type="text" name="firstName" >
<br><br>
Enter Middle Name:<input type="text" name="middleName" >
<br><br>
Enter Last Name:<input type="text" name="lastName" >
<br><br>
Enter Email Id:<input type="text" name="emailId" >
<br><br>
Enter Password:<input type="password" name="password" >
<br><br>
Enter Phone Number:<input type="number" name="phoneno" >
<br><br>
Enter Date of Birth:<input type="text" name="dob" >
<br><br>
Enter Gender:<input type="text" name="gender" >
<br><br>
Enter Resident Type:<input type="text" name="residentType" >
<br><br>
Enter Aadhar Number:<input type="number" name="aadharNumber" >
<br><br>
Enter PAN Number:<input type="number" name="panNumber" >
<br><br>
<input type="submit" value = "Submit">
</form>
<a href="delete.jsp">Delete User</a>
</center>
</body>
</html>

