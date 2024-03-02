<%-- 
    Document   : eliminar_eq
    Created on : 27/out/2022, 12:44:42
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="del" class="classes.apagar"/>
<jsp:useBean id="eq" class="metodos_set_get.metodos_equip"/>
<!DOCTYPE html>
<html>
   <%
       eq.setId_eq(Integer.parseInt(request.getParameter("id")));
       del.apagar_equip(eq);
       
       response.sendRedirect("equipamento.jsp?id="+request.getParameter("id"));
   %>
</html>
