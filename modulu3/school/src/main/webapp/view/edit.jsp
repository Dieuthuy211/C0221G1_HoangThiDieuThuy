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

        <form class="form-horizontal" id="form-edit-client" method="post" action="/students?action=edit">
            <div class="bober">
                <h1 class="text-center">edit</h1>
                <c:if test="${message!=null}">
                <span>${message}</span>
                </c:if>
                <div class="form-group">
                    <label class="col-md-4 control-label" >ID</label>
                    <div class="col-md-4">
                        <input id="id" name="id" value="${student.id}" disabled
                               class="form-control input-md">
                        <span class="help-block">Id of your student</span>
                    </div>
                </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label" >Name</label>
                        <div class="col-md-4">
                            <input id="name" name="name" value="${student.name}" type="text"
                                   placeholder="your client's name"
                                   class="form-control input-md">
                            <span class="help-block">Full name of your customer</span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label">Gender</label>
                        <div class="col-md-4" >
                            <select name="gender" class="form-control" >
                                <option value="Nam" ${student.gender=='Nam'?"selected":""}>male</option>
                                <option value="Nu" ${student.gender=='Nu'?"selected":""}>female</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label">birthday</label>
                        <div class="col-md-4">
                            <input  name="birthday" id="birthday" type="date"
                                    value="${student.birthday}"
                                    class="form-control input-md">
                            <span class="help-block">Date of birth of your student</span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label">Email</label>
                        <div class="col-md-4">
                            <div class="input-group">
                                <span class="input-group-addon">@</span>
                                <input id="email" name="email" class="form-control"
                                       value="${student.email}" type="email">
                            </div>
                            <p class="help-block">Email of your customer</p>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label">Address</label>
                        <div class="col-md-4">
                            <input name="address" id="address" value="${student.address}" type="text" style="height: 80px;"
                                   class="form-control input-md">
                            <span class="help-block">Address of your customer</span>
                        </div>
                    </div>
                <div class="form-group">
                    <label class="col-md-4 control-label">Date of birth</label>
                    <div class="col-md-4">
                        <input  name="point" id="point" type="text"
                                value="${student.point}"
                                class="form-control input-md">
                        <span class="help-block">Date of birth of your student</span>
                    </div>
                </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label"></label>
                        <div class="col-md-4">
                            <button  type="submit" class="btn btn-success">edit</button>
                            <a class="btn btn-default-btn-xs btn-success" href="/students">back to list</a>
                        </div>
                    </div>

                </div>
        </form>


    </div>
</div>
</body>
</html>

