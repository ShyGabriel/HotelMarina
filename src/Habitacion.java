/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hegam
 */
public class Habitacion {
    private int numero;
    private String tipo;
    private double precio;

    public Habitacion(int numero, String tipo, double precio) {
        this.numero = numero;
        this.tipo = tipo;
        this.precio = precio;
    }

    public void mostrarInfo() {
        System.out.println("\nHabitación " + numero + 
                           "\nTipo: " + tipo + 
                           "\nPrecio: " + precio);
    }

    public int getNumero() {
        return numero;
    }
}
