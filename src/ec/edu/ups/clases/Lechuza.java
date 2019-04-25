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
 * Clase "hija " hereda de la clase padre AveSilvestre
 * 
 * @author Rolando Calle
 */
public final  class Lechuza extends AveSilvestre implements Acciones  {
    private String nopturna;
    private String augeros;
    private String caracorazonada;

    public Lechuza(String nopturna, String augeros, String caracorazonada) {
        this.nopturna = nopturna;
        this.augeros = augeros;
        this.caracorazonada = caracorazonada;
    }

    public Lechuza(String nopturna, String augeros, String caracorazonada, String cuevas, String depredador, int codigo, String peso, String nombre, Date fechaNacimiento, int edad) {
        super(cuevas, depredador, codigo, peso, nombre, fechaNacimiento, edad);
        this.nopturna = nopturna;
        this.augeros = augeros;
        this.caracorazonada = caracorazonada;
    }
    
    public Lechuza(){
    
    }

    public String getNopturna() {
        return nopturna;
    }

    public void setNopturna(String nopturna) {
        this.nopturna = nopturna;
    }

    public String getAugeros() {
        return augeros;
    }

    public void setAugeros(String augeros) {
        this.augeros = augeros;
    }

    public String getCaracorazonada() {
        return caracorazonada;
    }

    public void setCaracorazonada(String caracorazonada) {
        this.caracorazonada = caracorazonada;
    }
    
    @Override
    public String criando() {
         return "La lechuza "+super.getNombre()+"esta criando a sus crias en las cuevas de la selva ";
    }

    @Override
    public String comer() {
         return "La lechuza"+super.getNombre()+"esta comiendo ratones";
    }

    @Override
    public String volar() {
        return "La lechuza"+super.getNombre()+"esta volando por la noche en sus arededorees";
    }

    @Override
    public String toString() {
        return super.toString()+"Lechuza{" + "nopturna=" + nopturna + ", augeros=" + augeros + ", caracorazonada=" + caracorazonada + '}';
    }
    
}
