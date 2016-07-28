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
public class Unidade {
    private int id_unidade;
    private String unidade;

    public Unidade(String unidade) {
        this.unidade = unidade;
    }
    
    public Unidade(ResultSet rs) throws SQLException {
        this.id_unidade = rs.getInt("id_unidade");
        this.unidade = rs.getString("unidade");
    }
    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public int getId_unidade() {
        return id_unidade;
    }

    public void setId_unidade(int id_unidade) {
        this.id_unidade = id_unidade;
    }
    
    
}
