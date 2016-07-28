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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yosh
 *
 * @param <T>
 */
public class SelectDAO<T> extends GenericDAO<T> {

    public SelectDAO(Class<T> tipo) throws ClassNotFoundException {
        super(tipo, new ConexaoBanco().getConnection());
    }

    @Override
    protected String createQuery() {
        StringBuilder sb = new StringBuilder();

        sb.append("SELECT ");
        sb.append(super.getColumns(false));
        sb.append(" FROM ");

        /* Assumimos que o nome da tabela seja igual ao nome(simpleName) de T */
        sb.append(tipo.getSimpleName());

        return sb.toString();
    }

    /**
     * Cria uma lista de T's elementos preenchidos com os valores
     * correspondentes à suas tabelas no banco
     *
     * @return retorna essa lista
     *
     * @throws SQLException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     * @throws java.beans.IntrospectionException
     * @throws java.lang.reflect.InvocationTargetException
     */
    public List<T> selecionarObjetos() throws SQLException,
            InstantiationException, IllegalAccessException,
            IntrospectionException, IllegalArgumentException, InvocationTargetException {
        

        try {
           Statement stmt = conexao.createStatement();
           ResultSet rs = stmt.executeQuery(query);

            return criarObjetos(rs);
        } finally {

        }
    }

    /**
     * Cria uma lista de T's preenchidos com os valores do ResultSet passado por
     * parâmetro
     *
     * @param rs ResultSet previamente preenchido pelo metoro
     * selecionarObjetos()
     *
     * @return Retorna a lista de T's já preenchida
     *
     * @throws SQLException
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws IntrospectionException
     * @throws IllegalArgumentException
     * @throws InvocationTargetException
     */
    private List<T> criarObjetos(ResultSet rs) throws SQLException,
            InstantiationException, IllegalAccessException,
            IntrospectionException, IllegalArgumentException, InvocationTargetException {
        List<T> lista = new ArrayList();

        while (rs.next()) {

            T instancia = tipo.newInstance(); //Cria uma nova instancia de T

            for (Field campo : tipo.getDeclaredFields()) {

                /*Assumimos que o nome das colunas na tabela T está exatamente igual ao nome
                    dos atributos da classe T
                 */
                Object valor = rs.getObject(campo.getName());

                /* Meio de conseguir acesso aos metodos referentes ao campo */
                PropertyDescriptor pd = new PropertyDescriptor(campo.getName(), tipo);

                /*Pega o metodo de escrita(set) do atributo em questao */
                Method metodo = pd.getWriteMethod();

                /* invoca o método acima com os parâmetros gravando o 'valor'
                   no objeto 'instancia'
                 */
                metodo.invoke(instancia, valor);
            }

            lista.add(instancia);
        }

        return lista;
    }

}
