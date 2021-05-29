<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List product</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

</head>
<body>
<h1>List product</h1>
<p>
    <a href="/products?action=create">Creat new Product</a>
</p>
<form  method="post" action="/products?action=search"><input type="text" name="key"  ><input type="submit"value="Search"></form><br>
<table class="table table-striped">
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Price</td>
        <td>Description</td>
        <td>Producer</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items = '${products}' var="product">
        <tr>
            <td><a href="/products?action=view&id=${product.id}">${product.id}</a></td>
            <td>${product.nameProduct}</td>
            <td>${product.price}</td>
            <td>${product.description}</td>
            <td>${product.producer}</td>
            <td><a href="/products?action=edit&id=${product.id}">edit</a></td>
            <td><a href="/products?action=delete&id=${product.id}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
