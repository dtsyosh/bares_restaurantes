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
public class pedidos {
    
    private int id_pedido;
    private int funcionario_id;
    private int mesa_id;
    private int estado_id;

    public pedidos(int funcionario_id, int mesa_id, int estado_id) {
        this.funcionario_id = funcionario_id;
        this.mesa_id = mesa_id;
        this.estado_id = estado_id;
    }
    
    public pedidos(ResultSet rs) throws SQLException {
        this.id_pedido = rs.getInt("id_pedido");
        this.estado_id = rs.getInt("estado_id");
        this.funcionario_id = rs.getInt("funcionario_id");
        this.mesa_id = rs.getInt("mesa_id");
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getFuncionario_id() {
        return funcionario_id;
    }

    public void setFuncionario_id(int funcionario_id) {
        this.funcionario_id = funcionario_id;
    }

    public int getMesa_id() {
        return mesa_id;
    }

    public void setMesa_id(int mesa_id) {
        this.mesa_id = mesa_id;
    }

    public int getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(int estado_id) {
        this.estado_id = estado_id;
    }
    
    
}
