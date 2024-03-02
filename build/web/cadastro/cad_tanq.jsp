<%-- 
    Document   : cad_tanq
    Created on : 26/out/2022, 4:53:35
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="tanq" class="metodos_set_get.metodos_posto"/>
<jsp:useBean id="cadast" class="classes.cadastro"/>
<!DOCTYPE html>
<html>
    <%
        tanq.setTanque(request.getParameter("nome"));
        tanq.setCombustivel(request.getParameter("comb"));
        tanq.setId_posto(Integer.parseInt(request.getParameter("id_posto")));
        tanq.setVolume(request.getParameter("volume"));
        
       cadast.CadTanq(tanq);
       response.sendRedirect("cadastrar_tanq.jsp");
    %>
</html>
