<%-- 
    Document   : nome_individual
    Created on : 26/out/2022, 9:01:50
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="alterar.jsp?cpf=<%=request.getParameter("id")%>" method="post">
            <input type="text" placeholder="Nome" name="nome_i"/></br>
            <input type="submit" value="Alterar">
        </form>
    </body>
</html>
