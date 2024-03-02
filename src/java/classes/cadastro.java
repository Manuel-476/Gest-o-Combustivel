/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import metodos_set_get.Metodos_abastecimento;
import metodos_set_get.metodos_equip;
import metodos_set_get.metodos_funcionario;
import metodos_set_get.metodos_posto;
import metodos_set_get.metodos_transporte;

/**
 *
 * @author DELL
 */
public class cadastro extends Conexao{
    PreparedStatement stmt=null;
    Connection con;
     public cadastro() throws ClassNotFoundException, SQLException
    {
        con=conectar();
    }
     
    protected int Idnacio(String obj) throws SQLException
    {
       ResultSet rs;
       int id=0;
       
       stmt=con.prepareStatement("select * from nacionalidade where pais=?");
       stmt.setString(1, obj); 
       rs=stmt.executeQuery();
       
       while(rs.next())
           id=rs.getInt("id_nacio");
       
       return id;
    }
    
    protected int Idfuncio(String obj) throws SQLException
    {
       ResultSet rs;
       int id=0;
       
       stmt=con.prepareStatement("select * from funcionario where Nome=?");
       stmt.setString(1, obj); 
       rs=stmt.executeQuery();
       
       while(rs.next())
           id=rs.getInt("CPF");
       
       return id;
    }
   
    
    protected int Numregistro(String obj) throws SQLException
    {
       ResultSet rs;
       int id=0;
       
       stmt=con.prepareStatement("select * from posto where nome=?");
       stmt.setString(1, obj); 
       rs=stmt.executeQuery();
       
       while(rs.next())
           id=rs.getInt("num_registro");
       
       return id;
    }
    
    protected void Cadtel(metodos_funcionario obj) throws SQLException
    { 
       stmt=con.prepareStatement("insert into fun_tel (cpf,numero) values (?,?)");
       stmt.setInt(1, obj.getCpf());
       stmt.setString(2, obj.getTel());
       stmt.execute();   
    }
    
     protected void CadtelAlt(metodos_funcionario obj) throws SQLException
    { 
       stmt=con.prepareStatement("insert into fun_tel (cpf,numero) values (?,?)");
       stmt.setInt(1, obj.getCpf());
       stmt.setString(2, obj.getTelAlt());
       stmt.execute();   
    }
    protected int IdTel(int obj) throws SQLException
    {
       ResultSet rs;
       int id=0;
       
       stmt=con.prepareStatement("select min(id) as id from fun_tel where cpf=?");
       stmt.setInt(1, obj); 
       rs=stmt.executeQuery();
       
       while(rs.next())
           id=rs.getInt("id");
       
       return id;
    }
    
    protected int IdTelAlt(int obj) throws SQLException
    {
       ResultSet rs;
       int id=0;
       
       stmt=con.prepareStatement("select max(id) as id from fun_tel where cpf=?");
       stmt.setInt(1, obj); 
       rs=stmt.executeQuery();
       
       while(rs.next())
           id=rs.getInt("id");
       
       return id;
    }
    
    protected int minIdNacio(int obj) throws SQLException
    {
       ResultSet rs;
       int id=0;
       
       stmt=con.prepareStatement("select min(id) as id from nacio_func where cpf=?");
       stmt.setInt(1, obj); 
       rs=stmt.executeQuery();
       
       while(rs.next())
           id=rs.getInt("id");
       
       return id;
    }
    
    protected int maxIdNacioAlt(int obj) throws SQLException
    {
       ResultSet rs;
       int id=0;
       
       stmt=con.prepareStatement("select max(id) as id from nacio_func where cpf=?");
       stmt.setInt(1, obj); 
       rs=stmt.executeQuery();
       
       while(rs.next())
           id=rs.getInt("id");
       
       return id;
    }
     
    protected int IdAbast() throws SQLException
    {
       ResultSet rs;
       int id=0;
       
       stmt=con.prepareStatement("select max(id_abast) as id from abastecimento ");
      
       rs=stmt.executeQuery();
       
       while(rs.next())
           id=rs.getInt("id");
       
       return id;
    }
    protected int Iddepart(String obj) throws SQLException
    {
       ResultSet rs;
       int id=0;
       
       stmt=con.prepareStatement("select * from departamento where nome=?");
       stmt.setString(1, obj); 
       rs=stmt.executeQuery();
       
       while(rs.next())
           id=rs.getInt("num_depart");
       
       return id;
    }
    
    protected int Idcategoria(String obj) throws SQLException
    {
       ResultSet rs;
       int id=0;
       
       stmt=con.prepareStatement("select * from categoria where nome=?");
       stmt.setString(1, obj); 
       rs=stmt.executeQuery();
       
       while(rs.next())
           id=rs.getInt("id_categoria");
       
       return id;
    }
    
    protected int Idcombus(String obj) throws SQLException
    {
       ResultSet rs;
       int id=0;
       
       stmt=con.prepareStatement("select * from combustivel where tipo=?");
       stmt.setString(1, obj); 
       rs=stmt.executeQuery();
       
       while(rs.next())
           id=rs.getInt("id_combus");
       
       return id;
    }
    
