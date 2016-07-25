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
            
            return DriverManager.getConnection("jdbc:mysql://85.10.205.173/agenda_conta", "dtsyosh", "3bjmf82");
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}