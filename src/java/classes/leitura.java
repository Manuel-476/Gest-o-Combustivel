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
import metodos_set_get.metodos_funcionario;
import metodos_set_get.metodos_transporte;

/**
 *
 * @author DELL
 */
public class leitura extends Conexao{
    Connection con;
    PreparedStatement stmt;
    public leitura() throws ClassNotFoundException, SQLException
    {
        con=conectar();
    }
    
    public ResultSet dados_fun_cpf(metodos_funcionario obj) throws SQLException
    {  ResultSet rs;
       stmt=con.prepareStatement("select * from funcionario where cpf=?");
       stmt.setInt(1, obj.getCpf()); 
       rs=stmt.executeQuery();
         
       return rs;
    }
 
    
    public ResultSet dados_nacio() throws SQLException
    {  ResultSet rs;
       stmt=con.prepareStatement("select * from nacionalidade order by pais");
      
       rs=stmt.executeQuery();
         
       return rs;
    }
    
    public ResultSet dados_categoria() throws SQLException
    {  ResultSet rs;
       stmt=con.prepareStatement("select * from categoria order by nome");
      
       rs=stmt.executeQuery();
         
       return rs;
    }
    
    public ResultSet nacioFun(metodos_funcionario obj) throws SQLException
    {  ResultSet rs;
       stmt=con.prepareStatement("select nac.pais \"pais\" from funcionario as fun join nacio_func as nf on(fun.cpf=nf.cpf)  \n" +
                                 "join nacionalidade as nac on(nac.id_nacio=nf.id_nacio) where fun.cpf=?;");
       stmt.setInt(1, obj.getCpf());
       rs=stmt.executeQuery();
         
       return rs;
    }
     
    public ResultSet TelFun(metodos_funcionario obj) throws SQLException
    {  ResultSet rs;
       stmt=con.prepareStatement("select numero from fun_tel as tel join funcionario as fun on (fun.CPF=tel.cpf) where fun.cpf=?;");
       stmt.setInt(1, obj.getCpf());
       rs=stmt.executeQuery();
         
       return rs;
    }
    
    public ResultSet dados_fun_normal() throws SQLException
    {  ResultSet rs;
       stmt=con.prepareStatement("select * from funcionario");
      
       rs=stmt.executeQuery();
         
       return rs;
    }
    
    public ResultSet dados_Abast() throws SQLException
    {  ResultSet rs;
       stmt=con.prepareStatement("select a.id_abast,a.Qtd_litro,a.data_hora,f.Nome,fr.Nome \"frentista\",c.tipo,tr.marca,tr.placa from abastecimento as a join trans_posto_fun as t on(t.id_abast=a.id_abast)\n" +
           "join funcionario as f on (f.CPF=t.cpf) join posto as p on (p.num_registro=t.num_registro) \n" +
           "join transporte as tr on (tr.id_trans=t.id_trans ) \n" +
           "join combustivel as c on (c.id_combus=a.id_combust) join funcionario as fr on (fr.CPF=t.cpf_ent);");
      
       rs=stmt.executeQuery();
         
       return rs;
    }
    
    public ResultSet dados_Abasttanq(int id) throws SQLException
    {  ResultSet rs;
       stmt=con.prepareStatement("select t.id_abast,tr.nome_c,c.tipo,a.Qtd_litro,p.nome as posto,f.Nome,a.data_hora,tr.marca from abastecimento as a join tanq_posto_abast as t on(t.id_abast=a.id_abast)\n" +
        " join funcionario as f on (f.CPF=t.id_fun) join posto as p on (p.num_registro=t.num_registro)\n" +
        " join camiao_tanq as tr on (tr.id_cam=t.id_cam ) join combustivel as c on (c.id_combus=a.id_combust) where id_tanq=?;");
       stmt.setInt(1, id);
       rs=stmt.executeQuery();
         
       return rs;
    }
     
    public ResultSet dados_IdAbast(int id) throws SQLException
    {  ResultSet rs;
       stmt=con.prepareStatement("select * from abastecimento as a join trans_posto_fun as t on(t.id_abast=a.id_abast)\n" +
                                 "join funcionario as f on (f.CPF=t.cpf) join posto as p on (p.num_registro=t.num_registro)"
                               + " join transporte as tr on (tr.id_trans=t.id_trans ) join combustivel as c on (c.id_combus=a.id_combust )"
                             + " where a.id_abast=?");
      stmt.setInt(1, id);
       rs=stmt.executeQuery();
         
       return rs;
    }
    
    public ResultSet dados_IdAbasttanq(int id) throws SQLException
    {  ResultSet rs;
       stmt=con.prepareStatement("select * from abastecimento as a join tanq_posto_abast as t on(t.id_abast=a.id_abast)\n" +
                                 "join funcionario as f on (f.CPF=t.id_fun) join posto as p on (p.num_registro=t.num_registro) "
                               + " join camiao_tanq as tr on (tr.id_cam=t.id_cam ) join combustivel as c on (c.id_combus=a.id_combust )"
                             + " where a.id_abast=?");
      stmt.setInt(1, id);
       rs=stmt.executeQuery();
         
       return rs;
    }
    
