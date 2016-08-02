/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DeleteDAO;
import dao.InsertDAO;
import dao.SelectDAO;
import java.util.List;
import relatorios.GenericREL;

/**
 *
 * @author yosh
 * @param <T>
 *
 */
public abstract class GenericController<T> {

    protected Class<T> tipo;

    public GenericController(Class<T> tipo) {
        this.tipo = tipo;
    }

    protected void inserir(List<T> lista) {
        try {
            new InsertDAO(tipo).inserirObjetos(lista);
        } catch (Exception e) {
        }
    }

    protected void inserir(T novoDado) {
        try {
            new InsertDAO(tipo).inserirObjetos(novoDado);
        } catch (Exception e) {
        }
    }

    public List<T> select() {
        try {
            List<T> lista = new SelectDAO(tipo).selecionarObjetos();

            return lista;
        } catch (Exception e) {
        }
        return null;
    }

    protected void deletar(int id) {
        try {
            new DeleteDAO(tipo).deletarObjeto(id);
        } catch (Exception e) {
        }
    }

    public void criarRelatorio(List<T> lista) {
        new GenericREL(tipo).criarRelatorio(lista);
    }

}
