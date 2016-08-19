/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.lang.reflect.Field;
import java.sql.Connection;

/**
 *
 * @author yosh
 * @param <T>
 */
public abstract class GenericDAO<T> {

    protected Connection conexao;
    protected Class<T> tipo;
    protected final String query;

    /**
     * Construtor
     *
     * @param tipo O tipo do objeto deve ser criado e preenchido com os valores
     * do banco ou inseridos no banco
     *
     * @param connection Contém as configurações para criar a conexão com o
     * banco
     */
    protected GenericDAO(Class<T> tipo, Connection connection) {
        this.conexao = connection;
        this.tipo = tipo;
        this.query = createQuery();
    }

    /**
     * Cria a string SQL para fazer insert/select
     *
     * @return the SQL-String
     */
    protected abstract String createQuery();

    /**
     * Cria uma string separada por "," contendo os nomes de todos os atributos
     * da classe
     *
     *
     * @param usePlaceHolders
     *
     * verdadeiro, se for usado o "?" do PreparedStatement no lugar do nome da
     * variavel campo
     *
     * @return
     */
    protected String getColumns(boolean usePlaceHolders) {
        StringBuilder sb = new StringBuilder();

        boolean first = true;
        /* Itera sobre os nomes das colunas */

        for (Field f : tipo.getDeclaredFields()) {
            if (first) //Verifica se está no primeiro elemento, caso esteja, não adiciona virgula
            {
                first = false;
            } else {
                sb.append(",");
            }

            if (usePlaceHolders) {
                sb.append("?");
            } else {
                sb.append(f.getName());
            }
        }

        return sb.toString();
    }
}