    public ResultSet dados_IdPostoTanq(int id) throws SQLException
    {  ResultSet rs;
       stmt=con.prepareStatement("select tanque.id_tanq,tanque.nome,c.tipo from posto join tanq_posto as t on(posto.num_registro=t.num_registro)\n" +
                                 "join tanque on(t.id_tanq=tanque.id_tanq)  "
                               + "join  combustivel as c on (tanque.id_combus=c.id_combus) where posto.num_registro=?;");
      stmt.setInt(1, id);
       rs=stmt.executeQuery();
         
       return rs;
    }
     
    public ResultSet dados_fun() throws SQLException
    {  ResultSet rs;
       stmt=con.prepareStatement("select fun.cpf \"CPF\",fun.nome \"Funcionario\",fun.data_nasc \"Data_Nascim\",fun.est_civil \"Est_civil\",\n" +
" fun.genero\"genero\",fun.Grau_academico \"grau\", dep.nome \"departamento\",\n" +
"post.nome \"Posto\",fun.funcao \"Funcao\",fun.pai \"pai\",fun.mae \"mae\" \n" +
"from posto as post join funcionario as fun on (fun.num_reg=post.num_registro)\n" +
"join func_depart as f on (f.cpf=fun.cpf) join  departamento as dep on (dep.num_depart=f.num_depart);");
      
       rs=stmt.executeQuery();
         
       return rs;
    }
    public ResultSet dados_fun_pesq(String info) throws SQLException
    {  ResultSet rs;
       stmt=con.prepareStatement("select fun.cpf \"CPF\",fun.nome \"Funcionario\",fun.data_nasc \"Data_Nascim\",fun.est_civil \"Est_civil\",\n" +
" fun.genero\"genero\",fun.Grau_academico \"grau\", dep.nome \"departamento\",\n" +
"post.nome \"Posto\",fun.funcao \"Funcao\",fun.pai \"pai\",fun.mae \"mae\" \n" +
"from posto as post join funcionario as fun on (fun.num_reg=post.num_registro)\n" +
"join func_depart as f on (f.cpf=fun.cpf) join  departamento as dep on (dep.num_depart=f.num_depart)\n" +
"where fun.nome like ? or fun.cpf=? or dep.nome like ? or post.nome like ? or fun.funcao like ?;");
       stmt.setString(1, "%"+info+"%");
       stmt.setString(2, info);
       stmt.setString(3, "%"+info+"%");
       stmt.setString(4, "%"+info+"%");
       stmt.setString(5, "%"+info+"%");
       rs=stmt.executeQuery();
         
       return rs;
    }
    
    public ResultSet dados_combus() throws SQLException
    {  ResultSet rs;
       stmt=con.prepareStatement("select * from combustivel");
      
       rs=stmt.executeQuery();
         
       return rs;
    }
      
    public ResultSet dados_posto() throws SQLException
    {  ResultSet rs;
       stmt=con.prepareStatement("select * from posto");
      
       rs=stmt.executeQuery();
         
       return rs;
    }
    
    public ResultSet dados_postoId(int id) throws SQLException
    {  ResultSet rs;
       stmt=con.prepareStatement("select * from posto where num_registro=?");
       stmt.setInt(1, id);
      
       rs=stmt.executeQuery();
         
       return rs;
    }
    
    public ResultSet dados_camiao() throws SQLException
    {  ResultSet rs;
       stmt=con.prepareStatement("select * from camiao_tanq");
      
       rs=stmt.executeQuery();
         
       return rs;
    } 
    
    public ResultSet dados_tanque() throws SQLException
    {  ResultSet rs;
       stmt=con.prepareStatement("select * from tanque");
      
       rs=stmt.executeQuery();
         
       return rs;
    }
    
    public ResultSet dados_transporte() throws SQLException
    {  ResultSet rs;
       stmt=con.prepareStatement("select * from transporte");
      
       rs=stmt.executeQuery();
         
       return rs;
    }
    
    public ResultSet dados_trans_id(metodos_transporte obj) throws SQLException
    {  ResultSet rs;
       stmt=con.prepareStatement("select * from transporte where id_trans=?");
       stmt.setInt(1, obj.getId_trans()); 
       rs=stmt.executeQuery();
         
       return rs;
    }
    
    public ResultSet dados_equip() throws SQLException
    {  ResultSet rs;
       stmt=con.prepareStatement("select * from equipamento");
       
       rs=stmt.executeQuery();
         
       return rs;
    }
    
    public ResultSet dados_depart() throws SQLException
    {  ResultSet rs;
       stmt=con.prepareStatement("select * from departamento");
       
       rs=stmt.executeQuery();
         
       return rs;
    }
    
    public ResultSet dados_funcao() throws SQLException
    {  ResultSet rs;
       stmt=con.prepareStatement("select * from funcao");
       
       rs=stmt.executeQuery();
         
       return rs;
    }
    
     public ResultSet dados_Equip(int id) throws SQLException
    {  ResultSet rs;
       stmt=con.prepareStatement("select e.id_eq,e.nome,e.qtd from equipamento as e join eq_posto as ep on(e.id_eq=ep.id_eq ) where ep.num_registro=?");
       stmt.setInt(1, id);
       rs=stmt.executeQuery();
         
       return rs;
    }
}
