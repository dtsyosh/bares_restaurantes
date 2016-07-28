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
public class categoria_produtos {
    private int id_categoria;
    private String descricao;

    public categoria_produtos(String descricao) {
        this.descricao = descricao;
    }

    public categoria_produtos(ResultSet rs) throws SQLException {
        this.id_categoria = rs.getInt("id_categoria");
        this.descricao = rs.getString("descricao");
    }
    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
}
