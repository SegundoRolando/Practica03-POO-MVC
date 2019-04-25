/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Buitre;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @version 1.2
 * @since 2019
 *
 * Controlador "Hija" de la clase padre AveSilvestre
 * 
 * @author Rolando Calle
 */
public class ControladorBuitre {
    private SortedSet <Buitre> lista;
    private int codigo;

    /**
     * ControladorBuitre
     * inicializa el codigo y la lista como TreeSet.
     */
    public ControladorBuitre() {
        lista = new TreeSet<>();
        codigo = 0;
    }
    
    /**
     * create
     * incrementa el codigo, lo establece en el objeto y añade el objeto a la lista.
     * @param buitre buitre de tipo buitre.
     */
    public void create(Buitre buitre){
        codigo++;
        buitre.setCodigo(codigo);
        lista.add(buitre);
    }
    
    /**
     * read
     * busca un objeto con un determinado código y lo devuelve.
     * @param codigo codigo de tipo int
     * @return buitre de tipo buitre con todos sus atributos.
     */
    public Buitre read(int codigo){
        for(Buitre buitre : lista){
            if(buitre.getCodigo() == (codigo)){
                return buitre;
            }
        }
        return null;
    }
    
    /**
     * update
     * busca en la lista un objeto y lo reemplaza por otro.
     * @param buitre buitre de tipo Lactante.
     */
    public void update(Buitre buitre){
        if(lista.contains(buitre)){
            lista.remove(buitre);
            lista.add(buitre);
        }
    }
    
    /**
     * delete
     * busca en la lista un objeto y lo elimina
     * @param codigo codigo de tipo entero.
     */
    public void delete(int codigo){
        for(Buitre buitre : lista){
            if(buitre.getCodigo() == codigo){
                lista.remove(buitre);
                break;
            }
        }
    }
    
    /**
     * imprimir
     * lista en consola los nombres de todos los objetos en la lista
     */
    public void imprimir(){
        for (Buitre buitre : lista) {
            System.out.println(buitre.getNombre());
        }
    }
    
}
