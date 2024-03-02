package classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import classes.cadastro;
import com.sun.tools.ws.wsdl.document.jaxws.Exception;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import metodos_set_get.metodos_funcionario;

/**
 *
 * @author DELL
 */
@WebServlet(urlPatterns = {"/cadastrar"})
@MultipartConfig(fileSizeThreshold=1024*1024*10, 	// 10 MB 
                 maxFileSize=1024*1024*50,      	// 50 MB
                 maxRequestSize=1024*1024*100) 
public class cadastrar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      //  response.setContentType("text/html;charset=UTF-8");
     
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
         String msg="Arquivo Enviando";
        cadastro cadastro;
        try {
        cadastro = new cadastro();
        
        metodos_funcionario func=new metodos_funcionario();
        
       
        String path=getServletContext().getRealPath("/imagem");
       
       Part part=request.getPart("file");
       
           if(part.getName().equals("files")){
               part.write(path+File.separator+part.getSubmittedFileName());
               System.out.println(path+File.separator+part.getSubmittedFileName());
               }
           
     
       
       
   func.setNome(request.getParameter("nome"));
   func.setData_nasc(request.getParameter("data"));
   func.setTel(request.getParameter("tel"));
   func.setNacionalidade(request.getParameter("pais"));
   func.setDepatamento(request.getParameter("depart"));
   func.setEst_civil(request.getParameter("est_civil"));
   func.setGenero(request.getParameter("genero"));
   func.setGrau_acad(request.getParameter("grau"));
   func.setPosto(request.getParameter("posto") );
   
  
   cadastro.CadastrarFunc(func);
   
   } 
        catch (ClassNotFoundException | SQLException ex) {
            msg="Erro no Envio";
            Logger.getLogger(cadastrar.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getMessage());
        }
        request.setAttribute("msg", msg);
   response.sendRedirect("cadastrar_fun.jsp");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
