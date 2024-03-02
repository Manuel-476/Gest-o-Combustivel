<%-- 
    Document   : login
    Created on : 9/out/2022, 14:21:43
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link href="../estilo/estilo_login.css" rel="stylesheet" type="text/css"/>
         <title>Entrar</title>
    </head>
    <body>
        <header class="logo">
          <img src="../imagem/logo_min_defesa.png"/>
          <h2>MINDENVP</h2>
          <h3>Sistema de Gestão de Combustível</h3>
        </header>
        
        
      <div class="login_estru">
       <div class="imagem_principal">
           <img src="../imagem/foto_comb.png" style="width:60%"> 
       </div>
          
        <div class="formulario" style="width:40%">
        <h1>Entrar</h1>
          <form method="post" action="verficar.jsp">
            <input type="email" name="email" placeholder="Email"/><br/>
            <input type="password" name="senha" placeholder="Palavra-Passe"/><br/>
            <input type="submit" value="Entrar">
          </form>
         </div>
     </div>
    </body>
</html>
