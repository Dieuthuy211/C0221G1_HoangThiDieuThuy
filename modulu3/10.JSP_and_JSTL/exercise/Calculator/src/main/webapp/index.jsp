
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h1>Simple Calculator</h1>
<form action="/calculator" method="post">
   <div> First operand : <input type="text" name="first"></div>
   <div> Operator: <select name="operator">
     <option value="one">summation</option>
     <option value="two">Subtraction</option>
     <option value="three">multiplication</option>
     <option value="four">division </option>
   </select></div>
    <div>Second operand : <input type="text " name="second"></div>
  <button>Calculate</button>

</form>
</body>
</html>
