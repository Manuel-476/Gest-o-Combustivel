<%-- 
    Document   : postoVis
    Created on : 13/out/2022, 4:29:29
    Author     : DELL
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="tab" class="classes.leitura"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../estilo/listar.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Postos</h1>
         <a href="../login/Pagina_principal.jsp" class="voltar">Pagina Inicial</a>
        <a href="#" class="tanq" style="color:white;background-color:#336600;border-radius:10px;padding:15px;margin:20px;">Cadastrar Tanques</a>
        <%
            ResultSet rs=tab.dados_posto();
        %>
        <table>
            <thead>
                <th>ID</th>
                <th>NOME</th>
                <th>ENDERECO</th>
                <th>DATA INAUGURACAO</th>
                <th>OPCAO</th>
            </thead>
            <%while(rs.next()){%>
            <tr>
                <td><%=rs.getString("num_registro")%></td>
                <td><%=rs.getString("nome")%></td>
                <td><%=rs.getString("endereco")%></td>
                <td><%=rs.getString("data_inaug")%></td>
                <td>
                    <a href="alterar_posto.jsp?id=<%=rs.getString("num_registro")%>"><img src="../imagem/icon-edit-5.jpg"  title="Ver/Editar" width="23"/></a>
                    
                    <a href="deletar_posto.jsp?id=<%=rs.getString("num_registro")%>"><img src="../imagem/delete-icon-vector-25.jpg"  title="Eliminar" width="20"/></a>
                    
                    <a class="eq"href="?id=<%=rs.getString("num_registro")%>"><img src=""  title="Ver Equipamento" width="20"/></a>
                    
                </td>
            </tr>
            <%}%>
        </table>
       
    </body>
      <script>
             var botao=document.getElementsByClassName("tanq")[0]; 
             var botao2=document.getElementsByClassName("eq")[0];
             botao.addEventListener("click",janela);
             botao2.addEventListener("click",janelaeq);
             function janela()
             {
                 window.open("../cadastro/cadastrar_tanq.jsp","_blank","width=500,height=300,top=200,left=300")
             }
              function janelaeq()
             {
                 window.open("equipamento.jsp","_blank","width=500,height=300,top=200,left=300")
             }
       </script>
</html>
