<%--
  Created by IntelliJ IDEA.
  User: FPTSHOP
  Date: 5/26/2021
  Time: 5:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
   <style>
    #list{
     margin-left: 70px ;
    }
    #percent{
     margin-left: 25px;
    }
    button{
     margin-left: 150px;
    }
   </style>
</head>
<body>
<h1>Product Discount Calculator</h1>
<form action="ketqua" method="post">
 <div> Product Description: <input type="text" name="tenSanPham"></div>
  <br>
  <div>List Price: <input id="list" type ="text" name="giaNiemYet"></div>
  <br>
  <div>Discount Percent: <input id="percent" type="text" name="chietKhau"></div>
  <br>
  <div><button>Calculate Discount</button></div>
</form>
</body>
</html>
