<!DOCTYPE html>
<html>
<head>
    <title>Chackycool</title>
</head>
<body>
<h1 >Chack</h1>
<hr>
<h3>Products</h3>
<#list products as product>
    <div>
<p>
    <b>${product.title}</b>
</p>
    </div>
    <div>
        <p>
            <b>${product.title +"  ("+ product.price+") грн."} | <br><a href="/product/${product.id}">More...</a></b>
        </p>
    </div>
</#list>
<hr>
<h3>
    Add new product
</h3>
<form action="/product/create" method="post">
    Caption: <input type="text"  name="title"/>
    <br>
    description: <input type="text"  name="description"/>
    <br>
    price: <input type="number"  name="price"/>
    <br>
    city: <input type="text"  name="city"/>
    <br>
    autor: <input type="text"  name="autor"/>
    <br>
    <input type="submit" value="add product"/>
</form>
</body>
</html>