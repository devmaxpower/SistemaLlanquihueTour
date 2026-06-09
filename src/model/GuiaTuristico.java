package model;

public class GuiaTuristico extends Empleado {
    private String idioma;
    private String especialidad;

    public GuiaTuristico() {
        super();
        setIdioma("Español");
        setEspecialidad("Rutas culturales");
    }

    public GuiaTuristico(String nombre, String rut, String telefono, Direccion direccion, String cargo, double sueldo, String idioma, String especialidad) {
        super(nombre, rut, telefono, direccion, cargo, sueldo);
        setIdioma(idioma);
        setEspecialidad(especialidad);
    }
    //getters
    public String getIdioma() {
        return idioma;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    //setters
    public void setIdioma(String idioma) {
        if (idioma == null || idioma.isBlank()) {
            this.idioma = "Idioma no informado";
        } else {
            this.idioma = idioma;
        }
    }

    public void setEspecialidad(String especialidad) {
        if (especialidad == null || especialidad.isBlank()) {
            this.especialidad = "Especialidad no informada";
        } else {
            this.especialidad = especialidad;
        }
    }
    @Override
    public String toString() {
        return super.toString() +
                ". \nIdioma: " + idioma +
                ". \nEspecialidad: " + especialidad;
    }
}
