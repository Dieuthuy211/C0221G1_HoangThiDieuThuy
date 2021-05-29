
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>search product</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<table class="table table-striped">
<h1>search product</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<tr>
    <td>ID</td>
    <td>Name</td>
    <td>Price</td>
    <td>Description</td>
    <td>Producer</td>
</tr>
<c:forEach items = '${products}' var="product">
    <tr>
        <td><a href="/products?action=view&id=${product.id}">${product.id}</a></td>
        <td>${product.nameProduct}</td>
        <td>${product.price}</td>
        <td>${product.description}</td>
        <td>${product.producer}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>
