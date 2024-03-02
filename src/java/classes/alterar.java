/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import metodos_set_get.metodos_equip;
import metodos_set_get.metodos_funcionario;
import metodos_set_get.metodos_posto;
import metodos_set_get.metodos_transporte;

/**
 *
 * @author DELL
 */
public class alterar extends cadastro{
     PreparedStatement stmt=null;
    Connection con;
     public alterar() throws ClassNotFoundException, SQLException
    {
        con=conectar();
    }
     
      public void AlterarFunc(metodos_funcionario obj) throws SQLException
    {
        PreparedStatement st=null;
        PreparedStatement stm=null;
        PreparedStatement stmts=null;
        
        obj.setNum_reg(Numregistro(obj.getPosto()));
        obj.setid_nacio(Idnacio(obj.getNacionalidade()));
        obj.setId_depart(Iddepart(obj.getDepartamento()));
        
        stmt=con.prepareStatement("update funcionario set"
                + " num_reg=?,nome=?,data_nasc=?,est_civil=?,"
                + "genero=?,grau_academico=?,funcao=?,mae=?,pai=?,deficiencia=? "
                + "where CPF=?");
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
        stmt.setInt(11, obj.getCpf());
        stmt.execute();
       
        
        st=con.prepareStatement("update nacio_func set id_nacio=? where id=?");
       
        st.setInt(1, obj.getid_nacio());
        st.setInt(2, minIdNacio(obj.getCpf()));
        st.execute();
        st.close();
        
        if(obj.getNacionalidadeAlt()!=""){
        obj.setid_nacioAlt(Idnacio(obj.getNacionalidadeAlt()));
        st=con.prepareStatement("update nacio_func set id_nacio=? where id=?");
         st.setInt(1, obj.getid_nacioAlt());
        st.setInt(2, maxIdNacioAlt(obj.getCpf()));
        st.execute();
        st.close();
        }
        
        st=con.prepareStatement("update fun_tel set numero=? where id=?");
        
        st.setString(1, obj.getTel());
        st.setInt(2, IdTel(obj.getCpf()));
        st.execute();
        st.close();
        
        if(obj.getTelAlt()!=""){
        obj.setid_nacioAlt(Idnacio(obj.getNacionalidadeAlt()));
        st=con.prepareStatement("update fun_tel set numero=? where id=?");
        st.setString(1, obj.getTelAlt());
        st.setInt(2, IdTelAlt(obj.getCpf()));
        st.execute();
        st.close();
        }
        
        stm=con.prepareStatement("update func_depart set num_depart=? where cpf=?");
        stm.setInt(1, obj.getCpf());
        stm.setInt(2, obj.getId_depart());
        stm.execute();
       
        stmts=con.prepareStatement("update func_posto set  num_reg=? where cpf=?");
        stmts.setInt(1, obj.getCpf());
        stmts.setInt(2, obj.getNum_reg());
        stmts.execute();
        
        stmt.close();
        st.close();
        stmts.close();
        stm.close();
        con.close();
    }
    
    public void AlterarPosto(metodos_posto obj) throws SQLException
    {
        PreparedStatement st=null;
        
       
        obj.setId_combus(Idcombus(obj.getCombustivel()));
        
        stmt=con.prepareStatement("update posto set"
                + " nome=?,endereco=?,data_inaug=?"
                + " where num_registro=?");
        stmt.setString(1, obj.getNome() );
        stmt.setString(2, obj.getEndereco());
        stmt.setString(3, obj.getData_inaug());
        stmt.setInt(4, obj.getId_posto());
     
        stmt.execute();
       
        
        stmt.close();
        con.close();
    }
    
    public void AlterarTransporte(metodos_transporte obj) throws SQLException
    {
        PreparedStatement st=null;
        
        obj.setId_categ(Idcategoria(obj.getCategoria()));
        
        stmt=con.prepareStatement("insert into transporte"
                + " placa,marca,modelo,categoria,data_c,deposito_vol)"
                + " values (?,?,?,?,?,?)");  
        stmt.setString(1, obj.getPlaca());
        stmt.setString(2, obj.getMarca());
        stmt.setString(3, obj.getModelo());
        stmt.setString(4, obj.getCategoria());
        stmt.setString(5, obj.getData());
        stmt.setString(6, obj.getDeposito_vol());      
        stmt.execute();
        
        obj.setId_depart(Iddepart(obj.getDepartamento()));
        st=con.prepareStatement("insert into trans_depart values (?,?)");
        st.setInt(1, obj.getId_trans());
        st.setInt(2, obj.getId_depart());
        st.execute();
        
        stmt.close();
        st.close();
        con.close();
    }
    
    public void AlterarNome(metodos_funcionario obj) throws SQLException
    {
        PreparedStatement st=null;
        
        
        stmt=con.prepareStatement("update funcionario"
                + " set nome=? where cpf=?");  
        stmt.setString(1, obj.getNome());
        stmt.setInt(2, obj.getCpf());
           
        stmt.execute();
           
        stmt.close();
        con.close();
    }

    public void AlterarEquip(metodos_equip obj) throws SQLException
    {
        PreparedStatement st=null;
        
        obj.setNum_reg(Numregistro(obj.getPosto()));
        
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
     
}
