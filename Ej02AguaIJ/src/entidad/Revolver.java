package entidad;

import java.util.Random;

public class Revolver {
    private Integer posicionActual;
    private Integer posicionAgua;

    public Revolver() {
    }


    public void llenarRevolver(){
        Random aleatorio = new Random();
        posicionActual = aleatorio.nextInt(5);
        posicionAgua = aleatorio.nextInt(5);
    }
    public boolean mojar(){
        return (posicionActual == posicionAgua);
    }
    public void siguienteTurno(){
        if(posicionActual<5){
            posicionActual++;
        }else{
            posicionActual=0;
        }

    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }
}
