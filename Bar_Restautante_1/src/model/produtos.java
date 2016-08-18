/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author yosh
 */
public class produtos {
    
    private int id_produto;
    private int categoria_id;
    private Double preco;
    private String nome_produto;

    public produtos(int categoria_id, String nome_produto, Double valor) {
        this.categoria_id = categoria_id;
        this.nome_produto = nome_produto;
        this.preco = valor;
    }

    public produtos() {
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double valor) {
        this.preco = valor;
    }
    
    

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }


    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }
    
    
}
