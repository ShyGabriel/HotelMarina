/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hegam
 */
public class Empleado extends Persona{
    private String puesto;

    public Empleado(String dni, String nombre, String apellido_paterno, String apellido_materno, String correo, String nro_telefono, String puesto) {
        super(dni, nombre, apellido_paterno, apellido_materno, correo, nro_telefono);
        this.puesto = puesto;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("\nDNI: " + dni +
                           "\nNombre: " + nombre +
                           "\nApellido Paterno: " + apellido_paterno +
                           "\nApellido Materno: " + apellido_materno +
                           "\nCorreo: " + correo +
                           "\nNro Telefonico: " + nro_telefono +
                           "\nPuesto: " + puesto);
    }
}
