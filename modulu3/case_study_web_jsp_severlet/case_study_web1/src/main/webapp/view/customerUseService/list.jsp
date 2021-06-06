<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>List</title>
    <link rel="stylesheet" href="bootstrap/bootstrap.min.css">
    <link rel="stylesheet" href="bootstrap/dataTables.bootstrap.min.css">

</head>
<body>
<!--// logo-->
<header class="row">
    <div class="col-8 pl-4 my-2 mx-5"><a href="https://www.microsoft.com/vi-vn/">
        <img src="https://furamavietnam.com/wp-content/uploads/2018/08/logo.png"
             width="100" height="150">
    </a></div>
    <div class="col-3 mt-5">
        <h1>Hoàng Thị Diệu Thúy</h1>
    </div>
</header>


<!--head-->
<nav class="navbar navbar-expand-lg navbar-light bg-info">

    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarScroll"
            aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse ml-5" id="navbarScroll">
        <ul class="navbar-nav mr-auto my-2 my-lg-0 navbar-nav-scroll" style="max-height: 100px;">
            <li class="nav-item" style="margin-left: 250px">
                <a class="nav-link " href="#" data-toggle="dropdown" aria-expanded="false">Home</a>
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
            <li class="nav-item" style="margin-left: 50px">
                <a class="nav-link " href="/contractDetails"  aria-expanded="false">contract detail</a>
            </li>

        </ul>
        <form class="d-flex"  action="/userService?action=search" method="post">
            <input class="form-control mr-2" name="tim" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success text-white" type="submit">Search</button>
        </form>
    </div>
</nav>

<div class="container-fluid border pt-5 mt-5">
<div style="height: 50px;margin-bottom: 50px">
    <h1 class="text-center">list of customers using the service </h1>
</div>
    <table id="tableEmployee" class="container table table-bordered table-striped ">
        <thead>
        <tr>
            <th>Contract ID</th>
            <th>Customer Id</th>
            <th>Customer Name</th>
            <th>Service Name</th>
            <th>Contract Start Date</th>
            <th>Contract End Date</th>
            <th>Accompanied service</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${customerUseServices}" var="customerUseService">
        <tr>
            <td>${customerUseService.contractId}</td>
            <td>${customerUseService.customerId}</td>
            <td>${customerUseService.customerName}</td>
            <td>${customerUseService.serviceName}</td>
            <td>${customerUseService.contractStartDate}</td>
            <td>${customerUseService.contractEndDate}</td>
            <td>
                <div class="dropdown">
                    <button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenu2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        Accompanied service
                    </button>
                    <div class="dropdown-menu" aria-labelledby="dropdownMenu2">
                        <c:forEach items="${amountOfServicesIncludeds}" var="amountOfServicesIncluded">
                        <button class="dropdown-item" type="button">
                            <c:if test="${amountOfServicesIncluded.contractId==customerUseService.contractId}">
                                ${amountOfServicesIncluded.attachServiceName}
                            </c:if>
                        </button>
                        </c:forEach>
                    </div>
                </div>
            </td>
            <td><a href="/?action=edit&id=${employee.employeeId}">
                <button type="button" class="btn btn-primary">Edit</button>
            </a>
            </td>
            <td>
                <button class="btn btn-primary" data-toggle="modal" data-target="#myModal"
                        onclick="myFunction(${customerUseService.contractId})">
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
        <form action="/userService?action=delete" method="post">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="myModalLabel">Accept delete Employee</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    Do you want to delete this employee?
                </div>
                <div class="modal-footer">
                    <input type="button" class="btn btn-secondary" data-dismiss="modal" value="Cancel">
                    <input type="submit" class="btn btn-danger btn-ok" id="delete" value="Delete">
                    <input type="hidden" id="contractId" name="contractId">
                </div>
            </div>
        </form>

    </div>
</div>
<c:if test="${message != null}">
    <input type="hidden" id="message" value="${message}">
    <script>
        let message = document.getElementById("message").value;
        alert(message);
    </script>
</c:if>


<script src="bootstrap/jquery-3.6.0.min.js"></script>
<script src="bootstrap/jquery.dataTables.min.js"></script>
<script src="bootstrap/dataTables.bootstrap4.min.js"></script>
<script src="bootstrap/popper.min.js"></script>
<script src="bootstrap/bootstrap.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableEmployee').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });
</script>
<script type="text/javascript">
    function myFunction(id) {
        document.getElementById("contractId").value = id;
    }
</script>


</body>
</html>