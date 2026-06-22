package data;

import model.Cliente;
import model.Direccion;
import model.Empleado;
import model.GuiaTuristico;
import model.OperadorTuristico;
import model.Persona;
import model.Proveedor;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

/**
 * Gestiona la lectura de personas desde archivos externos.
 * Permite cargar registros desde archivos TXT o Excel y convertirlos
 * en objetos de tipo Persona almacenados en una colección dinámica.
 *
 * @author Maximiliano Villalobos
 * @version 1.0
 */
public class GestorPersonas {

    /**
     * Lee personas desde un archivo de texto separado por punto y coma (;).
     *
     * @param rutaArchivo Ruta del archivo TXT.
     * @return Colección de personas cargadas desde el archivo.
     */
    public ArrayList<Persona> leerPersonasDesdeTxt(String rutaArchivo) {

        ArrayList<Persona> personas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            while ((linea = br.readLine()) != null) {

                if (linea.isBlank()) {
                    continue;
                }

                String[] datos = linea.split(";");

                Persona persona = crearPersonaDesdeDatos(datos);

                if (persona != null) {
                    personas.add(persona);
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo TXT: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Error al convertir un dato numérico del TXT: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error en el formato del archivo TXT. Faltan datos en una línea.");
        }

        return personas;
    }

    /**
     * Lee personas desde un archivo Excel ubicado en la carpeta resources.
     *
     * @param resourcePath Nombre del archivo Excel dentro de resources.
     * @return Colección de personas cargadas desde el archivo Excel.
     */
    public ArrayList<Persona> leerPersonasDesdeExcel(String resourcePath) {

        ArrayList<Persona> personas = new ArrayList<>();

        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(resourcePath)) {

            if (inputStream == null) {
                throw new IOException("No se encontró el archivo Excel: " + resourcePath);
            }

            try (Workbook workbook = new XSSFWorkbook(inputStream)) {

                Sheet sheet = workbook.getSheetAt(0);
                boolean primeraFila = true;

                for (Row row : sheet) {

                    if (primeraFila) {
                        primeraFila = false;
                        continue;
                    }

                    if (filaVacia(row)) {
                        continue;
                    }

                    String[] datos = new String[11];

                    for (int i = 0; i < datos.length; i++) {
                        datos[i] = obtenerTextoCelda(row.getCell(i));
                    }

                    Persona persona = crearPersonaDesdeDatos(datos);

                    if (persona != null) {
                        personas.add(persona);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo Excel: " + e.getMessage());

        } catch (NumberFormatException e) {
            System.out.println("Error al convertir un dato numérico del Excel: " + e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error en el formato del archivo Excel. Faltan datos en una fila.");
        }

        return personas;
    }

    /**
     * Crea un objeto Persona o alguna de sus clases hijas
     * a partir de un arreglo de datos.
     *
     * @param datos Arreglo con los datos de una persona.
     * @return Objeto Persona creado o null si el tipo no es reconocido.
     */
    private Persona crearPersonaDesdeDatos(String[] datos) {

        String tipo = datos[0].trim();
        String nombre = datos[1].trim();
        String rut = datos[2].trim();
        String telefono = datos[3].trim();

        Direccion direccion = new Direccion(
                datos[4].trim(),
                datos[5].trim(),
                datos[6].trim()
        );

        switch (tipo.toUpperCase()) {

            case "EMPLEADO":
                return new Empleado(
                        nombre,
                        rut,
                        telefono,
                        direccion,
                        datos[7].trim(),
                        Double.parseDouble(datos[8].trim())
                );

            case "GUIA":
                return new GuiaTuristico(
                        nombre,
                        rut,
                        telefono,
                        direccion,
                        datos[7].trim(),
                        Double.parseDouble(datos[8].trim()),
                        datos[9].trim(),
                        datos[10].trim()
                );

            case "OPERADOR":
                return new OperadorTuristico(
                        nombre,
                        rut,
                        telefono,
                        direccion,
                        datos[7].trim(),
                        Double.parseDouble(datos[8].trim()),
                        datos[9].trim(),
                        datos[10].trim()
                );

            case "CLIENTE":
                return new Cliente(
                        nombre,
                        rut,
                        telefono,
                        direccion,
                        datos[7].trim(),
                        (int) Double.parseDouble(datos[8].trim())
                );

            case "PROVEEDOR":
                return new Proveedor(
                        nombre,
                        rut,
                        telefono,
                        direccion,
                        datos[7].trim(),
                        datos[8].trim()
                );

            default:
                System.out.println("Tipo de persona no reconocido: " + tipo);
                return null;
        }
    }

    /**
     * Verifica si una fila de Excel está vacía.
     *
     * @param row Fila del archivo Excel.
     * @return true si la fila está vacía, false en caso contrario.
     */
    private boolean filaVacia(Row row) {

        if (row == null) {
            return true;
        }

        for (int i = 0; i < 11; i++) {
            Cell cell = row.getCell(i);

            if (cell != null && cell.getCellType() != CellType.BLANK) {
                return false;
            }
        }

        return true;
    }

    /**
     * Obtiene el contenido de una celda como texto.
     *
     * @param cell Celda del archivo Excel.
     * @return Valor de la celda como String.
     */
    private String obtenerTextoCelda(Cell cell) {

        if (cell == null) {
            return "";
        }

        if (cell.getCellType() == CellType.NUMERIC) {
            return String.valueOf(cell.getNumericCellValue());
        }

        return cell.toString().trim();
    }
}