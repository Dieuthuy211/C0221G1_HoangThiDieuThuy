<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Create product</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
</head>
<body>
<h1>Update</h1>
<p>
    <a href="/products">back to list pages</a>
</p>

<table class="table table-striped " >
    <tr>

        <td>Name</td>
        <td>Price</td>
        <td>Description</td>
        <td>Producer</td>
    </tr>
    <tr>
        <form method="post">

            <td>
                <label>name product</label>
                <input type="text" name="nameProduct" id="nameProduct" value="${products.nameProduct}">
            </td>
            <td>
                <label>price</label>
                <input type="text" name="price" id="price" value="${products.price}">
            </td>
            <td>
                <label>description</label>
                <input type="text" name="description" id="description" value="${products.description}">
            </td>
            <td>

                <input type="text" name="producer" id="producer" value="${products.producer}">
                <button type="submit">update product</button>
            </td>
        </form>
    </tr>

</table>
</body>
</html>