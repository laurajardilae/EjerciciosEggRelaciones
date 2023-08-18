
package ej01personaperro.servicio;

import ej01personaperro.entidad.Perro;
import ej01personaperro.entidad.Persona;
import ej01personaperro.enumeraciones.RazasPerros;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lau
 */
public class AppServicio {

    private List<Persona> personas = new ArrayList<>();
    private List<Perro> perrosDisponibles = new ArrayList<>();
    private List<Perro> perrosAdoptados = new ArrayList<>();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public void ejecutar() {
        cargarPerros();
        cargarPersonas();
        adoptar();
        mostrarPersonasFelices();
    }

    public void cargarPerros() {
        perrosDisponibles.add(new Perro("Tommy", RazasPerros.BEAGLE, 1, "Mediano"));
        perrosDisponibles.add(new Perro("Croissant", RazasPerros.COCKER, 1, "Mediano"));
        perrosDisponibles.add(new Perro("Tequila", RazasPerros.SHIH_TZU, 1, "Pequeño"));
        perrosDisponibles.add(new Perro("Fercho", RazasPerros.SCHNAUZER, 1, "Grande"));
    }

    public void cargarPersonas() {
        personas.add(new Persona("Laura", "Ardila", 24, "1234"));
        personas.add(new Persona("Andres", "Carnederes", 30, "4567"));
        personas.add(new Persona("Lola", "Sanchez", 20, "7894"));
        personas.add(new Persona("Pepito", "Perez", 50, "5612"));
    }

    public void adoptar() {
        String opc;
        for (int i = 0; i < personas.size(); i++) {
            System.out.println("Hola " + personas.get(i).getNombre());
            if(i<personas.size()-1){
                verDisponibles();
                asignarPerro(personas.get(i));
            }else if(i==personas.size()-1){
                //Condicional que le asigna a la ultima persona el ultimo perro
                //siempre y cuando haya la misma cantidad de perros y de personas
                System.out.println("Felicidades, eres el nuevo dueño de: " + perrosDisponibles.get(0).getNombre());
                personas.get(i).setPerro(perrosDisponibles.get(0));
            }         
        }
        
    }

    public void verDisponibles() {
        System.out.println("Estos son los perritos que buscan hogar:");
        for (Perro perro : perrosDisponibles) {
            System.out.println(perro.toString());

        }
    }

    public void asignarPerro(Persona persona) {
        boolean encontrado = false;
        String perroUsuario;
        do {
            System.out.println("¿Qué perro desea adoptar?");
            perroUsuario = scan.next();
            for (Perro perro : perrosDisponibles) {
                if (perro.getNombre().equals(perroUsuario)) {
                    encontrado = true;
                    persona.setPerro(perro);
                    perrosAdoptados.add(perro);
                    System.out.println("Felicidades, su adopción fue exitosa");
                    System.out.println("-------------------------------------");
                    perrosDisponibles.remove(perro);
                    break;
                }          
            }
            if(!encontrado){
                    System.out.println("Ese nombre no se encuentra en la lista, intente nuevamente");
                }
        } while (!encontrado);
    }
    
    public void mostrarPersonasFelices(){
        System.out.println("----------------");
        personas.forEach((persona) -> System.out.println(persona));
        
    }
    
    

}







