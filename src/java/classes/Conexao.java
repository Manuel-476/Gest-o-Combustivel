package classes;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
abstract class Conexao {
   private String url="jdbc:mysql://localhost:3306/gestao_combustivel?zeroDateTimeBehavior=convertToNull";
   private String user="root";
   private String password="";
    
    public Connection conectar() throws SQLException, ClassNotFoundException
    {   Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, user, password);
        return con;
    }
    
}
