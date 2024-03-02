<%-- 
    Document   : deletar_posto
    Created on : 27/out/2022, 12:36:21
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="del" class="classes.apagar"  scope="page" />
<jsp:useBean id="pos" class="metodos_set_get.metodos_posto" scope="page"/>
<!DOCTYPE html>
<html>
 <%
     pos.setNum_reg(Integer.parseInt(request.getParameter("id")));
     del.apagar_posto(pos);
     response.sendRedirect("postoVis.jsp");
 %>
</html>
