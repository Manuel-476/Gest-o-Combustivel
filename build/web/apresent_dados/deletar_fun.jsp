<%-- 
    Document   : deletar_fun
    Created on : 12/out/2022, 8:01:51
    Author     : DELL
--%>
<jsp:useBean id="func" class="metodos_set_get.metodos_funcionario" scope="page" />
<jsp:useBean id="apagar" class="classes.apagar" scope="page" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <%
     func.setCpf(Integer.parseInt(request.getParameter("cpf")));
     
     apagar.apagar_fun(func);
     response.sendRedirect("funcionario.jsp");
  %>
</html>
