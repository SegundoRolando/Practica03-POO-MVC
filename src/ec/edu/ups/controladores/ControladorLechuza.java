/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Lechuza;
import java.util.Map;
import java.util.TreeMap;

/**
 * @version 1.2
 * @since 2019
 *
 * Controlador "Hija" de la clase padre AveSilvestre
 * 
 * @author Rolando Calle
 */
public class ControladorLechuza {
       private Map<Integer,Lechuza> lista;
    private int codigo;

    /**
     * ControladorLechuza
     * inicializa el codigo y la lista como TreeMap.
     */
    public ControladorLechuza() {
        lista = new TreeMap<>();
        codigo = 0;
    }
    
    /**
     * create
     * incrementa el codigo, lo establece en el objeto y añade el objeto a la lista.
     * @param lechuza lechuza de tipo Lechuza.
     */
    public void create(Lechuza lechuza){
        codigo++;
        lechuza.setCodigo(codigo);
        lista.put(codigo, lechuza);
    }
    
    /**
     * read
     * busca un objeto con un determinado código y lo devuelve.
     * @param codigo codigo de tipo int
     * @return objeto de tipo lechuza con todos sus atributos.
     */
    public Lechuza read(int codigo){
        if(lista.get(codigo) != null){
            return lista.get(codigo);
        }
        return null;
    }
    
    /**
     * update
     * busca en la lista un objeto y lo reemplaza por otro.
     * @param lechuza devuelve el objeto lechuza
     */
    public void update(Lechuza lechuza){
        lista.put(lechuza.getCodigo(),lechuza);
    }
    
    /**
     * delete
     * busca en la lista un objeto y lo elimina
     * @param codigo codigo de tipo entero.
     */
    public void delete(int codigo){
        lista.remove(codigo);
    }
    
    /**
     * imprimir
     * lista en consola los nombres de todos los objetos en la lista
     */
    public void imprimir(){
        for(Map.Entry<Integer, Lechuza> elemento : lista.entrySet()){
            int key = elemento.getKey();
            String nombrelechuza = elemento.getValue().getNombre();
            System.out.println("Key : " + key + " Lechuza : " + nombrelechuza);
        }
    }
    
    
}
