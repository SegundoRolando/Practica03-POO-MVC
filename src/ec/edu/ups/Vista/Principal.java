/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Vista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import ec.edu.ups.controladores.ControladorBuitre;
import ec.edu.ups.controladores.ControladorLechuza;
import ec.edu.ups.controladores.ControladorPato;
import ec.edu.ups.controladores.ControladorLoro;
import ec.edu.ups.clases.Buitre;
import ec.edu.ups.clases.Lechuza;
import ec.edu.ups.clases.Pato;
import ec.edu.ups.clases.Loro;

/**
 *
 * @author ASUS
 */
public class Principal {
    public static void main(String[] args) throws ParseException{
        
        
        Scanner l=new Scanner(System.in);
        String z="";
        boolean repetir =true;
        ControladorLoro controladorloro = new ControladorLoro();
        ControladorPato controladorpato = new ControladorPato();
        ControladorBuitre controladorbuitre = new ControladorBuitre();
        ControladorLechuza controladorlechuza = new ControladorLechuza();
    
    do {
        System.out.println("Digite la opcion que desea realizar?");
        System.out.println("1. CRUD LORO");
        System.out.println("2. CRUD PATO");
        System.out.println("3. CRUD BUITRE");
        System.out.println("4. CRUD LECHUZA");
        System.out.println("5. Salir");
            int x= l.nextInt();

            switch (x) {

                case 1:
                    boolean repLoro = true;
                    do {
                       
                        System.out.println("MENU LORO");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        int oploro= l.nextInt();
                        switch (oploro) {
                            case 1:
                                System.out.println("Ingrese el nombre:");
                                String nombre = l.next();
                                System.out.println("Ingrese el codigo:");
                                int codigo = l.nextInt();
                                System.out.println("Ingrese el peso:");
                                String peso=l.next();
                                System.out.println("Ingrese la edad:");
                                int edad=l.nextInt();
                                System.out.println("Ingresela fecha de nacimiento:");
                                Date fechaN= new SimpleDateFormat("dd/MM/yyyy").parse(l.next());
                                System.out.println("Ingrese  un medicamento:");
                                String medicamento=l.next();
                                System.out.println("Ingrese el nombre del Veterinario:");
                                String veterinario=l.next();
                                System.out.println("Ingrese el nombre del Dueño:");
                                String dueño=l.next();
                                System.out.println("Ingrese que clase de seguridad tiene Baja/Alta:");
                                String seguridad=l.next();
                                System.out.println("Ingrese el nombre del cautiverio:");
                                String cautiverio=l.next();
                                System.out.println("Ingrese que tipo de aseo es el adecuado/normal/medio/alto:");
                                String aseo=l.next();
                                System.out.println("Que tipo de fama tiene:");
                                String fama=l.next();
                                Loro objeto=new Loro(fama, fama, aseo, seguridad, cautiverio, dueño, veterinario, medicamento, codigo, peso, nombre, fechaN, edad);
                                controladorloro.create(objeto);
                                break;
                            case 2:
                                System.out.println("Ingrese el codigo del Loro");
                                int cod = l.nextInt();
                                System.out.println(controladorloro.read(cod));
                                break;
                            case 3:
                                System.out.println("Ingrese el codigo del loro");
                                cod = l.nextInt();
                                if (controladorloro.read(cod) != null) {
                                    System.out.println("Ingrese un nombre:");
                                    nombre =l.next();
                                    System.out.println("Ingrese el codigo:");
                                    codigo = l.nextInt();
                                    System.out.println("Ingrese el peso:");
                                    peso=l.next();
                                    System.out.println("Ingrese la edad:");
                                    edad=l.nextInt();
                                    System.out.println("Ingresela fecha de nacimiento:");
                                    fechaN= new SimpleDateFormat("dd/MM/yyyy").parse(l.next());
                                    System.out.println("Ingrese  un medicamento:");
                                    medicamento=l.next();
                                    System.out.println("Ingrese el nombre del Veterinario:");
                                    veterinario=l.next();
                                    System.out.println("Ingrese el nombre del Dueño:");
                                    dueño=l.next();
                                    System.out.println("Ingrese que clase de seguridad tiene Baja/Alta:");
                                    seguridad=l.next();
                                    System.out.println("Ingrese el nombre del cautiverio:");
                                    cautiverio=l.next();
                                    System.out.println("Ingrese que tipo de aseo es el adecuado/normal/medio/alto:");
                                    aseo=l.next();
                                    System.out.println("Que tipo de fama tiene:");
                                    fama=l.next();
                                
                                    objeto = new Loro(fama, fama, aseo, seguridad, cautiverio, dueño, veterinario, medicamento, codigo, peso, nombre, fechaN, edad);
                                    objeto.setCodigo(cod);
                                    controladorloro.update(objeto);
                                } else {
                                    System.out.println("El El loro no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del Loro que va a eliminar");
                                cod = l.nextInt();
                                controladorloro.delete(cod);
                                break;
                            case 5:
                                controladorloro.imprimir();
                                break;
                            case 6:
                                repLoro = false;
                                break;
                        }
                    } while (repLoro);
                    break;
                case 2:
                    boolean repPato = true;
                    do {
                        System.out.println("MENU PATO");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        int oppato = l.nextInt();
                        switch (oppato) {
                            case 1:
                                System.out.println("Ingrese el nombre:");
                                String nombre = l.next();
                                System.out.println("Ingrese el codigo:");
                                int codigo = l.nextInt();
                                System.out.println("Ingrese el peso:");
                                String peso=l.next();
                                System.out.println("Ingrese la edad:");
                                int edad=l.nextInt();
                                System.out.println("Ingresela fecha de nacimiento:");
                                Date fechaN= new SimpleDateFormat("dd/MM/yyyy").parse(l.next());
                                System.out.println("Ingrese  un medicamento:");
                                String medicamento=l.next();
                                System.out.println("Ingrese el nombre del Veterinario:");
                                String veterinario=l.next();
                                System.out.println("Ingrese el nombre del Dueño:");
                                String dueño=l.next();
                                System.out.println("Ingrese que clase de seguridad tiene Baja/Alta:");
                                String seguridad=l.next();
                                System.out.println("Ingrese el nombre del cautiverio:");
                                String cautiverio=l.next();
                                System.out.println("Ingrese nombre donde nada el Pato");
                                String nada=l.next();
                                System.out.println("Ingrese el nombre donde esta ubicado el estanque de agua");
                                String estanque=l.next();
                                Pato objeto = new Pato(nada, estanque, cautiverio, dueño, veterinario, medicamento, codigo, peso, nombre, fechaN, edad);
                                controladorpato.create(objeto);

                                break;
                            case 2:
                                System.out.println("Ingrese el codigo del pato");
                                int cod1 = l.nextInt();
                                System.out.println(controladorpato.read(cod1));
                                break;
                            case 3:
                                System.out.println("Ingrese el codigo del pato");
                                cod1 = l.nextInt();
                                if (controladorpato.read(cod1) != null) {
                                    System.out.println("Ingrese el nombre:");
                                nombre = l.next();
                                System.out.println("Ingrese el codigo:");
                                codigo = l.nextInt();
                                System.out.println("Ingrese el peso:");
                                peso=l.next();
                                System.out.println("Ingrese la edad:");
                                edad=l.nextInt();
                                System.out.println("Ingresela fecha de nacimiento:");
                                fechaN= new SimpleDateFormat("dd/MM/yyyy").parse(l.next());
                                System.out.println("Ingrese  un medicamento:");
                                medicamento=l.next();
                                System.out.println("Ingrese el nombre del Veterinario:");
                                veterinario=l.next();
                                System.out.println("Ingrese el nombre del Dueño:");
                                dueño=l.next();
                                System.out.println("Ingrese que clase de seguridad tiene Baja/Alta:");
                                seguridad=l.next();
                                System.out.println("Ingrese el nombre del cautiverio:");
                                cautiverio=l.next();
                                System.out.println("Ingrese nombre donde nada el Pato");
                                nada=l.next();
                                System.out.println("Ingrese el nombre donde esta ubicado el estanque de agua");
                                estanque=l.next();
                                objeto = new Pato(nada, estanque, cautiverio, dueño, veterinario, medicamento, codigo, peso, nombre, fechaN, edad);
                                objeto.setCodigo(cod1);
                                
                                    controladorpato.update(objeto);
                                } else {
                                    System.out.println("El pato no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del pato  que va a eliminar");
                                cod1 = l.nextInt();
                                controladorpato.delete(cod1);
                                break;
                            case 5:
                                controladorpato.imprimir();
                                break;
                            case 6:
                                repPato = false;
                                break;
                        }
                    } while (repPato);

                    break;
                case 3:
                    boolean repbuitre = true;
                    do {
                        System.out.println("MENU BUITRE");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        int opbuitre = l.nextInt();
                        switch (opbuitre) {
                            case 1:
                                System.out.println("Ingrese el nombre:");
                                String nombre = l.next();
                                System.out.println("Ingrese el codigo:");
                                int codigo = l.nextInt();
                                System.out.println("Ingrese el peso:");
                                String peso=l.next();
                                System.out.println("Ingrese la edad:");
                                int edad=l.nextInt();
                                System.out.println("Ingresela fecha de nacimiento:");
                                Date fechaN= new SimpleDateFormat("dd/MM/yyyy").parse(l.next());
                                System.out.println("que clase de animales come  siendo este carnivoro");
                                String Carnivoro=l.next();
                                System.out.println("En que simbolo es represntado el buitre o conocidomo commo condor tambien");
                                String simbolo=l.next();
                                System.out.println("Donde estan ubicada las cuevas de estos animales ");
                                String cueva=l.next();
                                System.out.println("Es posible que coma a otros depredadores");
                                String depredador=l.next();
                                Buitre objeto= new Buitre(Carnivoro, simbolo, cueva, depredador, codigo, peso, nombre, fechaN, edad);
                                controladorbuitre.create(objeto);
                                break;
                            case 2:
                                System.out.println("Ingrese el codigo del buitre");
                                int cod2 = l.nextInt();
                                System.out.println(controladorbuitre.read(cod2));
                                break;
                            case 3:
                                System.out.println("Ingrese el codigo del buitre");
                                cod2 = l.nextInt();
                                if (controladorbuitre.read(cod2) != null) {
                                     System.out.println("Ingrese el nombre:");
                                nombre = l.next();
                                System.out.println("Ingrese el codigo:");
                                codigo = l.nextInt();
                                System.out.println("Ingrese el peso:");
                                peso=l.next();
                                System.out.println("Ingrese la edad:");
                                edad=l.nextInt();
                                System.out.println("Ingresela fecha de nacimiento:");
                                fechaN= new SimpleDateFormat("dd/MM/yyyy").parse(l.next());
                                System.out.println("que clase de animales come  siendo este carnivoro");
                                Carnivoro=l.next();
                                System.out.println("En que simbolo es represntado el buitre o conocidomo commo condor tambien");
                                simbolo=l.next();
                                System.out.println("Donde estan ubicada las cuevas de estos animales ");
                                cueva=l.next();
                                System.out.println("Es posible que coma a otros depredadores");
                                depredador=l.next();
                                 objeto = new Buitre(Carnivoro, simbolo, cueva, depredador, codigo, peso, nombre, fechaN, edad);
                                 objeto.setCodigo(cod2);
                                 controladorbuitre.update(objeto);
                                } else {
                                    System.out.println("El buitre no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del buitre que va a eliminar");
                                cod2 = l.nextInt();
                                controladorbuitre.delete(cod2);
                                break;
                            case 5:
                                controladorbuitre.imprimir();
                                break;
                            case 6:
                                repbuitre = false;
                                break;
                        }
                    } while (repbuitre);

                    break;
                case 4:
                    boolean replechuza = true;
                    do {
                        System.out.println("MENU Lechuza");
                        System.out.println("1. Create");
                        System.out.println("2. Read");
                        System.out.println("3. Update");
                        System.out.println("4. Delete");
                        System.out.println("5. Regresar al menu principal");
                        System.out.println("Selecciona una opción");
                        int oplechuza = l.nextInt();
                        switch (oplechuza) {
                            case 1:
                                System.out.println("Ingrese el nombre:");
                                String nombre = l.next();
                                System.out.println("Ingrese el codigo:");
                                int codigo = l.nextInt();
                                System.out.println("Ingrese el peso:");
                                String peso=l.next();
                                System.out.println("Ingrese la edad:");
                                int edad=l.nextInt();
                                System.out.println("Ingresela fecha de nacimiento:");
                                Date fechaN= new SimpleDateFormat("dd/MM/yyyy").parse(l.next());
                                System.out.println("Que clase de animales come  siendo este tambien depredador");
                                String depredador=l.next();
                                System.out.println("Donde estan ubicada las cuevas de estos animales ");
                                String cueva=l.next();
                                System.out.println("ingrese el tiempo que pude estar en la luz del dia");
                                String tiempo=l.next();
                                System.out.println("Ingrese cual seria la forma de su cabeza");
                                String fcabeza=l.next();
                                System.out.println("Ingrese donde puede  hacer sus nidos ");
                                String aujeros=l.next();
                                Lechuza objeto = new Lechuza(nombre, aujeros, aujeros, cueva, depredador, codigo, peso, nombre, fechaN, edad);
                                controladorlechuza.create(objeto);
                                break;
                            case 2:
                                System.out.println("Ingrese el codigo de la lechuza");
                                int cod3 = l.nextInt();
                                System.out.println(controladorlechuza.read(cod3));
                                break;
                            case 3:
                                System.out.println("Ingrese el codigo de la lechuza");
                                cod3 = l.nextInt();
                                if (controladorlechuza.read(cod3) != null) {
                                    System.out.println("Ingrese el nombre:");
                                    nombre = l.next();
                                    System.out.println("Ingrese el codigo:");
                                    codigo = l.nextInt();
                                    System.out.println("Ingrese el peso:");
                                    peso=l.next();
                                    System.out.println("Ingrese la edad:");
                                    edad=l.nextInt();
                                    System.out.println("Ingresela fecha de nacimiento:");
                                    fechaN= new SimpleDateFormat("dd/MM/yyyy").parse(l.next());
                                    System.out.println("Que clase de animales come  siendo este tambien depredador");
                                    depredador=l.next();
                                    System.out.println("Donde estan ubicada las cuevas de estos animales ");
                                    cueva=l.next();
                                    System.out.println("ingrese el tiempo que pude estar en la luz del dia");
                                    tiempo=l.next();
                                    System.out.println("Ingrese cual seria la forma de su cabeza");
                                    fcabeza=l.next();
                                    System.out.println("Ingrese donde puede  hacer sus nidos ");
                                    aujeros=l.next();
                                    objeto = new Lechuza(nombre, aujeros, aujeros, cueva, depredador, codigo, peso, nombre, fechaN, edad);
                                    objeto.setCodigo(cod3);
                                    controladorlechuza.update(objeto);
                                    
                                } else {
                                    System.out.println("La lechuza  no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo la lechuza que va a eliminar");
                                cod3 = l.nextInt();
                                controladorlechuza.delete(cod3);
                                break;
                            case 5:
                                controladorlechuza.imprimir();
                                break;
                            case 6:
                                replechuza = false;
                                break;
                        }
                    } while (replechuza);

                    break;
                case 5:
                    repetir = false;

            }

        } while (repetir);
    }
    
}
