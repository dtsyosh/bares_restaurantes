/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import dao.ContaDAO;
import java.util.List;
import modelo.*;
/**
 *
 * @author yosh
 */
public class ContaController {
    
    private List<Conta> listaConta;
    private ContaDAO contaDAO;

    public ContaController() {
        this.listaConta = new ContaDAO().getListaContas();
        this.contaDAO = new ContaDAO();
    }
    
    
    
    public void cadastrarNovaConta(String descricao, Double valor, int pago) {
        contaDAO.adicionarConta(new Conta(descricao, valor, pago));
        this.listaConta.add(new Conta(descricao, valor, pago));
    }

    
    public List<Conta> getListaConta() {
        return this.listaConta;
    }
    
    public void pagarConta(int idConta, int idPago) {
        contaDAO.pagarConta(idConta, idPago);
        this.listaConta.get(idConta).setPago(idPago);
    }
}
