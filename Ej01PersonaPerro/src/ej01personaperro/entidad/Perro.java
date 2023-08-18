/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej01personaperro.entidad;

import ej01personaperro.enumeraciones.RazasPerros;

/**
 *
 * @author ardil
 */
public class Perro {
    private String nombre;
    private RazasPerros raza;
    private int edad;
    private String tamanio;


    public Perro() {
    }

    public Perro(String nombre, RazasPerros raza, int edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public RazasPerros getRaza() {
        return raza;
    }

    public void setRaza(RazasPerros raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }


    
    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza.getFormato() + ", edad=" + edad + ", tamanio=" + tamanio + '}';
    }
    
}