    protected int Idtanq(String obj) throws SQLException
    {
       ResultSet rs;
       int id=0;
       
       stmt=con.prepareStatement("select * from tanque where nome=?");
       stmt.setString(1, obj); 
       rs=stmt.executeQuery();
       
       while(rs.next())
           id=rs.getInt("id_tanq");
       
       return id;
    }
    
    protected int MaxIdtanq() throws SQLException
    {
       ResultSet rs;
       int id=0;
       
       stmt=con.prepareStatement("select max(id_tanq) as id_tanq from tanque");
       
       rs=stmt.executeQuery();
       
       while(rs.next())
           id=rs.getInt("id_tanq");
       
       return id;
    }
    
    protected int Idtrans(String obj) throws SQLException
    {
       ResultSet rs;
       int id=0;
       
       stmt=con.prepareStatement("select * from transporte where placa=?");
       stmt.setString(1, obj); 
       rs=stmt.executeQuery();
       
       while(rs.next())
           id=rs.getInt("id_trans");
       
       return id;
    }
    
    protected int Idcam(String obj) throws SQLException
    {
       ResultSet rs;
       int id=0;
       
       stmt=con.prepareStatement("select * from camiao_tanq where nome_c=?");
       stmt.setString(1, obj); 
       rs=stmt.executeQuery();
       
       while(rs.next())
           id=rs.getInt("id_cam");
       
       return id;
    }
    
      protected int Cpffun(String obj) throws SQLException
    {
       ResultSet rs;
       int id=0;
       
       stmt=con.prepareStatement("select max(cpf) as cpf from funcionario where nome=?");
       stmt.setString(1, obj); 
       rs=stmt.executeQuery();
       
       while(rs.next())
           id=rs.getInt("cpf");
       
       return id;
    }
     
    public void CadastrarFunc(metodos_funcionario obj) throws SQLException
    {
        PreparedStatement st=null;
        PreparedStatement stm=null;
        PreparedStatement stmts=null;
        
        obj.setNum_reg(Numregistro(obj.getPosto()));
        obj.setid_nacio(Idnacio(obj.getNacionalidade()));
        obj.setId_depart(Iddepart(obj.getDepartamento()));
        
        stmt=con.prepareStatement("insert into funcionario"
                + " (num_reg,nome,data_nasc,est_civil,genero,grau_academico,funcao,mae,pai,deficiencia)"
                + " values (?,?,?,?,?,?,?,?,?,?)");
        stmt.setInt(1, obj.getNum_reg());
        stmt.setString(2, obj.getNome());
        stmt.setString(3, obj.getData_nasc());
        stmt.setString(4, obj.getEst_civil());
        stmt.setString(5, obj.getGenero());
        stmt.setString(6, obj.getGrau_acad());
        stmt.setString(7, obj.getFuncao());
        stmt.setString(8, obj.getMae());
        stmt.setString(9, obj.getPai());
        stmt.setString(10, obj.getDeficiencia());
        stmt.execute();
        obj.setCpf(Cpffun(obj.getNome()));
        st=con.prepareStatement("insert into nacio_func (cpf,id_nacio) values (?,?)");
        st.setInt(1, obj.getCpf());
        st.setInt(2, obj.getid_nacio());
        st.execute();
        st.close();
        
        if(obj.getNacionalidadeAlt()!=""){
        obj.setid_nacio(Idnacio(obj.getNacionalidadeAlt()));
        st=con.prepareStatement("insert into nacio_func (cpf,id_nacio) values (?,?)");
        st.setInt(1, obj.getCpf());
        st.setInt(2, obj.getid_nacio());
        st.execute();
        st.close();
        }
        
        Cadtel(obj);
        if(obj.getTelAlt()!="")
            CadtelAlt(obj);
        
        stm=con.prepareStatement("insert into func_depart values (?,?)");
        stm.setInt(1, obj.getCpf());
        stm.setInt(2, obj.getId_depart());
        stm.execute();
       
        stmts=con.prepareStatement("insert into func_posto values (?,?)");
        stmts.setInt(1, obj.getCpf());
        stmts.setInt(2, obj.getNum_reg());
        stmts.execute();
        
        stmt.close();
        
        stmts.close();
        stm.close();
        con.close();
    }
    
    public void CadastrarPosto(metodos_posto obj) throws SQLException
    {
        PreparedStatement st=null;
        
       
        obj.setId_combus(Idcombus(obj.getCombustivel()));
        
        stmt=con.prepareStatement("insert into posto"
                + " (nome,endereco,data_inaug,id_combus)"
                + " values (?,?,?,?)");
        stmt.setString(1, obj.getNome() );
        stmt.setString(2, obj.getEndereco());
        stmt.setString(3, obj.getData_inaug());
        stmt.setInt(4, obj.getId_combus());
        stmt.execute();
        
        obj.setNum_reg(Numregistro(obj.getNome()));
        obj.setIdtanq(Idtanq(obj.getTanque()));
        st=con.prepareStatement("insert into tanq_posto values (?,?)");
        st.setInt(1, obj.getIdtanq());
        st.setInt(2, obj.getNum_reg());
        st.execute();
        
        stmt.close();
        st.close();
        con.close();
    }
    
