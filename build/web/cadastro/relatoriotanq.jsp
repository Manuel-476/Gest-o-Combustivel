<%-- 
    Document   : relatoriotanq
    Created on : 24/out/2022, 22:39:15
    Author     : DELL
--%>

<%@page import="com.itextpdf.text.pdf.PdfPTable"%>
<%@page import="com.itextpdf.text.pdf.PdfPCell"%>
<%@page import="com.itextpdf.text.Element"%>
<%@page import="com.itextpdf.text.Paragraph"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.itextpdf.text.pdf.PdfWriter"%>
<%@page import="classes.leitura"%>
<%@page import="com.itextpdf.text.Document"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%
       Document doc=new Document();
       
            leitura le=new leitura();
            
            response.setContentType("apllication/pdf");
            response.addHeader("Content-Disposition", "inline; filename="+"Relatorio de Abast_Tanq.pdf");
            
            PdfWriter.getInstance(doc, response.getOutputStream());
            
            doc.open();
             
        
       
        ResultSet lista=le.dados_IdAbasttanq(Integer.parseInt(request.getParameter("id_abas")));
        Paragraph tit=new Paragraph("Relatorio de Abastecimento de tanque");
        tit.setAlignment(Element.ALIGN_CENTER);
       ;
        
       
        doc.add(tit);
        doc.add(new Paragraph(" "));
        
        PdfPTable tab=new PdfPTable(2);
       
        while(lista.next()) {
        PdfPCell col=new PdfPCell();
        PdfPCell col1=new PdfPCell();
        col.setPadding(10);
        col1.setPadding(10);
        
        tab.addCell(col);
        tab.addCell(col1);
        
       
        Paragraph tem=new Paragraph("Nome do Posto: "+lista.getString("nome"));
        tem.setAlignment(Element.ALIGN_CENTER);
        doc.add(tem);
       
        
        
        doc.add(new Paragraph(" "));
      
     tab.addCell("Qtd: "); 
     tab.addCell(lista.getString("Qtd_litro")); 
     
      tab.addCell("Condutor: ");
      tab.addCell(lista.getString("Nome"));  
     
             
       tab.addCell(new Paragraph("Tipo Combustivel: "));
       tab.addCell(lista.getString("tipo"));
             
              
      tab.addCell(new Paragraph("Camiao: "));
      tab.addCell(lista.getString("nome_c"));
       
      tab.addCell("Marca: "); 
      tab.addCell(lista.getString("marca")); 
      
      tab.addCell("Data e Hora: "); 
      tab.addCell(lista.getString("data_hora")); 
    
      tab.addCell("Deposito Cheio: "); 
      tab.addCell(lista.getString("cheio")); 
             
       doc.add(tab);
       
                  
            
        }
        doc.close();   
  
  %>
</html>
