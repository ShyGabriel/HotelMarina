package Clases;


import Clases.Habitacion;
import Clases.Cliente;

/**
 *
 * @author hegam
 */
public class Reserva implements Reservable{
    private Cliente cliente;
    private Habitacion habitacion;

    public Reserva(Cliente cliente, Habitacion habitacion) {
        this.cliente = cliente;
        this.habitacion = habitacion;
    }

    @Override
    public void reservar() {
        System.out.println("¡Reserva realizada!");
        cliente.mostrarInfo();
        habitacion.mostrarInfo();
    }
}
