package entidades;

import java.util.Arrays;

public class Sala {
    private Pelicula pelicula;
    private Espectador[][] sala = new Espectador[8][6];
    private double precioEntrada;

    public Sala() {
    }

    public Sala(Pelicula pelicula, Espectador[][] sala, double precioEntrada) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precioEntrada = precioEntrada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Espectador[][] getSala() {
        return sala;
    }

    public void setSala(Espectador[][] sala) {
        this.sala = sala;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "pelicula=" + pelicula +
                ", sala=" + Arrays.toString(sala) +
                ", precioEntrada=" + precioEntrada +
                '}';
    }
    public void verSala(){
        String[] columnas = {"A","B","C","D","E","F"};
        String[] filas = {"8","7","6","5","4","3","2","1"};
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(filas[i]);
                System.out.print(columnas[j]);
                if(sala[i][j]!=null){
                    System.out.print(" X ");
                }else{
                    System.out.print("   ");
                }
                System.out.print(" | ");
            }
            System.out.println("");
        }
    }
}