/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hegam
 */
abstract class Persona {
    protected String dni;
    protected String nombre;
    protected String apellido_paterno;
    protected String apellido_materno;
    protected String correo;
    protected String nro_telefono;

    public Persona(String dni, String nombre, String apellido_paterno, String apellido_materno, String correo, String nro_telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido_paterno = apellido_paterno;
        this.apellido_materno = apellido_materno;
        this.correo = correo;
        this.nro_telefono = nro_telefono;
    }

    public abstract void mostrarInfo();
}
