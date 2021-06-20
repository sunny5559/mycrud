<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Login</title>
<style>
.error{
color: red;
	
}
</style>
</head>
<body>
     
      <form:form method="POST" action="showregister.do" modelAttribute="regis">
        <table width="100%" border="0">
          <tr>
            <td>
                
                 First Name  <form:input path="fname"/> 
                  <form:errors path="fname" cssClass="error"></form:errors>
              </td>
          </tr>
            <tr>
            <td>
                
                 Last Name  <form:input path="lname"/> 
                 <form:errors path="lname" cssClass="error"></form:errors>
              </td>
          </tr>
            <tr>
            <td>
            
                 Email  <form:input path="emailId"/> 
                 <form:errors path="emailId" cssClass="error"></form:errors>
                 
              </td>
          </tr>
            <tr>
            <td>
            	
                 Contact  <form:input path="contact"/> 
                 <form:errors path="contact" cssClass="error"></form:errors>
              </td>
          </tr>
          <tr>
            <td> 
            
                 Password   &nbsp&nbsp <form:password path="password"/>
                 	<form:errors path="password" cssClass="error"></form:errors>
             </td>
          </tr>
          <tr>
            <td ><input type="submit" value="Submit" /></td>
          
          </tr>
              
        </table>
            <a href="product.do">product</a>
      </form:form>
</html>