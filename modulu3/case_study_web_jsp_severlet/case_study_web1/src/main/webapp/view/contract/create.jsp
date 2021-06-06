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
        <form class="form-horizontal" id="form-edit-client" method="post">
            <legend>create</legend>
            <c:if test="${message!=null}">
                <span>${message}</span>
            </c:if>
            <div class="form-group">
                <label class="col-md-4 control-label">employee</label>
                <div class="col-md-4">
                    <select name="customerId" class="form-control">
                        <c:forEach var="employee" items="${employees}">
                            <option value="${employee.employeeId}">${employee.employeeId}.${employee.employeeName}</option>
                        </c:forEach>
                    </select>
                    <span class="help-block">select employee</span>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-4 control-label">customer</label>
                <div class="col-md-4">
                    <select name="employeeId" class="form-control">
                        <c:forEach var="customer" items="${customers}">
                            <option value="${customer.id}">${customer.id}.${customer.name}</option>
                        </c:forEach>
                    </select>
                    <span class="help-block">select customer</span>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-4 control-label">service</label>
                <div class="col-md-4">
                    <select name="serviceId" class="form-control">
                        <c:forEach var="service" items="${services}">
                            <option value="${service.serviceId}">${service.serviceId}.${service.serviceName}</option>
                        </c:forEach>
                    </select>
                    <span class="help-block">select service</span>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-4 control-label" for="contractStartDate">contract Start Date</label>
                <div class="col-md-4">
                    <input id="contractStartDate" name="contractStartDate" type="date"
                           class="form-control input-md" placeholder="contract Start Date">

                    <span class="help-block">the date the customer made the contract </span>
                </div>
            </div>

            <div class="form-group">
                <label class="col-md-4 control-label">contract End Date</label>
                <div class="col-md-4">
                    <input name="contractEndDate" id="contractEndDate" type="date"
                           placeholder="contract End Date"
                           class="form-control input-md">
                    <span class="help-block">contract End Date</span>
                </div>
            </div>

            <div class="form-group">
                <label class="col-md-4 control-label">deposit</label>
                <div class="col-md-4">
                    <input name="deposit" id="deposit" type="text" placeholder="deposit"
                           class="form-control input-md">
                    <span class="help-block">deposit of your customer</span>
                </div>
            </div>
            <div class="form-group">
                <label class="col-md-4 control-label">total</label>
                <div class="col-md-4">
                    <input name="total" id="total" type="text" placeholder="total money"
                           class="form-control input-md">
                    <span class="help-block">total money</span>
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
