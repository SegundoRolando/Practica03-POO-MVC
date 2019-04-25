/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import ec.edu.ups.interfaces.Acciones;
import java.util.Date;

/**
 * @version 1.2
 * @since 2019
 *
 * Clase "hija " heredan de la clase padre AveDomestica
 * 
 * @author Rolando Calle
 */
public final class Pato extends AveDomestica implements Acciones {
    
    private String nadar;
    private String estanqueAgua;

    public Pato(String nadar, String estanqueAgua) {
        this.nadar = nadar;
        this.estanqueAgua = estanqueAgua;
    }

    public Pato(String nadar, String estanqueAgua, String cautiverio, String dueño, String veterinario, String medicamento, int codigo, String peso, String nombre, Date fechaNacimiento, int edad) {
        super(cautiverio, dueño, veterinario, medicamento, codigo, peso, nombre, fechaNacimiento, edad);
        this.nadar = nadar;
        this.estanqueAgua = estanqueAgua;
    }
    
    public Pato(){
        
    }

    public String getNadar() {
        return nadar;
    }

    public void setNadar(String nadar) {
        this.nadar = nadar;
    }

    public String getEstanqueAgua() {
        return estanqueAgua;
    }

    public void setEstanqueAgua(String estanqueAgua) {
        this.estanqueAgua = estanqueAgua;
    }
  

    @Override
    public String camina() {
       return "El Patito "+super.getNombre()+" esta caminando a su arededor del estanque de agua";    
    }

    @Override
    public String comer() {
   return "el patito"+super.getNombre()+" esta comiendo su comida";
    }

    @Override
    public String volar() {
   return "el patito"+super.getNombre()+" sacude  sus alas";
    }

    @Override
    public String toString() {
        return super.toString()+"Pato{" + "nadar=" + nadar + ", estanqueAgua=" + estanqueAgua + '}';
    }
    
    
}
