package model;
/**
 * Representa un guía turístico de la agencia.
 * Hereda de la clase Empleado.
 *
 * @author Maximiliano Villalobos
 * @version 1.0
 */
public class GuiaTuristico extends Empleado {
    private String idioma;
    private String especialidad;
    /**
     * Constructor por defecto.
     * Inicializa el Guia turístico con valores predeterminados.
     */
    public GuiaTuristico() {
        super();
        setIdioma("Español");
        setEspecialidad("Rutas culturales");
    }
    /**
     * Constructor con parámetros.
     *
     * @param nombre Nombre del guía.
     * @param rut RUT del guía.
     * @param telefono Teléfono del guía.
     * @param direccion Dirección del guía.
     * @param cargo Cargo desempeñado.
     * @param sueldo Sueldo del guía.
     * @param idioma Idioma que domina.
     * @param especialidad Especialidad turística.
     */
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
    /**
     * Devuelve una representación textual del guía turístico.
     *
     * @return Información completa del guía turístico.
     */
    @Override
    public String toString() {
        return super.toString() +
                ". \nIdioma: " + idioma +
                ". \nEspecialidad: " + especialidad;
    }
}
