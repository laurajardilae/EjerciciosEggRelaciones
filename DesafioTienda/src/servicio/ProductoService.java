package servicio;

import entidad.Producto;
import entidad.Tienda;

import java.util.Scanner;

public class ProductoService {
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public Producto crearProducto(){
        Producto p = new Producto();
        System.out.println("Ingrese el nombre del producto:");
        p.setNombre(scan.next());
        System.out.println("Ingrese el precio del producto:");
        p.setPrecio(Integer.parseInt(scan.next()));
        System.out.println("Ingrese el stock del producto:");
        p.setStock(Integer.parseInt(scan.next()));
        return p;
    }

}
