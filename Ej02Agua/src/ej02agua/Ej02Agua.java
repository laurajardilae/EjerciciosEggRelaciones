/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej02agua;

import ej02agua.entidad.Juego;

/**
 *
 * @author ardil
 */
public class Ej02Agua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego juegoNuevo = new Juego();
        juegoNuevo.llenarJuego();
        juegoNuevo.ronda();
    }
    
}
