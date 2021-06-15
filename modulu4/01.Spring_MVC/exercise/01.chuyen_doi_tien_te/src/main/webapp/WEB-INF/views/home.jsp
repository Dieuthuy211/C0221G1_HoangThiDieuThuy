
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/convert" method="post">
    rate: <input type="number" name="rate" value="${rate}" placeholder="input rate">
    <br>
    usd: <input type="number" name="usd" value="${usd}" placeholder="input usd">
    <br>
    <input type="submit">
    result: ${result}



</form>
</body>
</html>
