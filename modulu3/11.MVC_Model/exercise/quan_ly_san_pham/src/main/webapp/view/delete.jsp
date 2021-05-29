<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete product</title>
</head>
<body>
<h1>Delete product</h1>
<p>
    <a href="/products">Back to product list</a>
</p>
<form method="post">
    <h3>Are you sure?</h3>
    <fieldset>
        <legend>product information</legend>
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
            <tr>
                <td><input type="submit" value="Delete product"></td>
                <td><a href="/products">Back to product list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>