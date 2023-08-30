package servicios;

import entidades.Espectador;
import entidades.Pelicula;
import entidades.Sala;

import java.util.Scanner;

public class AppServicio {
    private Sala sala1 = new Sala();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public void ejecutar(){
        EspectadorServicio espectadorServicio = new EspectadorServicio();
        System.out.println("¡BIENVENIDO!");
        datosPorDefecto();
        menu(espectadorServicio);
    }
    public void menu(EspectadorServicio espectadorServicio){
        int opc;
        do{
            System.out.println("-----------MENÚ----------");
            System.out.println("1. Comprar entradas");
            System.out.println("2. Ver sala");
            System.out.println("3. Salir");
            opc = Integer.parseInt(scan.next());
            switch (opc){
                case 1:
                    comprarEntradas(espectadorServicio);
                    break;
                case 2:
                    sala1.verSala();
                    break;
                case 3:
                    System.out.println("Hasta luego");
                default:
                    System.out.println("Opción inválida");

            }
        }while(opc!=3);


    }
    public void comprarEntradas(EspectadorServicio espectadorServicio){
        System.out.println("Indique el número de entradas que desea comprar:");
        int numeroEntradas = Integer.parseInt(scan.next());
        for (int i = 0; i < numeroEntradas; i++) {
            Espectador espectador = espectadorServicio.crearNuevoEspectador();
            if(espectador.getEdad()>=sala1.getPelicula().getEdadMinima()){
                preguntarAsiento(espectador);
            }else{
                System.out.println("El espectador no cumple con la edad mínima para ingresar a la pelicula");
                break;
            }

        }
    }
    public void preguntarAsiento(Espectador espectador){
        sala1.verSala();
        System.out.println("-----------------------------------------");
        System.out.println("Recuerde seleccionar un asiento libre :)");
        System.out.println("Ingrese la fila del asiento que desea tomar (numero):");
        int fila = Integer.parseInt(scan.next());
        System.out.println("Ingrese la columna del asiento que desea tomar (letra):");
        String columna = scan.next().toUpperCase();

        int filaConvertida=filaConversion(fila);
        System.out.println("filaC"+filaConvertida);
        int columnaConvertida = columnaConversion(columna);
        System.out.println("columnaC" + columnaConvertida);

        if(filaConvertida>=0&&filaConvertida<8&&columnaConvertida>=0&&columnaConvertida<6){
            asignarAsiento(filaConvertida,columnaConvertida,espectador);
            System.out.println("Asiento asignado con éxito");
        }else{
            System.out.println("El asiento ingresado no es válido");
            preguntarAsiento(espectador);
        }
    }
    public int filaConversion(int filaIngresada){
        String[] filas = {"7","6","5","4","3","2","1","0"};
        if(filaIngresada>0&&filaIngresada<=8){
            return Integer.parseInt(filas[filaIngresada-1]);
        }else{
            return -1;
        }
    }
    public int columnaConversion(String columnaIngresada){
        switch (columnaIngresada){
            case "A": return 0;
            case "B": return 1;
            case "C": return 2;
            case "D": return 3;
            case "E": return 4;
            case "F": return 5;
            default: return -1;
        }
    }
    public void asignarAsiento(int fila, int columna,Espectador espectador){
        if (sala1.getSala()[fila][columna]==null) {
            sala1.getSala()[fila][columna]=espectador;
        }else {
            System.out.println("Asiento ocupado");
            preguntarAsiento(espectador);
        }
    }


    public void datosPorDefecto(){
        sala1.setPelicula(new Pelicula("Barbie",114,13,"Greta Gerwig"));
        sala1.setPrecioEntrada(10);
        espectadoresPorDefecto();
    }
    public void espectadoresPorDefecto(){
        Espectador espectador1 = new Espectador("Laura", 24,100);
        Espectador espectador2 = new Espectador("Juan", 29,100);
        Espectador espectador3 = new Espectador("Felipe", 26,100);
        Espectador espectador4 = new Espectador("Nathalia", 26,5);
        Espectador espectador5 = new Espectador("Alejandra", 12,100);
        sala1.getSala()[1][0]=espectador1;
        sala1.getSala()[1][1]=espectador2;
        sala1.getSala()[4][2]=espectador3;
        sala1.getSala()[4][3]=espectador4;
        sala1.getSala()[4][4]=espectador5;
    }


}
