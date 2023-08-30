package servicios;

import entidades.Espectador;

import java.util.Scanner;

public class EspectadorServicio {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public Espectador crearNuevoEspectador(){
        Espectador espectador = new Espectador();
        System.out.println("Ingrese su nombre:");
        espectador.setNombre(scan.next());
        System.out.println("Ingrese su edad:");
        espectador.setEdad(Integer.parseInt(scan.next()));
        System.out.println("Ingrese cuanto desea recargar en su tarjeta de cine:");
        espectador.setDineroDisponible(Integer.parseInt(scan.next()));
        return espectador;
    }
}
