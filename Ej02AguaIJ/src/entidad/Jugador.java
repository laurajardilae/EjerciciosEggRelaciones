package entidad;

public class Jugador {
    private static int contador = 0;
    private int id;
    private String nombre="Jugador ";
    private boolean mojado;



    public Jugador() {
        contador++;
        this.id=contador;
        this.nombre = nombre + id;
    }

    public void disparo(Revolver r){
        mojado = r.mojar();
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

    public String getNombre() {
        return nombre;
    }
}
