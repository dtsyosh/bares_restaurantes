/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Conta;

/**
 *
 * @author yosh
 */
public class ContaDAO {
    private Connection conexao;
    
    public ContaDAO(){
        try {
            this.conexao = new ConexaoBanco().getConnection();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
    
    public void adicionarConta(Conta conta){
        String sql = "insert into conta(descricao, valor, pago)"
                + "values (?, ?, ?)";
        try(PreparedStatement stmt = conexao.prepareStatement(sql)){
            stmt.setString(1, conta.getDescricao());
            stmt.setDouble(2, conta.getValor());
            stmt.setInt(3, conta.getPago());
            
            stmt.execute();
            stmt.close();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public void deletarConta(int id){
        String sql = "delete from conta where id = ?";
        
        try(PreparedStatement stmt = conexao.prepareStatement(sql)){
            stmt.setInt(1, id);
            
            stmt.execute();
            stmt.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação");
        }
    }
    public List<Conta> getListaContas(){
        List<Conta> listaContas = new ArrayList();
        try(PreparedStatement stmt = conexao.prepareStatement("select * from conta"); ResultSet rs = stmt.executeQuery()){            
            while(rs.next()){
                listaContas.add(new Conta(rs));
            }
            
            rs.close();
            stmt.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação");
        }
        
        return listaContas;
    }
    
    public void pagarConta(int id, int idPagante) {
        String sql = "update conta set pago = ? where id = ?";
        
        try(PreparedStatement stmt = conexao.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.setInt(2, idPagante);
            
            stmt.execute();
            stmt.close();
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Não foi possível realizar a operação");
        }
    }
}
