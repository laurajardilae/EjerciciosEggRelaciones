package entidad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tienda {
    private int id;
    private static int contador=0;
    private Map<Integer, Producto> listaDeProductos = new HashMap<>();
    private String ubicacion;
    private String representante;

    public Tienda() {
        contador++;
        id=contador;
    }

    public Tienda(Map<Integer, Producto> listaDeProductos, String ubicacion, String representante) {
        contador++;
        id=contador;
        this.listaDeProductos = listaDeProductos;
        this.ubicacion = ubicacion;
        this.representante = representante;
    }

    public int getId() {
        return id;
    }


    public Map<Integer, Producto> getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(Map<Integer, Producto> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    @Override
    public String toString() {
        return "Tienda{" +
                "id=" + id +
                ", ubicacion='" + ubicacion + '\'' +
                ", representante='" + representante + '\'' +
                ", listaDeProductos=" + listaDeProductos +
                '}';
    }
}
