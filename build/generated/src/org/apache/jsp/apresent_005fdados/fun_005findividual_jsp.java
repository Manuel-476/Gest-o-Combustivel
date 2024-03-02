package org.apache.jsp.apresent_005fdados;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.sql.ResultSet;

public final class fun_005findividual_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      metodos_set_get.metodos_funcionario func = null;
      synchronized (_jspx_page_context) {
        func = (metodos_set_get.metodos_funcionario) _jspx_page_context.getAttribute("func", PageContext.PAGE_SCOPE);
        if (func == null){
          func = new metodos_set_get.metodos_funcionario();
          _jspx_page_context.setAttribute("func", func, PageContext.PAGE_SCOPE);
        }
      }
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
      out.write("        <link href=\"../estilo/fun.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"../estilo/formul.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            ArrayList <String> nac=new ArrayList();
            ArrayList <String> num=new ArrayList();
            
            func.setCpf(Integer.parseInt(request.getParameter("cpf")));
            func.setDepatamento(request.getParameter("dep"));
            func.setPosto(request.getParameter("posto"));
            
            ResultSet rs=ler.dados_fun_cpf(func);
            ResultSet nacio=ler.dados_nacio();
            ResultSet cpf_nacio=ler.nacioFun(func);
            ResultSet tel=ler.TelFun(func);
            ResultSet depart=ler.dados_depart();
            ResultSet posto=ler.dados_posto();
            
            while(cpf_nacio.next())
            {
                nac.add(cpf_nacio.getString("pais"));
            }
            
            while(tel.next())
            {
                num.add(tel.getString("numero"));
            }
            
            func.setNacionalidade(nac.get(0));
            if(nac.size()>1)
              func.setNacionalidadeAlt(nac.get(1));
            
            func.setTel(num.get(0));
            if(num.size()>1)
              func.setTelAlt(num.get(1));
            
            while(rs.next()){
        
      out.write("\n");
      out.write("    <a href=\"deletar_fun.jsp?cpf=");
      out.print(func.getCpf());
      out.write("\" class=\"eliminar\">Eliminar</a>\n");
      out.write("    <h2>");
      out.print(rs.getString("nome"));
      out.write("</h2>\n");
      out.write("    \n");
      out.write("    <div class=\"princ\">   \n");
      out.write("       <form action=\"alterar.jsp?cpf=");
      out.print(func.getCpf());
      out.write("&&nome=");
      out.print(rs.getString("nome"));
      out.write("&&depart=");
      out.print(func.getDepartamento());
      out.write("&&posto=");
      out.print(func.getPosto());
      out.write("\" method=\"post\"> \n");
      out.write("        \n");
      out.write("        <label for=\"data\">Data De Nascimento</label><br/>\n");
      out.write("           <input type=\"text\" id=\"data\" name=\"data\" value=\"");
      out.print(rs.getString("data_nasc"));
      out.write("\">\n");
      out.write("        <br/>\n");
      out.write("        \n");
      out.write("         <label for=\"civil\">Estado Civil</label><br/> \n");
      out.write("          <select id=\"civil\" name=\"est_civil\">\n");
      out.write("            <option selected>");
      out.print(rs.getString("est_civil"));
      out.write("</option>\n");
      out.write("            <option>Solteiro(a)</option>\n");
      out.write("            <option>Casado(a)</option>\n");
      out.write("            <option>Viuvo(a)</option>\n");
      out.write("            <option>Divorciado(a)</option>\n");
      out.write("          </select>\n");
      out.write("        <br/>\n");
      out.write("        \n");
      out.write("      <label for=\"gen\">Genero</label><br/>\n");
      out.write("       <select  id=\"gen\" name=\"genero\">\n");
      out.write("          <option selected>");
      out.print(rs.getString("genero") );
      out.write("</option>    \n");
      out.write("          <option>Masculino</option>\n");
      out.write("          <option>Feminino</option>\n");
      out.write("       </select>\n");
      out.write("       <br/> \n");
      out.write("       \n");
      out.write("        <label for=\"grau\">Grau Academico</label><br/>\n");
      out.write("         <select name=\"grau\" id=\"grau\" placeholder=\"Grau Academico\" >\n");
      out.write("             <option selected>");
      out.print(rs.getString("grau_academico") );
      out.write("</option>\n");
      out.write("             <optgroup>Ensino primario\n");
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
      out.write("            </optgroup> \n");
      out.write("            </select>\n");
      out.write("           <br/> \n");
      out.write("           \n");
      out.write("           <label for=\"funcao\">Funcao</label><br/> \n");
      out.write("          <select  id=\"funcao\" name=\"funcao\">\n");
      out.write("            <option selected>");
      out.print(rs.getString("funcao") );
      out.write("</option>    \n");
      out.write("             <option>Frentista</option>\n");
      out.write("             <option>Motorista</option>\n");
      out.write("          </select>\n");
      out.write("          <br/> \n");
      out.write("          \n");
      out.write("          <label for=\"def\">Possui Alguma Deficiencia?</label><br/>\n");
      out.write("            <select  id=\"def\" name=\"deficiencia\">\n");
      out.write("              <option selected>");
      out.print(rs.getString("genero") );
      out.write("</option>    \n");
      out.write("              <option>Sim</option>\n");
      out.write("             <option>Nao</option>\n");
      out.write("            </select>\n");
      out.write("           <br/> \n");
      out.write("       \n");
      out.write("         <label for=\"mae\">Nome Da Mae</label><br/>\n");
      out.write("           <input type=\"text\" id=\"mae\" value=\"");
      out.print(rs.getString("mae") );
      out.write("\" name=\"mae\">\n");
      out.write("         <br/> \n");
      out.write("         \n");
      out.write("         <label for=\"pai\">Nome Do Pai</label><br/> \n");
      out.write("           <input type=\"text\" id=\"pai\" value=\"");
      out.print(rs.getString("pai") );
      out.write("\" name=\"pai\">\n");
      out.write("         <br/>     \n");
      out.write("          ");
}
      out.write("\n");
      out.write("          \n");
      out.write("         <label for=\"depart\">Departamento</label><br/>\n");
      out.write("            <select  id=\"depart\" name=\"depart\">\n");
      out.write("              ");
while(depart.next()){
      out.write("\n");
      out.write("               <option>");
      out.print(depart.getString("nome"));
      out.write("</option>\n");
      out.write("              ");
}
      out.write("\n");
      out.write("           <option selected>");
      out.print(func.getDepartamento() );
      out.write("</option>    \n");
      out.write("            </select>\n");
      out.write("          <br/>\n");
      out.write("          \n");
      out.write("        <label for=\"posto\">Posto</label><br/>\n");
      out.write("         <select name=\"posto\" id=\"posto\">  \n");
      out.write("           ");
 while(posto.next()){ 
      out.write("\n");
      out.write("            <option>");
      out.print( posto.getString("nome"));
      out.write("</option>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("          <option selected>");
      out.print(func.getPosto());
      out.write("</option>    \n");
      out.write("        </select>\n");
      out.write("       <br/>\n");
      out.write("              \n");
      out.write("       <datalist id=\"lista\">\n");
      out.write("            ");
 while(nacio.next()){ 
      out.write("\n");
      out.write("            <option>\n");
      out.write("                ");
      out.print( nacio.getString("pais") );
      out.write("\n");
      out.write("            </option>\n");
      out.write("           ");
}
      out.write("\n");
      out.write("      </datalist> \n");
      out.write("      <label for=\"nacio\">Nacionalidade</label><br/>\n");
      out.write("          <input type=\"text\" list=\"lista\" id=\"nacio\" placeholder=\"Nacionalidade\" name=\"pais\" value=\"");
      out.print(func.getNacionalidade());
      out.write("\"/>\n");
      out.write("      <br/>\n");
      out.write("      \n");
      out.write("      <label for=\"nacioalt\">Outra Nacionalidade</label><br/>\n");
      out.write("          <input type=\"text\" id=\"nacioalt\" list=\"lista\" placeholder=\"Outra Nacionalidade\" name=\"paisalt\" value=\"");
      out.print(func.getNacionalidadeAlt());
      out.write("\"/>\n");
      out.write("      <br/> \n");
      out.write("      \n");
      out.write("     <label for=\"tel\">Telefone</label><br/>\n");
      out.write("          <input type=\"text\" id=\"tel\"  placeholder=\"Telefone\" name=\"tel\" value=\"");
      out.print(func.getTel() );
      out.write("\"/>\n");
      out.write("     <br/> \n");
      out.write("     \n");
      out.write("     <label for=\"telalt\">Telefone Alternativo</label><br/>\n");
      out.write("          <input type=\"text\" id=\"telalt\" placeholder=\"Telefone Alternativo\" name=\"telalt\" value=\"");
      out.print(func.getTelAlt());
      out.write("\"/>\n");
      out.write("     <br/>       \n");
      out.write("\n");
      out.write("    \n");
      out.write("        <div class=\"botao\"><input type=\"submit\" value=\"Salvar\"></div>\n");
      out.write("    </form> \n");
      out.write("      <div class=\"imagem_principal\">\n");
      out.write("    </div>\n");
      out.write("   </div>\n");
      out.write("   \n");
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
