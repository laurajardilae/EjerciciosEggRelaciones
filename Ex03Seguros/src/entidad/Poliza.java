package entidad;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Poliza {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private int numeroDePoliza;
    private static int contador=100;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double valor;
    private List<Cuota> totalCuotas = new ArrayList<>();

}
