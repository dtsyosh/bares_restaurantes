/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author yosh
 * @param <T>
 */
public class InsertDAO<T> extends GenericDAO<T>{

    public InsertDAO(Class<T> tipo) throws ClassNotFoundException {
        super(tipo, new ConexaoBanco().getConnection());
    }

    @Override
    protected String createQuery() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("INSERT INTO ");
        sb.append(tipo.getSimpleName());
        sb.append("(");
        sb.append(super.getColumns(false));
        sb.append(")");
        sb.append(" VALUES(");
        sb.append(super.getColumns(true));
        sb.append(")");
        
        return sb.toString();
    }
    
    /**
     * Insere no banco a lista de objetos passada por parâmetro;
     * @param lista
     * @throws SQLException
     * @throws IntrospectionException
     * @throws IllegalAccessException
     * @throws IllegalArgumentException
     * @throws InvocationTargetException 
     */
    public void inserirObjetos(List<T> lista) throws SQLException,
            IntrospectionException, IllegalAccessException,
            IllegalArgumentException, InvocationTargetException {
        PreparedStatement stmt = null;
        
        try {
            stmt = conexao.prepareStatement(query);
            
            for(T instancia : lista) {
                int i = 0;
                
                for(Field campo : tipo.getDeclaredFields()) {
                    
                    PropertyDescriptor pd = new PropertyDescriptor(campo.getName(), tipo);
                    Method metodo = pd.getReadMethod();
                    
                    Object valor = metodo.invoke(instancia);
                    
                    stmt.setObject(++i, valor);
                }
                stmt.addBatch();
            }
            
            stmt.executeBatch();
        } finally {
            stmt.close();
        }
    }
    
}
