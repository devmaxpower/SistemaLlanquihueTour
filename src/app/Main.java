package app;
import model.*;
import util.Utilidades;

public class Main{
    public static void main(String[] args) {
        //Creando direcciones
        Direccion direccion1 = new Direccion(
                "Av. Vicuña mackenna  123",
                "Santiago",
                "Chile"
        );
        Direccion direccion2 = new Direccion(
                "Costanera 232323",
                "Puerto Varas",
                "Chile"
        );
        Direccion direccion3 = new Direccion(
                "Av. Del Lago 0001",
                "Llanquihue",
                "Chile"
        );
        //Creando empleados
        Empleado empleado1 = new Empleado(
                "Juan Peréz",
                "18.048.360-8",
                "+56999999999",
                direccion1,
                "Coordindor de Tours",
                1200000

        );
        GuiaTuristico guiaTuristico1 = new GuiaTuristico(
                "Tulio Tribiño",
                "15.111.222-3",
                "+56988884445",
                direccion3,
                "Guia Turistico",
                970000,
                "Inglés",
                "Turismo Ecológico"
        );
        OperadorTuristico operadorTuristico1 = new OperadorTuristico(
                "Juan Carlos bodoque",
                "17.333.444-5",
                "+56977664445",
                direccion1,
                "Operador",
                850000,
                "Excursiones",
                "Diurno"
        );

        //Creando clientes
        Cliente cliente1 = new Cliente(
                "Maria Antonieta de la nieves",
                "16.234.567-9",
                "+56234345657",
                direccion2,
                "Ruta Gastronomica de los Lagos",
                4
        );

        //Creando proveedores
        Proveedor  proveedor1 = new Proveedor(
                "Luis Miguel",
                "18.048.360-8",
                "+56955556666",
                direccion2,
                "Músico de eventos",
                "La banda de LuisMi"
        );

        //Imprimir datos
        Utilidades.adornoTitulo("EMPLEADOS");
        System.out.println(empleado1);
        Utilidades.LineaSeparador();

        Utilidades.adornoTitulo("GUÍAS TURÍSTICOS");
        System.out.println(guiaTuristico1);
        Utilidades.LineaSeparador();

        Utilidades.adornoTitulo("OPERADORES");
        System.out.println(operadorTuristico1);
        Utilidades.LineaSeparador();

        Utilidades.adornoTitulo("CLIENTES");
        System.out.println(cliente1);
        Utilidades.LineaSeparador();

        Utilidades.adornoTitulo("PROVEEDORES");
        System.out.println(proveedor1);
        Utilidades.LineaSeparador();
    }
}