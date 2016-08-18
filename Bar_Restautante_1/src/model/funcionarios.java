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
public class funcionarios {
    private int id_funcionario;
    private String nome_funcionario;
    private String celular;
    private int rg;
    private int estado_id;

    public funcionarios(String nome_funcionario, String numero_celular, int rg, int estado_id) {
        this.nome_funcionario = nome_funcionario;
        this.celular = numero_celular;
        this.rg = rg;
        this.estado_id = estado_id;
    }

    public funcionarios() {
    }
    

    public int getId_funcionario() {
        return id_funcionario;
    }

    public void setId_funcionario(int id_funcionario) {
        this.id_funcionario = id_funcionario;
    }

    public String getNome_funcionario() {
        return nome_funcionario;
    }

    public void setNome_funcionario(String nome_funcionario) {
        this.nome_funcionario = nome_funcionario;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

 

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(int estado_id) {
        this.estado_id = estado_id;
    }
    
    
}
