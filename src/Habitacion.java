/**
 *
 * @author hegam
 */
public class Habitacion {
    protected int numero;
    protected String tipo;
    double precio;

    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public void mostrarInfo() {
        System.out.println("\nHabitación " + numero + 
                           "\nTipo: " + tipo + 
                           "\nPrecio: " + calcularPrecioHabitacion());
    }
    
    public double calcularPrecioHabitacion(){
        
        switch (tipo) {
            case "HABITACION INDIVIDUAL":
                precio = 85.90;
                break;
            case "HABITACION DOBLE":
                precio = 105.90;
                break;
            case "HABITACION TRIPLE":
                precio = 125.90;
                break;
            case "HABITACION CUADRUPLE":
                precio = 145.90;
                break;
            case "HABITACION SUITE":
                precio = 200.90;
                break;
            case "HABITACION PRESIDENCIAL":
                precio = 1250.90;
                break;
        }
        return precio;
    }

    public int getNumero() {
        return numero;
    }
    
    public double getPrecio(){
        return precio;
    }
}
