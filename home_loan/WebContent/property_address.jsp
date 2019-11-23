<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Address</title>
</head>
<body>
<center>
<form method=post action="/home_loan/addPropertyAddress">
User_ID:<input type="text" name="userId" hidden>
<br><br>
Address_Line_1:<input type="text" name="address1" >
<br><br>
Address_Line_2:<input type="text" name="address2" >
<br><br>
Landmark:<input type="text" name="landmark" >
<br><br>
City:<input type="text" name="city" >
<br><br>
State:<input type="text" name="state" >
<br><br>
Pin:<input type="number" name="pin" >
<br><br>

<input type="submit" value="submit">
</form>
</center>
</body>
</html>


