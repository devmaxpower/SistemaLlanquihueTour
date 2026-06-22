package model;
/**
 * Representa un operador turístico de la agencia.
 * Hereda de la clase Empleado.
 *
 * @author Maximiliano Villalobos
 * @version 1.0
 */
public class OperadorTuristico extends Empleado  {
    private String areaOperacion;
    private String turno;
    /**
     * Constructor por defecto.
     * Inicializa el Operador turístico con valores predeterminados.
     */
    public OperadorTuristico() {
        super();
        setAreaOperacion("Coordinación de tours");
        setTurno("Diurno");
    }
    /**
     * Constructor con parámetros.
     *
     * @param nombre Nombre del operador.
     * @param rut RUT del operador.
     * @param telefono Teléfono del operador.
     * @param direccion Dirección del operador.
     * @param cargo Cargo desempeñado.
     * @param sueldo Sueldo del operador.
     * @param areaOperacion Área de operación.
     * @param turno Turno de trabajo.
     */
    public OperadorTuristico(String nombre, String rut, String telefono, Direccion direccion, String cargo, double sueldo, String areaOperacion, String turno) {
        super(nombre, rut, telefono, direccion, cargo, sueldo);
        setAreaOperacion(areaOperacion);
        setTurno(turno);
    }
    //getters
    public String getAreaOperacion() {
        return areaOperacion;
    }

    public String getTurno() {
        return turno;
    }
    //setters
    public void setAreaOperacion(String areaOperacion) {
        if (areaOperacion == null || areaOperacion.isBlank()) {
            this.areaOperacion = "Área no informada";
        } else {
            this.areaOperacion = areaOperacion;
        }
    }

    public void setTurno(String turno) {
        if (turno == null || turno.isBlank()) {
            this.turno = "Turno no informado";
        } else {
            this.turno = turno;
        }
    }
    /**
     * Devuelve una representación textual del operador turístico.
     *
     * @return Información completa del operador turístico.
     */
    @Override
    public String toString() {
        return super.toString() +
                ". \nÁrea de operación: " + areaOperacion +
                ". \nTurno: " + turno;

    }
}
