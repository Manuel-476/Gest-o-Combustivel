<%-- 
    Document   : equipamento
    Created on : 27/out/2022, 11:23:13
    Author     : DELL
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="ler" class="classes.leitura"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>thead th{background-color:#336600;padding:5px;}
               table{ border-spacing: 0px;margin: auto;margin-top: 10px;
      box-shadow: 3px 6px 8px black;
     border-radius: 10px;margin:auto;width:80%;}
table tr{border:1px solid black; }
table tr td{border:1px solid black;
            background-color: #ffcc99;
            text-align: center;
         padding:5px;}
               h1{text-align: center;}
        </style>
        <title>JSP Page</title>
    </head>
    <body>
        <a href="" class="tanq" style="color:white;background-color:#336600;border-radius:10px;padding:15px;margin:20px;">Cadastrar</a>
        <h1>Equipamentos</h1>
        <table>
            <thead>
                <th>NOME</th>
                <th>QUANTIDADE</th>
                <th>Eliminar</th>
            </thead>
        <%
            ResultSet rs=ler.dados_Equip(Integer.parseInt(request.getParameter("id")));
            while(rs.next()){
        %>
        <tr>
            <td><%=rs.getString("nome")%></td>
            <td><%=rs.getString("qtd")%></td>
            <td><a href="eliminar_eq.jsp?id=<%=rs.getInt("id_eq")%>&&id_p=<%=request.getParameter("id")%>"><img src="../imagem/delete-icon-vector-25.jpg"  title="Eliminar" width="20"/></a></td>
        </tr>
        <%}%>
        </table>
      
        <script>
             var botao=document.getElementsByClassName("tanq")[0];
             
             botao.addEventListener("click",janela);
             function janela()
             {
                 window.open("../cadastro/cadastrar_eq.jsp?id=<%=request.getParameter("id")%>","_blank","width=300,height=300,top=200,left=300");
             }
         </script>
    </body>
</html>
