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


<div class="container">
    <div class="row border">

        <form class="form-horizontal" id="form-edit-client" method="post" action="/userService?action=edit">
            <div class="border">
                <h1 class="text-center">edit</h1>
                <c:if test="${message!=null}">
                    <span>${message}</span>
                </c:if>
                <div class="form-group">
                    <label class="col-md-4 control-label" >ID</label>
                    <div class="col-md-4">
                        <input id="contractId" name="contractId" value="${conTract.contractId}" type="hidden"
                               class="form-control input-md">
                        <span class="help-block">Id of your contract</span>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-md-4 control-label">Employee</label>

                    <div class="col-md-4">
                        <select class="form-control" name="employeeId" >
                            <c:forEach items="${employees}" var="employee">
                                <option value="${employee.employeeId}" ${conTract.employeeId==employee.employeeId?"selected":""}>${employee.employeeName}</option>
                            </c:forEach>
                        </select>

                    </div>
                </div>
                <div class="form-group">
                    <label class="col-md-4 control-label">customer</label>
                    <div class="col-md-4">
                           <select class="form-control" name="customerId" >
                             <c:forEach items="${customers}" var="customer">
                             <option value="${customer.id}" ${conTract.customerId==customer.id?"selected":""}>${customer.name}</option>
                             </c:forEach>
                         </select>

                     </div>
                </div>
                <div class="form-group">
                    <label class="col-md-4 control-label">service</label>

                    <div class="col-md-4">
                        <select class="form-control" name="serviceId" >
                            <c:forEach items="${services}" var="service">
                                <option value="${service.serviceId}" ${conTract.serviceId==service.serviceId?"selected":""}>${service.serviceName}</option>
                            </c:forEach>
                        </select>

                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label">contract start date</label>
                    <div class="col-md-4">
                        <input  name="contractStartDate" id="contractStartDate" type="date"
                                value="${conTract.contractStartDate}"
                                class="form-control input-md">
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-md-4 control-label">contract end date</label>
                    <div class="col-md-4">
                        <input  name="contractEndDate" id="contractEndDate" type="date"
                                value="${conTract.contractEndDate}"
                                class="form-control input-md">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label">deposit</label>
                    <div class="col-md-4">
                        <input  name="deposit" id="deposit" type="text" value="${conTract.deposit}"
                                class="form-control input-md">

                    </div>
                </div>
                <div class="form-group">
                    <label class="col-md-4 control-label">total</label>
                    <div class="col-md-4">
                        <input  name="total" id="total" type="text" value="${conTract.total}"
                                class="form-control input-md">
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label"></label>
                    <div class="col-md-4">
                        <button  type="submit" class="btn btn-success">edit</button>
                        <button name="btn-save" class="btn btn-success">
                            <a href="/userService">back to list</a>
                        </button>
                    </div>
                </div>

            </div>
        </form>


    </div>
</div>
</body>
</html>

