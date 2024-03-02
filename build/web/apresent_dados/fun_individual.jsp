<%-- 
    Document   : fun_individual
    Created on : 12/out/2022, 6:10:41
    Author     : DELL
--%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.ResultSet"%>
<jsp:useBean id="func" class="metodos_set_get.metodos_funcionario" scope="page"/>
<jsp:useBean id="ler" class="classes.leitura" scope="page"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../estilo/fun.css" rel="stylesheet" type="text/css"/>
        
        <style>label{color:#fff;font-size:15pt;font-decoration:bold;}
               input{width:95%;}
               select{width:100%;} 
               .princ{display:flex;justify-content:space-between;width:90%;margin:auto;}
               .formu{width:50%;}
        </style>
        <title>JSP Page</title>
    </head>
    <body>
        <%
            ArrayList <String> nac=new ArrayList();
            ArrayList <String> num=new ArrayList();
            
            func.setCpf(Integer.parseInt(request.getParameter("cpf")));
            func.setDepatamento(request.getParameter("dep"));
            func.setPosto(request.getParameter("posto"));
            
            ResultSet rs=ler.dados_fun_cpf(func);
            ResultSet nacio=ler.dados_nacio();
            ResultSet cpf_nacio=ler.nacioFun(func);
            ResultSet tel=ler.TelFun(func);
            ResultSet depart=ler.dados_depart();
            ResultSet posto=ler.dados_posto();
            
            while(cpf_nacio.next())
            {
                nac.add(cpf_nacio.getString("pais"));
            }
            
            while(tel.next())
            {
                num.add(tel.getString("numero"));
            }
            
            func.setNacionalidade(nac.get(0));
            if(nac.size()>1)
              func.setNacionalidadeAlt(nac.get(1));
            
            func.setTel(num.get(0));
            if(num.size()>1)
              func.setTelAlt(num.get(1));
            
            while(rs.next()){
        %>
    <a href="deletar_fun.jsp?cpf=<%=func.getCpf()%>" class="eliminar">Eliminar</a>
    <h2 class="nome"><%=rs.getString("nome")%></h2>
    
    <div class="princ"> 
      <div class="formu">  
       <form action="alterar.jsp?cpf=<%=func.getCpf()%>&&nome=<%=rs.getString("nome")%>&&depart=<%=func.getDepartamento()%>&&posto=<%=func.getPosto()%>" method="post"> 
       
        <label for="data">Data De Nascimento</label><br/>
           <input type="text" id="data" name="data" value="<%=rs.getString("data_nasc")%>">
        <br/>
        
         <label for="civil">Estado Civil</label><br/> 
          <select id="civil" name="est_civil">
            <option selected><%=rs.getString("est_civil")%></option>
            <option>Solteiro(a)</option>
            <option>Casado(a)</option>
            <option>Viuvo(a)</option>
            <option>Divorciado(a)</option>
          </select>
        <br/>
        
      <label for="gen">Genero</label><br/>
       <select  id="gen" name="genero">
          <option selected><%=rs.getString("genero") %></option>    
          <option>Masculino</option>
          <option>Feminino</option>
       </select>
       <br/> 
       
        <label for="grau">Grau Academico</label><br/>
         <select name="grau" id="grau" placeholder="Grau Academico" >
             <option selected><%=rs.getString("grau_academico") %></option>
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
           <br/> 
           
           <label for="funcao">Funcao</label><br/> 
          <select  id="funcao" name="funcao">
            <option selected><%=rs.getString("funcao") %></option>    
             <option>Frentista</option>
             <option>Motorista</option>
          </select>
          <br/> 
          
          <label for="def">Possui Alguma Deficiencia?</label><br/>
            <select  id="def" name="deficiencia">
              <option selected><%=rs.getString("deficiencia") %></option>    
              <option>Sim</option>
             <option>Nao</option>
            </select>
           <br/> 
       
         <label for="mae">Nome Da Mae</label><br/>
           <input type="text" id="mae" value="<%=rs.getString("mae") %>" name="mae">
         <br/> 
         
         <label for="pai">Nome Do Pai</label><br/> 
           <input type="text" id="pai" value="<%=rs.getString("pai") %>" name="pai">
         <br/>     
          <%}%>
          
         <label for="depart">Departamento</label><br/>
            <select  id="depart" name="depart">
              <%while(depart.next()){%>
               <option><%=depart.getString("nome")%></option>
              <%}%>
           <option selected><%=func.getDepartamento() %></option>    
            </select>
          <br/>
          
        <label for="posto">Posto</label><br/>
         <select name="posto" id="posto">  
           <% while(posto.next()){ %>
            <option><%= posto.getString("nome")%></option>
            <%}%>
          <option selected><%=func.getPosto()%></option>    
        </select>
       <br/>
              
       <datalist id="lista">
            <% while(nacio.next()){ %>
            <option>
                <%= nacio.getString("pais") %>
            </option>
           <%}%>
      </datalist> 
      <label for="nacio">Nacionalidade</label><br/>
          <input type="text" list="lista" id="nacio" placeholder="Nacionalidade" name="pais" value="<%=func.getNacionalidade()%>"/>
      <br/>
      
      <label for="nacioalt">Outra Nacionalidade</label><br/>
          <input type="text" id="nacioalt" list="lista" placeholder="Outra Nacionalidade" name="paisalt" value="<%=func.getNacionalidadeAlt()%>"/>
      <br/> 
      
     <label for="tel">Telefone</label><br/>
          <input type="text" id="tel"  placeholder="Telefone" name="tel" value="<%=func.getTel() %>"/>
     <br/> 
     
     <label for="telalt">Telefone Alternativo</label><br/>
          <input type="text" id="telalt" placeholder="Telefone Alternativo" name="telalt" value="<%=func.getTelAlt()%>"/>
     <br/>       

    
        <div class="botao"><input type="submit" value="Salvar"></div>
    </form> 
   </div>
      <div class="imagem_principal">
    </div>
   </div>
     <script>
             var botao=document.getElementsByClassName("nome")[0];
             
             botao.addEventListener("click",janela);
             function janela()
             {
                 window.open("nome_individual.jsp?id=<%=func.getCpf()%>","_blank","width=200,height=200,top=200,left=300");
             }
         </script>
    </body>
</html>
