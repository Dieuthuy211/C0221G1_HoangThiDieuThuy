
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

<div class="row">
    <div class="container-fluid border pt-5 mt-5">
        <h1 class="text-center">Danh Sách San Pham</h1>
        <div class="row" style="margin-left: 5px">
            <div ><a class="btn btn-default-btn-xs btn-success"
                     href="/sanPhams?action=create">New create</a>
            </div>
        </div>
        <table id="tableStudent" class="container table table-bordered table-striped ">
            <thead>
            <tr>
                <th>STT</th>
                <th>ID</th>
                <th>Ten San Pham</th>
                <th>Gia</th>
                <th>So Luong</th>
                <th>Mau sac</th>
                <th>Mo Ta</th>
                <th>Danh Muc</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
            </thead>
            <tbody>

            <c:forEach items="${sanPhams}" var="sanPham" varStatus="counts">
                <tr>
                    <td>${counts.count}</td>
                    <td><a href="/sanPhams?action=view&id=${sanPham.id}">${sanPham.id}</a>
                    </td>
                    <td>${sanPham.tenSanPham}</td>
                    <td>${sanPham.gia}</td>
                    <td>${sanPham.soLuong}</td>
                    <td>${sanPham.mauSsac}</td>
                    <td>${sanPham.moTa}</td>
                    <c:forEach var="danhMuc" items="${danhMucs}">
                        <c:if test="${danhMuc.idDanhMuc == sanPham.danhMuc}">
                            <td>${danhMuc.tenDanhMuc}</td>
                        </c:if>
                    </c:forEach>
                    <td><a href="/sanPhams?action=edit&id=${sanPham.id}">
                        <button type="button" class="btn btn-primary">Edit</button>
                    </a>
                    </td>
                    <td>
                        <button class="btn btn-primary" data-toggle="modal" data-target="#myModal"
                                onclick="myFunction(${sanPham.id})">
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
            <form action="/sanPhams?action=delete" method="post">
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