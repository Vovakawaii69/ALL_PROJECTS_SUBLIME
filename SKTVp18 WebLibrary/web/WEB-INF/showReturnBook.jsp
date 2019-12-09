<%-- 
    Document   : showReturnBook
    Created on : Dec 4, 2019, 5:41:02 PM
    Author     : user
--%>
    Created on : Nov 25, 2019, 7:08:03 PM
    Author     : user
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <h1>Возврат книг</h1> 
          <p> ${info}</p>
          <a href="index.jsp">Главная страница</a><br>
          <form action="returnOnBook" method="POST">
         
           Список выданных книг: </br>
        <select name="historyId" size="3">
           <c:forEach var="histoty" items="${listHistories}" varStatus="status">
            <option value ="${history.id}">
            ${status.index+1}.${history.reader.name}. ${history.reader.lastname} читает книгу ${history.book.title}
              </option> 
             <c:forEach> 
           </select> 
            <br>  
            <input type="submit" value="Вернуть книгу">
         </form>  
    </body>
</html>