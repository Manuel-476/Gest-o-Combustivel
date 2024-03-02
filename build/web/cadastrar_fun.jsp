
<%-- 
    Document   : cadastrar_fun
    Created on : 11/out/2022, 15:22:06
    Author     : DELL
--%>
<%@page import="java.sql.ResultSet"%>
<jsp:useBean id="ler" class="classes.leitura" type="classes.leitura" scope="page"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html>
<html lang="Pt-Br">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="estilo/formul.css" rel="stylesheet" type="text/css"/>
        <title>Cadastro</title>
    </head>
    <body>
        <a href="../login/Pagina_principal.jsp" class="voltar">Pagina Inicial</a>
        
        <h1>Cadastrar</h1>
        <form action="cadastrar" method="post" enctype="multipart/form-data">
       
            <%
                ResultSet depart,nacio,posto;
                depart=ler.dados_depart();
                nacio=ler.dados_nacio();
                posto=ler.dados_posto();
            %>
        <input type="file"  name="files"/>
        <div class="for">
        <div class="formul">
            <input type="text" placeholder="Nome Completo" name="nome"/>
            <input type="date" placeholder="Nome Completo" name="data"/>
        </div>
        <div class="formul">
        <input type="text" placeholder="Telefone" name="tel"/>
        
        <datalist id="lista">
          <% while(nacio.next()){ %>
            <option>
                <%= nacio.getString("pais") %>
            </option>
            <%}%>
        </datalist>
        
        <input type="text" list="lista" name="pais" placeholder="Nacionalidade"/>
        </div>
        <div class="formul">
        <select name="est_civil">
            <option>Solteiro(a)</option>
            <option>Casado(a)</option>
            <option>Viuvo(a)</option>
            <option>Divorciado(a)</option>
        </select>
        <select name="genero">
            <option>Masculino</option>
            <option>Feminino</option>
        </select>
        </div>
        
            </div>
          <div class="for"> 
           <div class="formul">
         <select name="posto" >  
           <% while(posto.next()){ %>
            <option><%= posto.getString("nome") %></option>
            <%}%>
        </select>
        <select name="depart">
           <% while(depart.next()){ %>
            <option>
                <%= depart.getString("nome") %>
            </option>
            <%}%>
        </select>
        </div>
        <div class="formul">
         <select name="grau" placeholder="Grau Academico">
            <optgroup>Ensino primario
               <option>Primario Concluido</option>
            </optgroup>
            <optgroup>Ensino Secundario
               <option>Frequentando o secundario</option>
               <option>Secundario Concluido</option>
            </optgroup>
            <optgroup>Ensino Medio
                <option>Frequentando o Medio</option>
                <option>Medio Concluido</option>
            </optgroup>
            <optgroup>Ensino Superior
                <option>Frequencia Universitaria</option>
                <option>Baicharel</option>
                <option>Licenciado</option>
            </optgroup>   
        </select>
       </div>
     </div>
        <div class="botao">
            <input type="submit" value="Cadastrar" >
        </div>
        </form>
            <c:if test="${msg!=null}">
                <c:out value="${msg}"></c:out>
            </c:if>
            
    </body>
</html>
