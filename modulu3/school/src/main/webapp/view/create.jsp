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
            <form class="form-horizontal" id="form-edit-client" method="post" action="/students?action=create">
                <fieldset>
                    <legend>create</legend>
                    <c:if test="${message!=null}">
                        <span>${message}</span>
                    </c:if>


                    <div class="form-group">
                        <label class="col-md-4 control-label" for="name">Name</label>
                        <div class="col-md-4">
                            <input id="name" name="name" type="text"
                                   placeholder="your client's name"
                                   class="form-control input-md">
                            <span class="help-block">Full name of your Student</span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label">Gender</label>
                        <div class="col-md-4">
                            <select class="form-control" name="gender" >
                                <option value="Nam">Nam</option>
                                <option value="Nu">Nu</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label">Birthday</label>
                        <div class="col-md-4">
                            <input  name="birthday" id="birthday" type="date"

                                    class="form-control input-md">
                            <span class="help-block">birthday of your Student</span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label">Email</label>
                        <div class="col-md-4">
                            <div class="input-group">
                                <span class="input-group-addon">@</span>
                                <input id="email" name="email" class="form-control"
                                       placeholder="yourname@yourdomain.com" type="email">
                            </div>
                            <p class="help-block">Email of your Student</p>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label">Address</label>
                        <div class="col-md-4">
                            <input name="address" id="address" type="text" style="height: 80px;"
                                   class="form-control input-md">
                            <span class="help-block">Address of your Student</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label">Point</label>
                        <div class="col-md-4">
                            <input  name="point" id="point" type="text"

                                    class="form-control input-md">
                            <span class="help-block">birthday of your Student</span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label"></label>
                        <div class="col-md-4">
                            <button type="submit"  class="btn btn-success">create</button>

                                <a class="btn btn-default-btn-xs btn-success" href="/students">back to list</a>

                        </div>
                    </div>

                </fieldset>
            </form>


        </div>
    </div>
</div>
</body>
</html>



