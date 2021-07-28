
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>List</title>
    <link rel="stylesheet" href="../../bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="../../bootstrap/dataTables.bootstrap.min.css">

</head>
<body>
<!--head-->
<nav class="navbar navbar-expand-lg navbar-light bg-info">

    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarScroll"
            aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse ml-5" id="navbarScroll">
        <ul class="navbar-nav mr-auto my-2 my-lg-0 navbar-nav-scroll" style="max-height: 100px;">
            <li class="nav-item" style="margin-left: 250px">
                <a class="nav-link " href="/index.jsp"  aria-expanded="false">Home</a>
            </li>
            <li class="nav-item" style="margin-left: 50px">
                <a class="nav-link " href="/employees" aria-expanded="false">Employee</a>
            </li>
            <li class="nav-item" style="margin-left: 50px">

                <a class="nav-link " href="/customers" aria-expanded="false">Customer</a>
            </li>

            <li class="nav-item" style="margin-left: 50px">
                <a class="nav-link " href="/services"  aria-expanded="false">Service</a>
            </li>

            <li class="nav-item" style="margin-left: 50px">
                <a class="nav-link " href="/contracts"  aria-expanded="false">contract</a>
            </li>

        </ul>
        <form class="d-flex m-2" action="/students?action=search" method="post">
            <input class="form-control mr-2" type="search" name="tim" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success text-white" type="submit">Search</button>
        </form>
    </div>
</nav>

<div class="row">
    <div class="container-fluid border pt-5 mt-5">
        <h1 class="text-center">List Customer</h1>
        <a href="/students">list of customers using the service </a>
        <div class="row" style="margin-left: 5px">
            <div ><a class="btn btn-default-btn-xs btn-success"
                     href="/students?action=create">New create</a>
            </div>
        </div>
        <table id="tableStudent" class="container table table-bordered table-striped ">
            <thead>
            <tr>
                <th>STT</th>
                <th>ID</th>
                <th>Name</th>
                <th>Gender</th>
                <th>Birthday</th>
                <th>Email</th>
                <th>Address</th>
                <th>Point</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${students}" var="student" varStatus="counts">
                <tr>
                    <td>${counts.count}</td>
                    <td><a href="/students?action=view&id=${student.id}">${student.id}</a>
                    </td>
                    <td>${student.name}</td>
                    <td>${student.gender}</td>
                    <td>${student.birthday}</td>
                    <td>${student.email}</td>
                    <td>${student.address}</td>
                    <td>${student.point}</td>
                    <td><a href="/students?action=edit&id=${student.id}">
                        <button type="button" class="btn btn-primary">Edit</button>
                    </a>
                    </td>
                    <td>
                        <button class="btn btn-primary" data-toggle="modal" data-target="#myModal"
                                onclick="myFunction(${student.id})">
                            Delete
                        </button>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

    <%--modal--%>
    <div class="modal fade" id="myModal" tabindex="-1" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <form action="/students?action=delete" method="post">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="myModalLabel">Accept delete customer</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        Do you want to delete this customer?
                    </div>
                    <div class="modal-footer">
                        <input type="button" class="btn btn-secondary" data-dismiss="modal" value="Cancel">
                        <input type="submit" class="btn btn-danger btn-ok" id="delete" value="Delete">
                        <input type="hidden" id="id" name="id">
                    </div>
                </div>
            </form>

        </div>
    </div>
</div>

<c:if test="${message != null}">
    <input type="hidden" id="message" value="${message}">
    <script>
        let message = document.getElementById("message").value;
        alert(message);
    </script>
</c:if>



<script src="../../bootstrap/jquery-3.6.0.min.js"></script>
<script src="../../bootstrap/jquery.dataTables.min.js"></script>
<script src="../../bootstrap/dataTables.bootstrap4.min.js"></script>
<script src="../../bootstrap/popper.min.js"></script>
<script src="../../bootstrap/bootstrap.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableStudent').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });
</script>
<script type="text/javascript">
    function myFunction(id) {
        document.getElementById("id").value = id;
    }
</script>


</body>
</html>