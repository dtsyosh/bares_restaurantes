/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author yosh
 */
public class Estoque {
    private int id_estoque;
    private int unidade_id;
    private int quantidade;
    private Date data_compra;

    public Estoque(int unidade_id, int quantidade, Date data_compra) {
        this.unidade_id = unidade_id;
        this.quantidade = quantidade;
        this.data_compra = data_compra;
    }
    
    public Estoque(ResultSet rs) throws SQLException {
        this.id_estoque = rs.getInt("id_estoque");
        this.unidade_id = rs.getInt("unidade_id");
        this.quantidade = rs.getInt("quantidade");
        this.data_compra = rs.getDate("data_compra");
    }

    public int getId_estoque() {
        return id_estoque;
    }

    public void setId_estoque(int id_estoque) {
        this.id_estoque = id_estoque;
    }

    public int getUnidade_id() {
        return unidade_id;
    }

    public void setUnidade_id(int unidade_id) {
        this.unidade_id = unidade_id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getData_compra() {
        return data_compra;
    }

    public void setData_compra(Date data_compra) {
        this.data_compra = data_compra;
    }
    
    
}
