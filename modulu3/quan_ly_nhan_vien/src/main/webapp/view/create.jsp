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
            <form class="form-horizontal" id="form-edit-client" method="post" action="/employees?action=create">
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
                            <samp style="color: red">${map.name}</samp>
                            <span class="help-block">Full name of your Employee</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label">Birthday</label>
                        <div class="col-md-4">
                            <input  name="birthday" id="birthday" type="date"

                                    class="form-control input-md">
                            <span style="color: red">${map.birthday}</span>
                            <span class="help-block">birthday of your Employee</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label"></label>
                        <div class="col-md-4">
                            <button type="submit"  class="btn btn-success">create</button>

                            <a class="btn btn-default-btn-xs btn-success" href="/employees">back to list</a>

                        </div>
                    </div>

                </fieldset>
            </form>


        </div>
    </div>
</div>
</body>
</html>




