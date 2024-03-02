package org.apache.jsp.cadastro;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class abastec_005ftanq_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"../estilo/abast.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"corpo\"> \n");
      out.write("            <div class=\"formu\">\n");
      out.write("        <form method=\"post\" action=\"cad_abas.jsp?id_tanq=");
      out.print(request.getParameter("id"));
      out.write("&&id_posto=");
      out.print(request.getParameter("id_posto"));
      out.write("\">\n");
      out.write("        \n");
      out.write("           \n");
      out.write("        <input type=\"text\" placeholder=\"Quantidade(Litro)\" name=\"qtd\"/>\n");
      out.write("        <input type=\"date\"  name=\"data\"/>\n");
      out.write("        \n");
      out.write("       ");

          ResultSet rs=ler.dados_combus();
          ResultSet le=ler.dados_fun();
          ResultSet pos=ler.dados_posto();
          ResultSet cam=ler.dados_camiao();
          ResultSet tab=ler.dados_Abasttanq(Integer.parseInt(request.getParameter("id")));
       
      out.write("\n");
      out.write("         <select name=\"cam\">\n");
      out.write("           ");
while(cam.next()){
      out.write("\n");
      out.write("               <option>");
      out.print(cam.getString("nome_c"));
      out.write("</option>\n");
      out.write("           ");
}
      out.write("\n");
      out.write("        </select>\n");
      out.write("       \n");
      out.write("       <select name=\"posto\">\n");
      out.write("           ");
while(pos.next()){
      out.write("\n");
      out.write("               <option>");
      out.print(pos.getString("nome"));
      out.write("</option>\n");
      out.write("           ");
}
      out.write("\n");
      out.write("        </select>\n");
      out.write("        <select name=\"combustivel\">\n");
      out.write("           ");
while(rs.next()){
      out.write("\n");
      out.write("               <option>");
      out.print(rs.getString("tipo"));
      out.write("</option>\n");
      out.write("           ");
}
      out.write("\n");
      out.write("        </select>\n");
      out.write("        \n");
      out.write("        <datalist id=\"nome\">\n");
      out.write("           ");
while(le.next()){
      out.write("\n");
      out.write("               <option>");
      out.print(le.getString("funcionario"));
      out.write("</option>\n");
      out.write("          ");
}
      out.write("\n");
      out.write("        </datalist>\n");
      out.write("        <input type=\"text\" list=\"nome\"  placeholder=\"Funcionario\" name=\"funcio\"/>\n");
      out.write("        <select name=\"cheio\">\n");
      out.write("          <option>Sim</option>\n");
      out.write("          <option>Nao</option>\n");
      out.write("        </select>\n");
      out.write("        <input type=\"submit\" value=\"Registrar\">\n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("        </div>\n");
      out.write("       <div class=\"tab\"> \n");
      out.write("           <table>\n");
      out.write("               <thead>\n");
      out.write("               <th>CAMIAO</th>\n");
      out.write("               <th>LITRO</th>\n");
      out.write("               <th>DATA</th>\n");
      out.write("               <th>CONDUTOR</th>\n");
      out.write("               <th>COMBUSTIVEL</th>\n");
      out.write("               <th>MARCA</th> \n");
      out.write("               <th>POSTO</th>\n");
      out.write("               <th>IMPRIMIR RELATORIO</th>\n");
      out.write("               </thead>>\n");
      out.write("               ");
while(tab.next()){
      out.write("\n");
      out.write("               <tr>\n");
      out.write("                   <td>");
      out.print(tab.getString("nome_c") );
      out.write("</td>\n");
      out.write("                   <td>");
      out.print(tab.getString("Qtd_litro") );
      out.write("</td>\n");
      out.write("                   <td>");
      out.print(tab.getString("data_hora") );
      out.write("</td>\n");
      out.write("                   <td>");
      out.print(tab.getString("nome") );
      out.write("</td>\n");
      out.write("                   <td>");
      out.print(tab.getString("tipo") );
      out.write("</td>\n");
      out.write("                   <td>");
      out.print(tab.getString("marca") );
      out.write("</td>\n");
      out.write("                   <td>");
      out.print(tab.getString("posto") );
      out.write("</td>\n");
      out.write("                   <td>\n");
      out.write("                     <a href=\"relatoriotanq.jsp?id_abas=");
      out.print(tab.getInt("id_abast"));
      out.write("\">rel<img src=\"\" alt=\"rel\"/></a>     \n");
      out.write("                   </td>\n");
      out.write("               </tr>\n");
      out.write("               ");
}
      out.write("\n");
      out.write("           </table>\n");
      out.write("        </div>\n");
      out.write("       </div>\n");
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
