package model;
/**
 * Representa una dirección física.
 * Contiene calle, ciudad y país.
 *
 * @author Maximiliano Villalobos
 * @version 1.0
 */
public class Direccion {
    private String calle;
    private String ciudad;
    private String pais;
    //constructor
    /**
     * Constructor por defecto.
     * Inicializa la dirección con valores predeterminados.
     */
    public Direccion(){
        setCalle("Enrique Segoviano");
        setCiudad("Llanquihue");
        setPais("Chile");
    }
    //Constructor con parametros
    /**
     * Constructor con parámetros.
     *
     * @param calle Calle de la dirección.
     * @param ciudad Ciudad de la dirección.
     * @param pais País de la dirección.
     */
    public Direccion(String calle, String ciudad, String pais){
        setCalle(calle);
        setCiudad(ciudad);
        setPais(pais);
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
        if (nuevaCalle == null || nuevaCalle.isBlank()) {
            this.calle = "Calle no informada";
        } else {
            this.calle = nuevaCalle;
        }
    }
    public void setCiudad(String nuevaCiudad){
        if (nuevaCiudad == null || nuevaCiudad.isBlank()) {
            this.ciudad = "Ciudad no informada";
        } else {
            this.ciudad = nuevaCiudad;
        }
    }
    public void setPais(String nuevoPais){
        if (nuevoPais == null || nuevoPais.isBlank()) {
            this.pais = "País no informado";
        } else {
            this.pais = nuevoPais;
        }
    }
    /**
     * Devuelve una representación textual de la dirección.
     *
     * @return Información de la dirección en formato String.
     */
    @Override
    public String toString(){
        return "\nCalle: "+ calle +
                ", \nCiudad: " + ciudad +
                ", \nPaís:" + pais;
    }
}
