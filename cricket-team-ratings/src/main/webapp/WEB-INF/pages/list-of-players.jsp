<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style >
body{
margin-top:10px;}
#footer{
position:relative;
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
   height:auto;
   position:relative;
   padding-top: 150px;
    padding-left: 50px;
    
    width:700px;
    margin:15px;
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List of Players</title>
</head>
<body>
<div id="header">
<center><h1 style="background-color:Blue">IPL Cricket Tournment</h1></center>
<center><h1 style="background-color:Green" >2017</h1></center>
<a  href="${pageContext.request.contextPath}/team/registrationpage/${team.id}.html">
<marquee style="background-color:Violet">Registrations Open for 2017 Tournment</marquee></a>
</div>
<div id="container">
<p>Here you can see the list of the players, edit them, delete.</p>
<table border="1px" cellpadding="0" cellspacing="0" >
<thead>
<tr>
<th width="10%">Id</th><th width="10%">Team Name</th><th width="15%">PlayerName</th><th width="10%">Age</th><th width="15%">Specialization</th>
<th width="15%">Number of Centuries</th><th width="10%">Total Runs</th><th width="15%">Actions</th>
</tr>
</thead>
<tbody>
<c:forEach var="player" items="${players}">
<tr>
    <td>${player.id}</td>
    <td>${player.teamname}</td>
    <td>${player.playername}</td>
    <td>${player.age}</td>
      <td>${player.specialization}</td>
        <td>${player.noc}</td>
          <td>${player.totalruns}</td>
    <td>
   <a href="${pageContext.request.contextPath}/team/editplayer/${player.id}.html">Edit Player</a></br> 
        <a href="${pageContext.request.contextPath}/team/deleteplayer/${player.id}.html">Delete Player</a></br>   
    </td>
</tr>
</c:forEach>
</tbody>
</table>
<h3>
 <a href="${pageContext.request.contextPath}/team/addplayer/${player.id}.html">Add Player</a><br>
 <a href="${pageContext.request.contextPath}/playerhome.html">Player Home page</a><br>
 <a href="${pageContext.request.contextPath}/index.html">Home page</a></h3>
 </div>
 <div id="footer">
<p>Posted By: IPL Cricket Team</p>
<p>Copy Rights@ IPLtournment-2017</p>
</div>
</body>
</html>