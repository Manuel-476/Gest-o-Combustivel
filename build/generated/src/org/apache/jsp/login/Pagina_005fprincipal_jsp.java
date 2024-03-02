package org.apache.jsp.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Pagina_005fprincipal_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Pagina Principal</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"../estilo/estilo_pagina_inicial.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../estilo/inicial.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    <body>    \n");
      out.write("   <div class=\"pagina\">\n");
      out.write("    <div>\n");
      out.write("     <h1>Gestao de Combustivel</h1>\n");
      out.write("     <span class=\"botao\"><a href=\"\">Bem-Vindo</a></span>\n");
      out.write("    </div>    \n");
      out.write("      <list id=\"opcao\" >\n");
      out.write("      <div class=\"menu\">\n");
      out.write("        <ul class=\"menu_princ\" type=\"disc\">\n");
      out.write("            <li >\n");
      out.write("              <a href=\"../apresent_dados/postos.jsp\">\n");
      out.write("                <img src=\"../imagem/tanque-de-combustível-sendo-abastecido.jpg\" alt=\"Registro de Abastecimento\"/>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("        </div>\n");
      out.write("      <div class=\"extra\">\n");
      out.write("        <ul class=\"menu_ext\">\n");
      out.write("            <li class=\"cad\"><img src=\"../imagem/cadastros-01-01.png\" alt=\"\" title=\"Cadastar\"/>\n");
      out.write("                <ul class=\"sub_op1\">\n");
      out.write("                  <li><a href=\"../cadastro/cadastrar_fun.jsp\">Funcionario<img src=\"\" ></a></li> \n");
      out.write("                  <li><a href=\"../cadastro/cad_posto.jsp\">Posto<img src=\"\" alt=\"\"></a></li>\n");
      out.write("                  <li><a href=\"../cadastro/cadastrar_trans.jsp\">Transporte<img src=\"\" ></a></li>\n");
      out.write("                  <li><a href=\"#\">Equipamento<img src=\"\" ></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li>   \n");
      out.write("           \n");
      out.write("            <li class=\"viz\">\n");
      out.write("                <img src=\"../imagem/kisspng-data-visualization-data-analysis-big-data-business-5bace19201bf87.3740842415380565940072.jpg\" alt=\"visualizar\" title=\"visualizar\"/>\n");
      out.write("              \n");
      out.write("                 <ul class=\"sub_op2\">\n");
      out.write("                  <li><a href=\"../apresent_dados/funcionario.jsp\">Funcionario<img src=\"\" ></a></li>\n");
      out.write("                  <li><a href=\"#\">Transporte<img src=\"\" ></a></li>\n");
      out.write("                  <li><a href=\"#\">Equipamentos<img src=\"\" ></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </li> <br/><br/>\n");
      out.write("           </ul>\n");
      out.write("         <ul class=\"menu_ext\">\n");
      out.write("            <li class=\"posto\">\n");
      out.write("              <a href=\"#\">\n");
      out.write("                  <img src=\"../imagem/istockphoto-1387492380-1024x1024.jpg\" alt=\"\" Title=\"postos\"/>   \n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"relat\">\n");
      out.write("              <a href=\"\">\n");
      out.write("                <img src=\"../imagem/relatorio.jpg\" alt=\"Relatorio\"/>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("         <ul/>   \n");
      out.write("       </div>\n");
      out.write("     </list>\n");
      out.write("   </div>     \n");
      out.write("        <script >\n");
      out.write("             document.getElementsByClassName(\"sub_op1\")[0].style=\"display:none\";\n");
      out.write("             document.getElementsByClassName(\"sub_op2\")[0].style=\"display:none\";\n");
      out.write("             botao=document.getElementsByClassName(\"cad\")[0];\n");
      out.write("             botao2=document.getElementsByClassName(\"viz\")[0];\n");
      out.write("    \n");
      out.write("             botao.addEventListener(\"mousemove\",menu);\n");
      out.write("             botao.addEventListener(\"mouseout\",menu_des);\n");
      out.write("             botao2.addEventListener(\"mousemove\",menu_2);\n");
      out.write("             botao2.addEventListener(\"mouseout\",menu_des_2);\n");
      out.write("            function menu()\n");
      out.write("            {\n");
      out.write("             var botao;\n");
      out.write("             botao=document.getElementsByClassName(\"sub_op1\")[0];\n");
      out.write("             botao.style=\"display:visible\";\n");
      out.write("             }\n");
      out.write("            function menu_des()\n");
      out.write("            {\n");
      out.write("             var botao;\n");
      out.write("             botao=document.getElementsByClassName(\"sub_op1\")[0];\n");
      out.write("             botao.style=\"display:none\";\n");
      out.write("             }\n");
      out.write("            function menu_2()\n");
      out.write("            {\n");
      out.write("             var botao;\n");
      out.write("             botao=document.getElementsByClassName(\"sub_op2\")[0];\n");
      out.write("             botao.style=\"display:visible\";\n");
      out.write("             }\n");
      out.write("            function menu_des_2()\n");
      out.write("            {\n");
      out.write("             var botao;\n");
      out.write("             botao=document.getElementsByClassName(\"sub_op2\")[0];\n");
      out.write("             botao.style=\"display:none\";\n");
      out.write("             }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
