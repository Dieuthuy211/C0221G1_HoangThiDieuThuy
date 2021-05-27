<%--
  Created by IntelliJ IDEA.
  User: FPTSHOP
  Date: 5/27/2021
  Time: 4:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html>
  <head>
    <title>$Title$</title>
      <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
              integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4"
              crossorigin="anonymous"></script>
  </head>
  <body>
 <div>
   <h1>Danh Sách Khách Hàng</h1>
   <table class="table table-dark table-striped">
     <tr>
       <th>name</th>
       <th>Date Of Birth</th>
       <th>address</th>
       <th>image</th>
     </tr>
    <c:forEach items="${list}" var="customer">
        <tr>
            <td><c:out value="${customer.name}"></c:out></td>
            <td><c:out value="${customer.dateOfBirth}"></c:out></td>
            <td><c:out value="${customer.address}"></c:out></td>
            <td><img src="img/<c:out value="${customer.image}"></c:out>"></td>

        </tr>
    </c:forEach>
   </table>
 </div>
  </body>
</html>
