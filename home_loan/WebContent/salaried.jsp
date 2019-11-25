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
Type_Of_Employemnt:<input type="text" name="typeOfEmployment" value="salaried" >
<br><br>
Required_Amount:<input type="text" name="requiredAmt" >
<br><br>
Net_Amount_Salary:<input type="text" name="netAmtSalary" >
<br><br>
Employer_Name:<input type="text" name="employerName" >
<br><br>
Organization_Type:<input type="text" name="organizationType" >
<br><br>
Age:<input type="text" name="age" >
<br><br>
Retirement_Age:<input type="text" name="retirementAge" >
<br><br>
Existing EMI:<input type="text" name="existingEmi" >
<br><br>
Cost_Of_Living _Per_Month:<input type="text" name="costOfLiving" >
<br><br>
Tenure(In years):<input type="text" name="tenure" >
<br><br>

<input type="text" name="userId" value="<%=session.getAttribute("userId") %>" hidden > 
<br><br>


<input type="submit" value = "Submit">
</form>



</center>
</body>
</html>

