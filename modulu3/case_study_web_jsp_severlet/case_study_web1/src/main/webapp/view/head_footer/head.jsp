
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
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
                <a class="nav-link " href="#"  aria-expanded="false">contract</a>
            </li>

        </ul>
        <form class="d-flex">
            <input class="form-control mr-2" type="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success text-white" type="submit">Search</button>
        </form>
    </div>
</nav>
</body>
</html>
