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
        <title>JSP Page</title>
        <style>.mae{display:flex;justify-content:space-between;}
               .botao{margin:auto;text-align:center;}
               .botao input{width:40%;background-color:#336600;color:#fff;padding:15px;}
               h1{text-align: center;}
        </style>
    </head>
    <body>
        <form method="post" action="cad_cam.jsp">
          <h1>Camiao Tanque</h1>
        <datalist id="marca">
            <option>Toyota</option>
            <option>Hyundai</option>
            <option>Kia</option>
            <option>Nissan</option>
            <option>Volvo</option>
            <option>Lamborguini</option>
        </datalist>
      <div class="mae">
        <div class="filho">
         <input type="text"  placeholder="Nome" name="nome"/><br/><br/>
         <input type="text"list="marca" placeholder="Marca" name="marca"/><br/><br/>
        </div>
        <div class="filho">
         <input type="date" name="data"/><br/><br/>
         <input type="text" placeholder="Volume do Deposito" name="vol_dep"><br/><br/>
        </div>
       </div>
      <div class="botao">
         <input  type="submit" value="Regitrar">
       </div>
      </form>
     
    </body>
</html>
