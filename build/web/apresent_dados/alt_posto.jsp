<%-- 
    Document   : alt_posto
    Created on : 27/out/2022, 12:19:35
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="alt" class="classes.alterar"  scope="page" />
<jsp:useBean id="pos" class="metodos_set_get.metodos_posto" scope="page"/>
<!DOCTYPE html>
<html>
    <%
      pos.setNome(request.getParameter("nome"));
      pos.setEndereco(request.getParameter("endereco"));
      pos.setData_inaug(request.getParameter("data"));
       pos.setId_posto(Integer.parseInt(request.getParameter("id")));
      alt.AlterarPosto(pos);
      response.sendRedirect("postoVis.jsp");
    %>
</html>
