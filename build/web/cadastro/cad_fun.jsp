<%-- 
    Document   : cad_fun
    Created on : 14/out/2022, 20:43:08
    Author     : DELL
--%>
<jsp:useBean id="func" class="metodos_set_get.metodos_funcionario" />
<jsp:useBean id="cadastro" class="classes.cadastro" />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <%
   func.setNome(request.getParameter("nome"));
   func.setData_nasc(request.getParameter("data"));
   func.setTel(request.getParameter("tel"));
   func.setTelAlt(request.getParameter("telalt"));
   func.setNacionalidade(request.getParameter("pais"));
   func.setNacionalidadeAlt(request.getParameter("paisalt"));
   func.setDepatamento(request.getParameter("depart"));
   func.setEst_civil(request.getParameter("est_civil"));
   func.setGenero(request.getParameter("genero"));
   func.setGrau_acad(request.getParameter("grau"));
   func.setPosto(request.getParameter("posto"));
   func.setDeficiencia(request.getParameter("deficiencia"));
   func.setMae(request.getParameter("mae"));
   func.setPai(request.getParameter("pai"));
   func.setFuncao(request.getParameter("funcao"));
   
  
   cadastro.CadastrarFunc(func);
  
   response.sendRedirect("cadastrar_fun.jsp");
 %>
</html>
