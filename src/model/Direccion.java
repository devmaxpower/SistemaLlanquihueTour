package model;

public class Direccion {
    private String calle;
    private String ciudad;
    private String pais;
    //constructor
    public Direccion(){
        calle = "Enrique segoviano";
        ciudad = "Jalisco";
        pais = "Chile";
    }
    //Constructor con parametros
    public Direccion(String calle, String ciudad, String pais){
        this.calle = calle;
        this.ciudad = ciudad;
        this.pais = pais;
    }
    //getters
    public String getCalle(){
        return calle;
    }
    public String getCiudad(){
        return ciudad;
    }
    public String getPais(){
        return pais;
    }
    //setters
    public void setCalle( String nuevaCalle){
        calle = nuevaCalle;
    }
    public void setCiudad(String nuevaCiudad){
        ciudad = nuevaCiudad;
    }
    public void setPais(String nuevoPais){
        pais = nuevoPais;
    }
    @Override
    public String toString(){
        return "Calle: "+ calle + " Ciudad: " + ciudad + " País:" + pais;
    }
}
