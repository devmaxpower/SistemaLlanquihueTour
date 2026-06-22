package app;

import data.GestorPersonas;
import model.Persona;
import service.PersonaService;
import util.Utilidades;

import java.util.ArrayList;

/**
 * Clase principal de la aplicación Llanquihue Tour.
 * Carga personas desde un archivo externo, almacena los datos
 * en una colección dinámica y aplica búsquedas y filtros.
 *
 * @author Maximiliano Villalobos
 * @version 1.0
 */

public class Main{
    /**
     * Método principal de ejecución del sistema.
     *
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        //instancia de personas y servicios
        GestorPersonas gestorPersonas = new GestorPersonas();
        PersonaService personaService = new PersonaService();

        // Carga desde TXT
        // ArrayList<Persona> personas = gestorPersonas.leerPersonasDesdeTxt("resources/personas.txt");

        // Carga desde Excel
        ArrayList<Persona> personas = gestorPersonas.leerPersonasDesdeExcel("personas.xlsx");

        Utilidades.adornoTitulo("LISTADO COMPLETO DE PERSONAS");
        mostrarLista(personas);
        Utilidades.LineaSeparador();

        Utilidades.adornoTitulo("GUIAS TURÍSTICOS");
        mostrarLista(personaService.obtenerGuias(personas));
        Utilidades.LineaSeparador();

        Utilidades.adornoTitulo("OPERADORES TURÍSTICOS");
        mostrarLista(personaService.obtenerOperadores(personas));
        Utilidades.LineaSeparador();

        Utilidades.adornoTitulo("CLIENTES");
        mostrarLista(personaService.obtenerClientes(personas));
        Utilidades.LineaSeparador();

        Utilidades.adornoTitulo("PROVEEDORES");
        mostrarLista(personaService.obtenerProveedores(personas));
        Utilidades.LineaSeparador();

        Utilidades.adornoTitulo("EMPLEADOS");
        mostrarLista(personaService.obtenerEmpleados(personas));
        Utilidades.LineaSeparador();

        Utilidades.adornoTitulo("BÚSQUEDA POR RUT");

        Persona personaEncontrada = personaService.buscarPorRut(personas, "15.111.222-3");



        if(personaEncontrada != null) {
            System.out.println("Persona encontrada");
            System.out.println(personaEncontrada);
        }else {
            System.out.println("No se encontró el rut buscado");
        }

        Utilidades.LineaSeparador();

    }
    /**
     * Muestra por consola los elementos de una colección de personas.
     *
     * @param personas Colección de personas a mostrar.
     */
    public static void mostrarLista(ArrayList<Persona> personas){
        if(personas.isEmpty()){
            System.out.println("No existen personas");
        }else {
            for(Persona persona : personas){
                System.out.println(persona);
            }
        }
    }
}