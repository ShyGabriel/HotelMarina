/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

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
