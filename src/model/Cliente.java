package model;
/**
 * Representa un cliente que reserva tours turísticos.
 * Hereda de la clase Persona.
 *
 * @author Maximiliano Villalobos
 * @version 1.0
 */
public class Cliente extends Persona {
    private String tourReservado;
    private int cantidadPersonas;
    /**
     * Constructor por defecto.
     * Inicializa el cliente con valores predeterminados.
     */
    public Cliente() {
        super();
        setTourReservado("Ruta gastronómica");
        setCantidadPersonas(1);
    }
    /**
     * Constructor con parámetros.
     *
     * @param nombre Nombre del cliente.
     * @param rut RUT del cliente.
     * @param telefono Teléfono del cliente.
     * @param direccion Dirección del cliente.
     * @param tourReservado Tour reservado.
     * @param cantidadPersonas Cantidad de personas de la reserva.
     */
    public Cliente(String nombre, String rut, String telefono, Direccion direccion, String tourReservado, int cantidadPersonas) {
        super(nombre, rut, telefono, direccion);
        setTourReservado(tourReservado);
        setCantidadPersonas(cantidadPersonas);
    }
    //getters
    public String getTourReservado() {
        return tourReservado;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }
    //setters
    public void setTourReservado(String tourReservado) {
        if (tourReservado == null || tourReservado.isBlank()) {
            this.tourReservado = "Tour no informado";
        } else {
            this.tourReservado = tourReservado;
        }
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        if (cantidadPersonas <= 0) {
            this.cantidadPersonas = 1;
        } else {
            this.cantidadPersonas = cantidadPersonas;
        }
    }
    /**
     * Devuelve una representación textual del cliente.
     *
     * @return Información completa del cliente.
     */
    @Override
    public String toString() {
        return super.toString() +
                ". \nTour reservado: " + tourReservado +
                ". \nCantidad de personas: " + cantidadPersonas;
    }
}
