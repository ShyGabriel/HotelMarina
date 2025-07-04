
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hegam
 */
public class HotelApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ingresar datos del cliente
        System.out.println("Ingrese DNI del cliente:");
        String dniCliente = sc.nextLine();
        System.out.println("Ingrese nombre del cliente:");
        String nombreCliente = sc.nextLine();
        System.out.println("Ingrese apellido paterno del cliente:");
        String apellidoPaternoCliente = sc.nextLine();
        System.out.println("Ingrese apellido materno del cliente:");
        String apellidoMaternoCliente = sc.nextLine();
        System.out.println("Ingrese correo del cliente:");
        String correoCliente = sc.nextLine();
        System.out.println("Ingrese numero telefonico del cliente:");
        String nroTelCliente = sc.nextLine();
        Cliente cliente = new Cliente(dniCliente, nombreCliente, apellidoPaternoCliente, apellidoMaternoCliente, correoCliente, nroTelCliente);

        // Ingresar datos de la habitación
        System.out.println("Ingrese número de habitación:");
        int numeroHab = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        System.out.println("Ingrese tipo de habitación:");
        String tipoHab = sc.nextLine();
        System.out.println("Ingrese precio de habitación:");
        double precioHab = sc.nextDouble();

        Habitacion habitacion = new Habitacion(numeroHab, tipoHab, precioHab);

        // Crear reserva
        Reserva reserva = new Reserva(cliente, habitacion);
        reserva.reservar();

        sc.close();
    }
}
