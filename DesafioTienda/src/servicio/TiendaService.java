package servicio;

import entidad.Producto;
import entidad.Tienda;

import java.util.Scanner;

public class TiendaService {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public Tienda crearTienda(){
        Tienda t = new Tienda();
        System.out.println("Ingrese la ubicación de la nueva tienda:");
        t.setUbicacion(scan.next());
        System.out.println("Ingrese el nombre del representante:");
        t.setRepresentante(scan.next());
        return t;
    }
    public void verListaDeProductos(Tienda tienda){
        tienda.getListaDeProductos().forEach((k,v) -> System.out.println(k + " " + v));
    }
}
