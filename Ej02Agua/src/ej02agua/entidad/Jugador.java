/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej02agua.entidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ej02agua.entidad.Revolver;

/**
 *
 * @author ardil
 */
public class Jugador {
    private static int contador = 0;
    private int id;
    private String nombre="Jugador ";
    private boolean mojado=false;

    

    public Jugador() {
        contador++;
        this.id=contador;
        this.nombre = nombre + id;
    }
    
    public void disparo(Revolver r){
        boolean mojado = r.mojar();
        if(mojado){
            System.out.println("Perdiste");            
        }else{
            System.out.println("Tuviste suerte, pasa el revolver al siguiente jugador");
        }
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado +  '}';
    }
    
    
    
    
}
