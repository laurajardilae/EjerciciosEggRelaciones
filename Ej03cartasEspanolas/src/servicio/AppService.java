package servicio;

import java.util.Scanner;

public class AppService {
    private cartaService cs = new cartaService();
    Scanner impr = new Scanner(System.in).useDelimiter("\n");
    public void ejecutar(){
        cs.crearBarajaCompleta();
        menu();
    }
    public void menu(){
        int a=0;
        while(a!=7){
            System.out.println("Que desea hacer:");
            System.out.println("1-Cuantas cartas quedan");
            System.out.println("2-Dame la siguiente carta");
            System.out.println("3-Cuales son las cartas que quedan?");
            System.out.println("4-Barajar cartas aun disponibles");
            System.out.println("5-Cuales son las cartas en la mesa");
            System.out.println("6-Quiero mas de una carta");
            System.out.println("7-Deseo salir");
            a = impr.nextInt();
            switch(a){
                case 1:
                    cs.cartasDisponibles();
                    break;

                case 2:
                    cs.siguienteCarta();
                    break;
                case 3:
                    cs.mostrarBaraja();
                    break;
                case 4:
                    cs.barajar();
                    break;
                case 5:
                    cs.cartasMonton();
                    break;
                case 6:
                    cs.darCartas();
                    break;

                case 7:
                    a=7;
                    break;
                default:
                    System.out.println("Ingrese un numero válido");
            }
        }
        System.out.println("Usted decidio salir, adiós");
    }
}
