<%-- 
    Document   : listBooks
    Created on : Nov 25, 2019, 5:55:47 PM
    Author     : user
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spisok knig</title>
    </head>
    <body>
        <h1>Spisok nasih knig</h1>
        <ul>
            <c:forEach var="book" item="$listBooks">
            <li>${book.title}.$ {book.author}.${book.year}</li>
            <c:forEach> 
       </ul>     
         
    </body>
</html>
