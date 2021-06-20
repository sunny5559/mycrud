<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
     
      <form:form method="POST" action="mergelogin.do" modelAttribute="user">
        <table width="100%" border="0">
          <tr>
          <td><label>Email</label></td>
            <td>
                  <form:input path="emailId"/> 
                   <form:errors path="emailId" cssClass="error"></form:errors>
              </td>
          </tr>
          <tr>
          
            <td><label>password</label></td>
            <td> 
                 <form:password path="password"/>
                   <form:errors path="password" cssClass="error"></form:errors>
             </td>
          </tr>
          <tr>
            <td ><input type="submit" value="Submit" /></td>
          </tr>
          
        </table>
         <a href="registration.do">Register</a>
      </form:form>
</html>