<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head><style>
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
   height:auto;
   position:relative;
   padding-top: 150px;
    padding-left: 50px;
    
    width:700px;
    margin:15px;
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact Us</title>
</head>
<body>
<div id="header">
<center><h1 style="background-color:Blue">IPL Cricket Tournment</h1></center>
<center><h1 style="background-color:Green" >2017</h1></center>
<a  href="${pageContext.request.contextPath}/team/registrationpage/${team.id}.html">
<marquee style="background-color:Violet">Registrations Open for 2017 Tournment</marquee></a>
</div>
<div id="container">
<h2>Contact Us:</h2>
<pre>
Deepthi
Chairman of IPL TEAM,
EMail:deepu@gmail.com,
Phone:(1)816-XXX-XXXX
</pre>
<form action="${pageContext.request.contextPath}/index.html" method="post">
<button type="submit">Back</button>
</form>
</div>
<div id="footer">
<p>Posted By: IPL Team</p>
<p>Copy Rights@ IPLteam2017@gmail.com </p>
</div>
</body>
</html>