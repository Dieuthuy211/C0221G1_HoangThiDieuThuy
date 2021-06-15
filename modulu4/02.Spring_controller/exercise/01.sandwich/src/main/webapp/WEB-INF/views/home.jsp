
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<div style="width: 500px">
    <form action="/sandwich" method="get">
        <input type="checkbox" name="condiment" value="Lettuce">Lettuce
        <input type="checkbox" name="condiment" value="Tomato">Tomato
        <input type="checkbox" name="condiment" value="Mustard">Mustard
        <input type="checkbox" name="condiment" value="Sprouts">Sprouts
        <hr>
        <input type="submit" value="Save">
    </form>
</div>
<c:if test="${condiments != null}">
    <h3>Result sandwich ingredients :
    <c:forEach items="${condiments}" var="condiment">
      <span> ${condiment.toString()}</span>
    </c:forEach>
    </h3>
</c:if>

</body>
</html>
