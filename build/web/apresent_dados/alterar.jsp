<%-- 
    Document   : alterar
    Created on : 13/out/2022, 4:34:12
    Author     : DELL
--%>
<jsp:useBean id="alter" class="classes.alterar" scope="page"/>
<jsp:useBean id="func" class="metodos_set_get.metodos_funcionario" scope="page"/>
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
   func.setCpf(Integer.parseInt(request.getParameter("cpf")));
   
   if(request.getParameter("nome_i")!=null)
   {
       func.setNome(request.getParameter("nome_i"));
       alter.AlterarNome(func);
       response.sendRedirect("nome_individual.jsp");
       return;
   }
       
   alter.AlterarFunc(func);
   response.sendRedirect("funcionario.jsp");
%>
</html>
