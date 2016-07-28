/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.InsertDAO;
import dao.SelectDAO;
import java.util.List;

/**
 *
 * @author yosh
 * @param <T>
 *
 */
public class GenericController<T> {

    protected Class<T> tipo;

    public GenericController(Class<T> tipo) {
        this.tipo = tipo;
    }

    public void inserir(List<T> lista) throws Exception {
        new InsertDAO(tipo).inserirObjetos(lista);
    }

    public List<T> select() throws Exception {

        List<T> lista = new SelectDAO(tipo).selecionarObjetos();

        return lista;
    }

}
