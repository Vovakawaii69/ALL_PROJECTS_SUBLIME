<%-- 
    Document   : listReader
    Created on : Nov 25, 2019, 6:19:00 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Список читателей</title>
    </head>
    <body>
        <h1>Список наших читателей</h1>
        <c:forEach var="book" item="$listBooks">
            <li>${reader.name}.$ {reader.lastname}.${reader.email}</li>
            <c:forEach> 
    </body>
</html>
