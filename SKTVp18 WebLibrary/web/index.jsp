<%-- 
    Document   : index
    Created on : Nov 4, 2019, 7:05:08 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Library SKTVp18</title>
    </head>
    <body>
       <h1>Dobro pozalovat v SKTVp18</h1> 
             ${info}</br>
        <p>Создана книга: $(book.title)</p>     
     <p>izutchem kak rabotaet webprilozenie na Java</p>
       <a href= showLogin> Вход</a><br> 
       <a href="newBook"> Создать книгу </a><br>
       <a href="listBooks">Список книг</a><br>
       <a href="newReader"> Создать книгу </a><br>
       <a href="listReader"> Список читателей </a><br>
       <a href="showTakeOnBook"> Выдать книгу читателю</a><br>
       <a href="showReturnBook">Возвращена</a><br> 
    </body>
</html>
