<%-- 
    Document   : cad_abast
    Created on : 24/out/2022, 19:04:12
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="cadast" class="classes.cadastro"/>
<jsp:useBean id="abast" class="metodos_set_get.Metodos_abastecimento"/>
<!DOCTYPE html>
<html>
<%
    abast.setPlaca(request.getParameter("placa"));
    abast.setCombustivel(request.getParameter("combustivel"));
    abast.setData_hora(request.getParameter("data").toString()+" "+request.getParameter("hora").toString());
    abast.setCheio(request.getParameter("cheio"));
    abast.setNome_fun(request.getParameter("funcio"));
    abast.setQtd(request.getParameter("qtd"));
    abast.setId_posto(/*Integer.parseInt(request.getParameter("id_posto"))*/7);
    abast.setTanque(request.getParameter("tanque"));
    abast.setNome_fren(request.getParameter("frentista"));
    cadast.CadastratAbast(abast);
    
    response.sendRedirect("abastecimento.jsp");
%>
</html>
