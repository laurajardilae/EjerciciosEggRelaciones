package entidad;

import enumeraciones.FormaDePago;

import java.time.LocalDate;

public class Cuota {
    private int numeroCuota;
    private double montoTotalCuota;
    private boolean pagada;
    private LocalDate fechaVencimiento;
    private FormaDePago formaDePago;

}
