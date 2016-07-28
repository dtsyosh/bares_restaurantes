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
public class Pagamentos {
    
    private int id_pagamento;
    private int caixa_id;
    private int pedido_id;
    private int forma_pgto_id;
    private Date data_hora;

    public Pagamentos(int caixa_id, int pedido_id, int forma_pgto_id, Date data_hora) {
        this.caixa_id = caixa_id;
        this.pedido_id = pedido_id;
        this.forma_pgto_id = forma_pgto_id;
        this.data_hora = data_hora;
    }
    
    public Pagamentos(ResultSet rs) throws SQLException {
        this.id_pagamento = rs.getInt("id_pagamento");
        this.caixa_id = rs.getInt("caixa_id");
        this.pedido_id = rs.getInt("pedido_id");
        this.forma_pgto_id = rs.getInt("forma_pgto_id");
        this.data_hora = rs.getDate("data_hora");
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

    public Date getData_hora() {
        return data_hora;
    }

    public void setData_hora(Date data_hora) {
        this.data_hora = data_hora;
    }

    
}
