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
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            
            return DriverManager.getConnection("jdbc:derby://localhost/agenda_conta", "dtsyosh", "3bjmf82,");
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}