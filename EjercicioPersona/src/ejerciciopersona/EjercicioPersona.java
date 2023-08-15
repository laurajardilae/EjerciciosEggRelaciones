/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopersona;

import ejerciciopersona.enums.Nacionalidad;

/**
 *
 * @author ardil
 */
public class EjercicioPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona("Laura",new Dni("A", 1234));
        System.out.println(persona1.toString());
        persona1.getDni().setNumero(4567);
        System.out.println(persona1.toString());
        for (Nacionalidad aux: Nacionalidad.values()){
            System.out.println(aux);
        }
    }
    
}
