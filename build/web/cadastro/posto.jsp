<%-- 
    Document   : posto
    Created on : 11/out/2022, 21:22:58
    Author     : DELL
--%>
<%@page import="java.sql.ResultSet"%>
<jsp:useBean id="ler" class="classes.leitura" type="classes.leitura" scope="page" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../estilo/formul.css" rel="stylesheet" type="text/css"/>
        <title>Catastrar Posto</title>
    </head>
    <body>
      <a href="../login/Pagina_principal.jsp" class="voltar">Pagina Inicial</a>
      <a href="" class="tanq">Cadastrar Tanque</a>
        <h1>Cadastrar Posto</h1>
        <form action="cad_posto.jsp" method="post">
        <%
            ResultSet combus;
            combus=ler.dados_combus();
        %>
       <div class="for">
           <div class="formul">
             <input type="text" placeholder="Nome" name="nome">
             <input type="text" placeholder="Endereco" name="endereco">
           </div>
          <div class="formul">
             <input type="text" placeholder="Nome do Tanque" name="tanque">
             <label for="data">Data de Inauguracao</label><br/><input type="date" id="data" name="data">
           </div>
           <div class="formul">
             <select name="combus">
               <%while(combus.next()){%>
                   <option><%=combus.getString("tipo")%></option> 
               <%}%>
             </select>
         </div>
       </div>
         <div class="botao"> <input type="submit" value="Cadastrar" /></div>
       </form>
             
    </body>
</html>
