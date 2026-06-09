package model;

public class Cliente extends Persona {
    private String tourReservado;
    private int cantidadPersonas;

    public Cliente() {
        super();
        setTourReservado("Ruta gastronómica");
        setCantidadPersonas(1);
    }

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

    @Override
    public String toString() {
        return super.toString() +
                ". Tour reservado: " + tourReservado +
                ". Cantidad de personas: " + cantidadPersonas;
    }
}
