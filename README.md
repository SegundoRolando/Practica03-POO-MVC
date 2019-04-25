# Practica03-POO-MVC
Práctica de Programación Aplicada

 	PRÁCTICA DE LABORATORIO 

CARRERA: Computación	ASIGNATURA: Programación Aplicada
NRO. PRÁCTICA:	03	TÍTULO PRÁCTICA:  Practica03-POO MVC

OBJETIVO ALCANZADO:
Esta práctica nos permite desarrollar el conocimiento básico hacia la programación.
Se utilizó la página (lucitchart) la cual nos permite diseñar clases Uml Siendo esta la que nos facilita y nos orienta en la programación. 
Esta práctica nos permitirá  conocer herramientas que nos facilitaran  compartir información sobre la programación.
ACTIVIDADES DESARROLLADAS
1.	Crear un repositorio en GitHub con el nombre “Práctica 02 – POO con Java”  
2.	Sincronizar el repositorio creado con un proyecto en NetBeans. Realizar un commit y push por cada requerimiento de los puntos a continuación descritos (incluir un mensaje que identifique claramente los commits realizados a GitHub).
 
3. Crear un paquete para las clases, otro para las interfaces, otro para las pruebas.
 
4. Crear una jerarquía de clases de tres niveles, es decir, una clase “abuelo”, dos clases “padres” y cuatro clases “hijas” (dos de cada padre).

 

6. Cada clase padre debe tener por lo menos un método abstracto cada una. 7
Clase hija pato
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
 Clase hija loro
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

Clase hija buitre
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
 Clase hija lechuza
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
Clase padre animalsilvestre
*
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
Clase padre animaldomestico
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
Clase abuelo Ave
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
    } 
}
7. Los métodos abstractos deben ser sobre-escritos (implementados) en cada clase h
AveSilvestres
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
AveDomestica
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

8. Todas las clases hijas deben ser clases finales

public final class Loro extends AveDomestica implements Acciones {
public final class Pato extends AveDomestica implements Acciones {
public class Buitre extends AveSilvestre implements Acciones {
public final  class Lechuza extends AveSilvestre implements Acciones{


9. Crear una interface, con al menos dos métodos abstractos. Estos métodos deben ser implementados en cada clase hija.
 
public abstract String camina();
public abstract String come();
public abstract String duerme();
public abstract String criando();







10. Clases controladores
Controlador Pato 
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Pato;
import java.util.HashSet;
import java.util.Set;
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
    
    public void create(Pato pato ){
        codigo++;
        pato .setCodigo(this.codigo);
        lista.add(pato );
    }
    public Pato read(int codigo){
        for(Pato pato : lista){
            if(codigo == pato .getCodigo()){
                return pato;
            }
        }
        return null;
    }
    public void update(Pato pato ){
        if(lista.contains(pato )){
            lista.remove(pato );
            lista.add(pato );
        }
    }
    public void delete(int codigo){
        
        for(Pato pato  : lista){
            if(pato .getCodigo() == codigo){
                lista.remove(pato );
                break;
            }
        }
        
    }
    
    public void imprimir(){
        for (Pato noProfesional : lista) {
            System.out.println(noProfesional.getNombre());
        }
    }
}
Controlador loro
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Loro;
import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.2
 * @since 2019
 *
 * Controlador "Hija" de la clase padre AveDomestica.
 * 
 * @author Rolando Calle
 */
public class ControladorLoro {
    
