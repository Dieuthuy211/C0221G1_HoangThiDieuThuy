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
            <form class="form-horizontal" id="form-edit-client" method="post" action="/customers?action=edit">
                <div class="bober">
                    <legend>edit</legend>
                    <c:if test="${message!=null}">
                        <span>${message}</span>
                    </c:if>
                    <div class="form-group">
                        <label class="col-md-4 control-label" >ID</label>
                        <div class="col-md-4">
                            <input id="id" name="id" value="${customer.id}" type="text"
                                   placeholder="your client's name"
                                   class="form-control input-md">
                            <span class="help-block">Id of your customer</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label">ID Customer Type</label>

                        <div class="col-md-4">
                            <select name="customerType" >
                                <option value="1">Diamond</option>
                                <option value="2">Platinium</option>
                                <option value="3">Gold</option>
                                <option value="4">Silver</option>
                                <option value="5">Member</option>
                            </select>

                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label" >Name</label>
                        <div class="col-md-4">
                            <input id="name" name="name" value="${customer.name}" type="text"
                                   placeholder="your client's name"
                                   class="form-control input-md">
                            <span class="help-block">Full name of your customer</span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label">Gender</label>
                        <div class="col-md-4">
                            <select name="gender" >
                                <option value="male">male</option>
                                <option value="female">female</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label">Date of birth</label>
                        <div class="col-md-4">
                            <input  name="dateOfBirth" id="dateOfBirth" type="text"
                                    value="${customer.dateOfBirth}"
                                    class="form-control input-md">
                            <span class="help-block">Date of birth of your customer</span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label">card</label>
                        <div class="col-md-4">
                            <input  name="card" id="card" type="text" value="${customer.card}"
                                    class="form-control input-md">
                            <span class="help-block">card of your customer</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label">Phone</label>
                        <div class="col-md-4">
                            <input  name="phone" id="phone" type="text" value="${customer.phone}"
                                    class="form-control input-md">
                            <span class="help-block">Phone of your customer</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label">Email</label>
                        <div class="col-md-4">
                            <div class="input-group">
                                <span class="input-group-addon">@</span>
                                <input id="email" name="email" class="form-control"
                                       value="${customer.email}" type="text">
                            </div>
                            <p class="help-block">Email of your customer</p>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label">Address</label>
                        <div class="col-md-4">
                            <input name="address" id="address" value="${customer.address}" type="text" style="height: 80px;"
                                   class="form-control input-md">
                            <span class="help-block">Address of your customer</span>
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="col-md-4 control-label"></label>
                        <div class="col-md-4">
                        <button  type="submit" class="btn btn-success">edit</button>
                            <button name="btn-save" class="btn btn-success">
                                <a href="/customers">back to list</a>
                            </button>
                        </div>
                    </div>

                </div>
            </form>


        </div>
    </div>
</div>
</body>
</html>

