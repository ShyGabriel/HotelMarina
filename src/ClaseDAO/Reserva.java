/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseDAO;

import Utilitarios.ConexionBBDD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alama
 */
public class Reserva {

    private String dni;
    public String nombre;
    public String apellidoPaterno;
    public String apellidoMaterno;
    public String correo;
    public String telefono;
    public int numHabitacion;
    public String tipoHabitacion;
    public double precio;

    
    public Reserva(String dni, String nombre, String apellidoPaterno, String apellidoMaterno,
            String correo, String telefono, int numHabitacion, String tipoHabitacion, double precio) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.correo = correo;
        this.telefono = telefono;
        this.numHabitacion = numHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.precio = precio;
    }

    public boolean validarCampos() {
        if (dni.isEmpty() || nombre.isEmpty() || apellidoPaterno.isEmpty()
                || apellidoMaterno.isEmpty() || correo.isEmpty() || telefono.isEmpty()
                || tipoHabitacion.isEmpty() || numHabitacion <= 0 || precio <= 0) {
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos correctamente.");
            return false;
        }

        if (dni.length() < 8) {
            JOptionPane.showMessageDialog(null, "El DNI debe tener al menos 8 dígitos.");
            return false;
        }

        if (!correo.contains("@")) {
            JOptionPane.showMessageDialog(null, "Correo electrónico no válido.");
            return false;
        }

        return true;
    }

    public boolean registrar() {
        if (!validarCampos()) {
            return false;
        }

        Connection con = ConexionBBDD.getConnection();
        String sql = "INSERT INTO reserva (dni, nombre, apellido_paterno, apellido_materno, correo, telefono, num_habitacion, tipo_habitacion, precio) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, nombre);
            ps.setString(3, apellidoPaterno);
            ps.setString(4, apellidoMaterno);
            ps.setString(5, correo);
            ps.setString(6, telefono);
            ps.setInt(7, numHabitacion);
            ps.setString(8, tipoHabitacion);
            ps.setDouble(9, precio);

            ps.executeUpdate();
            con.close();

            JOptionPane.showMessageDialog(null, "✅ Reserva registrada correctamente.");
            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "❌ Error al registrar reserva: " + e.getMessage());
            return false;
        }
    }

    public static void listarReservas(JTable tabla) {
        Connection con = ConexionBBDD.getConnection();
        DefaultTableModel modelo = new DefaultTableModel();

        // Define columnas
        modelo.addColumn("ID");
        modelo.addColumn("DNI");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido Pat");
        modelo.addColumn("Apellido Mat");
        modelo.addColumn("Correo");
        modelo.addColumn("Nro Teléfono");
        modelo.addColumn("Nro Habitación");
        modelo.addColumn("Tipo Hab");
        modelo.addColumn("Precio");

        String sql = "SELECT id, dni, nombre, apellido_paterno, apellido_materno, correo, telefono, num_habitacion, tipo_habitacion, precio FROM reserva";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Object[] fila = new Object[10];
                fila[0] = rs.getInt("id");
                fila[1] = rs.getString("dni");
                fila[2] = rs.getString("nombre");
                fila[3] = rs.getString("apellido_paterno");
                fila[4] = rs.getString("apellido_materno");
                fila[5] = rs.getString("correo");
                fila[6] = rs.getString("telefono");
                fila[7] = rs.getInt("num_habitacion");
                fila[8] = rs.getString("tipo_habitacion");
                fila[9] = rs.getDouble("precio");

                modelo.addRow(fila);
            }

            tabla.setModel(modelo);
            con.close();

        } catch (Exception e) {
            System.out.println("❌ Error al listar reservas: " + e.getMessage());
        }
    }

    // Al final de tu clase Reserva:
    public static Reserva buscarPorDNI(String dni) {
        Connection con = ConexionBBDD.getConnection();
        String sql = "SELECT * FROM reserva WHERE dni = ?";
        Reserva reserva = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                reserva = new Reserva(
                        rs.getString("dni"),
                        rs.getString("nombre"),
                        rs.getString("apellido_paterno"),
                        rs.getString("apellido_materno"),
                        rs.getString("correo"),
                        rs.getString("telefono"),
                        rs.getInt("num_habitacion"),
                        rs.getString("tipo_habitacion"),
                        rs.getDouble("precio")
                );
            }

            con.close();

        } catch (Exception e) {
            System.out.println("❌ Error al buscar reserva: " + e.getMessage());
        }

        return reserva;
    }

    public static boolean actualizarReserva(Reserva r) {
        Connection con = ConexionBBDD.getConnection();
        String sql = "UPDATE reserva SET nombre=?, apellido_paterno=?, apellido_materno=?, correo=?, telefono=?, num_habitacion=?, tipo_habitacion=?, precio=? WHERE dni=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, r.nombre);
            ps.setString(2, r.apellidoPaterno);
            ps.setString(3, r.apellidoMaterno);
            ps.setString(4, r.correo);
            ps.setString(5, r.telefono);
            ps.setInt(6, r.numHabitacion);
            ps.setString(7, r.tipoHabitacion);
            ps.setDouble(8, r.precio);
            ps.setString(9, r.dni);

            int rows = ps.executeUpdate();
            con.close();

            return rows > 0;

        } catch (Exception e) {
            System.out.println("❌ Error al actualizar reserva: " + e.getMessage());
            return false;
        }
    }

    public static boolean eliminarPorDNI(String dni) {
        Connection con = ConexionBBDD.getConnection();
        String sql = "DELETE FROM reserva WHERE dni = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            int rows = ps.executeUpdate();
            con.close();

            return rows > 0;

        } catch (Exception e) {
            System.out.println("❌ Error al eliminar reserva: " + e.getMessage());
            return false;
        }
    }

}
