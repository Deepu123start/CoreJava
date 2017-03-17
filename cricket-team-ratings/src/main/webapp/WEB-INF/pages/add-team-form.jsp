<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 
<?xml version="1.0" encoding="ISO-8859-1" ?>
 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
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
#sidemenu  {
    color: Black;
    text-align: right;
    list-style-type: none;
    padding-left: 2px;
    margin-right: 40px;
    margin-top:15px;
    
    float: left;
}
#sidemenu  li {
    width: 250px;
    height: 35px;
    font-size: 1em;
    
    padding-right:5px;
}
#sidemenu  li a {
    text-decoration: none;
    text-transform: uppercase;
    color: Black;
}
#sidemenu  li:active{
	border-left: 5px solid hsl(180,70%,55%);
}
#sidemenu  li:hover {
    background-color: #635555;
    border-left: 5px solid hsl(180,70%,55%);
}
#sidemenu tablemenu{
font-size:10px;
}
 #container {
   min-height:100%;
   position:relative;
   padding-top: 150px;
    padding-left: 50px;
    
    width:500px;
    margin:15px;
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Add team page</title>
</head>
<body>
<div id="header">
<center><h1 style="background-color:Blue">IPL Cricket Tournment</h1></center>
<center><h1 style="background-color:Green" >2017</h1></center>
<a  href="${pageContext.request.contextPath}/team/registrationpage/${team.id}.html">
<marquee style="background-color:Violet">Registrations Open for 2017 Tournment</marquee></a>
</div>
<div id="container">
<ul id=sidemenu>
<li>Add Team Page</li>
<li>Here you can add a new team</li>
<div id="tablemenu">
<form:form method="POST" commandName="team" action="${pageContext.request.contextPath}/team/add.html">
<table>
<tbody>
    <tr>
        <td>Name:</td>
        <td><form:input path="name" /></td>
    </tr>
    <tr>
        <td>Rating:</td>
        <td><form:input path="rating" /></td>
    </tr>
    <tr>
        <td><input type="submit" value="Add" /></td>
        <td></td>
    </tr>
</tbody>
</table>
</form:form>
</div>
 <div id="homepage">
<h3><a href="${pageContext.request.contextPath}/index.html">Home page</a></h3>
</div>
</ul>
</div>
<div id="footer">
<p>Posted By: IPL Cricket Team</p>
<p>Copy Rights@ IPLtournment-2017</p>
</div>
</body>
</html>