package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author yosh
 */

public class Conta {
    
    private int id;
    private String descricao;
    private Double valor;
    private int pago;   //Pode ser 0 "não foi paga ainda", 1 "Diego pagou", 2 "Geovana pagou" ou 3 "foi dividido"

    public Conta(String descricao, Double valor, int pago) {
        this.descricao = descricao;
        this.valor = valor;
        this.pago = pago;
    }
    
    
    public Conta(ResultSet rs) throws SQLException {
        this.id = rs.getInt("id");
        this.descricao = rs.getString("descricao");
        this.valor = rs.getDouble("valor");
        this.pago = rs.getInt("pago");
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public int getPago() {
        return pago;
    }

    public void setPago(int pago) {
        this.pago = pago;
    }
    
}
