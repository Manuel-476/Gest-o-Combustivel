<%-- 
    Document   : postos
    Created on : 25/out/2022, 20:29:51
    Author     : DELL
--%>
<%@page import="java.sql.ResultSet"%>
<jsp:useBean id="ler" class="classes.leitura"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../estilo/posto.css" rel="stylesheet" type="text/css"/>

        <title>JSP Page</title>
    </head>
    <body>
      <%ResultSet rs=ler.dados_posto();
      while(rs.next()){%>
        <div class="opcao">
             <figure >
               <ul class="menu_extra">
                 <li class="cad">
                  <img src="" title="posto">
                  <figcaption><%=rs.getString("nome")%></figcaption>
                 
                  <ul class="sub_op1" id="sub_op1">
                      <li><a href="tanques.jsp?id=<%=rs.getString("num_registro")%>">Tanque</a></li>
                      <li><a href="../cadastro/abastecimento.jsp?id=<%=rs.getString("num_registro")%>">Veiculo</a></li>
                  </ul>
                  
                       <figcaption><%=rs.getString("endereco")%></figcaption>
             </li>
            </ul>
             </figure>  
         </div>
      <%}%>
        <script >
             document.getElementById("sub_op1")[0].style="display: none";
             botao=document.getElementsByClassName("cad")[0];
             botao.addEventListener("mousemove",menu);
             botao.addEventListener("mouseout",menu_des);
          
            function menu()
            {
             var botao;
             botao=document.getElementById("sub_op1")[0];
             botao.style="display: visible";
             }
            function menu_des()
            {
             var botao;
             botao=document.getElementById("sub_op1")[0];
             botao.style="display: none";
             }
           /* function menu_2()
            {
             var botao;
             botao=document.getElementsByClassName("sub_op2")[0];
             botao.style="display:visible";
             }
            function menu_des_2()
            {
             var botao;
             botao=document.getElementsByClassName("sub_op2")[0];
             botao.style="display:none";
             }*/
        </script>
    </body>
</html>
