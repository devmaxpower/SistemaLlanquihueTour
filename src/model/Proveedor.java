package model;

public class Proveedor extends Persona {
    private String servicioOfrecido;
    private String nombreEmpresa;

    public Proveedor() {
        super();
        setServicioOfrecido("Transporte turístico");
        setNombreEmpresa("Proveedor local Llanquihue");
    }

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

    @Override
    public String toString() {
        return super.toString() +
                ". \nServicio ofrecido: " + servicioOfrecido +
                ". \nEmpresa: " + nombreEmpresa;
    }
}
