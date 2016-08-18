package dao;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author yosh
 * @param <T>
 */
public class DeleteDAO<T> extends GenericDAO<T> {
    
    public DeleteDAO(Class<T> tipo) throws ClassNotFoundException {
        super(tipo, new ConexaoBanco().getConnection());
    }

    @Override
    protected String createQuery() {
        StringBuilder sb = new StringBuilder();
        
        Field campo = tipo.getDeclaredFields()[0];
        
        sb.append("DELETE FROM ");
        sb.append(tipo.getSimpleName());
        sb.append(" WHERE ");
        sb.append(campo.getName());
        sb.append(" = ");
        sb.append("?");
        
        return sb.toString();
    }
    
    public void deletarObjeto(int id) {
        try(PreparedStatement stmt = conexao.prepareStatement(query)) {
            
            stmt.setInt(1, id);
            stmt.execute();
            stmt.close();
        } catch (SQLException e){}
    }
    
}
