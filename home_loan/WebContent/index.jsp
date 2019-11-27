<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
        <head>
            <meta name="viewport" content="width=device-width, initial-scale=1">
            <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
                        <script type="text/javascript" src="D:\Home_UI\js\main.js"></script>
                <meta charset="utf-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1">
                <title>LTI Home Loans</title>
                <meta charset="utf-8">
                <meta name="viewport" content="width=device-width, initial-scale=1">
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
                <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    
  <style>
  
body {
   margin: 0;
   font-family: Arial, Helvetica, sans-serif;
  }

  body {font-family: Arial, Helvetica, sans-serif;}
    
    /* Full-width input fields */
    input[type=text] {
      width: 100%;
      padding: 12px 20px;
      margin: 8px 0;
      display: inline-block;
      border: 1px solid #ccc;
      box-sizing: border-box;
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
    }
    
    input[type=email] {
      width: 100%;
      padding: 12px 20px;
      margin: 8px 0;
      display: inline-block;
      border: 1px solid #ccc;
      box-sizing: border-box;
    }
    
    input[type=password] {
      width: 100%;
      padding: 12px 20px;
      margin: 8px 0;
      display: inline-block;
      border: 1px solid #ccc;
      box-sizing: border-box;
    }
    
    input[type=number] {
      width: 100%;
      padding: 12px 20px;
      margin: 8px 0;
      display: inline-block;
      border: 1px solid #ccc;
      box-sizing: border-box;
    }
    
    /* Set a style for all buttons */
    button {
      background-color: #4CAF50;
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
      text-align: center;
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
      display: none; /* Hidden by default */
      position: fixed; /* Stay in place */
      z-index: 1; /* Sit on top */
      left: 0;
      top: 0;
      width: 100%; /* Full width */
      height: 100%; /* Full height */
      overflow: auto; /* Enable scroll if needed */
      background-color: rgb(0,0,0); /* Fallback color */
      background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
      padding-top: 60px;
    }
    
    /* Modal Content/Box */
    .modal-content {
      background-color: #fefefe;
      margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
      border: 1px solid #888;
      width:30%; /* Could be more or less, depending on screen size */
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
    }
    
    
    button.right {
    
    height:40px;
    width:30%;
    float:right;
    margin:10px;
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

.myCarousel{
 width:100%;

}
  .carousel-inner{
   display: block;
   /* max-width: 100%; */
   height: auto;
  }
  .topnav {
   overflow: hidden;
   background-color: #157DEC;
   height:80px;
   
   
  }
  
  .topnav a {
   float:right;
   text-align:right;
   color: #f2f2f2;
   text-align: center;
   padding: 29px;
   text-decoration: none;
   font-size: 17px;
   direction:ltr;
  }
  
  
  .topnav a:hover {
   background-color: grey;
   color: white;
  }
  
  .topnav a.active {
   
   color: white;
  }
  ?
     
  } 
  
  .push_button {
  position: relative;
  padding:0px;
  text-align:center;
  color:#FFF;
  text-decoration:none;
  
  font-family:'Oswald', Helvetica;
  display: block;
  
  
  }
  .push_button:before {
  background:#f0f0f0;
  background-image:-webkit-gradient(linear, 0% 0%, 0% 100%, from(#D0D0D0), to(#f0f0f0));
  
  -webkit-border-radius:5px;
  -moz-border-radius:5px;
  border-radius:5px;
  
  -webkit-box-shadow:0 1px 2px rgba(0, 0, 0, .5) inset, 0 1px 0 #FFF; 
  -moz-box-shadow:0 1px 2px rgba(0, 0, 0, .5) inset, 0 1px 0 #FFF; 
  box-shadow:0 1px 2px rgba(0, 0, 0, .5) inset, 0 1px 0 #FFF;
  
  position: absolute;
  content: "";
  left: -6px; right: -6px;
  top: -6px; bottom: -10px;
  z-index: -1;
  }
  
  .push_button:active {
  -webkit-box-shadow:0 1px 0 rgba(255, 255, 255, .5) inset, 0 -1px 0 rgba(255, 255, 255, .1) inset;
  top:5px;
  }
  .push_button:active:before{
  top: -11px;
  bottom: -5px;
  content: "";
  }
  
  .red {
  text-shadow:-1px -1px 0 #A84155;
  background: #D25068;
  border:1px solid #D25068;
  
  background-image:-webkit-linear-gradient(top, #F66C7B, #D25068);
  background-image:-moz-linear-gradient(top, #F66C7B, #D25068);
  background-image:-ms-linear-gradient(top, #F66C7B, #D25068);
  background-image:-o-linear-gradient(top, #F66C7B, #D25068);
  background-image:linear-gradient(to bottom, #F66C7B, #D25068);
  
  -webkit-border-radius:5px;
  -moz-border-radius:5px;
  border-radius:5px;
  
  -webkit-box-shadow:0 1px 0 rgba(255, 255, 255, .5) inset, 0 -1px 0 rgba(255, 255, 255, .1) inset, 0 4px 0 #AD4257, 0 4px 2px rgba(0, 0, 0, .5);
  -moz-box-shadow:0 1px 0 rgba(255, 255, 255, .5) inset, 0 -1px 0 rgba(255, 255, 255, .1) inset, 0 4px 0 #AD4257, 0 4px 2px rgba(0, 0, 0, .5);
  box-shadow:0 1px 0 rgba(255, 255, 255, .5) inset, 0 -1px 0 rgba(255, 255, 255, .1) inset, 0 4px 0 #AD4257, 0 4px 2px rgba(0, 0, 0, .5);
  }
  
  .red:hover {
  background: #F66C7B;
  background-image:-webkit-linear-gradient(top, #D25068, #F66C7B);
  background-image:-moz-linear-gradient(top, #D25068, #F66C7B);
  background-image:-ms-linear-gradient(top, #D25068, #F66C7B);
  background-image:-o-linear-gradient(top, #D25068, #F66C7B);
  background-image:linear-gradient(top, #D25068, #F66C7B);
  }
  
  .blue {
  text-shadow:-1px -1px 0 #2C7982;
  background: #3EACBA;
  border:1px solid #379AA4;
  background-image:-webkit-linear-gradient(top, #48C6D4, #3EACBA);
  background-image:-moz-linear-gradient(top, #48C6D4, #3EACBA);
  background-image:-ms-linear-gradient(top, #48C6D4, #3EACBA);
  background-image:-o-linear-gradient(top, #48C6D4, #3EACBA);
  background-image:linear-gradient(top, #48C6D4, #3EACBA);
  
  -webkit-border-radius:5px;
  -moz-border-radius:5px;
  border-radius:5px;
  
  -webkit-box-shadow:0 1px 0 rgba(255, 255, 255, .5) inset, 0 -1px 0 rgba(255, 255, 255, .1) inset, 0 4px 0 #338A94, 0 4px 2px rgba(0, 0, 0, .5);
  -moz-box-shadow:0 1px 0 rgba(255, 255, 255, .5) inset, 0 -1px 0 rgba(255, 255, 255, .1) inset, 0 4px 0 #338A94, 0 4px 2px rgba(0, 0, 0, .5);
  box-shadow:0 1px 0 rgba(255, 255, 255, .5) inset, 0 -1px 0 rgba(255, 255, 255, .1) inset, 0 4px 0 #338A94, 0 4px 2px rgba(0, 0, 0, .5);
  }
  
  .blue:hover {
  background: #48C6D4;
  background-image:-webkit-linear-gradient(top, #3EACBA, #48C6D4);
  background-image:-moz-linear-gradient(top, #3EACBA, #48C6D4);
  background-image:-ms-linear-gradient(top, #3EACBA, #48C6D4);
  background-image:-o-linear-gradient(top, #3EACBA, #48C6D4);
  background-image:linear-gradient(top, #3EACBA, #48C6D4);
  }
  


  .Container{
     /* width: 100%;
     height: 90%; */
     /* overflow: hidden;
     background-color: aliceblue;
     position: relative; */

     width:100%;
  }
  

body {
 margin: 0;
 font-family: Arial, Helvetica, sans-serif;
}

.topnav {
 overflow: hidden;
 background-color: #157DEC;
 height:80px;
 
 
}

.topnav a {
 float:right;
 text-align:right;
 color: #f2f2f2;
 text-align: center;
 padding: 29px;
 text-decoration: none;
 font-size: 17px;
 direction:ltr;
}

.topnav a:hover {
 background-color: grey;
 color: white;
}

.topnav a.active {
 
 color: white;
}
.imgs{
   position: absolute; top:0; left:0;
   margin:10px;
   margin-left:110px;
   
} 
.img
{
    width: 100%;
}

.push_button {
position: relative;
padding:0px;
text-align:center;
color:#FFF;
text-decoration:none;

font-family:'Oswald', Helvetica;
display: block;


}
.push_button:before {
background:#f0f0f0;
background-image:-webkit-gradient(linear, 0% 0%, 0% 100%, from(#D0D0D0), to(#f0f0f0));

-webkit-border-radius:5px;
-moz-border-radius:5px;
border-radius:5px;

-webkit-box-shadow:0 1px 2px rgba(0, 0, 0, .5) inset, 0 1px 0 #FFF; 
-moz-box-shadow:0 1px 2px rgba(0, 0, 0, .5) inset, 0 1px 0 #FFF; 
box-shadow:0 1px 2px rgba(0, 0, 0, .5) inset, 0 1px 0 #FFF;

position: absolute;
content: "";
left: -6px; right: -6px;
top: -6px; bottom: -10px;
z-index: -1;
}

.push_button:active {
-webkit-box-shadow:0 1px 0 rgba(255, 255, 255, .5) inset, 0 -1px 0 rgba(255, 255, 255, .1) inset;
top:5px;
}
.push_button:active:before{
top: -11px;
bottom: -5px;
content: "";
}

.red {
text-shadow:-1px -1px 0 #A84155;
background: #D25068;
border:1px solid #D25068;

background-image:-webkit-linear-gradient(top, #F66C7B, #D25068);
background-image:-moz-linear-gradient(top, #F66C7B, #D25068);
background-image:-ms-linear-gradient(top, #F66C7B, #D25068);
background-image:-o-linear-gradient(top, #F66C7B, #D25068);
background-image:linear-gradient(to bottom, #F66C7B, #D25068);

-webkit-border-radius:5px;
-moz-border-radius:5px;
border-radius:5px;

-webkit-box-shadow:0 1px 0 rgba(255, 255, 255, .5) inset, 0 -1px 0 rgba(255, 255, 255, .1) inset, 0 4px 0 #AD4257, 0 4px 2px rgba(0, 0, 0, .5);
-moz-box-shadow:0 1px 0 rgba(255, 255, 255, .5) inset, 0 -1px 0 rgba(255, 255, 255, .1) inset, 0 4px 0 #AD4257, 0 4px 2px rgba(0, 0, 0, .5);
box-shadow:0 1px 0 rgba(255, 255, 255, .5) inset, 0 -1px 0 rgba(255, 255, 255, .1) inset, 0 4px 0 #AD4257, 0 4px 2px rgba(0, 0, 0, .5);
}

.red:hover {
background: #F66C7B;
background-image:-webkit-linear-gradient(top, #D25068, #F66C7B);
background-image:-moz-linear-gradient(top, #D25068, #F66C7B);
background-image:-ms-linear-gradient(top, #D25068, #F66C7B);
background-image:-o-linear-gradient(top, #D25068, #F66C7B);
background-image:linear-gradient(top, #D25068, #F66C7B);
}

.blue {
text-shadow:-1px -1px 0 #2C7982;
background: #3EACBA;
border:1px solid #379AA4;
background-image:-webkit-linear-gradient(top, #48C6D4, #3EACBA);
background-image:-moz-linear-gradient(top, #48C6D4, #3EACBA);
background-image:-ms-linear-gradient(top, #48C6D4, #3EACBA);
background-image:-o-linear-gradient(top, #48C6D4, #3EACBA);
background-image:linear-gradient(top, #48C6D4, #3EACBA);

-webkit-border-radius:5px;
-moz-border-radius:5px;
border-radius:5px;

-webkit-box-shadow:0 1px 0 rgba(255, 255, 255, .5) inset, 0 -1px 0 rgba(255, 255, 255, .1) inset, 0 4px 0 #338A94, 0 4px 2px rgba(0, 0, 0, .5);
-moz-box-shadow:0 1px 0 rgba(255, 255, 255, .5) inset, 0 -1px 0 rgba(255, 255, 255, .1) inset, 0 4px 0 #338A94, 0 4px 2px rgba(0, 0, 0, .5);
box-shadow:0 1px 0 rgba(255, 255, 255, .5) inset, 0 -1px 0 rgba(255, 255, 255, .1) inset, 0 4px 0 #338A94, 0 4px 2px rgba(0, 0, 0, .5);
}

.blue:hover {
background: #48C6D4;
background-image:-webkit-linear-gradient(top, #3EACBA, #48C6D4);
background-image:-moz-linear-gradient(top, #3EACBA, #48C6D4);
background-image:-ms-linear-gradient(top, #3EACBA, #48C6D4);
background-image:-o-linear-gradient(top, #3EACBA, #48C6D4);
background-image:linear-gradient(top, #3EACBA, #48C6D4);
}

.slider-holder
{
    width: 800px;
    height: 400px;
    background-color: yellow;
    margin-left: auto;
    margin-right: auto;
    margin-top: 0px;
    text-align: center;
    overflow: hidden;
}

.image-holder
{
    width: 2400px;
    background-color: rgb(168, 184, 184);
    height: 400px;
    clear: both;
    position: relative;
   
    -webkit-transition: left 2s;
    -moz-transition: left 2s;
    -o-transition: left 2s;
    transition: left 2s;
}

.slider-image
{
    float: left;
    margin: 0px;
    padding: 0px;
    position: relative;
}


.keys {
    background-color:black;
    color: white;
   
  
    border: none;
    cursor: pointer;
   width:134px;
    border-radius: 25px;

#slider-image-1:target ~ .image-holder
{
    left: 0px;
}

#slider-image-2:target ~ .image-holder
{
    left: -800px;
}

#slider-image-3:target ~ .image-holder
{
    left: -1600px;
}

.button-holder
{
    position: relative;
    top: -20px;
}

.slider-change
{
    display: inline-block;
    height: 10px;
    width: 10px;
    border-radius: 5px;
    background-color: brown;
}

/*
    Footer Css
*/
.context-dark, .bg-gray-dark, .bg-primary {
    color: rgba(255, 255, 255, 0.8);
}

.footer-classic a, .footer-classic a:focus, .footer-classic a:active {
    color: #ffffff;
}
.nav-list li {
    padding-top: 5px;
    padding-bottom: 5px;
}

.nav-list li a:hover:before {
    margin-left: 0;
    opacity: 1;
    visibility: visible;
}

ul, ol {
    list-style: none;
    padding: 0;
    margin: 0;
}

.social-inner {
    display: flex;
    flex-direction: column;
    align-items: center;
    width: 100%;
    padding: 23px;
    font: 900 13px/1 "Lato", -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, "Helvetica Neue", Arial, sans-serif;
    text-transform: uppercase;
    color: rgba(255, 255, 255, 0.5);
}
.social-container .col {
    border: 1px solid rgba(255, 255, 255, 0.1);
}
.nav-list li a:before {
    content: "\f14f";
    font: 400 21px/1 "Material Design Icons";
    color: #4d6de6;
    display: inline-block;
    vertical-align: baseline;
    margin-left: -28px;
    margin-right: 7px;
    opacity: 0;
    visibility: hidden;
    transition: .22s ease;
}

/*Style for footer */
footer {
  background: #333333;
  width: 100%;
  float: left;
}

article, aside, details, figcaption, figure, footer, header, hgroup, main, menu, nav, section, summary {
  display: block;
}
.num
{
  font-family: sans-serif;
  color: #D0D0D0;
}

.red{
  color: red !important;
}

footer{
  background-color: #f5f5f5;
  padding: 80px 0;
  .footer-widget{
    h3{
      margin-bottom: 30px;
    }
  }
  .contact-link{
    display:inline-block;
    width: 100%;
    color: #333;
  }
  // footer social
  .footer-social{
    ul{
      padding-left: 0;
      li{
        list-style: none;
        float: left;
        padding: 0 10px;
        &:first-child{
          padding-left: 0;
        }
        a{
          font-size: 20px;
          color: #333;
          &:hover{
            color: red;
          }
        }
      }
    }
  }
  
  // opening hour
  .opening-time{
    padding-left:0;
    li{
      list-style: none;
      span{
        float:left;
        padding-right: 10px;
        .fa-times{
          color: red;
        }
      }
        strong{
          color: red;
        }
    }
  }
  
  // latest event
  .media-body{
    a{
      color: #333;
      &:hover{
        color: red;
      }
    }
    span{
        color: #969696;
      }
  }
  
  // gallery image
  .images-gellary{
    ul{
      padding-left: 0;
      li{
        list-style: none;
        float: left;
        margin: 0 3% 2% 0;
        width: 31%;
        position: relative;
        &:nth-child(3n) {
    margin: 0 0 1%;
}
        a{
          
        }
      }
    }
  }
}
  </style>
             
                                
                
               

               
               
              
            </head>
          <body>
                
                
              
                <div class="topnav">
                        
                                
                        <!-- <a  href="">Apply</a> -->
                         
                         
                        <a href="userDetailInsert.jsp" class="push_button red keys" onclick="document.getElementById('id01').style.display='block'" style="width:auto;">Apply Now</a>
                        <a class="push_button blue keys" href="userlogin.jsp">Login</a>
                        <a>Contact Us</a>
                         <a>FAQs</a>
                        <a href="emiCalculator.jsp">Calculators</a>     
                         <a>About Us</a>
                         <a>Home</a>
                      <img src="resources\images\lti.png" alt="logo" height="60px" width="100px" class="imgs"/>
                
                </div>
                <div id="myCarousel" class="carousel slide" data-ride="carousel">
                    <!-- Indicators -->
                    <ol class="carousel-indicators">
                      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                      <li data-target="#myCarousel" data-slide-to="1"></li>
                      <li data-target="#myCarousel" data-slide-to="2"></li>
                    </ol>
                  
                    <!-- Wrapper for slides -->
                    <div class="carousel-inner">
                      <div class="item active">
                        <img src="resources\images\1.png" alt="Los Angeles" class="img">
                      </div>
                  
                      <div class="item">
                        <img src="resources\images\2.png" alt="Chicago" class="img">
                      </div>
                  
                      <div class="item">
                        <img src="resources\images\3.png" alt="New York" class="img">
                      </div>
                    </div>
                  
                    <!-- Left and right controls -->
                    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                      <span class="glyphicon glyphicon-chevron-left"></span>
                      <span class="sr-only">Previous</span>
                    </a>
                    <a class="right carousel-control" href="#myCarousel" data-slide="next">
                      <span class="glyphicon glyphicon-chevron-right"></span>
                      <span class="sr-only">Next</span>
                    </a>
                  </div>

                  <div>
                     <!--footer-->
<footer>
  <div class="container">
      <div class="row">
          <!--footer left barr-->
          <div class="col-lg-9 col-md-9 col-sm-9 col-xs-9 footer-left">
              <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">	


                   <ul class="f-nav">
                      <li><a href="D:\Home_UI\html\mainp.html" class="num"  title="Home">Home</a></li>
                      <li><a href=""  title="About Us" class="num">About Us</a></li>
                      <li><a href=""  title="Our Products" class="num">Our Products</a></li>
                      <li><a href=""  class="num" target="_blank"  data-toggle="modal" data-backdrop="static" data-keyboard="false" data-target="#myModal-project" title="Approved Project">Approved Project</a></li>
                      <li><a href="" class="num" title="Calculators">Calculators</a></li>
                      <li><a href="" class="num" title="FAQs">FAQs</a></li>
                      <li><a href="" class="num" title="Contact Us">Contact Us</a></li>	
                  </ul>
                                  </div>
              <div class="col-lg-3 col-md-3 col-sm-3 col-xs-6">
                                      <ul class="f-nav">
                      <li><a href="" class="num" target="_blank">Apply Now</a></li>
                      
                      <li><a class="num" href="">Privacy Policy</a></li>
                      <li><a href="" class="num" >Terms & Conditions</a></li>
                      <li><a href="" class="num" >Disclosure</a></li>
                  </ul>
                </div>

              <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12 social-icon">	
                                       <h4>Follow us on</h4>
                  <a href="" target="_blank" class="fb-icon"></a>
                  <a href=""  target="_blank" class="tw-icon"></a>
                  <a href=""  target="_blank" class="you-icon"></a>
                  <a href=""  target="_blank" class="in-icon"></a>
                  <a href="/"  target="_blank" class="insta-icon"></a>
                  <a href=""  target="_blank" class="pin-icon"></a>
                  </div>
                  <div class="col-lg-3 col-md-3 col-sm-3 col-xs-8">
                      <p class="num" >Call us at</p>
                     <p class="num">1800 425 3800</p>
                     <p class="num">1800 112 211</p>   
                      </div>
      


                  <!-- <div class="col-lg-3 col-md-3 col-sm-3 col-xs-12 social-icon">	
                      <h4>Follow us on</h4>
 <a href="https://www.facebook.com/StateBankofIndia" target="_blank" class="fb-icon"></a>
 <a href="https://twitter.com/TheOfficialSBI"  target="_blank" class="tw-icon"></a>
 <a href="https://www.youtube.com/user/TheOfficialSBI"  target="_blank" class="you-icon"></a>
 <a href="https://www.linkedin.com/company/state-bank-of-india/"  target="_blank" class="in-icon"></a>
 <a href="https://instagram.com/theofficialsbi/"  target="_blank" class="insta-icon"></a>
 <a href="https://www.pinterest.com/TheOfficialSBI/"  target="_blank" class="pin-icon"></a>
                   </div> -->
                                             
</footer>
 </div>

            
          </body>

</html>