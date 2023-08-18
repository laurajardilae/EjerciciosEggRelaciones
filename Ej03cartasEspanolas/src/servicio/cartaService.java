package servicio;

import entidad.Carta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class cartaService {
    private List<Carta> baraja= new ArrayList<>();
    private List<Carta> monton = new ArrayList<>();
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    public void crearBarajaCompleta(){
        for (int i = 0; i < 4; i++) {

            for (int j = 1; j < 13; j++) {
                Carta carta = new Carta();
                if (j==8||j==9){
                    continue;
                }else{
                    carta.setNumero(j);
                    switch (i){
                        case 0:
                            carta.setPalo("Espadas");
                            break;
                        case 1:
                            carta.setPalo("Bastos");
                            break;
                        case 2:
                            carta.setPalo("Oros");
                            break;
                        case 3:
                            carta.setPalo("Copas");
                            break;
                    }
                    baraja.add(carta);
                }
            }

        }
    }
    public void barajar(){
        Collections.shuffle(baraja);
    }
    public void siguienteCarta(){
        System.out.println("La carta es " + baraja.get(0));
        monton.add(baraja.get(0));
        baraja.remove(0);
    }
    public void cartasDisponibles(){
        System.out.println("Hay " + baraja.size()+ " disponibles para repartir");;
    }
    public void darCartas(){
        System.out.println("Ingrese la cantidad de cartas que necesita: ");
        int cantidadCartas = Integer.parseInt(scan.next());
        if(cantidadCartas<=baraja.size()){
            for (int i = 0; i < cantidadCartas; i++) {
                siguienteCarta();
            }
        }else{
            System.out.println("No hay suficientes cartas disponibles");
        }
    }
    public void cartasMonton(){
        if(monton.size()==0){
            System.out.println("No ha salido ninguna carta");
        }else{
            monton.forEach(carta-> System.out.println(carta.toString()));
        }
    }
    public void mostrarBaraja(){
        if(baraja.size()==0){
            System.out.println("La baraja está vacia");
        }else{
            baraja.forEach(carta-> System.out.println(carta.toString()));
        }
    }
    public List<Carta> getBarajaCompleta() {
        return baraja;
    }

    @Override
    public String toString() {
        return "cartaService{" +
                "barajaCompleta=" + baraja +
                '}';
    }
}
