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
public class Buitre extends AveSilvestre implements Acciones {
 
  private  String carnivoro;
  private String simbologismo;

    public Buitre(String carnivoro, String simbologismo) {
        this.carnivoro = carnivoro;
        this.simbologismo = simbologismo;
    }

    public Buitre(String carnivoro, String simbologismo, String cuevas, String depredador, int codigo, String peso, String nombre, Date fechaNacimiento, int edad) {
        super(cuevas, depredador, codigo, peso, nombre, fechaNacimiento, edad);
        this.carnivoro = carnivoro;
        this.simbologismo = simbologismo;
    }
  
    public Buitre(){
      
     }

    public String getCarnivoro() {
        return carnivoro;
    }

    public void setCarnivoro(String carnivoro) {
        this.carnivoro = carnivoro;
    }

    public String getSimbologismo() {
        return simbologismo;
    }

    public void setSimbologismo(String simbologismo) {
        this.simbologismo = simbologismo;
    }
  
    @Override
    public String criando() {
        return "El buitre "+super.getNombre()+"esta criando a sus crias en sus nidos";
    }

    @Override
    public String comer() {
        return "El buitre "+super.getNombre()+"esta comiendo animales muertos";
    }

    @Override
    public String volar() {
        return "El buitre "+super.getNombre()+"esta volando por las montañas";
    }

    @Override
    public String toString() {
        return super.toString()+"Buitre{" + "carnivoro=" + carnivoro + ", simbologismo=" + simbologismo + '}';
    }

    
}
