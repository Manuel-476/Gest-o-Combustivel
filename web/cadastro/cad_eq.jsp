<%-- 
    Document   : cad_eq
    Created on : 27/out/2022, 11:05:31
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="cadast" class="classes.cadastro"/>
<jsp:useBean id="eq" class="metodos_set_get.metodos_equip"/>
<!DOCTYPE html>
<html>
   <%
       eq.setNome(request.getParameter("nome"));
       eq.setQtd(Integer.parseInt(request.getParameter("qtd")));
       eq.setNum_reg(Integer.parseInt(request.getParameter("id")));
       cadast.CadastratEquip(eq);
       
       response.sendRedirect("cadastrar_eq.jsp");
   %>
</html>
