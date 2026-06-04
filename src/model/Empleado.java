package model;

public class Empleado extends Persona {
    private String cargo;
    private double sueldo;

    public Empleado(){
        super();
        cargo = "Developer";
        sueldo = 574000.0;
    }
    //constructor con parametros
    public Empleado(String nombre, Direccion direccion, String cargo, double sueldo){
        super(nombre, direccion);
        this.cargo = cargo;
        this.sueldo = sueldo;

    }
    //getters
    public String getCargo(){
        return cargo;
    }
    public double getSueldo(){
        return sueldo;
    }
    //setters
    public void setCargo( String nuevoCargo){
        cargo = nuevoCargo;
    }
    public void setSueldo( double nuevoSueldo){
        sueldo = nuevoSueldo;
    }
    @Override
    public String toString(){
        return super.toString() + " Cargo: " + cargo + "Sueldo: " + sueldo;
    }
}
