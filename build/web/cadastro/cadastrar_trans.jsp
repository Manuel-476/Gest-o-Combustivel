<%-- 
    Document   : cad_trab
    Created on : 24/out/2022, 17:29:45
    Author     : DELL
--%>

<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="ler" class="classes.leitura"  />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../estilo/formul.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Cadastro Transportes</h1>
         <a href="../login/Pagina_principal.jsp" class="voltar">Pagina Inicial</a>
        <a href="" class="tanq" style="color:white;background-color:#336600;border-radius:10px;padding:15px;margin:20px;">Cadastrar Camiao Tanque</a>
        <form method="post" action="cad_trans.jsp">
         <div class="princ">   
        <datalist id="marca">
            <option>Toyota</option>
            <option>Hyundai</option>
            <option>Kia</option>
            <option>Nissan</option>
            <option>Volvo</option>
            <option>Lamborguini</option>
        </datalist>
        <datalist id="modelo">
            <option>Corola</option>
            <option>Tucson</option>
        </datalist>
         <div class="formul"> 
        <input type="text" list="marca" placeholder="Marca" name="marca"/>
        <input type="text" placeholder="Placa" name="placa"/>
        </div>
        <div class="formul"> 
        <input type="text" list="modelo" placeholder="Modelo" name="modelo"/>
       <%
          ResultSet rs=ler.dados_categoria();
          ResultSet dep=ler.dados_depart();
       %>
        <select name="categoria">
             <%while(rs.next()){%>
                  <option><%=rs.getString("nome")%></option>
             <%}%>
        </select>
        <select name="departamento">
            <%while(dep.next()){%>
                  <option><%=dep.getString("nome")%></option>
            <%}%>
         </select>
         </div>
          <div class="formul"> 
         <input type="date" name="data"/>
         <input type="text" placeholder="Volume do Deposito" name="vol_dep">
         </div>
         </div>
          <div class="botao">
          <input type="submit" value="Regitrar">
         </div>
      </form>
         <script>
             var botao=document.getElementsByClassName("tanq")[0];
             
             botao.addEventListener("click",janela);
             function janela()
             {
                 window.open("Cadastrar_cam_tanq.jsp","_blank","width=500,height=300,top=200,left=300");
             }
         </script>
    </body>
</html>
