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
                                System.out.println("Ingrese el codigo del profesional");
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
                                System.out.println("Ingrese el codigo del no profesional");
                                int cod1 = l.nextInt();
                                System.out.println(controladorpato.read(cod1));
                                break;
                            case 3:
                                System.out.println("Ingrese el codigo del no profesional");
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
                                    System.out.println("El no profesional no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del no profesional que va a eliminar");
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
                        System.out.println("MENU PATO");
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
                                System.out.println("Ingrese el codigo del lactante");
                                int cod2 = l.nextInt();
                                System.out.println(controladorbuitre.read(cod2));
                                break;
                            case 3:
                                System.out.println("Ingrese el codigo del lactante");
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
                                    System.out.println("El lactante no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del lactante que va a eliminar");
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
                    boolean repetirPreadolescente = true;
                    do {
                        System.out.println("Elija una opcion:\n1) Create\n2) Read\n3) Update\n4) Delete\n5) Listar\n6) Regresar");
                        int opcionPreadolescente = escaner.nextInt();
                        switch (opcionPreadolescente) {
                            case 1:
                                System.out.println("Ingrese un nombre:");
                                String nombre = escaner.next();
                                System.out.println("Ingrese año escolar:");
                                int anio = escaner.nextInt();
                                System.out.println("Ingrese calificacion escolar");
                                int calificacion = escaner.nextInt();
                                System.out.println("Ingrese si esta en bachillerato");
                                boolean bachi = escaner.nextBoolean();
                                System.out.println("Ingrese si esta en colegio publico");
                                boolean publico = escaner.nextBoolean();
                                System.out.println("Ingrese crecimiento de talla anual");
                                int talla = escaner.nextInt();
                                System.out.println("Es huerfano:");
                                boolean huerfano = escaner.nextBoolean();
                                System.out.println("Es vulnerable");
                                boolean vulnerable = escaner.nextBoolean();
                                System.out.println("Está en un orfanato:");
                                boolean orfanato = escaner.nextBoolean();
                                System.out.println("Fecha de nacimiento");
                                Date miDate = new SimpleDateFormat("dd/MM/yyyy").parse(escaner.next());
                                System.out.println("Sexo:");
                                String sexo = escaner.next();
                                System.out.println("Tipo de sangre:");
                                String sangre = escaner.next();
                                Preadolescente objeto = new Preadolescente(anio, calificacion, bachi, publico, talla, huerfano, vulnerable, orfanato, nombre, miDate, sexo, sangre);
                                controladorPreadolescente.create(objeto);
                                break;
                            case 2:
                                System.out.println("Ingrese el codigo del preadolescente");
                                int codigo2 = escaner.nextInt();
                                System.out.println(controladorPreadolescente.read(codigo2));
                                break;
                            case 3:
                                System.out.println("Ingrese el codigo del preadolescente");
                                codigo2 = escaner.nextInt();
                                if (controladorPreadolescente.read(codigo2) != null) {
                                    System.out.println("Ingrese un nombre:");
                                    nombre = escaner.next();
                                    System.out.println("Ingrese año escolar:");
                                    anio = escaner.nextInt();
                                    System.out.println("Ingrese calificacion escolar");
                                    calificacion = escaner.nextInt();
                                    System.out.println("Ingrese si esta en bachillerato");
                                    bachi = escaner.nextBoolean();
                                    System.out.println("Ingrese si esta en colegio publico");
                                    publico = escaner.nextBoolean();
                                    System.out.println("Ingrese crecimiento de talla anual");
                                    talla = escaner.nextInt();
                                    System.out.println("Es huerfano:");
                                    huerfano = escaner.nextBoolean();
                                    System.out.println("Es vulnerable");
                                    vulnerable = escaner.nextBoolean();
                                    System.out.println("Está en un orfanato:");
                                    orfanato = escaner.nextBoolean();
                                    System.out.println("Fecha de nacimiento");
                                    miDate = new SimpleDateFormat("dd/MM/yyyy").parse(escaner.next());
                                    System.out.println("Sexo:");
                                    sexo = escaner.next();
                                    System.out.println("Tipo de sangre:");
                                    sangre = escaner.next();
                                    objeto = new Preadolescente(anio, calificacion, bachi, publico, talla, huerfano, vulnerable, orfanato, nombre, miDate, sexo, sangre);
                                    objeto.setCodigo(codigo2);
                                    controladorPreadolescente.update(objeto);
                                } else {
                                    System.out.println("El preadolescente no existe");
                                }
                                break;
                            case 4:
                                System.out.println("Ingrese el codigo del adolescente que va a eliminar");
                                codigo2 = escaner.nextInt();
                                controladorPreadolescente.delete(codigo2);
                                break;
                            case 5:
                                controladorPreadolescente.imprimir();
                                break;
                            case 6:
                                repetirPreadolescente = false;
                                break;
                        }
                    } while (repetirPreadolescente);

                    break;
                case 5:
                    repetir = false;

            }

        } while (repetir);
    }
    
}
