package model;
import util.Utilidades;

public class Persona {
    private String nombre;
    private String rut;
    private String telefono;
    private Direccion direccion;
    //constructor
    public Persona(){
        setNombre("Max Villalobos");
        setRut("18.048.360-8");
        setTelefono("+56912345678");
        setDireccion(new Direccion());
    }
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
    @Override
    public String toString(){

        return "Nombre: " + nombre +
                ". Rut: " + rut +
                ". Teléfono: " + telefono+
                ". Dirección: " + direccion;
    }
}
