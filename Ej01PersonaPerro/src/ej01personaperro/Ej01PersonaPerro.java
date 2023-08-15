/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej01personaperro;

import ej01personaperro.entidad.Perro;
import ej01personaperro.entidad.Persona;
import ej01personaperro.enumeraciones.RazasPerros;

/**
 *
 * @author ardil
 */
public class Ej01PersonaPerro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro1 = new Perro("Chiquito",RazasPerros.BEAGLE,2,"Mediano");
        Persona persona1 = new Persona("Laura","Ardila",24,"1234",perro1);
        
        Persona persona2 = new Persona("Pipe","Ramirez",30,"4567",new Perro("Oddie",RazasPerros.SCHNAUZER,11,"Mediano"));
        
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
    
    }
    
}
