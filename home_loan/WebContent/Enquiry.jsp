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
<form method=post action="/home_loan/addEnquiry">
Required_Amount:<input type="text" name="requiredAmt" >
<br><br>
Salary :<input type="text" name="salary" >
<br><br>
Age:<input type="text" name="age" >
<br><br>
Retirement_Age:<input type="text" name="retirementAge" >
<br><br>
Cost_Of_Living _Per_Month:<input type="text" name="costOfLiving" >
<br><br>
Tenure(In years):<input type="text" name="tenures" >
<br><br>
Current_EMIs:<input type="text" name="currentEmi" >
<br><br>
<input type="submit" value="Submit">
</form>
</center>
</body>
</html>


