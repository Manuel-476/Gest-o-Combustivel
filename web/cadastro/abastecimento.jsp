<%-- 
    Document   : abastecimento
    Created on : 24/out/2022, 18:44:00
    Author     : DELL
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="ler" class="classes.leitura"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../estilo/abast.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
      
        <form method="post" action="cad_abast.jsp?id_posto=<%=request.getParameter("id")%>">
     <div class="corpo"> 
       <div class="formu">
        <input type="text"  placeholder="Placa" name="placa"/><br/><br/>
        <input type="text" placeholder="Quantidade(Litro)" name="qtd"/><br/><br/>
        <input type="date" placeholder="Modelo" name="data"/><br/><br/>
        <input type="time" name="hora"/><br/><br/>
        
       <%
          ResultSet rs=ler.dados_combus();
          ResultSet le=ler.dados_fun();
          ResultSet tab=ler.dados_Abast();
          ResultSet tan=ler.dados_IdPostoTanq(Integer.parseInt(request.getParameter("id")));
       %>
        <select name="combustivel">
           <%while(rs.next()){%>
               <option><%=rs.getString("tipo")%></option>
           <%}%>
        </select><br/><br/>
       
         <select name="tanque">
           <%while(tan.next()){%>
               <option><%=tan.getString("nome")%></option>
           <%}%>
        </select><br/><br/>
        
        <datalist id="nome">
           <%while(le.next()){%>
               <option><%=le.getString("funcionario")%></option>
          <%}%>
        </datalist>
        <input type="text" list="nome"  placeholder="Condutor" name="funcio"/><br/><br/>
        <input type="text" list="nome"  placeholder="Frentista" name="frentista"/><br/><br/>
        <select name="cheio">
          <option>Sim</option>
          <option>Nao</option>
        </select><br/><br/>
        <input style="width:100%;background-color: #336600;color:#fff;box-shadow:1px 2px 3px black;" type="submit" value="Registrar">
      </div>
       <div class="tab"> 
           <table>
               <thead>
               <th>PLACA</th>
               <th>LITRO</th>
               <th>DATA HORA</th>
               <th>CONDUTOR</th>
               <th>FRENTISTA</th>
               <th>COMBUSTIVEL</th>
               <th>MARCA</th>
               <th>IMPRIMIR RELATORIO</th>
               </thead>>
               <%while(tab.next()){%>
               <tr>
                   <td><%=tab.getString("placa") %></td>
                   <td><%=tab.getString("Qtd_litro") %></td>
                   <td><%=tab.getString("data_hora") %></td>
                   <td><%=tab.getString("nome") %></td>
                   <td><%=tab.getString("frentista") %></td>
                   <td><%=tab.getString("tipo") %></td>
                   <td><%=tab.getString("marca") %></td>
                   <td>
                     <a href="relatorio.jsp?id_abas=<%=tab.getInt("id_abast")%>">rel<img src="" alt="rel"/></a>                     
                   </td>
               </tr>
               <%}%>
           </table>
        </div>
      </div>
    </body>
</html>
