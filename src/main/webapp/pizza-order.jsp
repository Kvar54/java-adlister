<%--
  Created by IntelliJ IDEA.
  User: kv
  Date: 8/29/23
  Time: 12:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>PizzaOrder</title>
</head>
<body>
<h1>Papi's Pizza</h1>
<%@ include file="partials/navbar.jsp"%>
<div class="container">
<h2>Create Your Order:</h2>
<form method = "post" action = "/pizza-order">
    <label for = "crust">Select Crust:</label>
    <select name = "crust" id="crust">
        <option value = "thin">Thin Crust</option>
        <option value= "thick">Thick Crust</option>
        <option value = "stuffed">Stuffed Crust</option>
    </select><br/>

    <label for="Sauce">Select Sauce:</label>
    <select name="sauce" id="sauce">
        <option value="tomato">Tomato Sauce</option>
        <option value="bbq">BBQ Sauce</option>
        <option value="Cheese">Cheese Sauce</option>
        <option value="pesto">Pesto</option>
    </select><br><br>

    <label for="Size">Select Size:</label>
    <select name="size" id="size">
            <option value="Small">'Small'</option>
        <option value="medium"> 'Medium'</option>
        <option value="large"> 'Large'</option>
        <option value="X-large">'X-large'</option>
    </select><br><br>

    <label>Toppings:</label><br>
    <input type="checkbox" name="topping" value="pepperoni"> Pepperoni<br>
    <input type="checkbox" name="topping" value="mushrooms"> Mushrooms<br>
    <input type="checkbox" name="topping" value="sausage"> Sausage<br>
    <input type="checkbox" name="topping" value="olives"> Olives<br><br>

    <label for="deliveryaddress"> Delivery Address:</label>
    <input type="text" name="deliveryaddress" placeholder = "Enter Address" id="deliveryaddress" required><br>
    <button type="submit">Place Order</button>
</form>
</div>
</body>
</html>
