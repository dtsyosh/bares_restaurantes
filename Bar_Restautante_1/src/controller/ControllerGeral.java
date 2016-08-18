package controller;

import dao.DeleteDAO;
import dao.InsertDAO;
import dao.SelectDAO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yosh
 * @param <T>
 *
 */
public class ControllerGeral<T> {

    protected Class<T> tipo;
    private List<T> listaSelect;

    public ControllerGeral(Class<T> tipo) {
        
        this.tipo = tipo;
        
        this.listaSelect = new ArrayList();
        try {
            listaSelect = new SelectDAO(tipo).selecionarObjetos();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
            this.listaSelect = new SelectDAO(tipo).selecionarObjetos();
        } catch (Exception e) {
        }
    }

    public List<T> select() {
        return this.listaSelect;
    }

    protected void delete(int id) {
        try {
            new DeleteDAO(tipo).deletarObjeto(id);
        } catch (Exception e) {
        }
    }
}
