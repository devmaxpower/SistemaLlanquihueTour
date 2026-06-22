package model;
/**
 * Representa un empleado de la agencia de turismo.
 * Hereda de la clase Persona.
 *
 * @author Maximiliano Villalobos
 * @version 1.0
 */
public class Empleado extends Persona {

    private String cargo;
    private double sueldo;
    /**
     * Constructor por defecto.
     * Inicializa empleado con valores predeterminados.
     */
    // Constructor vacío
    public Empleado() {
        super();
        setCargo("Guía Turístico");
        setSueldo(574000.0);
    }
    /**
     * Constructor con parámetros.
     *
     * @param nombre Nombre del empleado.
     * @param rut RUT del empleado.
     * @param telefono Teléfono del empleado.
     * @param direccion Dirección del empleado.
     * @param cargo Cargo desempeñado.
     * @param sueldo Sueldo del empleado.
     */
    // Constructor con parámetros
    public Empleado(
            String nombre,
            String rut,
            String telefono,
            Direccion direccion,
            String cargo,
            double sueldo) {

        super(nombre, rut, telefono, direccion);

        setCargo(cargo);
        setSueldo(sueldo);
    }

    // Getters
    public String getCargo() {
        return cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    // Setters
    public void setCargo(String nuevoCargo) {

        if (nuevoCargo == null || nuevoCargo.isBlank()) {
            this.cargo = "Cargo no informado";
        } else {
            this.cargo = nuevoCargo;
        }
    }

    public void setSueldo(double nuevoSueldo) {

        if (nuevoSueldo < 0) {
            this.sueldo = 0;
        } else {
            this.sueldo = nuevoSueldo;
        }
    }
    /**
     * Devuelve una representación textual del empleado.
     *
     * @return Información completa del empleado.
     */
    @Override
    public String toString() {

        return super.toString() +
                ". \nCargo: " + cargo +
                ". \nSueldo: $" + sueldo;
    }
}