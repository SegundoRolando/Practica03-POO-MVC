/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Pato;
import java.util.HashSet;
import java.util.Set;

/**
 * @version 1.2
 * @since 2019
 *
 * Controlador "Hija" de la clase padre AveDomestica.
 * 
 * @author Rolando Calle
 */
public class ControladorPato {
    
     private Set<Pato> lista;
    private int codigo;

    /**
     * ControladorPato 
     * Inicializa el codigo y la lista como HashSet.
     */
    public ControladorPato() {
        lista = new HashSet<>();
        codigo = 0;
    }
    
    /**
     * create
     * incrementa el codigo, lo establece en el objeto y añade el objeto a la lista.
     * @param pato  objeto de tipo Pato.
     */
    public void create(Pato pato ){
        codigo++;
        pato .setCodigo(this.codigo);
        lista.add(pato );
    }
    
    /**
     * read
     * busca un objeto con un determinado código y lo devuelve.
     * @param codigo codigo de tipo int o entero
     * @return objeto de tipo pato con todos sus atributos.
     */
    public Pato read(int codigo){
        for(Pato pato : lista){
            if(codigo == pato .getCodigo()){
                return pato;
            }
        }
        return null;
    }
    
    /**
     * update
     * busca en la lista un objeto y lo reemplaza por otro
     * es decir este actualiza.
     * @param pato  objeto de tipo Pato.
     */
    public void update(Pato pato ){
        if(lista.contains(pato )){
            lista.remove(pato );
            lista.add(pato );
        }
    }
    
    /**
     * delete
     * busca en la lista un objeto y lo elimina
     * dependiendo el codigo  del objeto.
     * @param codigo codigo de tipo entero.
     */
    public void delete(int codigo){
        
        for(Pato pato  : lista){
            if(pato .getCodigo() == codigo){
                lista.remove(pato );
                break;
            }
        }
        
    }
    
    /**
     * imprimir
     * lista en consola los nombres de todos los objetos en la lista
     */
    public void imprimir(){
        for (Pato noProfesional : lista) {
            System.out.println(noProfesional.getNombre());
        }
    }
}
