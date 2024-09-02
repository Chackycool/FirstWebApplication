<!DOCTYPE html>
<html>
<head>
    <title>Chackycool</title>
</head>
<body>
<h1 >Chack</h1>
<hr>
<h3>More about product</h3>
<b>Name:</b>${product.title}<br>
<b>description:</b>${product.description}<br>
<b>price:</b>${product.price}<br>
<b>City:</b>${product.city}<br>
<b>Autor:</b>${product.autor}<br>
<hr>
<form action="/product/delete/${product.id}" method="post">
    <input type="submit" value="delete"/>
</form>
</body>
</html>