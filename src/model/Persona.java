package model;

public class Persona {
    private String nombre;
    private Direccion direccion;
    //constructor
    public Persona(){
        nombre = "Max Villalobos";
        direccion = new Direccion();
    }
    //constructor con parametros
    public Persona(String nombre, Direccion direccion){
        this.nombre = nombre;
        this.direccion = direccion;
    }
    //getters
    //seters
    @Override
    public String toString(){
        return "Nombre: " + nombre + ". Dirección: " + direccion;
    }
}
