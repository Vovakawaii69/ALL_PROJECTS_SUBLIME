<%-- 
    Document   : page1
    Created on : Nov 4, 2019, 6:03:57 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Вход в систему</title>
    </head>
    <body>
        <h1>Введите логин и пароль</h1>
        ${info}<br>
       <from action = "login" method="POST"><br>
           Login: <input type = "text" name = "login"><br>
           Password: <input type = "password" name = "password"><br>
           <input type = "submit" value = "Go">
       </from>    
    </body>
</html>
  