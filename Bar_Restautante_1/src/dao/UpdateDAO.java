package dao;

import java.lang.reflect.Field;
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
        Field campo = tipo.getDeclaredFields()[0];
        sb.append("UPDATE ");
        sb.append(tipo.getSimpleName());
        sb.append(" SET estado_id = ?");
        sb.append(" WHERE ");
        sb.append(campo.getName());
        sb.append(" = ?");
        
        return sb.toString();
    }
    
    public void atualizarObjeto(int id, int estadoId) {
        try (PreparedStatement stmt = conexao.prepareStatement(query)) {
            stmt.setInt(1, estadoId);
            stmt.setInt(2, id);
            stmt.execute();
        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    
}
