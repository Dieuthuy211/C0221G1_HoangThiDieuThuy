<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/customer/detail">
    <p>id : ${customer.id}</p>
   <p>name : ${customer.name}</p>
   <p>email : ${customer.email}</p>
   <p>address : ${customer.address}</p>
</form>
</body>
</html>
