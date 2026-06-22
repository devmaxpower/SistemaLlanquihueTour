package model;
import util.Utilidades;
/**
 * Constructor por defecto.
 * Inicializa la persona con valores predeterminados.
 */
public class Persona {
    private String nombre;
    private String rut;
    private String telefono;
    private Direccion direccion;
    //constructor
    /**
     * Constructor por defecto.
     * Inicializa la persona con valores predeterminados.
     */
    public Persona(){
        setNombre("Max Villalobos");
        setRut("18.048.360-8");
        setTelefono("+56912345678");
        setDireccion(new Direccion());
    }
    /**
     * Constructor con parámetros.
     *
     * @param nombre Nombre de la persona.
     * @param rut RUT de la persona.
     * @param telefono Teléfono de contacto.
     * @param direccion Dirección asociada.
     */
    //constructor con parametros
    public Persona(String nombre, String rut, String telefono, Direccion direccion){
        setNombre(nombre);
        setRut(rut);
        setTelefono(telefono);
        setDireccion(direccion);
    }
    //getters
    public String getNombre() {
        return nombre;
    }
    public String getRut() {
        return rut;
    }
    public String getTelefono() {
        return telefono;
    }
    public Direccion getDireccion() {
        return direccion;
    }
    //setters
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            this.nombre = "Sin nombre";
        } else {
            this.nombre = nombre;
        }
    }
    public void setRut(String rut) {
        if (rut == null || rut.isBlank()) {
            this.rut = "RUT no informado";
        } else {
            if (Utilidades.validarRut(rut)) {
                this.rut = rut;
            } else {
                this.rut = "RUT inválido";
            }
        }

    }
    public void setTelefono(String telefono) {
        if (telefono == null || telefono.isBlank()) {
            this.telefono = "+56900000000";
        } else {
            this.telefono = telefono;
        }
    }
    public void setDireccion(Direccion direccion) {
        if (direccion == null) {
            this.direccion = new Direccion();
        } else {
            this.direccion = direccion;
        }
    }
    //seters
    /**
     * Devuelve una representación textual de la persona.
     *
     * @return Información de la persona en formato String.
     */
    @Override
    public String toString(){

        return "\nNombre: " + nombre +
                ". \nRut: " + rut +
                ". \nTeléfono: " + telefono+
                ". \nDirección: " + direccion;
    }
}
