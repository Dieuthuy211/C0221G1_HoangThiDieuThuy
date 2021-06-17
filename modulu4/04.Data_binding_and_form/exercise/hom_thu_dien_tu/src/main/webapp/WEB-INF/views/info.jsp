<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>Language : ${email.language}</td>
    </tr>
    <tr>
        <td>Page Size : ${email.pageSize}</td>
    </tr>
    <tr>
        <td>Spams Filter : ${email.spamsFilter}</td>
    </tr>
    <tr>
        <td>Signature : ${email.signature}</td>
    </tr>


</table>
<button><a href="/">back to home</a></button>
</body>
</html>
