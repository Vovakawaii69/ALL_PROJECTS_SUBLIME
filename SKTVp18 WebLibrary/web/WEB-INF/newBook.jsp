<%-- 
    Document   : newbook
    Created on : Nov 18, 2019, 7:22:15 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Novaja kniga</title>
    </head>
    <body>
        <h1>Sozdat knigu</h1>
        <from action="addBook" method="POST">
            Nazvanie knigi: <input type="text" name= "title"><br>
            Avtor knigi:<input type="text" name=author"><br>
            Gog izdanija knigi: <input type="text" name ="year"><br>
            Kolichestvo:<input type="text" name ="quantity"><br>
            <input type="submit" value ="sozdat knigu"><br>
         </from>
    </body>
</html>
