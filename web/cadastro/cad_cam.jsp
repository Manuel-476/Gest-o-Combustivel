<%-- 
    Document   : cad_cam
    Created on : 26/out/2022, 8:22:50
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="trans" class="metodos_set_get.metodos_transporte"  />
<jsp:useBean id="cadast" class="classes.cadastro"  />
<!DOCTYPE html>
<html>
  <%
    trans.setNome(request.getParameter("nome"));
    trans.setMarca(request.getParameter("marca"));
    trans.setData(request.getParameter("data"));
    trans.setDeposito_vol(request.getParameter("vol_dep"));
    
    cadast.CadastratCamiao(trans);
    response.sendRedirect("Cadastrar_cam_tanq.jsp");
  %>
</html>
