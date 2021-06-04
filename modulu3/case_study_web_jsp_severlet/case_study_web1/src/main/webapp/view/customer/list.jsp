
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>List product</title>
<%--    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"--%>
<%--          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">--%>
    <link rel="stylesheet" href="file_nhung/bootstrap.min.css">
    <link rel="stylesheet" href="file_nhung/dataTables.bootstrap.min.css">

</head>
<body>
<div class="container-fluid border pt-5 mt-5">
    <h1>List Customer</h1>
    <p><a href="/index.jsp">Back to menu</a></p>
    <div class="row">
        <div class="col-6">
            <p><a href="/customers?action=create">Create new customer</a></p>
        </div>
        <div class="col-6 d-flex justify-content-end">
            <form action="/customers?action=search" method="post">
                <input type="text" name="tim" placeholder="Enter name...">
                <input type="submit" value="Search">
            </form>
        </div>
    </div>
    <table id="tableCustomer" class="container table table-bordered table-striped ">
        <thead>
        <tr>
            <th>ID</th>
            <th>Customer Type</th>
            <th>Name</th>
            <th>Gender</th>
            <th>Birthday</th>
            <th>Card</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Address</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${customers}" var="customer">
            <tr>
                <td><a href="/customers?action=view&id=${customer.id}">${customer.id}</a>
                </td>
                <td>${customer.idCustomerType}</td>
                <td>${customer.name}</td>
                <td>${customer.gender}</td>
                <td>${customer.dateOfBirth}</td>
                <td>${customer.card}</td>
                <td>${customer.phone}</td>
                <td>${customer.email}</td>
                <td>${customer.address}</td>
                <td><a href="/customers?action=edit&id=${customer.id}">
                    <button type="button" class="btn btn-primary">Edit</button>
                </a>
                </td>
                <td>
                    <button class="btn btn-primary" data-toggle="modal" data-target="#myModal"
                            onclick="myFunction(${customer.id})">
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
        <form action="/customers?action=delete" method="post">
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
<c:if test="${message != null}">
    <input type="hidden" id="message" value="${message}">
    <script>
        let message = document.getElementById("message").value;
        alert(message);
    </script>
</c:if>



<script src="file_nhung/jquery-3.6.0.min.js"></script>
<script src="file_nhung/jquery.dataTables.min.js"></script>
<script src="file_nhung/dataTables.bootstrap4.min.js"></script>
<script src="file_nhung/popper.min.js"></script>
<script src="file_nhung/bootstrap.min.js"></script>
<script>
    $(document).ready(function () {
        $('#tableCustomer').dataTable({
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