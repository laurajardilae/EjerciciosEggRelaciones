/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej02agua.entidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ej02agua.entidad.Jugador;
import ej02agua.entidad.Revolver;


/**
 *
 * @author ardil
 */
public class Juego {

    private Revolver revolver;
    private List<Jugador> jugadores = new ArrayList<>();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");

    
    
    public void llenarJuego(){
    Revolver revolver = new Revolver();
    crearListaJugadores();
    }
    
    public void crearListaJugadores(){
        System.out.println("Ingrese el número de jugadores (1-6)");
        int numJugadores;
        do{
            numJugadores = Integer.parseInt(scan.next());
        }while(numJugadores<=0 || numJugadores>6);
        for (int i = 0; i < numJugadores; i++) {
            jugadores.add(new Jugador());
        }
        System.out.println(jugadores.toString());
    }
    
    
    public void ronda(){
        //boolean juegoContinua = true;
        //int turno=0;
        revolver.llenarRevolver();
        for(Jugador jugadorEnTurno: jugadores){
            jugadorEnTurno.disparo(revolver);
            System.out.println("///donde estamos: " + revolver.toString());
            if(jugadorEnTurno.isMojado()){
                break;
            }
            revolver.siguienteTurno();
            
        }
    }
}
