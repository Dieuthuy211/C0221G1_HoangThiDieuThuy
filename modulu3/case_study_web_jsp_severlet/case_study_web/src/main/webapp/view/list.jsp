<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Home</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
          integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    
</head>


<body>
<!--// logo-->
<div class="row">
    <div class="container-fluid d-flex justify-content-between  align-items-center py-3 bg-info text-light">
        <div class="  d-flex align-items-center" style="margin-left: 50px">
            <a class="navbar-brand" href="#"><img src="https://furamavietnam.com/wp-content/uploads/2018/08/logo.png" width="100" height="150"/>
            </a>

        </div>
        <div class="col-md-2 h3">
            <p>Hoang Thi Dieu Thuy</p>
        </div>
    </div>
</div>



<!--head-->
<div class="row">
    <nav class="container-fluid navbar navbar-expand-lg navbar-light  bg-light">
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto h5">
                <li class="nav-item active px-5 h4">
                    <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item px-5">
                    <a class="nav-link" href="#">Employee</a>
                </li>
                <li class="nav-item px-5">
                    <a class="nav-link" href="#">Customer</a>
                </li>
                <li class="nav-item px-5">
                    <a class="nav-link" href="#">Service</a>
                </li>
                <li class="nav-itempx px-5">
                    <a class="nav-link" href="#">Contract</a>
                </li>
            </ul>
            <form class="form-inline my-2 my-lg-0 mr-3">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </nav>
</div>


<!--body-->



<div class="row " style="width: 100%; height: 1000px">
    <div class="col-3 bg-info">
        <p> day la the p</p>
        <p> day la the p</p>
        <p> day la the p</p>
    </div>
    <div class="col-9">
        <h1 class="text-center">List</h1>

        <div class="container-fluid">
            <div class="pull-right " style="margin-bottom: 20px"><a class="btn btn-default-btn-xs btn-success"
                                                                    href="create.html">
                <i class="glyphicon glyphicon-plus"></i> New create</a></div>

            <table class="table table-striped table-hover border" style="margin-top: 20px">
                <tr>
                    <td>ID</td>
                    <td>Name</td>
                    <td>Date Of Birth</td>
                    <td>Gender</td>
                    <td>card</td>
                    <td>Phone</td>
                    <td>email</td>
                    <td>Address</td>
                    <td>Edit</td>
                    <td>Delete</td>
                </tr>

                <tr>
                    <td><a href="/products?action=view&id=${customer.id}"></a></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td><a href="edit.html" title="edit this user" class="btn btn-default btn-sm "> <i
                            class="glyphicon glyphicon-edit text-primary"></i> </a></td>
                    <td><a href="delete.html" title="delete this user" class="btn btn-default btn-sm "> <i
                            class="glyphicon glyphicon-trash text-danger"></i> </a></td>
                </tr>


            </table>
        </div>
    </div>
</div>


<div class="row">
    <div class="card-footer " style="height: 50px ;width: 100% ">
        <p style="text-align: center;">Card footer</p>
    </div>
</div>


</body>
</html>
