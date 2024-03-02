<%-- 
    Document   : cad_trans
    Created on : 24/out/2022, 17:46:12
    Author     : DELL
--%>

<%@page import="classes.cadastrar"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="trans" class="metodos_set_get.metodos_transporte"  />
<jsp:useBean id="cadast" class="classes.cadastro"  />
<!DOCTYPE html>
<html>
<%
    trans.setPlaca(request.getParameter("placa"));
    trans.setMarca(request.getParameter("marca"));
    trans.setCategoria(request.getParameter("categoria"));
    trans.setModelo(request.getParameter("modelo"));
    trans.setData(request.getParameter("data"));
    trans.setDeposito_vol(request.getParameter("vol_dep"));
    trans.setDepatamento(request.getParameter("departamento"));
    
    cadast.CadastratTransporte(trans);
    response.sendRedirect("cadastrar_trans.jsp");
%>
</html>
