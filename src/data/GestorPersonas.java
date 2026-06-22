package data;
import model.Cliente;
import model.Direccion;
import model.Empleado;
import model.GuiaTuristico;
import model.OperadorTuristico;
import model.Persona;
import  model.Proveedor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Gestiona la lectura de datos desde archivos externos.
 * Permite convertir registros de texto en objetos de tipo Persona
 * y almacenarlos en una colección dinámica.
 *
 * @author Maximiliano Villalobos
 * @version 1.0
 */


public class GestorPersonas {
    /**
     * Lee un archivo de texto y carga personas en una colección ArrayList.
     *
     * El archivo debe contener registros separados por punto y coma (;)
     * siguiendo la estructura definida para cada tipo de persona.
     *
     * @param rutaArchivo Ruta del archivo que contiene los registros.
     * @return Colección de objetos Persona cargados desde el archivo.
     */

    public ArrayList<Persona> leerPersonas(String rutaArchivo){
        ArrayList<Persona> personas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))){
            String linea;
            while ((linea = br.readLine() ) != null ){
                //Definición de atributos
                String[] datos = linea.split(";");
                String tipo = datos[0];
                String nombre = datos[1];
                String rut = datos[2];
                String telefono = datos[3];

                //Creando la dirección
                Direccion direccion = new Direccion(
                        datos[4],
                        datos[5],
                        datos[6]
                );
                //Determinando tipo de persona
                switch (tipo.toUpperCase()){
                    case "EMPLEADO":
                        personas.add(new Empleado(
                                nombre,
                                rut,
                                telefono,
                                direccion,
                                datos[7],
                                Double.parseDouble(datos[8])
                        ));
                        break;
                    case "GUIA":
                        personas.add(new GuiaTuristico(
                                nombre,
                                rut,
                                telefono,
                                direccion,
                                datos[7],
                                Double.parseDouble(datos[8]),
                                datos[9],
                                datos[10]
                        ));
                        break;
                    case "OPERADOR":
                        personas.add(new OperadorTuristico(
                                nombre,
                                rut,
                                telefono,
                                direccion,
                                datos[7],
                                Double.parseDouble(datos[8]),
                                datos[9],
                                datos[10]
                        ));
                        break;
                    case "CLIENTE":
                        personas.add(new Cliente(
                                nombre,
                                rut,
                                telefono,
                                direccion,
                                datos[7],
                                Integer.parseInt(datos[8])
                        ));
                        break;
                    case "PROVEEDOR":
                        personas.add(new Proveedor(
                                nombre,
                                rut,
                                telefono,
                                direccion,
                                datos[7],
                                datos[8]
                        ));
                        break;
                    default:
                        System.out.println("Tipo de persona no reconocido" + tipo);
                        break;
                }

            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo" + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error al convertir un dato en númerico" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error en el formato del archivo. Faltan datos en una línea." + e.getMessage());
        }
        return  personas;
    }


}
