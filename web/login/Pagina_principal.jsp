<%-- 
    Document   : Pagina_principal
    Created on : 9/out/2022, 16:55:21
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Pagina Principal</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../estilo/estilo_pagina_inicial.css" rel="stylesheet" type="text/css"/>
        <link href="../estilo/inicial.css" rel="stylesheet" type="text/css"/>
      
    </head>
    <body>    
   <div class="pagina">
    <div>
     <h1>Gestao de Combustivel</h1>
     <span class="botao"><a href="">Bem-Vindo</a></span>
    </div>    
      <list id="opcao" >
      <div class="menu">
        <ul class="menu_princ" type="disc">
            <li >
              <a href="../apresent_dados/postos.jsp">
                <img src="../imagem/tanque-de-combustível-sendo-abastecido.jpg" alt="Registro de Abastecimento"/>
              </a>
            </li>
        </ul>
        </div>
      <div class="extra">
        <ul class="menu_ext">
            <li class="cad"><img src="../imagem/cadastros-01-01.png" alt="" title="Cadastar"/>
                <ul class="sub_op1">
                  <li><a href="../cadastro/cadastrar_fun.jsp">Funcionario<img src="" ></a></li> 
                  <li><a href="../cadastro/cad_posto.jsp">Posto<img src="" alt=""></a></li>
                  <li><a href="../cadastro/cadastrar_trans.jsp">Transporte<img src="" ></a></li>
                  <li><a href="#">Equipamento<img src="" ></a></li>
                </ul>
            </li>   
           
            <li class="viz">
                <img src="../imagem/kisspng-data-visualization-data-analysis-big-data-business-5bace19201bf87.3740842415380565940072.jpg" alt="visualizar" title="visualizar"/>
              
                 <ul class="sub_op2">
                  <li><a href="../apresent_dados/funcionario.jsp">Funcionario<img src="" ></a></li>
                  <li><a href="#">Transporte<img src="" ></a></li>
                  <li><a href="#">Equipamentos<img src="" ></a></li>
                </ul>
            </li> <br/><br/>
           </ul>
         <ul class="menu_ext">
            <li class="posto">
              <a href="../apresent_dados/postoVis.jsp">
                  <img src="../imagem/istockphoto-1387492380-1024x1024.jpg" alt="" Title="postos"/>   
              </a>
            </li>
            <li class="relat">
              <a href="">
                <img src="../imagem/relatorio.jpg" alt="Relatorio"/>
              </a>
            </li>
         <ul/>   
       </div>
     </list>
   </div>     
        <script >
             document.getElementsByClassName("sub_op1")[0].style="display:none";
             document.getElementsByClassName("sub_op2")[0].style="display:none";
             botao=document.getElementsByClassName("cad")[0];
             botao2=document.getElementsByClassName("viz")[0];
    
             botao.addEventListener("mousemove",menu);
             botao.addEventListener("mouseout",menu_des);
             botao2.addEventListener("mousemove",menu_2);
             botao2.addEventListener("mouseout",menu_des_2);
            function menu()
            {
             var botao;
             botao=document.getElementsByClassName("sub_op1")[0];
             botao.style="display:visible";
             }
            function menu_des()
            {
             var botao;
             botao=document.getElementsByClassName("sub_op1")[0];
             botao.style="display:none";
             }
            function menu_2()
            {
             var botao;
             botao=document.getElementsByClassName("sub_op2")[0];
             botao.style="display:visible";
             }
            function menu_des_2()
            {
             var botao;
             botao=document.getElementsByClassName("sub_op2")[0];
             botao.style="display:none";
             }
        </script>
    </body>
</html>