    public void CadastratTransporte(metodos_transporte obj) throws SQLException
    {
        PreparedStatement st=null;
        
        
        
        stmt=con.prepareStatement("insert into transporte"
                + " (placa,marca,modelo,categoria,data_c,deposito_vol)"
                + " values (?,?,?,?,?,?)");  
        stmt.setString(1, obj.getPlaca());
        stmt.setString(2, obj.getMarca());
        stmt.setString(3, obj.getModelo());
        stmt.setString(4, obj.getCategoria());
        stmt.setString(5, obj.getData());
        stmt.setString(6, obj.getDeposito_vol());      
        stmt.execute();
        obj.setId_trans(Idtrans(obj.getPlaca()));
        obj.setId_depart(Iddepart(obj.getDepartamento()));
        st=con.prepareStatement("insert into trans_depart values (?,?)");
        st.setInt(1, obj.getId_trans());
        st.setInt(2, obj.getId_depart());
        st.execute();
        
        stmt.close();
        st.close();
        con.close();
    }
    
    public void CadastratCamiao(metodos_transporte obj) throws SQLException
    {

        stmt=con.prepareStatement("insert into camiao_tanq"
                + " (volume,nome_c,marca,data_c)"
                + " values (?,?,?,?)");  
        stmt.setString(1, obj.getDeposito_vol());
        stmt.setString(2, obj.getNome());
        stmt.setString(3, obj.getMarca());
        stmt.setString(4, obj.getData());
        
        stmt.execute();
       
        stmt.close();
       
        con.close();
    }

    public void CadastratEquip(metodos_equip obj) throws SQLException
    {
        PreparedStatement st=null;
        PreparedStatement stmt=null;
        
        
       
        
        stmt=con.prepareStatement("insert into equipamento"
                + " (nome,qtd)"
                + " values (?,?)");  
        stmt.setString(1, obj.getNome());
        stmt.setInt(2, obj.getQtd());
         
        stmt.execute();
        
        
        st=con.prepareStatement("insert into eq_posto values "
                + "(?,(select max(id_eq) from equipamento))");
        st.setInt(1, obj.getNum_reg());
        
        st.execute();
        
        stmt.close();
        st.close();
        con.close();
    }       
    
    public void CadastratAbast(Metodos_abastecimento obj) throws SQLException
       {
        PreparedStatement st=null;
        PreparedStatement stm=null;
        st=con.prepareStatement("insert into trans_posto_fun values "
                + "(?,?,?,?,?,?)");
        st.setInt(1, Idtrans(obj.getPlaca()));
        st.setInt(2, obj.getId_posto());
        st.setInt(3, Idtanq(obj.getTanque()));
        st.setInt(4, Idfuncio(obj.getNome_fun()));
        st.setInt(5, Idfuncio(obj.getNome_fren()));
        st.setInt(6, IdAbast()+1);
         st.execute();
        stm=con.prepareStatement("insert into abastecimento"
                + " (Qtd_litro,data_hora,cheio,id_combust)"
                + " values (?,?,?,?)");  
        stm.setString(1, obj.getQtd());
        stm.setString(2, obj.getData_hora());
        stm.setString(3, obj.getCheio());
        stm.setInt(4, Idcombus(obj.getCombustivel())); 
        stm.execute();
        
       
        
        stm.close();
        st.close();
        con.close();
    }      
       
    public void CadastratAbastTanq(Metodos_abastecimento obj) throws SQLException
       {
        PreparedStatement st=null;
        PreparedStatement stm=null;
         st=con.prepareStatement("insert into tanq_posto_abast values "
                + "(?,?,?,?,?)");
        st.setInt(1, Idcam(obj.getPlaca()));
        st.setInt(2, obj.getId_posto());
        st.setInt(3, Idfuncio(obj.getNome_fun()));
        st.setInt(4, IdAbast()+1);
        st.setInt(5, obj.getId_tanq());
        
        st.execute();
       
        stm=con.prepareStatement("insert into abastecimento"
                + " (Qtd_litro,data_hora,cheio,id_combust)"
                + " values (?,?,?,?)");  
        stm.setString(1, obj.getQtd());
        stm.setString(2, obj.getData_hora());
        stm.setString(3, obj.getCheio());
        stm.setInt(4, Idcombus(obj.getCombustivel())); 
        stm.execute();
        
        stm.close();
        st.close();
        con.close();
    }      
    
    public void CadTanq(metodos_posto obj) throws SQLException
    { 
       PreparedStatement st=null;
       PreparedStatement sts=null;
        
       sts=con.prepareStatement("insert into tanque (nome,volume,id_combus) values (?,?,?)");
       sts.setString(1, obj.getTanque());
       sts.setString(2, obj.getVolume());
       sts.setInt(3, Idcombus(obj.getCombustivel()));
       sts.execute(); 
         
       st=con.prepareStatement("insert into tanq_posto values (?,?)");
       st.setInt(1, MaxIdtanq());
       st.setInt(2, obj.getId_posto());
       st.execute();
       
       st.close();
       sts.close();
    }
    
      
}
