package controller;

import model.funcionario;
import model.produtos;

/**
 *
 * @author yosh
 */
public class GerenteController extends GenericController {

    public GerenteController() {}


    public void cadastrarFuncionario(String nome, String celular, int rg) {
        this.setTipo(funcionario.class);
        insert(new funcionario(nome, celular, rg, 1));
    }

    public void cadastrarProduto(String nome_produto, int categoria_id, Double valor) {
        this.setTipo(produtos.class);
        insert(new produtos(categoria_id, nome_produto, valor));
    }
    

}
