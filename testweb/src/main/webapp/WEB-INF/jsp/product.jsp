<%@page import="org.springframework.beans.factory.annotation.Autowired"%>
<%@page import="com.pp.model.ProductDto"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
 
<html>
<head>
<title>product</title>
<style>
.error{
color: red;
	
}
</style>
</head>
<body>
     
      <form:form method="POST" action="showproduct.do" modelAttribute="product">
        <table width="100%" border="0">
          <tr>
            <td>
                 Product Name  <form:input path="pname"/> 
                 	<form:errors path="pname" cssClass="error"></form:errors>
              </td>
          </tr>
            <tr>
            <td>
                  Description  <form:input path="pdescription"/> 
                  	<form:errors path="pdescription" cssClass="error"></form:errors>
              </td>
          </tr>
            <tr>
            <td>
                  Date  <form:input path="pDate"/> 
                  	<form:errors path="pDate" cssClass="error"></form:errors>
              </td>
          </tr>
            <tr>
            <td>
                 Expiry  <form:input path="pExpiry"/>
                 	<form:errors path="pExpiry" cssClass="error"></form:errors> 
              </td>
          </tr>
          <tr>
            <td> 
                 Rating  &nbsp&nbsp <form:input path="rating"/>
                 	<form:errors path="rating" cssClass="error"></form:errors>
             </td>
          </tr>
          <tr>
            <td ><input type="submit" value="Submit" /></td>
          </tr>
        </table>

      </form:form>
      
   
       <table border="2">
                      
      <tr>
      <th>ProductName</th>
      <th>ProductDescription</th>
      <th>ProductDate</th>
      <th>ProductExpiry</th>
      <th>ProductRating</th>
      </tr>
      <c:if test="${listofProduct.size()>0}">
       <c:forEach var="o" items="${listofProduct}">
      <tr>
      <td><c:out value="${o.pname}"></c:out></td>
      <td><c:out value="${o.pdescription}"></c:out></td>
      <td><c:out value="${o. pDate}"></c:out></td>
      <td><c:out value="${o.pExpiry}"></c:out></td>
      <td><c:out value="${o.rating}"></c:out></td>
      <td><a href="">Delete</a></td>
      <td><a href="">Edit</a></td>
      </tr>
      </c:forEach>
      </c:if>
      
      <c:if test="${listofProduct.size()==0 }">
      <tr>
      <th>
      No Data Found
      </th>
      </tr>
      </c:if>
      </table> 
</html>