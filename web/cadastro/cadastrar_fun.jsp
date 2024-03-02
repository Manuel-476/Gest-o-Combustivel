<%--    Document   : cadastrar_fun
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
        <link href="../estilo/formul.css" rel="stylesheet" type="text/css"/>
        <title>Cadastro</title>
       
    </head>
    <body>
        <a href="../login/Pagina_principal.jsp" class="voltar">Pagina Inicial</a>
        
        <h1>Cadastro do Pessoal</h1>
        <form action="cad_fun.jsp" method="post">
       
            <%
                ResultSet depart,nacio,posto;
                depart=ler.dados_depart();
                nacio=ler.dados_nacio();
                posto=ler.dados_posto();
            %>
        <div class="princ">
      
        
        <div class="formul"> 
          
            <input type="text" placeholder="Nome Completo" name="nome"/><br/><br/>
            <input type="text" placeholder="Nome Do Pai" name="pai"><br/><br/>
            <input type="text" placeholder="Nome Da Mae" name="mae"><br/><br/>
        </div>
       
        
        <div class="formul">
        <input type="text" placeholder="Telefone" name="tel"/><br/><br/>
        <input type="text" placeholder="Telefone Alternativa" name="telalt"/><br/><br/>
     
        <datalist id="lista">
          <% while(nacio.next()){ %>
            <option>
                <%= nacio.getString("pais") %>
            </option>
            <%}%>
        </datalist>
        
        <input type="text" list="lista" name="pais" placeholder="Nacionalidade"/><br/><br/>
        <input type="text" list="lista" name="paisalt" placeholder="Outra Nacionalidade"/><br/><br/>
        </div>
        
      
        <div class="formul">
          <label for="data">Data Nascimento</label><br/><input type="date" placeholder="Data" id="data" name="data"/>
          <label for="civil">Estado Civil</label><br/>
         <select id="civil" name="est_civil">
            <option>Solteiro(a)</option>
            <option>Casado(a)</option>
            <option>Viuvo(a)</option>
            <option>Divorciado(a)</option>
         </select>
         <label for="genero">Genero</label><br/>
         <select id="genero" name="genero">
            <option>Masculino</option>
            <option>Feminino</option>
         </select>
        </div>
       
        
         
        
           <div class="formul">
               <label for="posto">Posto</label><br/>
         <select name="posto" id="posto">  
           <% while(posto.next()){ %>
            <option><%= posto.getString("nome") %></option>
            <%}%>
        </select><br/>
        <label for="depart">Departamento</label><br/>
        <select name="depart" id="depart">
           <% while(depart.next()){ %>
            <option>
                <%= depart.getString("nome") %>
            </option>
            <%}%>
        </select>
           </select>
         <label for="funcao">Funcao</label><br/>
             <select id="funcao" name="funcao">
            <option>Frentista</option>
            <option>Motorista</option>
        </select>
        </div>
       
        <div class="formul">
            <label for="grau">Grau Academico</label><br/>
         <select name="grau" placeholder="Grau Academico" id="grau">
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
        </select><br/>
       <label for="def">Possui alguma deficiencia?</label><br/>
        <select id="def"name="deficiencia">
            <option>Sim</option>
            <option>Nao</option>
        </select>
       </div>  
      
     </div>
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
