package org.apache.jsp.apresent_005fdados;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class postoVis_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      classes.leitura tab = null;
      synchronized (_jspx_page_context) {
        tab = (classes.leitura) _jspx_page_context.getAttribute("tab", PageContext.PAGE_SCOPE);
        if (tab == null){
          tab = new classes.leitura();
          _jspx_page_context.setAttribute("tab", tab, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"../estilo/listar.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Postos</h1>\n");
      out.write("         <a href=\"../login/Pagina_principal.jsp\" class=\"voltar\">Pagina Inicial</a>\n");
      out.write("        <a href=\"#\" class=\"tanq\" style=\"color:white;background-color:#336600;border-radius:10px;padding:15px;margin:20px;\">Cadastrar Tanques</a>\n");
      out.write("        ");

            ResultSet rs=tab.dados_posto();
        
      out.write("\n");
      out.write("        <table>\n");
      out.write("            <thead>\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>NOME</th>\n");
      out.write("                <th>ENDERECO</th>\n");
      out.write("                <th>DATA INAUGURACAO</th>\n");
      out.write("                <th>OPCAO</th>\n");
      out.write("            </thead>\n");
      out.write("            ");
while(rs.next()){
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(rs.getString("num_registro"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("nome"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("endereco"));
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("data_inaug"));
      out.write("</td>\n");
      out.write("                <td>\n");
      out.write("                    <a href=\"?id=");
      out.print(rs.getString("num_registro"));
      out.write("\"><img src=\"../imagem/icon-edit-5.jpg\"  title=\"Ver/Editar\" width=\"23\"/></a>\n");
      out.write("                    \n");
      out.write("                    <a href=\"?id=");
      out.print(rs.getString("num_registro"));
      out.write("\"><img src=\"../imagem/delete-icon-vector-25.jpg\"  title=\"Eliminar\" width=\"20\"/></a>\n");
      out.write("                    \n");
      out.write("                    <a class=\"eq\"href=\"?id=");
      out.print(rs.getString("num_registro"));
      out.write("\"><img src=\"\"  title=\"Ver Equipamento\" width=\"20\"/></a>\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </table>\n");
      out.write("       \n");
      out.write("    </body>\n");
      out.write("      <script>\n");
      out.write("             var botao=document.getElementsByClassName(\"tanq\")[0]; \n");
      out.write("             var botao2=document.getElementsByClassName(\"eq\")[0];\n");
      out.write("             botao.addEventListener(\"click\",janela);\n");
      out.write("             botao2.addEventListener(\"click\",janelaeq);\n");
      out.write("             function janela()\n");
      out.write("             {\n");
      out.write("                 window.open(\"../cadastro/cadastrar_tanq.jsp\",\"_blank\",\"width=500,height=300,top=200,left=300\")\n");
      out.write("             }\n");
      out.write("              function janelaeq()\n");
      out.write("             {\n");
      out.write("                 window.open(\"equipamento.jsp\",\"_blank\",\"width=500,height=300,top=200,left=300\")\n");
      out.write("             }\n");
      out.write("       </script>\n");
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
