/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author yosh
 */
public class ConexaoBanco {
     
    public Connection getConnection() throws ClassNotFoundException{

        try{
            Class.forName("com.mysql.jdbc.Driver");           
            return DriverManager.getConnection("jdbc:mysql://localhost/bar_restaurante?zeroDateTimeBehavior=convertToNull", "root", "3bjmf82,");
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

}
