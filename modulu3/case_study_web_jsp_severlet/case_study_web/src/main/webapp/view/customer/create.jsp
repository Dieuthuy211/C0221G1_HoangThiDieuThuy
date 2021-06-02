
<html>
<head>
    <title>Title</title>
</head>
<body>

<div class="container">
    <div class="row">


        <link href="http://fontawesome.io/assets/font-awesome/css/font-awesome.css" rel="stylesheet" media="screen">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" type="text/css" rel="stylesheet">



        <div class="col-md-12">

            <form class="form-horizontal" id="form-edit-client">
                <fieldset>
                    <legend>create</legend>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="client-name">ID</label>
                        <div class="col-md-4">
                            <input  name="client-name" type="text" placeholder="id"
                                    class="form-control input-md" value="${customer.id}">
                            <span class="help-block">Id of your customer</span>
                        </div>
                    </div>


                    <div class="form-group">
                        <label class="col-md-4 control-label" for="client-name" >Name</label>
                        <div class="col-md-4">
                            <input id="client-name" name="client-name" type="text" value="${customer.name}" placeholder="your client's name"
                                   class="form-control input-md">
                            <span class="help-block">Full name of your customer</span>
                        </div>
                    </div>

                    <div class="form-group">
                        <label class="col-md-4 control-label" for="client-name" >Date of birth</label>
                        <div class="col-md-4">
                            <input value="${customer.dateOfBirth}" name="client-name" type="text" placeholder="YYYY-MM-DD"
                                   class="form-control input-md">
                            <span class="help-block">Date of birth of your customer</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label">Gender</label>
                        <div class="col-md-4" value="${customer.gender}">
                            <div class="radio">
                                <label for="client-status-0">
                                    <input type="radio" name="client-status" id="client-status-0" value="active"
                                           checked="checked">
                                    male
                                </label>
                            </div>
                            <div class="radio">
                                <label for="client-status-1">
                                    <input type="radio" name="client-status" id="client-status-1" value="inactive">
                                    female
                                </label>
                            </div>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="client-name">card</label>
                        <div class="col-md-4">
                            <input value="${customer.card}" name="client-name" type="text" placeholder="card"
                                   class="form-control input-md">
                            <span class="help-block">card of your customer</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="client-name">Phone</label>
                        <div class="col-md-4">
                            <input value="${customer.phone}" name="client-name" type="text" placeholder="Phone"
                                   class="form-control input-md">
                            <span class="help-block">Phone of your customer</span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="client-email">Email</label>
                        <div class="col-md-4">
                            <div class="input-group">
                                <span class="input-group-addon">@</span>
                                <input id="client-email" name="client-email" class="form-control"
                                       placeholder="yourname@yourdomain.com" type="text">
                            </div>
                            <p class="help-block">Email of your customer</p>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="client-name">Address</label>
                        <div class="col-md-4">
                            <input name="client-name" type="text" style="height: 80px;"
                                   class="form-control input-md">
                            <span class="help-block">Address of your customer</span>
                        </div>
                    </div>



                    <div class="form-group">
                        <label class="col-md-4 control-label" for="btn-save"></label>
                        <div class="col-md-4">
                            <button id="btn-save" name="btn-save" class="btn btn-success">create</button>
                        </div>
                    </div>

                </fieldset>
            </form>


        </div>
    </div>
</div>
</body>
</html>
