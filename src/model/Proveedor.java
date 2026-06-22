package model;
/**
 * Representa un proveedor asociado a la agencia.
 * Hereda de la clase Persona.
 *
 * @author Maximiliano Villalobos
 * @version 1.0
 */
public class Proveedor extends Persona {
    private String servicioOfrecido;
    private String nombreEmpresa;
    /**
     * Constructor por defecto.
     * Inicializa el proveedor con valores predeterminados.
     */
    public Proveedor() {
        super();
        setServicioOfrecido("Transporte turístico");
        setNombreEmpresa("Proveedor local Llanquihue");
    }
    /**
     * Constructor con parámetros.
     *
     * @param nombre Nombre del proveedor.
     * @param rut RUT del proveedor.
     * @param telefono Teléfono del proveedor.
     * @param direccion Dirección del proveedor.
     * @param servicioOfrecido Servicio entregado.
     * @param nombreEmpresa Nombre de la empresa.
     */
    public Proveedor(String nombre, String rut, String telefono, Direccion direccion, String servicioOfrecido, String nombreEmpresa) {
        super(nombre, rut, telefono, direccion);
        setServicioOfrecido(servicioOfrecido);
        setNombreEmpresa(nombreEmpresa);
    }
    //getters
    public String getServicioOfrecido() {
        return servicioOfrecido;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
    //setters
    public void setServicioOfrecido(String servicioOfrecido) {
        if (servicioOfrecido == null || servicioOfrecido.isBlank()) {
            this.servicioOfrecido = "Servicio no informado";
        } else {
            this.servicioOfrecido = servicioOfrecido;
        }
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        if (nombreEmpresa == null || nombreEmpresa.isBlank()) {
            this.nombreEmpresa = "Empresa no informada";
        } else {
            this.nombreEmpresa = nombreEmpresa;
        }
    }
    /**
     * Devuelve una representación textual del proveedor.
     *
     * @return Información completa del proveedor.
     */
    @Override
    public String toString() {
        return super.toString() +
                ". \nServicio ofrecido: " + servicioOfrecido +
                ". \nEmpresa: " + nombreEmpresa;
    }
}
