/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Loro;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.2
 * @since 2019
 *
 * Controlador "Hija" de la clase padre AveDomestica.
 * 
 * @author Rolando Calle
 */
public class ControladorLoro {
    
      private List <Loro> lista;
    private int codigo;

    /**
     * ControladorLoro
     * inicializa el codigo y la lista como ArrayList.
     */
    public ControladorLoro() {
        lista = new ArrayList<>();
        codigo = 1;
    }
    
    /**
     * create
     * asigna un código al objeto, lo incrementa y añade el objeto a la lista.
     * @param loro objeto de tipo loro.
     */
    public void create(Loro loro){
        loro.setCodigo(codigo);
        codigo++;
        lista.add(loro);
    }
    
    /**
     * read
     * busca un objeto con un determinado código y lo devuelve.
     * @param codigo codigo de tipo int
     * @return objeto de tipo loro con todos sus atributos.
     */
    public Loro read(int codigo){
        for(Loro loro : lista){
            if(loro.getCodigo() == codigo){
                return loro;
            }
        }
        return null;
    }
    
    /**
     * update
     * busca en la lista un objeto y lo reemplaza por otro.
     * @param loro objeto de tipo loro.
     */
    public void update(Loro loro){
        for(int i = 0; i < lista.size(); i++){
            Loro elemento = lista.get(i);
            if(elemento.getCodigo() == loro.getCodigo()){
                lista.set(i, loro);
                break;
            }
        }
    }
    
    /**
     * delete
     * busca en la lista un objeto y lo elimina
     * @param codigo codigo de tipo entero.
     */
    public void delete(int codigo){
        for(int i = 0; i < lista.size(); i++){
            Loro loro = lista.get(i);
            if(loro.getCodigo() == codigo){
                lista.remove(i);
                break;
            }
        }
    }
    
    /**
     * imprimir
     * lista en consola los nombres de todos los objetos en la lista
     */
    public void imprimir(){
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).getNombre());
        }
    }
}
