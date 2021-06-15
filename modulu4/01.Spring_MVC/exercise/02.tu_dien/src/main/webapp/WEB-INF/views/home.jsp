
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post">
    <center>
        <h1>Từ Điển</h1>
        <input type="text" placeholder="nhập từ muốn dịch" name="input" value="${input}">
        <button type="submit">Dịch</button>
        <br>
        kết quả: ${result}
    </center>
</form>
</body>
</html>
