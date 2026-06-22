package util;
/**
 * Clase utilitaria que contiene métodos de apoyo
 * para validaciones y formato de salida por consola.
 *
 * @author Maximiliano Villalobos
 * @version 1.0
 */
public class Utilidades {
    /**
     * Muestra un título decorado en consola.
     *
     * @param titulo Texto que se mostrará como encabezado.
     */
    public static void adornoTitulo(String titulo){
        System.out.println("\n================"+titulo+"================\n");
    }
    /**
     * Muestra una línea separadora en consola.
     */
    public static void LineaSeparador(){

        System.out.println("\n================================\n");
    }
    /**
     * Valida el formato de un RUT chileno.
     *
     * @param rut RUT a validar.
     * @return true si el formato es válido; false en caso contrario.
     */
    public static boolean validarRut(String rut) {
        if (rut == null || rut.isBlank()) {
            return false;
        }
        return rut.matches("\\d{1,2}\\.\\d{3}\\.\\d{3}-[\\dkK]");
    }
}
