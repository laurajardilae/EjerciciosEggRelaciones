package servicio;

import entidad.Producto;
import entidad.Tienda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AppService {
    private Map<Integer, Tienda> listaDeTiendas = new HashMap<>();
    private TiendaService tiendaService = new TiendaService();
    private ProductoService productoService = new ProductoService();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public void ejecutar(){
        tiendaPorDefecto();
        menuPrincipal();
    }
    public void tiendaPorDefecto(){
        Tienda t1 = new Tienda(productosPorDefecto(),"Norte","Laura Ardila");
        listaDeTiendas.put(t1.getId(),t1);
    }
    public Map<Integer, Producto> productosPorDefecto(){
        Producto p1 = new Producto("Arroz",1500,10);
        Producto p2 = new Producto("Pasta",4500,5);
        Producto p3 = new Producto("Jabon",500,5);
        Producto p4 = new Producto("Leche",5500,5);
        Producto p5 = new Producto("Pan",1500,5);
        Map<Integer, Producto> listaDeProductos1 = new HashMap<>();
        listaDeProductos1.put(p1.getId(),p1);
        listaDeProductos1.put(p2.getId(),p2);
        listaDeProductos1.put(p3.getId(),p3);
        return listaDeProductos1;
    }

    public void menuPrincipal(){
        int opc;
        do {
            System.out.println("MENÚ PRINCIPAL");
            System.out.println("1. Menú para tiendas");
            System.out.println("2. Menú para productos");
            System.out.println("3. Salir");
            opc = Integer.parseInt(scan.next());
            switch (opc){
                case 1:
                    menuTiendas();
                    break;
                case 2:
                    menuProductos();
                    break;
                case 3:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opcion inválida");
            }
        }while (opc!=3);


    }
    public void menuTiendas(){
        int opc;
        do {
            System.out.println("MENÚ TIENDAS");
            System.out.println("1. Ver lista de tiendas");
            System.out.println("2. Crear nueva tienda");
            System.out.println("3. Eliminar una tienda");
            System.out.println("4. Salir");
            opc = Integer.parseInt(scan.next());
            switch (opc){
                case 1:
                    verTiendas();
                    break;
                case 2:
                    Tienda nuevaTienda = tiendaService.crearTienda();
                    listaDeTiendas.put(nuevaTienda.getId(),nuevaTienda);
                    break;
                case 3:
                    System.out.println("Ingrese el ID de la tienda que desea eliminar");
                    verTiendas();
                    listaDeTiendas.remove(Integer.parseInt(scan.next()));
                    break;
                case 4:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Opcion inválida");
            }
        }while (opc!=4);


    }
    public void menuProductos(){
        int opc=0;
        int tiendaSeleccionada;
        do {
            System.out.println("MENÚ PRODUCTOS");
            tiendaSeleccionada=seleccionarTienda();
            while(tiendaSeleccionada!=0) {
                System.out.println("Seleccione una opción:");
                System.out.println("1. Ver lista de productos");
                System.out.println("2. Crear nuevo producto");
                System.out.println("3. Eliminar un producto");
                System.out.println("4. Modificar el stock de un producto");
                System.out.println("5. Regresar al menú anterior");
                opc = Integer.parseInt(scan.next());
                    switch (opc){
                        case 1:
                            tiendaService.verListaDeProductos(listaDeTiendas.get(tiendaSeleccionada));
                            break;
                        case 2:
                            Producto nuevoProducto = productoService.crearProducto();
                            listaDeTiendas.get(tiendaSeleccionada).getListaDeProductos().put(nuevoProducto.getId(),nuevoProducto);
                            break;
                        case 3:
                            System.out.println("Ingrese el ID del producto que desea eliminar");
                            tiendaService.verListaDeProductos(listaDeTiendas.get(tiendaSeleccionada));
                            listaDeTiendas.get(tiendaSeleccionada).getListaDeProductos().remove(Integer.parseInt(scan.next()));
                            break;
                        case 4:
                            System.out.println("Ingrese el ID del producto que desea modificar el stock");
                            tiendaService.verListaDeProductos(listaDeTiendas.get(tiendaSeleccionada));
                            int productoSeleccionado = Integer.parseInt(scan.next());
                            System.out.println("Ingrese el nuevo stock");
                            int nuevoStock = Integer.parseInt(scan.next());
                            listaDeTiendas.get(tiendaSeleccionada).getListaDeProductos().get(productoSeleccionado).setStock(nuevoStock);
                            break;
                        case 5:
                            tiendaSeleccionada=0;
                            break;
                        default:
                            System.out.println("Opcion inválida");
                    }
                }
            }while(tiendaSeleccionada!=0);
    }
    public int seleccionarTienda(){
        System.out.println("Seleccione la tienda que desea agregar o modificar productos o ingrese 0 para salir:");
        verTiendas();
        return Integer.parseInt(scan.next());

    }
    public void verTiendas(){
        listaDeTiendas.forEach((k,v) -> System.out.println("ID: " + k + " " + v.toString()));
    }
}
