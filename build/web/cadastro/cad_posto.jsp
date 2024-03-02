<%-- 
    Document   : cad_posto
    Created on : 11/out/2022, 21:23:21
    Author     : DELL
--%>
<jsp:useBean id="posto" class="metodos_set_get.metodos_posto" scope="page" />
<jsp:useBean id="cadastro" class="classes.cadastro" type="classes.cadastro" scope="page"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <%
        posto.setNome(request.getParameter("nome"));
        posto.setTanque(request.getParameter("tanque"));
        posto.setData_inaug(request.getParameter("data"));
        posto.setEndereco(request.getParameter("endereco"));
        posto.setCombustivel(request.getParameter("combus"));
        
        cadastro.CadastrarPosto(posto);
        response.sendRedirect("posto.jsp");
    %>
</html>
