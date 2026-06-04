package app;

import model.Direccion;
import model.Empleado;

public class Main{
    public static void main(String[] args) {
        System.out.println("\n=========================\n");
        Empleado empleado1 = new Empleado();
        Direccion direccion1 = new Direccion(
                "Av.Vicuña mackenna 123",
                "Santiago",
                "Chile"
        );
        System.out.println(empleado1);
        System.out.println("\n=========================\n");
        Empleado empleado2 = new Empleado(
                "Juan Peréz",
                direccion1,
                "Product Owner",
                1200000.0
        );
        System.out.println(empleado2);

    }
}