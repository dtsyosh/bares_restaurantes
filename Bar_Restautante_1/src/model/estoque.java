/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author yosh
 */
public class estoque {
    private int id_estoque;
    private int unidade_id;
    private int quantidade;
    private Date data_compra;

    public estoque(int unidade_id, int quantidade, Date data_compra) {
        this.unidade_id = unidade_id;
        this.quantidade = quantidade;
        this.data_compra = data_compra;
    }

    public estoque() {
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
