<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View product</title>
</head>
<body>
<h1>product details</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<table>
    <tr>
        <td>id:</td>
        <td>${requestScope["product"].id}</td>
    </tr>
    <tr>
        <td>name Product:</td>
        <td>${requestScope["product"].nameProduct}</td>
    </tr>
    <tr>
        <td>pice:</td>
        <td>${requestScope["product"].price}</td>
    </tr>
    <tr>
        <td>description:</td>
        <td>${requestScope["product"].description}</td>
    </tr>
    <tr>
        <td>producer:</td>
        <td>${requestScope["product"].producer}</td>
    </tr>
</table>
</body>
</html>
