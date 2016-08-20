/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.sql.Timestamp;

/**
 *
 * @author yosh
 */
public class pagamentos {
    
    private int id_pagamento;
    private int caixa_id;
    private int pedido_id;
    private int forma_pgto_id;
    private Timestamp data_hora;
    private double valor;
    
    public pagamentos(int caixa_id, int pedido_id, int forma_pgto_id, Timestamp data_hora, double valor) {
        this.caixa_id = caixa_id;
        this.pedido_id = pedido_id;
        this.forma_pgto_id = forma_pgto_id;
        this.data_hora = data_hora;
        this.valor = valor;
    }

    public pagamentos() {
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    public int getId_pagamento() {
        return id_pagamento;
    }

    public void setId_pagamento(int id_pagamento) {
        this.id_pagamento = id_pagamento;
    }

    public int getCaixa_id() {
        return caixa_id;
    }

    public void setCaixa_id(int caixa_id) {
        this.caixa_id = caixa_id;
    }

    public int getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(int pedido_id) {
        this.pedido_id = pedido_id;
    }

    public int getForma_pgto_id() {
        return forma_pgto_id;
    }

    public void setForma_pgto_id(int forma_pgto_id) {
        this.forma_pgto_id = forma_pgto_id;
    }

    public Timestamp getData_hora() {
        return data_hora;
    }

    public void setData_hora(Timestamp data_hora) {
        this.data_hora = data_hora;
    }

    
}
