<%-- 
    Document   : takeOnBook
    Created on : Nov 25, 2019, 7:08:03 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Выдача книг читателю</title>
    </head>
    <body>
         <p> ${info}</p>
         <form action="takeOnBook" method="POST"></form>
         
        <h1>Список книг</h1> 
        <select name="bookId">
           <c:forEach var="book" item="${listBooks}" varStatus="status">
            <option value ="${bookId}">
            ${status.index+1}.${book.title}. ${book.year}
              </option> 
             <c:forEach> 
           </select> 
              
            <h2>Список читателей</h2> 
        <select name="readerId">
            <c:forEach var="reader" item="${listReader}" varStatus="status">
                <option value ="${readerId}">
            ${status.index+1}. ${reader.name}. ${reader.lastname}. ${reader.email}
              </option>
            <c:forEach> 
          </select> 
            <input type="submit" value="Выдать книгу">
         </form>  
    </body>
</html>
