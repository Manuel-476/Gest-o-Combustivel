package org.apache.jsp.cadastro;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class cadastrar_005ffun_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"Pt-Br\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"../estilo/formul.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Cadastro</title>\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <a href=\"../login/Pagina_principal.jsp\" class=\"voltar\">Pagina Inicial</a>\n");
      out.write("        \n");
      out.write("        <h1>Cadastro do Pessoal</h1>\n");
      out.write("        <form action=\"cad_fun.jsp\" method=\"post\">\n");
      out.write("       \n");
      out.write("            ");

                ResultSet depart,nacio,posto;
                depart=ler.dados_depart();
                nacio=ler.dados_nacio();
                posto=ler.dados_posto();
            
      out.write("\n");
      out.write("        <div class=\"princ\">\n");
      out.write("      \n");
      out.write("        \n");
      out.write("        <div class=\"formul\"> \n");
      out.write("            <input type=\"file\" placeholder=\"foto\" value=\"foto\" class=\"arq\" name=\"file\" /><br/><br/>\n");
      out.write("            <input type=\"text\" placeholder=\"Nome Completo\" name=\"nome\"/><br/><br/>\n");
      out.write("            <input type=\"text\" placeholder=\"Nome Do Pai\" name=\"pai\"><br/><br/>\n");
      out.write("            <input type=\"text\" placeholder=\"Nome Da Mae\" name=\"mae\"><br/><br/>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <div class=\"formul\">\n");
      out.write("        <input type=\"text\" placeholder=\"Telefone\" name=\"tel\"/><br/><br/>\n");
      out.write("        <input type=\"text\" placeholder=\"Telefone Alternativa\" name=\"telalt\"/><br/><br/>\n");
      out.write("     \n");
      out.write("        <datalist id=\"lista\">\n");
      out.write("          ");
 while(nacio.next()){ 
      out.write("\n");
      out.write("            <option>\n");
      out.write("                ");
      out.print( nacio.getString("pais") );
      out.write("\n");
      out.write("            </option>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </datalist>\n");
      out.write("        \n");
      out.write("        <input type=\"text\" list=\"lista\" name=\"pais\" placeholder=\"Nacionalidade\"/><br/><br/>\n");
      out.write("        <input type=\"text\" list=\"lista\" name=\"paisalt\" placeholder=\"Outra Nacionalidade\"/><br/><br/>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        <div class=\"formul\">\n");
      out.write("          <label for=\"data\">Data Nascimento</label><br/><input type=\"date\" placeholder=\"Data\" id=\"data\" name=\"data\"/>\n");
      out.write("          <label for=\"civil\">Estado Civil</label><br/>\n");
      out.write("         <select id=\"civil\" name=\"est_civil\">\n");
      out.write("            <option>Solteiro(a)</option>\n");
      out.write("            <option>Casado(a)</option>\n");
      out.write("            <option>Viuvo(a)</option>\n");
      out.write("            <option>Divorciado(a)</option>\n");
      out.write("         </select>\n");
      out.write("         <label for=\"genero\">Genero</label><br/>\n");
      out.write("         <select id=\"genero\" name=\"genero\">\n");
      out.write("            <option>Masculino</option>\n");
      out.write("            <option>Feminino</option>\n");
      out.write("         </select>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        \n");
      out.write("         \n");
      out.write("        \n");
      out.write("           <div class=\"formul\">\n");
      out.write("               <label for=\"posto\">Posto</label><br/>\n");
      out.write("         <select name=\"posto\" id=\"posto\">  \n");
      out.write("           ");
 while(posto.next()){ 
      out.write("\n");
      out.write("            <option>");
      out.print( posto.getString("nome") );
      out.write("</option>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </select><br/>\n");
      out.write("        <label for=\"depart\">Departamento</label><br/>\n");
      out.write("        <select name=\"depart\" id=\"depart\">\n");
      out.write("           ");
 while(depart.next()){ 
      out.write("\n");
      out.write("            <option>\n");
      out.write("                ");
      out.print( depart.getString("nome") );
      out.write("\n");
      out.write("            </option>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </select>\n");
      out.write("           </select>\n");
      out.write("         <label for=\"funcao\">Funcao</label><br/>\n");
      out.write("             <select id=\"funcao\" name=\"funcao\">\n");
      out.write("            <option>Frentista</option>\n");
      out.write("            <option>Motorista</option>\n");
      out.write("        </select>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("        <div class=\"formul\">\n");
      out.write("            <label for=\"grau\">Grau Academico</label><br/>\n");
      out.write("         <select name=\"grau\" placeholder=\"Grau Academico\" id=\"grau\">\n");
      out.write("            <optgroup>Ensino primario\n");
      out.write("               <option>Primario Concluido</option>\n");
      out.write("            </optgroup>\n");
      out.write("            <optgroup>Ensino Secundario\n");
      out.write("               <option>Frequentando o secundario</option>\n");
      out.write("               <option>Secundario Concluido</option>\n");
      out.write("            </optgroup>\n");
      out.write("            <optgroup>Ensino Medio\n");
      out.write("                <option>Frequentando o Medio</option>\n");
      out.write("                <option>Medio Concluido</option>\n");
      out.write("            </optgroup>\n");
      out.write("            <optgroup>Ensino Superior\n");
      out.write("                <option>Frequencia Universitaria</option>\n");
      out.write("                <option>Baicharel</option>\n");
      out.write("                <option>Licenciado</option>\n");
      out.write("            </optgroup>   \n");
      out.write("        </select><br/>\n");
      out.write("       <label for=\"def\">Possui alguma deficiencia?</label><br/>\n");
      out.write("        <select id=\"def\"name=\"deficiencia\">\n");
      out.write("            <option>Sim</option>\n");
      out.write("            <option>Nao</option>\n");
      out.write("        </select>\n");
      out.write("       </div>  \n");
      out.write("      \n");
      out.write("     </div>\n");
      out.write("    </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"botao\">\n");
      out.write("            <input type=\"submit\" value=\"Cadastrar\" >\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
      out.write("            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                ");
        if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${msg}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }
}
