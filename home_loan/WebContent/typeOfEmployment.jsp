<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%=session.getAttribute("userId")%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
    function select()
    {
     var1=document.getElementById("salaried");
     var2=document.getElementById("self_employed");
     if(var1.checked==true)
     {
        document.myform.action="salaried.jsp";
     }
     else
     {
        document.myform.action="self_employed.jsp";
     }
   }
  </script>
</head>
<body>
<form action="salaried.jsp" method="post" name="myform" onsubmit="select()">
Enter Type Of Employment <br><br> <input type="radio" name="employement" value = "1" id="salaried">Salaried 
<br>
<input type="radio" name="employement" value = "0" id="self_employed">Self-Employed/Business
<br><br>
<input type="submit" value = "Submit">
</form>
</body>
</html>

