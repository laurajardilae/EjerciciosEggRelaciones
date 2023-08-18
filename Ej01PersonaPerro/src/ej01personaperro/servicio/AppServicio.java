/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej01personaperro.servicio;

import ej01personaperro.entidad.Perro;
import ej01personaperro.entidad.Persona;
import ej01personaperro.enumeraciones.RazasPerros;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ardil
 */
public class AppServicio {
    private List<Persona> personas = new ArrayList<>();
    private List<Perro> perros = new ArrayList<>();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public void ejecutar(){
        cargarPerros();
        cargarPersonas();
        adoptar();
        mostrarPersonasFelices();
    }
    
    public void cargarPerros(){
        perros.add(new Perro("Tommy",RazasPerros.BEAGLE,1,"Mediano"));
        perros.add(new Perro("Croissant",RazasPerros.COCKER,1,"Mediano"));
        perros.add(new Perro("Tequila",RazasPerros.SHIH_TZU,1,"Pequeño"));
        perros.add(new Perro("Fercho",RazasPerros.SCHNAUZER,1,"Grande"));
    }
    public void cargarPersonas(){
        personas.add(new Persona("Laura","Ardila",24,"1234"));
        personas.add(new Persona("Andres","Carnederes",30,"4567"));
        personas.add(new Persona("Lola","Sanchez",20,"7894"));
        personas.add(new Persona("Pepito","Perez",50,"5612"));
    }
    public void adoptar(){
        String opc;
        for (Persona persona : personas) {
            System.out.println("Hola " + persona.getNombre());
            verDisponibles();
            asignarPerro(persona);     
            
        }
    }
    public void verDisponibles(){
        for (Perro perro : perros) {
                if(!perro.isAdoptado()){
                    System.out.println(perro.toString());
                }                
            }
    }
    public void asignarPerro(Persona persona){
        String opc;
        boolean aux=false;
        int contador=4;
        
        do {
            if (contador != 1) {
                System.out.println("¿Qué perro quieres adoptar?");
                opc = scan.nextLine();

                for (Perro perro : perros) {
                    if (contador != 1) {
                        if (perro.getNombre().equals(opc)) {
                            if (!perro.isAdoptado()) {
                                persona.setPerro(perro);
                                perro.setAdoptado(true);
                                aux = true;
                                contador--;
                                break;

                            }
                        }
                    } else {
                        break;
                    }

                }
                if (!aux) {
                    System.out.println("Ese perro no se encuentra en la lista");
                }
            }else{
                for (Perro perro : perros) {
                    if(!perro.isAdoptado()){
                        System.out.println("Eres el afortunado nuevo dueño de: " + perro.getNombre());
                        persona.setPerro(perro);
                        perro.setAdoptado(true);
                        break;
                    }
                }
                
            }


        }while(!aux);      
    
    }
    public void mostrarPersonasFelices(){
        System.out.println(personas.toString());
    }
}


