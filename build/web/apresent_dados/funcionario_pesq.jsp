<%-- 
    Document   : funcionario
    Created on : 12/out/2022, 5:01:20
    Author     : DELL
--%>
<%@page import="java.sql.ResultSet"%>
<jsp:useBean id="ler" class="classes.leitura" type="classes.leitura" scope="page"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="../estilo/listar.css" rel="stylesheet" type="text/css"/>
        <title>Funcionarios</title>
    </head>
    <body>
        <a href="../login/Pagina_principal.jsp" class="voltar">Pagina Inicial</a>
        <form action="" method="post">
            <input type="search" placeholder="Pesquisar" name="search"/>
        </form>
        <h1>Funcionarios</h1>
        <table>
            <a href="funcionario.jsp">Listar Todos</a>
            <thead>
                <th>CPF</th>
                <th>FUNCIONARIO</th>
                <th>DATA DE NASCIMENTO</th>
                 <th>ESTADO CIVIL</th>
                <th>GENERO</th>
                <th>GRAU ACADEMICO</th>
                <th>DEPARTAMENTO</th>
                <th>POSTO</th>
                <th>FUNCAO</th>  
                <th>OPCOES</th>
            </thead>
            <%
                ResultSet func=ler.dados_fun_pesq(request.getParameter("search"));
                while(func.next()){ 
            %>
            <tr>
                <td style="color:white;background-color:#336600;"><%=func.getInt("cpf")%></td>
                <td><%=func.getString("funcionario")%></td>
                <td><%=func.getString("Data_Nascim")%></td>
                <td><%=func.getString("Est_civil")%></td>
                <td><%=func.getString("genero")%></td>
                <td><%=func.getString("grau")%></td>
                <td><%=func.getString("departamento")%></td>
                <td><%=func.getString("posto")%></td>
                <td><%=func.getString("funcao")%></td>
                <td><a href="fun_individual.jsp?cpf=<%=func.getInt("cpf")%>&&dep=<%=func.getString("departamento")%>&&posto=<%=func.getString("posto")%>">
                        <img src="../imagem/icon-edit-5.jpg"  title="Ver/Editar" width="23">
                    </a>
                    <a href="deletar_fun.jsp?cpf=<%=func.getInt("cpf")%>">
                        <img src="../imagem/delete-icon-vector-25.jpg" title="Eliminar" width="20">
                    </a>
                </td>
            </tr>
            <%}%>
        </table>
    </body>
</html>
