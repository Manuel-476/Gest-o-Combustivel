<%-- 
    Document   : tanques
    Created on : 25/out/2022, 21:19:35
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
        <%
            ResultSet rs=ler.dados_IdPostoTanq(Integer.parseInt(request.getParameter("id")));
            while(rs.next()){
        %>
        <div class="opcao">
             <figure>
                 <figcaption><a href="../cadastro/abastec_tanq.jsp?id=<%=rs.getString("id_tanq")%>&&id_posto=<%=request.getParameter("id")%>">
                          <%=rs.getString("nome")%></a></figcaption>
                   <figcaption><%=rs.getString("tipo")%></figcaption>
             </figure>  
         </div>
      <%}%>
    </body>
</html>
