<%-- 
    Document   : page4
    Created on : Nov 4, 2019, 7:25:52 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>Page4</title>
    </head>
    <body>
       <div> Privet!</div>
           ${info}
       <from action = "hello" method="POST"><br>
         name <input type = "text" name = "name"><br>
         lastname <input type = "text" name = "lastname"><br>
       </from> 
</html>
