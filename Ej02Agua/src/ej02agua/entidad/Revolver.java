/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej02agua.entidad;

import java.util.Random;

/**
 *
 * @author ardil
 */
public class Revolver {
    private Integer posicionActual;
    private Integer posicionAgua;

    public Revolver() {
    }
    
    
    public void llenarRevolver(){
        Random aleatorio = new Random();
        posicionActual = aleatorio.nextInt(6);
        posicionAgua = aleatorio.nextInt(6);
    }
    public boolean mojar(){
        return (posicionActual == posicionAgua);
    }
    public void siguienteTurno(){
        posicionActual++;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
    
    
}
