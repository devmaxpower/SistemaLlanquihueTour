package util;

public class Utilidades {
    public static void adornoTitulo(String titulo){
        System.out.println("\n================"+titulo+"================\n");
    }
    public static void LineaSeparador(){

        System.out.println("\n================================\n");
    }
    public static boolean validarRut(String rut) {
        if (rut == null || rut.isBlank()) {
            return false;
        }
        return rut.matches("\\d{1,2}\\.\\d{3}\\.\\d{3}-[\\dkK]");
    }
}
