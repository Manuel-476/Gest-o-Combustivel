<%-- 
    Document   : verficar
    Created on : 9/out/2022, 15:03:27
    Author     : DELL
--%>
<jsp:useBean id="Verificar" class="classes.verificacao" type="classes.verificacao" scope="page"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="metodos_set_get.Metodos_Login" %>
<!DOCTYPE html>
<html>
<h1>Passou
    <%
        Metodos_Login met=new Metodos_Login();
        met.setEmail(request.getParameter("email"));
        met.setSenha(request.getParameter("senha"));
        
       if(Verificar.Verificar_login(met)>0)
        response.sendRedirect("Pagina_principal.jsp");
        else
        response.sendRedirect("Erro_login.jsp");
    %>
    
</html>
