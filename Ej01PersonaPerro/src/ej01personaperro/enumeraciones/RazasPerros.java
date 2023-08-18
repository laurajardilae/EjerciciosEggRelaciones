/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej01personaperro.enumeraciones;

/**
 *
 * @author ardil
 */
public enum RazasPerros {
    BEAGLE("Beagle"), SCHNAUZER("Schnauzer"), SHIH_TZU("Chitzu"),SAMOYEDO("Samoyedo"),COCKER("Cocker)");
    
    private String formato;

    private RazasPerros(String formato) {
        this.formato = formato;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
    
    
    
    
    
}
