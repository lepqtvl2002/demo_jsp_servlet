<%--
  Created by IntelliJ IDEA.
  User: thngtrn
  Date: 24/11/2022
  Time: 12:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>Login</h1>
    <div>
        <form action="login" method="post">
            <input type="text" name="username" id="username">
            <input type="password" name="password" id="password">
            <input type="submit" value="Login">
            <input type="reset" value="Reset">
        </form>
    </div>
</body>
</html>
