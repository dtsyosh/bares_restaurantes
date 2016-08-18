package controller;

import dao.DeleteDAO;
import dao.InsertDAO;
import dao.SelectDAO;
import java.util.List;

/**
 *
 * @author yosh
 * @param <T>
 *
 */
public class Controller<T> {

    protected Class<T> tipo;

    public Controller() {
    }

    public Class<T> getTipo() {
        return tipo;
    }

    public void setTipo(Class<T> tipo) {
        this.tipo = tipo;
    }

    protected void inserir(List<T> lista) {
        try {
            new InsertDAO(tipo).inserirObjetos(lista);
        } catch (Exception e) {
        }
    }

    protected void insert(T novoDado) {
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

    protected void delete(int id) {
        try {
            new DeleteDAO(tipo).deletarObjeto(id);
        } catch (Exception e) {
        }
    }
}
