package org.apache.jsp.cadastro;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class posto_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
      classes.leitura ler = null;
      synchronized (_jspx_page_context) {
        ler = (classes.leitura) _jspx_page_context.getAttribute("ler", PageContext.PAGE_SCOPE);
        if (ler == null){
          ler = new classes.leitura();
          _jspx_page_context.setAttribute("ler", ler, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"../estilo/formul.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Catastrar Posto</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <a href=\"../login/Pagina_principal.jsp\" class=\"voltar\">Pagina Inicial</a>\n");
      out.write("        <h1>Cadastrar Posto</h1>\n");
      out.write("        <form action=\"cad_posto.jsp\" method=\"post\">\n");
      out.write("        ");

            ResultSet combus;
            combus=ler.dados_combus();
        
      out.write("\n");
      out.write("       <div class=\"for\">\n");
      out.write("        <div class=\"formul\">\n");
      out.write("          <input type=\"text\" placeholder=\"Nome\" name=\"nome\">\n");
      out.write("          <input type=\"text\" placeholder=\"Endereco\" name=\"endereco\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"formul\">\n");
      out.write("          <input type=\"text\" placeholder=\"Nome do Tanque\" name=\"tanque\">\n");
      out.write("          <label for=\"data\">Data de Inauguracao</label><br/><input type=\"date\" id=\"data\" name=\"data\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"formul\">\n");
      out.write("          <select name=\"combus\">\n");
      out.write("            ");
while(combus.next()){
      out.write("\n");
      out.write("            <option>");
      out.print(combus.getString("tipo"));
      out.write("</option> \n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </select>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("         <div class=\"botao\"> <input type=\"submit\" value=\"Cadastrar\" /></div>\n");
      out.write("       </form>\n");
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
