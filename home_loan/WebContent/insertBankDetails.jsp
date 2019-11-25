<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Income_Detail</title>
</head>
<body>
<center>
<form method=post action="/home_loan/addBankDetail">
<input type="text" name="userId" value="<%=session.getAttribute("userId") %>" hidden>
<br><br>
Name_of_Bank:<input type="text" name="bankName" >
<br><br>
<br><br>
IFSC:<input type="text" name="ifsc" >
<br><br>
<br><br>
Account_Holder_Name:<input type="text" name="accountHolderName" >
<br><br>

<select name="accountType">
<option value="savings">Savings</option>
<option value="current">Curernt</option>
</select>
<br><br>

Account_Number:<input type="number" name="accountNumber" >
<br><br>

<input type="submit" value = "submit">
<br><br>

</form>
</center>
</body>
</html>
