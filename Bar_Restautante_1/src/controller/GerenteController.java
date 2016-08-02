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
 * @param <T>
 */
public class GerenteController<T> extends GenericController<T> {

    public GerenteController(Class<T> tipo) {
        super(tipo);
    }


    public void cadastrarFuncionario(String nome, String celular, int rg) {
        inserir( (T) new funcionario(nome, celular, rg, 1));
    }

    public void cadastrarProdutos(String nome_produto, int estoque_id, int categoria_id) {
        inserir( (T) new produtos(estoque_id, categoria_id, nome_produto));
    }
    

}
