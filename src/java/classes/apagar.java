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
import metodos_set_get.metodos_equip;
import metodos_set_get.metodos_funcionario;
import metodos_set_get.metodos_posto;
import metodos_set_get.metodos_transporte;

/**
 *
 * @author DELL
 */
public class apagar extends Conexao{
    Connection con;
    PreparedStatement stmt;
    
    public apagar() throws ClassNotFoundException, SQLException
    {
        con=conectar();
    }
    
    public void apagar_fun(metodos_funcionario obj) throws SQLException
    { 
       stmt=con.prepareStatement("delete from funcionario where cpf=?");
       stmt.setInt(1, obj.getCpf());
       stmt.execute();
    }
    
    public void apagar_equip(metodos_equip obj) throws SQLException
    { 
       stmt=con.prepareStatement("delete from equipamento where id_eq=?");
       stmt.setInt(1, obj.getId_eq());
       stmt.execute();
    }
    
    public void apagar_posto(metodos_posto obj) throws SQLException
    { 
       stmt=con.prepareStatement("delete from posto where num_registro=?");
       stmt.setInt(1, obj.getNum_reg());
       stmt.execute();
    }
    
    public void apagar_transporte(metodos_transporte obj) throws SQLException
    { 
       stmt=con.prepareStatement("delete from transporte where id_trans=?");
       stmt.setInt(1, obj.getId_trans());
       stmt.execute();
    }
      
}
