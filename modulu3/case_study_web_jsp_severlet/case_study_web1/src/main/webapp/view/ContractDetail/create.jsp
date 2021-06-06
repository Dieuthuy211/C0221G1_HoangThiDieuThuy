<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>create</title>
    <link href="http://fontawesome.io/assets/font-awesome/css/font-awesome.css" rel="stylesheet" media="screen">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" type="text/css" rel="stylesheet">
</head>
<body>


<div class="container border">
    <div class="row">
        <form class="form-horizontal" id="form-edit-client" method="post" action="/contractDetails?action=create">
            <legend>create</legend>
            <c:if test="${message!=null}">
                <span>${message}</span>
            </c:if>

            <div class="form-group">
                <label class="col-md-4 control-label">contract</label>
                <div class="col-md-4">
                    <select name="contractId" class="form-control">
                        <c:forEach var="conTract" items="${conTracts}">
                            <c:forEach var="customer" items="${customers}">
                                <option value="${conTract.contractId}">id
                                    contract: ${conTract.contractId}.${customer.name}</option>
                            </c:forEach>
                        </c:forEach>
                    </select>
                    <span class="help-block">select contract</span>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-4 control-label">Attach Service</label>
                <div class="col-md-4">
                    <select name="attachServiceId" class="form-control">
                        <c:forEach var="attachService" items="${attachServices}">
                            <option value="${attachService.attachServiceId}">${attachService.attachServiceId}.${attachService.attachServiceName}</option>
                        </c:forEach>
                    </select>
                    <span class="help-block">select Attach Service</span>
                </div>
            </div>

            <div class="form-group">
                <label class="col-md-4 control-label" for="quantity">quantity</label>
                <div class="col-md-4">
                    <input id="quantity" name="quantity" type="text"
                           class="form-control input-md" placeholder="quantity">

                    <span class="help-block">quantity of contract detail</span>
                </div>
            </div>

            <div class="form-group">
                <label class="col-md-4 control-label"></label>
                <div class="col-md-4">
                    <button type="submit" class="btn btn-success">create</button>
                    <button name="btn-save" class="btn btn-success">
                        <a href="/index.jsp">Home</a>
                    </button>
                </div>
            </div>


        </form>


    </div>
</div>
</body>
</html>