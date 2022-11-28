<%--
  Created by IntelliJ IDEA.
  User: thngtrn
  Date: 24/11/2022
  Time: 12:58
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
<h2>Login error!</h2>
<p>Please login again</p>
<form action="login" method="post">
    <input type="text" name="username" id="username">
    <input type="password" name="password" id="password">
    <input type="submit" value="Login" />
    <input type="reset" value="Reset" />
</form>
</body>
</html>