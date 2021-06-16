<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Caculator</h1>
<form action="/Calculator" method="post">
    <input type="text" value="${numberOne}" name="numberOne" pattern="[0-9-.]+">
    <input type="text" value="${numberTwo}" name="numberTwo" pattern="[0-9-.]+">
    <br>
    <br>
    <br>

    <button name="action" value="summation" style="background:dimgray">summation(+)</button>
    <button name="action" value="Subtraction" style="background:dimgray">Subtraction(-)</button>
    <button name="action" value="multiplication" style="background:dimgray">multiplication(*)</button>
    <button name="action" value="division" style="background:dimgray">division(/)</button>



    <br>
      <c:if test="${message != null}">
    <h2 style="color: red">Exception : ${message}</h2>
    </c:if>
    <c:if test="${message == null}">
        <h2>Result : ${result}</h2>
    </c:if>
</form>



</body>
</html>
