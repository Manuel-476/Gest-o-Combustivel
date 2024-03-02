<%-- 
    Document   : abastecimento
    Created on : 24/out/2022, 18:44:00
    Author     : DELL
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="ler" class="classes.leitura"  />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../estilo/abast.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="corpo"> 
            <div class="formu">
        <form method="post" action="cad_abas.jsp?id_tanq=<%=request.getParameter("id")%>&&id_posto=<%=request.getParameter("id_posto")%>">
        
           
        <input type="text" placeholder="Quantidade(Litro)" name="qtd"/><br/><br/>
        <input type="date"  name="data"/><br/><br/>
        
       <%
          ResultSet rs=ler.dados_combus();
          ResultSet le=ler.dados_fun();
          ResultSet pos=ler.dados_posto();
          ResultSet cam=ler.dados_camiao();
          ResultSet tab=ler.dados_Abasttanq(Integer.parseInt(request.getParameter("id")));
       %>
         <select name="cam">
           <%while(cam.next()){%>
               <option><%=cam.getString("nome_c")%></option>
           <%}%>
        </select><br/><br/>
       
       <select name="posto">
           <%while(pos.next()){%>
               <option><%=pos.getString("nome")%></option>
           <%}%>
        </select><br/><br/>
        <select name="combustivel">
           <%while(rs.next()){%>
               <option><%=rs.getString("tipo")%></option>
           <%}%>
        </select><br/><br/>
        
        <datalist id="nome">
           <%while(le.next()){%>
               <option><%=le.getString("funcionario")%></option>
          <%}%>
        </datalist>
        <input type="text" list="nome"  placeholder="Funcionario" name="funcio"/><br/><br/>
        <select name="cheio">
          <option>Sim</option>
          <option>Nao</option>
        </select><br/><br/>
        <input style="width:100%;background-color: #336600;color:#fff;box-shadow:1px 2px 3px black;" type="submit" value="Registrar">
        
        </form>
        </div>
       <div class="tab"> 
           <table>
               <thead>
               <th>CAMIAO</th>
               <th>LITRO</th>
               <th>DATA</th>
               <th>CONDUTOR</th>
               <th>COMBUSTIVEL</th>
               <th>MARCA</th> 
               <th>POSTO</th>
               <th>IMPRIMIR RELATORIO</th>
               </thead>>
               <%while(tab.next()){%>
               <tr>
                   <td><%=tab.getString("nome_c") %></td>
                   <td><%=tab.getString("Qtd_litro") %></td>
                   <td><%=tab.getString("data_hora") %></td>
                   <td><%=tab.getString("nome") %></td>
                   <td><%=tab.getString("tipo") %></td>
                   <td><%=tab.getString("marca") %></td>
                   <td><%=tab.getString("posto") %></td>
                   <td>
                     <a href="relatoriotanq.jsp?id_abas=<%=tab.getInt("id_abast")%>">rel<img src="" alt="rel"/></a>     
                   </td>
               </tr>
               <%}%>
           </table>
        </div>
       </div>
    </body>
</html>
