package org.apache.jsp.apresent_005fdados;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class postos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"../estilo/posto.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      ");
ResultSet rs=ler.dados_posto();
      while(rs.next()){
      out.write("\n");
      out.write("        <div class=\"opcao\">\n");
      out.write("             <figure class=\"cad\">\n");
      out.write("                  <img src=\"\" title=\"posto\">\n");
      out.write("                  <figcaption>");
      out.print(rs.getString("nome"));
      out.write("</figcaption>\n");
      out.write("                 \n");
      out.write("                  <ul class=\"sub_op1\">\n");
      out.write("                      <li><a href=\"tanques.jsp?id=");
      out.print(rs.getString("num_registro"));
      out.write("\">Tanque</a></li>\n");
      out.write("                      <li><a href=\"abastecimento.jsp?id=");
      out.print(rs.getString("num_registro"));
      out.write("\">Veiculo</a></li>\n");
      out.write("                  </ul>\n");
      out.write("                 \n");
      out.write("                       <figcaption>");
      out.print(rs.getString("endereco"));
      out.write("</figcaption>\n");
      out.write("             </figure>  \n");
      out.write("         </div>\n");
      out.write("      ");
}
      out.write("\n");
      out.write("        <script >\n");
      out.write("             document.getElementsByClassName(\"sub_op1\")[0].style=\"display:none\";\n");
      out.write("           //  document.getElementsByClassName(\"sub_op2\")[0].style=\"display:none\";\n");
      out.write("             botao=document.getElementsByClassName(\"cad\")[0];\n");
      out.write("          //   botao2=document.getElementsByClassName(\"viz\")[0];\n");
      out.write("    \n");
      out.write("             botao.addEventListener(\"mousemove\",menu);\n");
      out.write("             botao.addEventListener(\"mouseout\",menu_des);\n");
      out.write("          //   botao2.addEventListener(\"mousemove\",menu_2);\n");
      out.write("           //  botao2.addEventListener(\"mouseout\",menu_des_2);\n");
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
      out.write("           /* function menu_2()\n");
      out.write("            {\n");
      out.write("             var botao;\n");
      out.write("             botao=document.getElementsByClassName(\"sub_op2\")[0];\n");
      out.write("             botao.style=\"display:visible\";\n");
      out.write("             }\n");
      out.write("            function menu_des_2()\n");
      out.write("            {\n");
      out.write("             var botao;\n");
      out.write("             botao=document.getElementsByClassName(\"sub_op2\")[0];\n");
      out.write("             botao.style=\"display:none\";*/\n");
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
