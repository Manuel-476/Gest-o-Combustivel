package org.apache.jsp.cadastro;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cad_005ffun_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      metodos_set_get.metodos_funcionario func = null;
      synchronized (_jspx_page_context) {
        func = (metodos_set_get.metodos_funcionario) _jspx_page_context.getAttribute("func", PageContext.PAGE_SCOPE);
        if (func == null){
          func = new metodos_set_get.metodos_funcionario();
          _jspx_page_context.setAttribute("func", func, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');
      classes.cadastro cadastro = null;
      synchronized (_jspx_page_context) {
        cadastro = (classes.cadastro) _jspx_page_context.getAttribute("cadastro", PageContext.PAGE_SCOPE);
        if (cadastro == null){
          cadastro = new classes.cadastro();
          _jspx_page_context.setAttribute("cadastro", cadastro, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write(" ");

   func.setNome(request.getParameter("nome"));
   func.setData_nasc(request.getParameter("data"));
   func.setTel(request.getParameter("tel"));
   func.setTelAlt(request.getParameter("telalt"));
   func.setNacionalidade(request.getParameter("pais"));
   func.setNacionalidadeAlt(request.getParameter("paisalt"));
   func.setDepatamento(request.getParameter("depart"));
   func.setEst_civil(request.getParameter("est_civil"));
   func.setGenero(request.getParameter("genero"));
   func.setGrau_acad(request.getParameter("grau"));
   func.setPosto(request.getParameter("posto"));
   func.setDeficiencia(request.getParameter("deficiencia"));
   func.setMae(request.getParameter("mae"));
   func.setPai(request.getParameter("pai"));
   func.setFuncao(request.getParameter("funcao"));
   
  
   cadastro.CadastrarFunc(func);
  
   response.sendRedirect("cadastrar_fun.jsp");
 
      out.write("\n");
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
