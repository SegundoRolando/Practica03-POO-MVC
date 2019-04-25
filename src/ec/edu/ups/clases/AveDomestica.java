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
public abstract class AveDomestica extends Ave {
    
    private String cautiverio;
    private String dueño;
    private String veterinario;
    private String medicamento;

    public AveDomestica(String cautiverio, String dueño, String veterinario, String medicamento, int codigo, String peso, String nombre, Date fechaNacimiento, int edad) {
        super(codigo, peso, nombre, fechaNacimiento, edad);
        this.cautiverio = cautiverio;
        this.dueño = dueño;
        this.veterinario = veterinario;
        this.medicamento = medicamento;
    }
    public AveDomestica(){
    
    }

    public String getCautiverio() {
        return cautiverio;
    }

    public void setCautiverio(String cautiverio) {
        this.cautiverio = cautiverio;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(String veterinario) {
        this.veterinario = veterinario;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }
    public String trabajar(){
        return "El Ave " + super.getNombre() + " está volando";
    }
    
    public String conducir(){
        return "El Ave " + super.getNombre() + " está comiendo";
    }
    
    public String comprar(){
        return "El Ave " + super.getNombre() + " está caminando";
    }
    
    public abstract String camina();

    @Override
    public String toString() {
        return super.toString()+ "AveDomestica{" + "cautiverio=" + cautiverio + ", due\u00f1o=" + dueño + ", veterinario=" + veterinario + ", medicamento=" + medicamento + '}';
    }
    
    

}
