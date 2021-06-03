<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>list</title>

    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <link rel="stylesheet" href="file_nhung/bootstrap.min.css">
    <link rel="stylesheet" href="file_nhung/dataTables.bootstrap.min.css">


</head>


<body>
<!--// logo-->
<header class="row bg-info">
    <div class="col-8 pl-4 my-2 mx-5"><a href="https://www.microsoft.com/vi-vn/">
        <img src="https://furamavietnam.com/wp-content/uploads/2018/08/logo.png"
             width="100" height="150">
    </a></div>
    <div class="col-3 mt-5">
        <h1>Hoàng Thị Diệu Thúy</h1>
    </div>
</header>


<!--head-->
<nav class="navbar navbar-expand-lg navbar-light bg-light m-0">

    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarScroll"
            aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse ml-5" id="navbarScroll">
        <ul class="navbar-nav mr-auto my-2 my-lg-0 navbar-nav-scroll" style="max-height: 100px;">
            <li class="nav-item" style="margin-left: 250px">
                <a class="nav-link " href="/index.jsp" data-toggle="dropdown" aria-expanded="false">Home</a>
            </li>
            <li class="nav-item" style="margin-left: 50px">
                <a class="nav-link " href="#" data-toggle="dropdown" aria-expanded="false">Employee</a>
            </li>
            <li class="nav-item" style="margin-left: 50px">
                <a class="nav-link " href="#" data-toggle="dropdown" aria-expanded="false">Customer</a>
            </li>

            <li class="nav-item" style="margin-left: 50px">
                <a class="nav-link " href="#" data-toggle="dropdown" aria-expanded="false">Service</a>
            </li>

            <li class="nav-item" style="margin-left: 50px">
                <a class="nav-link " href="#" data-toggle="dropdown" aria-expanded="false">Contract</a>
            </li>

        </ul>
        <form class="d-flex" method="post" action="/customers?action=search">
            <input class="form-control my-2" style="width: 200px ;margin-left: 800px" type="search" placeholder="Search"
                   name="tim" id="tim" aria-label="Search">
            <button class="btn btn-outline-success" type="submit">Search</button>
        </form>
    </div>
</nav>


<!--body-->


<div class="row " style="width: 100%; height: 1000px">
    <div class="col-3 bg-info">
        <p> day la the p</p>
        <p> day la the p</p>
        <p> day la the p</p>
    </div>
    <div class="col-9">
        <h1 class="text-center">List Customer</h1>

        <div class="container-fluid">
            <div class="pull-right " style="margin-bottom: 20px"><a class="btn btn-default-btn-xs btn-success"
                                                                    href="view/customer/create.jsp">
                <i class="glyphicon glyphicon-plus"></i> New create</a></div>

            <table class="table table-striped table-hover border" style="margin-top: 20px">
                <tr>
                    <td>ID</td>
                    <td>ID Customer Type</td>
                    <td>Name</td>
                    <td>Gender</td>
                    <td>Date Of Birth</td>
                    <td>card</td>
                    <td>Phone</td>
                    <td>email</td>
                    <td>Address</td>
                    <td>Edit</td>
                    <td>Delete</td>
                </tr>

                <c:forEach items='${customers}' var="customer">
                    <tr>
                        <td>${customer.id}</td>
                        <td>${customer.idCustomerType}</td>
                        <td>${customer.name}</td>
                        <td>${customer.gender}</td>
                        <td>${customer.dateOfBirth}</td>
                        <td>${customer.card}</td>
                        <td>${customer.phone}</td>
                        <td>${customer.email}</td>
                        <td>${customer.address}</td>

                        <td><a href="/customers?action=edit&id=${customer.id}" title="edit this user"
                               class="btn btn-default btn-sm "> <i
                                class="glyphicon glyphicon-edit text-primary"></i> </a></td>
                            <%--                        <td><a href="/customers?action=delete&id=${customer.id}" title="delete this user" class="btn btn-default btn-sm "> <i--%>
                            <%--                                class="glyphicon glyphicon-trash text-danger"></i> </a></td>--%>

                        <td>
                            <button class="btn btn-info" data-toggle="modal" data-target="#exampleModal"
                                    onclick="sendDataToModal('${customer.id}','${customer.name}')">
                                <i class="glyphicon glyphicon-trash text-danger"></i>
                            </button>
                        </td>
                    </tr>
                </c:forEach>


            </table>
        </div>
    </div>
</div>


<div class="row">
    <div class="card-footer " style="height: 50px ;width: 100% ">
        <p style="text-align: center;">Card footer</p>
    </div>
</div>

<!-- Modal -->
<div class="modal fade" id="exampleModalLong" tabindex="-1" role="dialog" aria-labelledby="exampleModalLongTitle"
     aria-hidden="true">
    <form action="/customers?action=delete&id=delete" method="post">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLongTitle">delete Customer</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <input hidden type="text" name="id" id="idCustomer">
                    <p>bạn có muốn xóa khách hàng :<span id="nameCustomer"></span></p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal" value="Cancel">Cancel</button>
                    <button type="submit" class="btn btn-primary">OK</button>
                </div>
            </div>
        </div>
    </form>
</div>
<script src="file_nhung/jquery-3.6.0.min.js"></script>
<script src="file_nhung/jquery.dataTables.min.js"></script>
<script src="file_nhung/dataTables.bootstrap4.min.js"></script>
<script src="file_nhung/popper.min.js"></script>
<script src="file_nhung/bootstrap.min.js"></script>
<script type="text/javascript">
    function sendDataToModal(id,name) {
        document.getElementById("idCustomer").value = id;
        document.getElementById("nameCustomer").innerText = name
    }
</script>


</body>
</html>