<%-- 
    Document   : cadastrar_tanq
    Created on : 26/out/2022, 4:39:42
    Author     : DELL
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="comb" class="classes.leitura" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <style>.mae{display:flex;justify-content:space-between;}
               .botao{margin:auto;text-align:center;}
               .botao input{width:40%;background-color:#336600;color:#fff;padding:15px;}
               h1{text-align: center;}
        </style>
        <title>JSP Page</title>
    </head>
    <body>
        <%ResultSet rs=comb.dados_combus(); %>
        <h1>Tanque</h1>
        <form method="post" action="cad_tanq.jsp">
           <div class="mae">
        <div class="filho">
           <input type="text" placeholder="Nome" name="nome"><br/><br/>
           <input type="text" placeholder="Volume" name="volume"><br/><br/>
         </div>
         <div class="filho">
           <select name="comb">
           <%while(rs.next()){%>
               <option><%=rs.getString("tipo")%></option>
           <%}%>
           </select><br/><br/>
           <input type="text" placeholder="Id do Posto" name="id_posto"><br/><br/>
          </div>
           </div>
           <div class="botao">
           <input type="submit" value="Cadastrar">
           </div>
           </form>
    </body>
</html>
