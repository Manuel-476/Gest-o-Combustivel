<%-- 
    Document   : cadastrar_eq
    Created on : 27/out/2022, 11:01:47
    Author     : Rivaldo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
           <style>
               form{margin:auto;text-align:center;}
              .botao{width:30%;background-color:#336600;color:#fff;padding:15px;}
               h1{text-align: center;}
          </style>
    </head>
    <body>
        <h1>Equipamento</h1>
        <form method="post" action="cad_eq.jsp?id=<%=request.getParameter("id") %>">
         <input type="text" name="nome" placeholder="Nome do Euipamento">   <br/>
         <input type="text" name="qtd"placeholder="Quantidade"><br/>
         <input type="submit" class="botao" value="Registar"><br/>
       </form>
        
    </body>
</html>
