<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>edit</title>
    <link href="http://fontawesome.io/assets/font-awesome/css/font-awesome.css" rel="stylesheet" media="screen">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" type="text/css" rel="stylesheet">
</head>
<body>


<div class="container">
    <div class="row">
        <div class="col-md-12">
            <form class="form-horizontal" id="form-edit-client" method="post" action="/employees?action=edit">
                <fieldset>
                    <legend>create</legend>
                    <c:if test="${message!=null}">
                        <span>${message}</span>
                    </c:if>
                    <div class="form-group">
                        <label class="col-md-4 control-label">ID</label>
                        <div class="col-md-4">
                            <input id="employeeId" name="employeeId" type="text"
                                 hidden class="form-control input-md" value="${employee.employeeId}">
                            <span class="help-block">employee id of your employee</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="employeeName">Employee Name</label>
                        <div class="col-md-4">
                            <input id="employeeName" name="employeeName" type="text"
                                   placeholder="employee client's name"
                                   class="form-control input-md" value="${employee.employeeName}">
                            <span class="help-block">Full name of your employee</span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label">position</label>
                        <div class="col-md-4">
                            <select name="positionId" class="form-control">
                                <c:forEach  var="position" items="${positions}">
                                    <option value="${position.positionId}" ${position.positionId==position.positionId?"selected":""}>${position.positionName}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label">education degree</label>
                        <div class="col-md-4">
                            <select name="educationDegreeId" class="form-control">
                                <c:forEach  var="educationDegree" items="${educationDegrees}">
                                    <option value="${educationDegree.educationDegreeId}" ${educationDegree.educationDegreeId==educationDegree.educationDegreeId?"selected":""}>${educationDegree.educationDegreeName}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label">division</label>
                        <div class="col-md-4">
                            <select name="divisionId" class="form-control">
                                <c:forEach  var="division" items="${divisions}">
                                    <option value="${division.divisionId}"${division.divisionId==division.divisionId?"selected":""}>${division.divisionName}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label" for="employeeName">Birthday</label>
                        <div class="col-md-4">
                            <input  name="employeeBirthday" id="employeeBirthday" type="text"
                                    value="${employee.employeeBirthday}"
                                    class="form-control input-md">
                            <span class="help-block">Date of birth of your employee</span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label" for="employeeName">Id Card</label>
                        <div class="col-md-4">
                            <input  name="employeeIdCard" id="employeeIdCard" type="text" value="${employee.employeeIdCard}"
                                    class="form-control input-md">
                            <span class="help-block">card of your employer</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="employeeName">employee Salary</label>
                        <div class="col-md-4">
                            <input  name="employeeSalary" id="employeeSalary" type="text" value="${employee.employeeSalary}"
                                    class="form-control input-md">
                            <span class="help-block">Salary of your employe</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="employeeName">Phone</label>
                        <div class="col-md-4">
                            <input name="employeePhone" id="employeePhone" type="text"
                                   class="form-control input-md" value="${employee.employeePhone}">
                            <span class="help-block">Phone of your employee</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="employeeName">Email</label>
                        <div class="col-md-4">
                            <div class="input-group">
                                <span class="input-group-addon">@</span>
                                <input id="employeeEmail" name="employeeEmail" class="form-control"
                                       value="${employee.employeeEmail}" type="text">
                            </div>
                            <p class="help-block" >Email of your employe</p>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="employeeName">Address</label>
                        <div class="col-md-4">
                            <input name="employeeAddress" id="employeeAddress" type="text"
                                   class="form-control input-md" value="${employee.employeeAddress}">
                            <span class="help-block">Address of your employee </span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="employeeName">username</label>
                        <div class="col-md-4">
                            <input name="username" id="username" type="text" hidden
                                   class="form-control input-md" value="${employee.username}">
                            <span class="help-block">username of your employee </span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label"></label>
                        <div class="col-md-4">
                            <button type="submit"  class="btn btn-success">update</button>

                                <a href="/employees" class="btn btn-default-btn-xs btn-success">back to list</a>

                        </div>
                    </div>

                </fieldset>
            </form>
        </div>
    </div>
</div>
</body>
</html>

