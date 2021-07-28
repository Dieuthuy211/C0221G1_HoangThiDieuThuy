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

        <form class="form-horizontal" id="form-edit-client" method="post" action="/employees?action=edit">
            <div class="bober">
                <h1 class="text-center">edit</h1>
                <c:if test="${message!=null}">
                    <span>${message}</span>
                </c:if>
                <div class="form-group">
                    <label class="col-md-4 control-label" >ID</label>
                    <div class="col-md-4">
                        <input id="id" name="id" value="${employee.id}" type="hidden"
                               class="form-control input-md">
                        <span class="help-block">Id of your student</span>
                    </div>
                </div>

                <div class="form-group">
                    <label class="col-md-4 control-label" >Name</label>
                    <div class="col-md-4">
                        <input id="name" name="name" value="${employee.name}" type="text"
                               placeholder="your client's name"
                               class="form-control input-md">
                        <span style="color: red">${map.name}</span>
                        <span class="help-block">Full name of your customer</span>
                    </div>
                </div>


                <div class="form-group">
                    <label class="col-md-4 control-label">birthday</label>
                    <div class="col-md-4">
                        <input  name="birthday" id="birthday" type="date"
                                value="${employee.birthday}"
                                class="form-control input-md">
                        <span style="color: red">${map.birthday}</span>
                        <span class="help-block">Date of birth of your employee</span>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-md-4 control-label"></label>
                    <div class="col-md-4">
                        <button  type="submit" class="btn btn-success">edit</button>
                        <a class="btn btn-default-btn-xs btn-success" href="/employees">back to list</a>
                    </div>
                </div>

            </div>
        </form>


    </div>
</div>
</body>
</html>

