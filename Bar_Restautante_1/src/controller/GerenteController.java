/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.funcionario;
import model.produtos;

/**
 *
 * @author yosh
 */
public class GerenteController extends GenericController {

    public GerenteController() {
        
    }


    public void cadastrarFuncionario(String nome, String celular, int rg) {
        this.setTipo(funcionario.class);
        inserir(new funcionario(nome, celular, rg, 1));
    }

    public void cadastrarProdutos(String nome_produto, int estoque_id, int categoria_id) {
        this.setTipo(produtos.class);
        inserir(new produtos(estoque_id, categoria_id, nome_produto));
    }
    

}
