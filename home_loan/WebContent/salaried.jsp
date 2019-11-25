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
<form method="post" action="/home_loan/addSalaried" >
Net_Amount_Salary:<input type="text" name="netAmtSalary" >
<br><br>
Employer_Name:<input type="text" name="employerName" >
<br><br>
Existing EMI:<input type="text" name="existingEmi" >
<br><br>
Organization_Type:<input type="text" name="organizationType" >
<br><br>
Retirement_Age:<input type="text" name="retirementAge" >
<br><br>
Type_Of_Employemnt:<input type="text" name="typeOfEmployment" value="salaried" >
<br><br>
<input type="text" name="userId" value="<%=session.getAttribute("userId") %>" hidden > 
<br><br>


<input type="submit" value = "Submit">
</form>
<!--  <a href="delete.jsp">Delete User</a><br><br>
<a href="UpdateUser.jsp">Update User</a><br><br>
<a href="Enquiry.jsp">Enquiry</a>-->

<a href="insertAddress.jsp">Enter Address</a>

</center>
</body>
</html>

