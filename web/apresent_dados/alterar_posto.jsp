<%-- 
    Document   : alterar_posto
    Created on : 27/out/2022, 11:41:38
    Author     : DELL
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="ler" class="classes.leitura" type="classes.leitura" scope="page" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../estilo/fun.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
       
      <a href="../login/Pagina_principal.jsp" class="voltar">Pagina Inicial</a>
      <a href="" class="tanq">Equipamento</a>
        <h1>Cadastrar Posto</h1>
        <form action="alt_posto.jsp?id=<%=request.getParameter("id")%>" method="post">
        <%
            ResultSet combus,rs;
            combus=ler.dados_combus();
            rs=ler.dados_postoId(Integer.parseInt(request.getParameter("id")));
            while(rs.next()){
        %>
       <div class="for">
           
           <div class="formul">
               <input type="text" placeholder="Nome" value="<%=rs.getString("nome")%>"name="nome">
             <input type="text" placeholder="Endereco" value="<%=rs.getString("endereco")%>" name="endereco">
           </div>
          <div class="formul">
             <label for="data">Data de Inauguracao</label><br/><input type="text" id="data" value="<%=rs.getString("data_inaug")%>" name="data">
           </div>
           <%}%>
           <div class="formul">
             
         </div>
       </div>
         <div class="botao"> <input type="submit" value="Alterar" /></div>
       </form>
       <script>
             var botao=document.getElementsByClassName("tanq")[0]; 
            
             botao.addEventListener("click",janela);
            
            
              function janela()
             {
                 window.open("equipamento.jsp?id=<%=request.getParameter("id")%>","_blank","width=500,height=300,top=200,left=300")
             }
       </script>    
    </body>
</html>
