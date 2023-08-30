package entidad;

import enumeraciones.TipoDeCarro;

public class Vehiculo {
    private String marca;
    private String modelo;
    private int anio;
    private long numeroMotor;
    private String color;
    private TipoDeCarro tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anio, long numeroMotor, String color, TipoDeCarro tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numeroMotor = numeroMotor;
        this.color = color;
        this.tipo = tipo;
    }

}
