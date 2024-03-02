package Servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import classes.leitura;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
@WebServlet(urlPatterns = {"/relatorioabast"})
public class relatorioabast extends HttpServlet {

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
        processRequest(request, response);
        Document doc=new Document();
        try
        {
            leitura le=new leitura();
            
            response.setContentType("apllication/pdf");
            response.addHeader("Content-Disposition", "inline; filename="+"Relatorio de Abastecimento.pdf");
            
            PdfWriter.getInstance(doc, response.getOutputStream());
            
            doc.open();
             
        
       
        ResultSet lista=le.dados_IdAbast(Integer.parseInt(request.getParameter("id_abast")));
        doc.add(new Paragraph("                 Relatorio de Abastecimento"));
        doc.add(new Paragraph(" "));
        while(lista.next()) {
       
      doc.add(new Paragraph("Abastecimento"));
      doc.add(new Paragraph("Condutor: "+lista.getString("nome")));           
      doc.add(new Paragraph("Qtd: "+lista.getString("Qtd_litro")));       
      doc.add(new Paragraph("Tipo Combustivel: "+lista.getString("tipo")));        
      doc.add(new Paragraph(" "));        
      doc.add(new Paragraph("Categoria: "+lista.getString("categoria")));        
      doc.add(new Paragraph("Marca: "+lista.getString("marca")));
      doc.add(new Paragraph("Placa: "+lista.getString("placa")));
      doc.add(new Paragraph("Modelo: "+lista.getString("modelo")));
      
      doc.add(new Paragraph("Outros"));
      doc.add(new Paragraph("Data e Hora: "+lista.getString("data_hora")));
      doc.add(new Paragraph("Deposito Cheio: "+lista.getString("cheio")));        
     
      
       
                  
            
        }
        doc.close();   
    }   catch (ClassNotFoundException ex) {
            Logger.getLogger(relatorioabast.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(relatorioabast.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(relatorioabast.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        processRequest(request, response);
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
