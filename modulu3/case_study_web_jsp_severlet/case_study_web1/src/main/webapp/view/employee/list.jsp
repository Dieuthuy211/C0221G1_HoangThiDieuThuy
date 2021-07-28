
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
<div class="container-fluid border pt-5 mt-5">
    <h1>List Employee</h1>
    <p><a href="/index.jsp">Back to menu</a></p>
    <div class="row">
        <div class="col-6">
            <p><a href="/employees?action=create">Create new employee</a></p>
        </div>
        <div class="col-6 d-flex justify-content-end">
            <form action="/employees?action=search" method="post">
                <input type="text" name="tim" placeholder="Enter name...">
                <input type="submit" value="Search">
            </form>
        </div>
    </div>
    <table id="tableEmployee" class="container table table-bordered table-striped ">
        <thead>
        <tr>
            <th>ID</th>
            <th>Employee Name</th>
            <th>position Id</th>
            <th>Education Degree Id</th>
            <th>Division Id</th>
            <th>Employee Birthday</th>
            <th>Employee Id Card</th>
            <th>Employee Salary</th>
            <th>Employee Phone</th>
            <th>Employee Email</th>
            <th>Employee Address</th>
            <th>username</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${employees}" var="employee">
            <tr>
                <td><a href="/employees?action=view&id=${employee.employeeId}">${employee.employeeId}</a>
                </td>
                <td>${employee.employeeName}</td>
                <td>${employee.positionId}</td>
                <td>${employee.educationDegreeId}</td>
                <c:forEach var="division" items="${divisions}">
                <c:if test="${employee.divisionId == division.divisionId}">
                    <td>${division.divisionName}</td>
                </c:if>
                </c:forEach>
                <td>${employee.employeeBirthday}</td>
                <td>${employee.employeeIdCard}</td>
                <td>${employee.employeeSalary}</td>
                <td>${employee.employeePhone}</td>
                <td>${employee.employeeEmail}</td>
                <td>${employee.employeeAddress}</td>
                <td>${employee.username}</td>
                <td><a href="/employees?action=edit&id=${employee.employeeId}">
                    <button type="button" class="btn btn-primary">Edit</button>
                </a>
                </td>
                <td>
                    <button class="btn btn-primary" data-toggle="modal" data-target="#myModal"
                            onclick="myFunction(${employee.employeeId})">
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
        <form action="/employees?action=delete" method="post">
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
                    <input type="hidden" id="employeeId" name="employeeId">
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
        document.getElementById("employeeId").value = id;
    }
</script>


</body>
</html>