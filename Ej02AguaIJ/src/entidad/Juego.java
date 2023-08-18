package entidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Juego {
    private Revolver revolver= new Revolver();
    private List<Jugador> jugadores = new ArrayList<>();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");



    public void llenarJuego(){
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
    }


    public void ronda(){
        revolver.llenarRevolver();
        boolean juegoContinua=true;
        while(juegoContinua){
            for(Jugador jugadorEnTurno: jugadores){
                System.out.println("Está jugando el " + jugadorEnTurno.getNombre());
                esperar(1);
                jugadorEnTurno.disparo(revolver);
                esperar(1);
                //System.out.println("Donde estamos "+revolver.toString());
                System.out.println("----------");
                esperar(1);
                if(jugadorEnTurno.isMojado()){
                    juegoContinua=false;
                    break;
                }
                revolver.siguienteTurno();
            }
        }

    }
    public void esperar(int n){
        //Ponemos a "Dormir" el programa durante los ms que queremos
        try {
            Thread.sleep(n * 1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
