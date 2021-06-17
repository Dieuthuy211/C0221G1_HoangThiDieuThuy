
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Settings</h2>
<form:form method="post" action="/email" modelAttribute="email">
<table>
    <tr>
        <th>Languages</th>
        <td><from:select path="language" items="${languageArray}"/></td>
    </tr>
    <tr>
        <th>Page Size</th>
        <td>Show
        <from:select path="pageSize" items="${sizeArray}"/>
        email per pager</td>
    </tr>
    <tr>
        <th>Spams filter</th>
        <td><from:checkbox path="spamsFilter"/>
            <span>Enable spams filter</span>
        </td>

    </tr>
    <tr>
        <th>Signature</th>
        <td><from:input path="signature"/></td>
    </tr>
    <tr>
        <th></th>
        <td><input type="submit" value="Update">
            <input type="reset" value="Cancel">
        </td>
    </tr>
</table>

</form:form>
</body>
</html>
