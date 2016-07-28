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
public class estado { // ativo~inativo

    private int id_estado;
    private String descricao;

    public estado(String descricao) {
        this.descricao = descricao;
    }
    
    public estado(){}

    public estado(ResultSet rs) throws SQLException {
        this.id_estado = rs.getInt("id_estado");
        this.descricao = rs.getString("descricao");
    }

    public int getId_estado() {
        return id_estado;
    }

    public void setId_estado(int id_estado) {
        this.id_estado = id_estado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
