package model;

public class OperadorTuristico extends Empleado  {
    private String areaOperacion;
    private String turno;

    public OperadorTuristico() {
        super();
        setAreaOperacion("Coordinación de tours");
        setTurno("Diurno");
    }

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

    @Override
    public String toString() {
        return super.toString() +
                ". \nÁrea de operación: " + areaOperacion +
                ". \nTurno: " + turno;

    }
}