      private List <Loro> lista;
    private int codigo;
    public ControladorLoro() {
        lista = new ArrayList<>();
        codigo = 1;
    public void create(Loro loro){
        loro.setCodigo(codigo);
        codigo++;
        lista.add(loro);
    }
    public Loro read(int codigo){
        for(Loro loro : lista){
            if(loro.getCodigo() == codigo){
                return loro;
            }
        }
        return null;
    }
    public void update(Loro loro){
        for(int i = 0; i < lista.size(); i++){
            Loro elemento = lista.get(i);
            if(elemento.getCodigo() == loro.getCodigo()){
                lista.set(i, loro);
                break;
            }
        }
    }
    public void delete(int codigo){
        for(int i = 0; i < lista.size(); i++){
            Loro loro = lista.get(i);
            if(loro.getCodigo() == codigo){
                lista.remove(i);
                break;
            }
        }
    }
    public void imprimir(){
        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).getNombre());
        }
    }
}
Controlador Buitre
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Buitre;
import java.util.SortedSet;
import java.util.TreeSet;

public class ControladorBuitre {
    private SortedSet <Buitre> lista;
    private int codigo;
    public ControladorBuitre() {
        lista = new TreeSet<>();
        codigo = 0;
    }
    public void create(Buitre buitre){
        codigo++;
        buitre.setCodigo(codigo);
        lista.add(buitre);
    }
    public Buitre read(int codigo){
        for(Buitre buitre : lista){
            if(buitre.getCodigo() == (codigo)){
                return buitre;
            }
        }
        return null;
    }
    public void update(Buitre buitre){
        if(lista.contains(buitre)){
            lista.remove(buitre);
            lista.add(buitre);
        }
    }
    
    public void delete(int codigo){
        for(Buitre buitre : lista){
            if(buitre.getCodigo() == codigo){
                lista.remove(buitre);
                break;
            }
        }
    }
    public void imprimir(){
        for (Buitre buitre : lista) {
            System.out.println(buitre.getNombre());
        }
    }
    
}
Controlador Lechuza
package ec.edu.ups.controladores;

import ec.edu.ups.clases.Lechuza;
import java.util.Map;
import java.util.TreeMap;
public class ControladorLechuza {
       private Map<Integer,Lechuza> lista;
    private int codigo;

    public ControladorLechuza() {
        lista = new TreeMap<>();
        codigo = 0;
    }
    
    public void create(Lechuza lechuza){
        codigo++;
        lechuza.setCodigo(codigo);
        lista.put(codigo, lechuza);
    }
    public Lechuza read(int codigo){
        if(lista.get(codigo) != null){
            return lista.get(codigo);
        }
        return null;
    }
    public void update(Lechuza lechuza){
        lista.put(lechuza.getCodigo(),lechuza);
    }
    
    public void delete(int codigo){
        lista.remove(codigo);
    }
    
    public void imprimir(){
        for(Map.Entry<Integer, Lechuza> elemento : lista.entrySet()){
            int key = elemento.getKey();
            String nombrelechuza = elemento.getValue().getNombre();
            System.out.println("Key : " + key + " Lechuza : " + nombrelechuza);
        }
    }
}

11. Resolucion  del programa
  
 
 
 
 
13. Crear el archivo README del repositorio, en este archivo, debe constar la misma información del informe de resultados de la práctica que se indica en el punto anterior (incluidas las imágenes del informe).
Para revisar README revisar
 https://github.com/SegundoRolando/Practica03-POO-MVC.git

RESULTADO(S) OBTENIDO(S):
Los resultados que hemos obtenido son los siguiente: hemos cargado toda la información en github  con la siguiente dirección  donde está más detallado y cargado  tanto como en NetBeans, https://github.com/SegundoRolando/Pr-ctica02-CalleRolando.git  de acuerdo a lo desarrollado se pudo realizar  lo que se pudo y también dando seguimiento a la guía práctica, logramos  realizar esta práctica.
CONCLUSIONES:
En conclusión de  este proyecto nos ha permitido distinguir entre una clase , un método, el importar e instanciar clases  objetos  también nos ha permitido en esta práctica se ampliado el paquete de clase interface y por otro punto  nos permitió realizar  el método de herencia y  de relación fue lo que en mayor caso lo entendí.

Nombre de estudiante: Rolando Calle


Firma de estudiante: __________________
