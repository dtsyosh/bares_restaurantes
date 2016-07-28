/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.lang.reflect.Field;
import model.*;
/**
 *
 * @author yosh
 */
public class Principal {
    public static void main(String [] args) {
        Class<Produtos> classeProduto = Produtos.class;
        
        for(Field atributo : classeProduto.getDeclaredFields()){
            System.out.println(atributo.getName());
    
        }
    }
}
