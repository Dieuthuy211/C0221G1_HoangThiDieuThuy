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
            <form class="form-horizontal" id="form-edit-client" method="post" action="/sanPhams?action=edit">
                <fieldset>
                    <legend>create</legend>
                    <c:if test="${message!=null}">
                        <span>${message}</span>
                    </c:if>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="tenSanPham">ID</label>
                        <div class="col-md-4">
                            <input id="id" name="tenSanPham" type="text"
                                   placeholder="nhap ten san pham" disabled
                                   class="form-control input-md">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="tenSanPham">Ten San Pham</label>
                        <div class="col-md-4">
                            <input id="tenSanPham" name="tenSanPham" type="text"
                                   placeholder="nhap ten san pham"
                                   class="form-control input-md">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label" for="tenSanPham">Gia</label>
                        <div class="col-md-4">
                            <input  name="gia" id="gia" type="text"
                                    placeholder="nhap gia san pham"
                                    class="form-control input-md">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label" for="tenSanPham">So Luong</label>
                        <div class="col-md-4">
                            <input  name="soLuong" id="soLuong" type="text" placeholder="nhap So Luong"
                                    class="form-control input-md">
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="tenSanPham">Mau Sac</label>
                        <div class="col-md-4">
                            <input  name="mauSsac" id="mauSsac" type="text" placeholder="mau sac"
                                    class="form-control input-md">

                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="tenSanPham">Mo Ta</label>
                        <div class="col-md-4">
                            <input name="moTa" id="moTa" type="text"
                                   class="form-control input-md" placeholder="mo ta">
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label">position</label>
                        <div class="col-md-4">
                            <select name="danhMuc" class="form-control" >
                                <c:forEach  var="danhMuc" items="${danhMucs}">
                                    <option value="${danhMuc.idDanhMuc}">${danhMuc.tenDanhMuc}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label"></label>
                        <div class="col-md-4">
                            <button type="submit"  class="btn btn-success">create</button>
                            <a href="/sanPhams" class="btn btn-default-btn-xs btn-success">back to list</a>
                        </div>
                    </div>

                </fieldset>
            </form>


        </div>
    </div>
</div>
<script src="../../bootstrap/jquery-3.6.0.min.js"></script>
<script src="../../bootstrap/bootstrap.min.js"></script>
</body>
</html>

