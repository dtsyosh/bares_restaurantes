/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author yosh
 */
public class FormaPagamento {
    
    private int id_forma_pgto;
    private String descricao;

    public FormaPagamento(String descricao) {
        this.descricao = descricao;
    }
    
    public FormaPagamento(ResultSet rs) throws SQLException {
        this.id_forma_pgto = rs.getInt("id_forma_pgto");
        this.descricao = rs.getString("descricao");
    }

    public int getId_forma_pgto() {
        return id_forma_pgto;
    }

    public void setId_forma_pgto(int id_forma_pgto) {
        this.id_forma_pgto = id_forma_pgto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
