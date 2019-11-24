<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<center>
<form method=post action="/home_loan/addPropertyDetails">
Enter UserId:<input type="text" name="userId" >
<br><br>
Enter Property Type:
<select name="propertyType">
    <option value="purchase">Purchase or construct on identified property</option>
    <option value="repair">Repair/Renovation of own house/flat</option>
    <option value="unprop">Unidentified Property</option>
  </select>

Enter Property Name:<input type="text" name="propertyName" >
<br><br>


Enter Estimated Amount:<input type="number" name="estimatedAmount" >
<br><br>
<input type="submit" value="Submit">

</form>
</center>
</body>
</html>


