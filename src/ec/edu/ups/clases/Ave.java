/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;
import java.util.Objects;




/**
 * @version 1.2
 * @since 2019
 *
 * Clase "Abuelo" de la que heredarán las demás clases.
 * 
 * @author Rolando Calle
 */
public class Ave implements Comparable<Ave> {
    private int codigo;
    private String peso;
    private String nombre;
    private Date fechaNacimiento;
    private int edad;

    /**
     *Ave constructor de la clase abuelo.
     */
    public Ave(int codigo, String peso, String nombre, Date fechaNacimiento, int edad) {
        this.codigo = codigo;
        this.peso = peso;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }

    public Ave(String peso, String nombre) {
        this.peso = peso;
        this.nombre = nombre;
    }
   /**
     * Ave constructor de la clase este asigna valores a todos los atributos de
     * la clase abuelo.
     */
    public Ave(){
       
    }
  /**
     *  getCodigo Método para obtener el codigo de la Ave.
     *
     * @return codigo de la Ave
     */
    public int getCodigo() {
        return codigo;
    }
    /**
     *setCodigo Método para establecer el codigo de la Ave
     *
     * @param codigo codigo de la Ave.
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
     /**
     * getPeso Método para obtener el peso de la Ave.
     *
     * @return Peso de la Ave
     */
    public String getPeso() {
        return peso;
    }
     /**
     *setPeso Método para establecer el nombre.
     *
     * @param peso peso de la Ave
     */
    
    public void setPeso(String peso) {
        this.peso = peso;
    }
    /**
     * getNombre Método para obtener el nombre de la persona.
     *
     * @return nombre de la Ave
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * setNombre Método para establecer el nombre.
     *
     * @param nombre nombre de la Ave
     */

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * getFechaNacimiento Método para obtener la fecha de nacimiento.
     *
     * @return fecha de nacimiento de la Ave
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
     /**
     * setFechaNacimiento Método para establecer la fecha de nacimiento.
     *
     * @param fechaNacimiento fecha de nacimiento de la Ave.
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

     /**
     * getEdad Método para obtener la edad de la Ave
     *
     * @return Edad de la Ave.
     */
    public int getEdad() {
        return edad;
    }
     /**
     * setEdad Método para establecer la edad de la ave
     *
     * @param edad de la Ave
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Ave{" + "codigo=" + codigo + ", peso=" + peso + ", nombre=" + nombre + 
                ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.codigo;
        hash = 79 * hash + Objects.hashCode(this.peso);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ave other = (Ave) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.peso, other.peso)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.fechaNacimiento, other.fechaNacimiento)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Ave o) {
    return nombre.compareTo(o.nombre);   
    /*
     if(nombre.compareTo(o.getNombre())>=1){
        return 1;
    }else if(nombre.compareTo(o.getNombre())<=-1){
       return -1;
       
    }else {
        return 0;
     }*/
    }
  
}
