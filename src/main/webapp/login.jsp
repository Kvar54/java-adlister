<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>login page</title>
</head>
<body>
<h1>Login</h1>
<form method = "post" action = "login.jsp">
      <label for = "username"> Username:</label>
<input type = "text" id = "username" name = "username" required><br>
<label for = "password"> Password:</label>
<input type = "text" id = "password" name = "password" required><br>
<input type = "submit" value = "Submit">
</form>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String submittedUsername = request.getParameter("username");
String submittedPassword = request.getParameter("password");

if(request.getMethod().equalsIgnoreCase("post")) {

    if ("admin".equals(submittedUsername) && "password".equals(submittedPassword)) {
        response.sendRedirect("profile.jsp");
    } else {
        response.sendRedirect("login.jsp");
    }
}
%>

</body>
</html>
