package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author yosh
 */
public class UpdateDAO<T> extends GenericDAO<T> {

    public UpdateDAO(Class<T> tipo) throws ClassNotFoundException {
        super(tipo, new ConexaoBanco().getConnection());
    }
    
    @Override
    protected String createQuery() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("UPDATE ");
        sb.append(tipo.getSimpleName());
        sb.append(" SET ?");
        sb.append(" WHERE ?");
        
        return sb.toString();
    }
    
    public void atualizarObjeto(String set, String where) {
        try (PreparedStatement stmt = conexao.prepareStatement(query)) {
            stmt.setString(1, set);
            stmt.setString(2, where);
            
            stmt.executeUpdate();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
