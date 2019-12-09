<%-- 
    Document   : ShowNewPerson
    Created on : Dec 9, 2019, 7:00:22 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Novii polzovatel</title>
    </head>
    <body>
        <h1>Registratsia novogo polzovatelja</h1>
          <from action="newPerson" method="POST">
            Name: <input type="text" name= "name"><br>
            Lastname:<input type="text" name="lastname"><br>
            Status : <input type="text" name ="status"><br>
            email:<input type="text" name ="email"><br>
            <input type="submit" value ="sozdat knigu"><br>
    </body>
</html>
