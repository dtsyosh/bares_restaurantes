package controller;

import dao.DeleteDAO;
import dao.InsertDAO;
import dao.SelectDAO;
import dao.UpdateDAO;
import java.util.ArrayList;
import java.util.List;
import model.estado;

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

    public void insertList(List<T> lista) {
        try {
            new InsertDAO(tipo).inserirObjetos(lista);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insert(T novoDado) {
        try {
            new InsertDAO(tipo).inserirObjetos(novoDado);
            this.listaSelect = new SelectDAO(tipo).selecionarObjetos();
        } catch (Exception e) {
        }
    }

    public List<T> select() {
        return this.listaSelect;
    }

    public void delete(int id) {
        try {
            new DeleteDAO(tipo).deletarObjeto(id);
        } catch (Exception e) {
        }
    }
    
    public void atualizarEstado(int estadoId, int id) {
        try {
            new UpdateDAO(tipo).atualizarObjeto(estadoId, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
