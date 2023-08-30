<%--
  Created by IntelliJ IDEA.
  User: kv
  Date: 8/29/23
  Time: 2:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
<h1> COLOR CRAZE</h1>
<h2>Pick A Color:</h2>
<form method="post" action = "/pickcolor">
    <label for="pickcolor"> Pick A Color:</label>
    <input type="text" name="color" placeholder = "Enter A Color" id="pickcolor" required><br>
 <button type="submit">Submit</button>

</form>

</body>
</html>
