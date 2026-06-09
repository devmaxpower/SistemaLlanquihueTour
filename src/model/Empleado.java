package model;

public class Empleado extends Persona {

    private String cargo;
    private double sueldo;

    // Constructor vacío
    public Empleado() {
        super();
        setCargo("Guía Turístico");
        setSueldo(574000.0);
    }

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

    @Override
    public String toString() {

        return super.toString() +
                ". Cargo: " + cargo +
                ". Sueldo: $" + sueldo;
    }
}