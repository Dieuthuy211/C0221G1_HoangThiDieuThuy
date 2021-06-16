<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Customer</title>
</head>
<body>
<h1>List Customer</h1>
<form action="/customer/list">
    <table border="1">
        <tr>
            <th>STT</th>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
        </tr>

        <c:forEach items="${customerList}" var="customer" varStatus="theCount">
            <tr>
            <td><a href="/customer/detail?id=${customer.id}">${theCount.count}</a></td>
            <td>${customer.name}</td>
            <td>${customer.email}</td>
            <td>${customer.address}</td>
            </tr>
        </c:forEach>
    </table>
</form>

</body>
</html>
