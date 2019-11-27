<!-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> -->

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1" charset="ISO-8859-1">
<title>User Detail Insert</title>
<style>
body {
    font-family: Arial, Helvetica, sans-serif;
    background-color:aliceblue;
  }
  
  /* Full-width input fields */
  input[type=text] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
    border-radius:20px;
  }
  
  /* input[type=radio] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
  } */
  
  input[type=Date] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
    border-radius:20px;
  }
  
  input[type=email] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
    border-radius:20px;
  }
  
  input[type=password] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
    border-radius:20px;
  }
  
  input[type=number] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
    border-radius:20px;
  }
  
  /* Set a style for all buttons */
  button {
    background-color: black;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
  }
  
  button:hover {
    opacity: 0.8;
  }
  
  /* Extra styles for the cancel button */
  .cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
  }
  
  option{
  
      width:300px;
      height:300px;
  }
  
  /* Center the image and position the close button */
  .imgcontainer {
    /* text-align: center; */
    margin: 24px 0 12px 0;
    position: relative;
  }
  
  img.avatar {
    width: 40%;
    border-radius: 50%;
  }
  
  .container {
    padding: 25px;
  }
  
  span.psw {
    float: right;
    padding-top: 16px;
  }
  
  /* The Modal (background) */
  .modal {
    display: block; /* Hidden by default */
    /* position: fixed; Stay in place */
    z-index: 1; /* Sit on top */
    left: 0;
    top: 0;
    width: 100%; /* Full width */
    height: 100%; /* Full height */
    overflow: auto; /* Enable scroll if needed */
    
    background-color: aliceblue; /* Black w/ opacity */
    
  }
  
  /* Modal Content/Box */
  .modal-content {
    background-color: powderblue;
    margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
    border: 3px solid black;
    width:40%; /* Could be more or less, depending on screen size */
    border-radius:30px;
  }
  
  /* The Close Button (x) */
  .close {
    position: absolute;
    right: 25px;
    top: 0;
    color: #000;
    font-size: 35px;
    font-weight: bold;
  }
  
  button.left {
  
      height:40px;
      width:30%;
      float:left;
      margin:10px;
      border-radius:20px;
  }
  
  
  button.right {
  
  height:40px;
  width:30%;
  float:right;
  margin:10px;
  border-radius:20px;
  }
  
  
  
  .close:hover,
  .close:focus {
    color: red;
    cursor: pointer;
  }
  
  /* Add Zoom Animation */
  .animate {
    -webkit-animation: animatezoom 0.6s;
    animation: animatezoom 0.6s
  }
  
  @-webkit-keyframes animatezoom {
    from {-webkit-transform: scale(0)} 
    to {-webkit-transform: scale(1)}
  }
    
  @keyframes animatezoom {
    from {transform: scale(0)} 
    to {transform: scale(1)}
  }
  
  /* Change styles for span and cancel button on extra small screens */
  @media screen and (max-width: 300px) {
    span.psw {
       display: block;
       float: none;
    }
    .cancelbtn {
       width: 100%;
    }
  }
  
</style>
</head>
<body>




<form method="post" action="/home_loan/addUser" >
    <div class="container modal modal-content animate imgcontainer">
      <label for="username"><b>User Name</b></label>
      <input type="text" placeholder="Enter User Name" name="userId" required>

      <label for="firstname"><b>First Name</b></label>
      <input type="text" placeholder="Enter First Name" name="firstName" required>

      <label for="middlename"><b>Middle Name</b></label>
      <input type="text" placeholder="Enter Middle Name" name="middleName" required>

      <label for="lastname"><b>Last Name</b></label>
      <input type="text" placeholder="Enter Last Name" name="lastName" required>

      <label for="emailid"><b>Email Id</b></label>
      <input type="email" placeholder="Enter Email Id" name="emailId" required>

      <label for="password"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="password" required>

      <label for="phoneno"><b>Phone Number</b></label>
      <input type="number" placeholder="Enter Phone Number" name="phoneno" required>
      
      <label for="dob"><b>Date Of Birth</b></label>
      <input type="text" placeholder="Enter Date Of Birth" name="dob" required>
      
      <label for="gender" ><b>Enter the Gender</b></label><br><br>
      <input type="radio"  name="gender" value="female" required checked>Female
      <input type="radio"  name="gender" value="male" required>Male
      <br>
      <br>
      <label for="resisdentType"><b>Resident Type</b></label>
      <input type="text" placeholder="Enter Resident Type" name="residentType" required>

      <label for="aadharNumber"><b>Aadhar Number</b></label>
      <input type="number" placeholder="Enter Aadhar Number" name="aadharNumber" required>

      <label for="panNumber"><b>Pan Number</b></label>
      <input type="number" placeholder="Enter Pancard Number" name="panNumber" required>

    <br><br>
      <!-- <button type="save" class="left">Save</button> -->
      <button type="submit" class="right" >Next</button>

      
      
    </div>

    <div class="container" style="background-color:#f1f1f1">
    
    </div>
  </form>




</body>
</html>



