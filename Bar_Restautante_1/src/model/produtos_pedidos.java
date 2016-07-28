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
public class produtos_pedidos {
    
    private int id_produtos_pedidos;
    private int produto_id;
    private int pedido_id;
    private Date data_hora;

    public produtos_pedidos(int produto_id, int pedido_id, Date data_hora) {
        this.produto_id = produto_id;
        this.pedido_id = pedido_id;
        this.data_hora = data_hora;
    }
    
    public produtos_pedidos(ResultSet rs) throws SQLException {
        this.id_produtos_pedidos = rs.getInt("id_produtos_pedidos");
        this.produto_id = rs.getInt("produto_id");
        this.pedido_id = rs.getInt("pedido_id");
        this.data_hora = rs.getDate("data_hora");
    }

    public Date getData_hora() {
        return data_hora;
    }

    public void setData_hora(Date data_hora) {
        this.data_hora = data_hora;
    }

    public int getPedido_id() {
        return pedido_id;
    }

    public void setPedido_id(int pedido_id) {
        this.pedido_id = pedido_id;
    }

    public int getId_produtos_pedidos() {
        return id_produtos_pedidos;
    }

    public void setId_produtos_pedidos(int id_produtos_pedidos) {
        this.id_produtos_pedidos = id_produtos_pedidos;
    }

    public int getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(int produto_id) {
        this.produto_id = produto_id;
    }
    
    
}
