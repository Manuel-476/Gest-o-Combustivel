package classes;





import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import metodos_set_get.Metodos_Login;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class verificacao extends Conexao{
    Connection con;
    Metodos_Login met;
  
    
 public verificacao() throws SQLException, ClassNotFoundException
    {
         met = new Metodos_Login();
         con=conectar();
    }
    
    public ResultSet verificar_registros (PreparedStatement stmt) throws SQLException
    {
        ResultSet rs=stmt.executeQuery();
        return rs;
    }
    
    public int Verificar_login(Metodos_Login met) throws SQLException
    {
        PreparedStatement stmt=con.prepareStatement("select * from login where email=? and senha=?");
        stmt.setString(1,met.getEmail());
        stmt.setString(2, met.getSenha());
        ResultSet rs=verificar_registros(stmt);
        while(rs.next()){
        if(rs.getString("email").compareTo(met.getEmail())==0)
            return 1;
        }
        return 0;         
    }
    
}
