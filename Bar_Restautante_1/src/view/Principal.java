/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.InsertDAO;
import dao.SelectDAO;
import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.estado;

/**
 *
 * @author yosh
 */
public class Principal {

    public static void main(String[] args) throws ClassNotFoundException {

        List<estado> lista = new ArrayList();

        lista.add(new estado("ativo"));
        lista.add(new estado("inativo"));

        InsertDAO<estado> inserirEstado = new InsertDAO(estado.class);
        SelectDAO<estado> selectEstado = new SelectDAO(estado.class);
        try {

            inserirEstado.inserirObjetos(lista);
            lista = selectEstado.selecionarObjetos();

            for (estado o : lista) {
                System.out.println(o.getDescricao());
            }
        } catch (SQLException | IntrospectionException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | InstantiationException e) {
        }

    }
}
