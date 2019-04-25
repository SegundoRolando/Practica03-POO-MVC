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
public final class Loro extends AveDomestica implements Acciones {

     private String hablar;
    private String fama;
    private String aseo;
    private String seguridad;

    public Loro(String hablar, String fama, String aseo, String seguridad) {
        this.hablar = hablar;
        this.fama = fama;
        this.aseo = aseo;
        this.seguridad = seguridad;
    }

    public Loro(String hablar, String fama, String aseo, String seguridad, String cautiverio, String dueño, String veterinario, String medicamento, int codigo, String peso, String nombre, Date fechaNacimiento, int edad) {
        super(cautiverio, dueño, veterinario, medicamento, codigo, peso, nombre, fechaNacimiento, edad);
        this.hablar = hablar;
        this.fama = fama;
        this.aseo = aseo;
        this.seguridad = seguridad;
    }
    public Loro(){
        
    }

    public String getHablar() {
        return hablar;
    }

    public void setHablar(String hablar) {
        this.hablar = hablar;
    }

    public String getFama() {
        return fama;
    }

    public void setFama(String fama) {
        this.fama = fama;
    }

    public String getAseo() {
        return aseo;
    }

    public void setAseo(String aseo) {
        this.aseo = aseo;
    }

    public String getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(String seguridad) {
        this.seguridad = seguridad;
    }
    

    @Override
    public String camina() {
     return "El loro "+super.getNombre()+" esta caminando a en su madero  de la jaula";
    }

    @Override
    public String comer() {
     return "El loro "+super.getNombre()+" esta comiendo sus semillas";
    }

    @Override
    public String volar() {
     return "El loro"+super.getNombre()+" esta  volando  dentro de su jaula";
    }

    @Override
    public String toString() {
        return super.toString()+"Loro{" + "hablar=" + hablar + ", fama=" + fama + ", aseo=" + aseo + ", seguridad=" + seguridad + '}';
    }
    
}
