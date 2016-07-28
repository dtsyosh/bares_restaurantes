/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.GenericController;
import java.util.ArrayList;
import java.util.List;
import model.categoria_produtos;

/**
 *
 * @author yosh
 */
public class Principal {

    public static void main(String[] args) throws ClassNotFoundException {
        
        
        List<categoria_produtos> lista = new ArrayList();
        
        lista.add(new categoria_produtos("Alimento"));
        lista.add(new categoria_produtos("Bebida"));
        
        new GenericController(categoria_produtos.class).inserir(lista);
        lista = new GenericController(categoria_produtos.class).select();
        
        for(categoria_produtos o : lista) {
            System.out.println(o.getDescricao());
        }
    }
}
