/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Timestamp;

/**
 *
 * @author yosh
 */
public class caixas {

    private int id_caixa;
    private int funcionario_id;
    private int estado_id;
    private Timestamp data_hora_abertura;
    private Timestamp data_hora_fechamento;
    private Double valor_inicial;
    private Double valor_final;

    public caixas(int funcionario_id, int estado_id, Timestamp data_hora_abertura, Double valor_inicial) {
        this.funcionario_id = funcionario_id;
        this.estado_id = estado_id;
        this.data_hora_abertura = data_hora_abertura;
        this.valor_inicial = valor_inicial;
    }

    public caixas() {
    }

    public int getId_caixa() {
        return id_caixa;
    }

    public void setId_caixa(int id_caixa) {
        this.id_caixa = id_caixa;
    }

    public int getFuncionario_id() {
        return funcionario_id;
    }

    public void setFuncionario_id(int funcionatio_id) {
        this.funcionario_id = funcionatio_id;
    }

    public int getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(int estado_id) {
        this.estado_id = estado_id;
    }

    public Timestamp getData_hora_abertura() {
        return data_hora_abertura;
    }

    public void setData_hora_abertura(Timestamp data_hora_abertura) {
        this.data_hora_abertura = data_hora_abertura;
    }

    public Timestamp getData_hora_fechamento() {
        return data_hora_fechamento;
    }

    public void setData_hora_fechamento(Timestamp data_hora_fechamento) {
        this.data_hora_fechamento = data_hora_fechamento;
    }

    public Double getValor_inicial() {
        return valor_inicial;
    }

    public void setValor_inicial(Double valor_inicial) {
        this.valor_inicial = valor_inicial;
    }

    public Double getValor_final() {
        return valor_final;
    }

    public void setValor_final(Double valor_final) {
        this.valor_final = valor_final;
    }

}
