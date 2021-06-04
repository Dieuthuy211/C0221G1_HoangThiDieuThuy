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
    <div class="row">
        <div class="col-md-12">
            <form class="form-horizontal" id="form-edit-client" method="post" action="/services?action=create">
                <fieldset>
                    <legend>create</legend>
                    <c:if test="${message!=null}">
                        <span>${message}</span>
                    </c:if>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="serviceName">Service Name</label>
                        <div class="col-md-4">
                            <input id="serviceName" name="serviceName" type="text"
                                   placeholder="your client's name"
                                   class="form-control input-md">
                            <span class="help-block">Full Service Name of your Servicer</span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label">Service Area</label>
                        <div class="col-md-4">
                            <input  name="serviceArea" id="serviceArea" type="text"
                                    placeholder="Service Area"
                                    class="form-control input-md">
                            <span class="help-block">Service Area of your Service</span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label">Service Price</label>
                        <div class="col-md-4">
                            <input  name="servicePrice" id="servicePrice" type="text" placeholder="Service Price"
                                    class="form-control input-md">
                            <span class="help-block">Service Price of your Service</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label">Service Max People</label>
                        <div class="col-md-4">
                            <input  name="serviceMaxPeople" id="serviceMaxPeople" type="text" placeholder="Service Max People"
                                    class="form-control input-md">
                            <span class="help-block">Service Max People of your Service</span>
                        </div>
                    </div>
                        <div class="form-group">
                            <label class="col-md-4 control-label">Rent Type Id</label>
                            <div class="col-md-4">
                                <select name="rentTypeId" style="width: 360px;height: 30px">
                                    <option value="1">ngay</option>
                                    <option value="2">giờ</option>
                                    <option value="3">tháng</option>
                                    <option value="4">năm</option>
                                </select>
                            </div>
                        </div>
                    <div class="form-group">
                    <label class="col-md-4 control-label">Service Type Id</label>
                    <div class="col-md-4">
                        <select class="form-control" name="serviceTypeId" >
                            <c:forEach var="ServiceType" items="${serviceTypes}">
                                <option value="${ServiceType.serviceTypeId}">${ServiceType.serviceTypeName}</option>
                            </c:forEach>
                        </select>
                    </div>

                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label">Standrad Room</label>
                        <div class="col-md-4">
                            <input  name="standradRoom" id="standradRoom" type="text" placeholder="Standrad Room"
                                    class="form-control input-md">
                            <span class="help-block">Standrad Room of your Service</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label">status</label>
                        <div class="col-md-4">
                            <input  name="status" id="status" type="text" placeholder="status "
                                    class="form-control input-md">
                            <span class="help-block">status of your Service</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label">Pool Area</label>
                        <div class="col-md-4">
                            <input  name="poolArea" id="poolArea" type="text" placeholder="Pool Area"
                                    class="form-control input-md">
                            <span class="help-block">Pool Area of your Service</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label">number Of Floors</label>
                        <div class="col-md-4">
                            <input  name="numberOfFloors" id="numberOfFloors" type="text" placeholder="number Of Floors"
                                    class="form-control input-md">
                            <span class="help-block">number Of Floors of your Service</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label"></label>
                        <div class="col-md-4">
                            <button type="submit"  class="btn btn-success">create</button>
                            <button name="btn-save" class="btn btn-success">
                                <a href="/index.jsp">Home</a>
                            </button>
                        </div>
                    </div>

                </fieldset>
            </form>


        </div>
    </div>
</div>
</body>
</html>
