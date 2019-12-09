<%-- 
    Document   : showLogin
    Created on : Dec 9, 2019, 6:22:22 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Авторизация</title>
    </head>
    <body>
        <h1>Войдите</h1>
          ${info}</br>
       <from action = "login" method="POST">
           Login: <input type = "text" name = "login"><br>
           Password: <input type = "password" name = "password"><br>
           <input type = "submit" value = "Go">
    </body>
</html>
