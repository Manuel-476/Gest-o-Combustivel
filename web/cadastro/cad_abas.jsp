<%-- 
    Document   : cad_abas
    Created on : 24/out/2022, 22:09:04
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="cadast" class="classes.cadastro"/>
<jsp:useBean id="abast" class="metodos_set_get.Metodos_abastecimento"/>
<!DOCTYPE html>
<html>
 <%
    abast.setPlaca(request.getParameter("cam"));
    abast.setCombustivel(request.getParameter("combustivel"));
    abast.setData_hora(request.getParameter("data"));
    abast.setCheio(request.getParameter("cheio"));
    abast.setNome_fun(request.getParameter("funcio"));
    abast.setQtd(request.getParameter("qtd"));
    abast.setId_posto(Integer.parseInt(request.getParameter("id_posto") ));
    abast.setId_tanq(Integer.parseInt(request.getParameter("id_tanq") ));
    cadast.CadastratAbastTanq(abast);
    
    response.sendRedirect("abastec_tanq.jsp?id="+request.getParameter("id_tanq")+"&&id_posto="+request.getParameter("id_posto"));
%>
</html>
