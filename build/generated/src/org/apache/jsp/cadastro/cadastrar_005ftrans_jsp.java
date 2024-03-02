package org.apache.jsp.cadastro;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class cadastrar_005ftrans_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      classes.leitura ler = null;
      synchronized (_jspx_page_context) {
        ler = (classes.leitura) _jspx_page_context.getAttribute("ler", PageContext.PAGE_SCOPE);
        if (ler == null){
          ler = new classes.leitura();
          _jspx_page_context.setAttribute("ler", ler, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"../estilo/formul.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Cadastro Transportes</h1>\n");
      out.write("         <a href=\"../login/Pagina_principal.jsp\" class=\"voltar\">Pagina Inicial</a>\n");
      out.write("        <a href=\"\" class=\"tanq\" style=\"color:white;background-color:#336600;border-radius:10px;padding:15px;margin:20px;\">Cadastrar Camiao Tanque</a>\n");
      out.write("        <form method=\"post\" action=\"cad_trans.jsp\">\n");
      out.write("         <div class=\"princ\">   \n");
      out.write("        <datalist id=\"marca\">\n");
      out.write("            <option>Toyota</option>\n");
      out.write("            <option>Hyundai</option>\n");
      out.write("            <option>Kia</option>\n");
      out.write("            <option>Nissan</option>\n");
      out.write("            <option>Volvo</option>\n");
      out.write("            <option>Lamborguini</option>\n");
      out.write("        </datalist>\n");
      out.write("        <datalist id=\"modelo\">\n");
      out.write("            <option>Corola</option>\n");
      out.write("            <option>Tucson</option>\n");
      out.write("        </datalist>\n");
      out.write("         <div class=\"formul\"> \n");
      out.write("        <input type=\"text\" list=\"marca\" placeholder=\"Marca\" name=\"marca\"/>\n");
      out.write("        <input type=\"text\" placeholder=\"Placa\" name=\"placa\"/>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"formul\"> \n");
      out.write("        <input type=\"text\" list=\"modelo\" placeholder=\"Modelo\" name=\"modelo\"/>\n");
      out.write("       ");

          ResultSet rs=ler.dados_categoria();
          ResultSet dep=ler.dados_depart();
       
      out.write("\n");
      out.write("        <select name=\"categoria\">\n");
      out.write("             ");
while(rs.next()){
      out.write("\n");
      out.write("                  <option>");
      out.print(rs.getString("nome"));
      out.write("</option>\n");
      out.write("             ");
}
      out.write("\n");
      out.write("        </select>\n");
      out.write("        <select name=\"departamento\">\n");
      out.write("            ");
while(dep.next()){
      out.write("\n");
      out.write("                  <option>");
      out.print(dep.getString("nome"));
      out.write("</option>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("         </select>\n");
      out.write("         </div>\n");
      out.write("          <div class=\"formul\"> \n");
      out.write("         <input type=\"date\" name=\"data\"/>\n");
      out.write("         <input type=\"text\" placeholder=\"Volume do Deposito\" name=\"vol_dep\">\n");
      out.write("         </div>\n");
      out.write("         </div>\n");
      out.write("          <div class=\"botao\">\n");
      out.write("          <input type=\"submit\" value=\"Regitrar\">\n");
      out.write("         </div>\n");
      out.write("      </form>\n");
      out.write("         <script>\n");
      out.write("             var botao=document.getElementsByClassName(\"tanq\")[0];\n");
      out.write("             \n");
      out.write("             botao.addEventListener(\"click\",janela);\n");
      out.write("             function janela()\n");
      out.write("             {\n");
      out.write("                 window.open(\"Cadastrar_cam_tanq.jsp\",\"_blank\",\"width=500,height=400,top=200,left=300\");\n");
      out.write("             }\n");
      out.write("         </script>\n");
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
