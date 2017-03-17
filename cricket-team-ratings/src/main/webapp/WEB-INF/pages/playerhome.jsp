<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<html>
<head>
<style>
body{
background-image: url("http://funactive.co/tournament_image/cover/1456599783cricket-tournament-banner-background-vector-illustration-48415867.jpg");
margin-top:10px;
}
#footer{
position:absolute;
bottom:0;
background-color:#ff7f00;
width:97%;
height:100px;
}
#header{
position:absolute;
top:0;
width:97%;
height:100px;
}
 #container {
   min-height:100%;
   position:relative;
   padding-top: 150px;
    padding-left: 20px;
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Player Home Page</title>
</head>
<body>
<div id="header">
<center><h1 style="background-color:Blue">IPL Cricket Tournment</h1></center>
<center><h1 style="background-color:Green" >2017</h1></center>
<a  href="${pageContext.request.contextPath}/team/registrationpage/${team.id}.html">
<marquee style="background-color:Violet">Registrations Open for 2017 Tournment</marquee></a>
</div>
<div id="container">
<h3>
  ${message}<br /> 
 <a href="${pageContext.request.contextPath}/team/addplayer/${team.id}.html">Add New Player</a><br />
 <a href="${pageContext.request.contextPath}/team/playerlist.html">Players List</a><br />
 <a href="${pageContext.request.contextPath}/index.html">Home page</a>
<br>
</h3>
</div>
<div id="footer">
<p>Posted By: IPL Cricket Team</p>
<p>Copy Rights@ IPLtournment-2017</p>
</div>
</body>
</html>