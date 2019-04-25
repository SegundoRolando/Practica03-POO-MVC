/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 * @version 1.2
 * @since 2019
 *
 * Clase "Padre" de la que heredarán las demás clases hijas.
 * 
 * @author Rolando Calle
 */
public  abstract class AveSilvestre extends Ave{
    
    private String cuevas;
    private String depredador;
    
    public AveSilvestre(){
        
    }

    public AveSilvestre(String cuevas, String depredador, int codigo, String peso, String nombre, Date fechaNacimiento, int edad) {
        super(codigo, peso, nombre, fechaNacimiento, edad);
        this.cuevas = cuevas;
        this.depredador = depredador;
    }

    public String getCuevas() {
        return cuevas;
    }

    public void setCuevas(String cuevas) {
        this.cuevas = cuevas;
    }

    public String getDepredador() {
        return depredador;
    }

    public void setDepredador(String depredador) {
        this.depredador = depredador;
    }

      public String trabajar(){
        return "El Ave " + super.getNombre() + " está enfermo";
    }
    
    public String conducir(){
        return "El Ave " + super.getNombre() + " está en su nido";
    }
    
    public String comprar(){
        return "El Ave " + super.getNombre() + " está con sus crias";
    }
    public abstract String criando();

    @Override
    public String toString() {
        return super.toString()+"AveSilvestre{" + "cuevas=" + cuevas + ", depredador=" + depredador + '}';
    }
    
    
}
