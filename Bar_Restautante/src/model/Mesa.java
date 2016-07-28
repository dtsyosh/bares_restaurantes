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
public class Mesa {
    
    private int id_mesa;
    private int codigo_mesa;

    public Mesa(int codigo_mesa) {
        this.codigo_mesa = codigo_mesa;
    }

    public Mesa(ResultSet rs) throws SQLException {
        this.id_mesa = rs.getInt("id_mesa");
        this.codigo_mesa = rs.getInt("codigo_mesa");
    }
    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public int getCodigo_mesa() {
        return codigo_mesa;
    }

    public void setCodigo_mesa(int codigo_mesa) {
        this.codigo_mesa = codigo_mesa;
    }
    
    
}
