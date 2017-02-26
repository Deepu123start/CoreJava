<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Login</title>
</head>
<body>

 <div>
    Student Page
    <form:form action="${pageContext.request.contextPath}/student" method="post" modelAttribute="student">
       Student Name: <form:input path="name"/>
        Course:<select name="course">
       	<option>Core java</option>
       	<option>Spring</option>
       	<option>Hibernet</option>
       	<option>Servlets</option>
       	<option>JSP</option>
       	<option>Struts</option>
       </select>
      Fee:<input type="number" title="Please enter the Fee" placeholder="Please enter the Fee" name="Fee" /> 
     Year:<input type="number"  title="Please enter the Year" placeholder="Please enter the Year" name="Year" path="year" /> 
       <div>
        <form:errors path="name" cssStyle="color:red"></form:errors>
       </div>
       <button type="submit"> Submit</button>    
    </form:form>
 </div>

</body>
</html>