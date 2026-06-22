package service;
import model.*;

import java.util.ArrayList;

/**
 * Proporciona servicios de búsqueda y filtrado
 * sobre colecciones de personas.
 *
 * @author Maximiliano Villalobos
 * @version 1.0
 */
public class PersonaService {
    /**
     * Busca una persona por su RUT.
     *
     * @param personas Colección de personas.
     * @param rut RUT a buscar.
     * @return Persona encontrada o null si no existe.
     */
    public Persona buscarPorRut(ArrayList<Persona> personas, String rut) {
        for (Persona persona : personas) {
            if (persona.getRut().equalsIgnoreCase(rut)) {
                return persona;
            }
        }
        return null;
    }
    /**
     * Obtiene todos los clientes.
     *
     * @param personas Colección de personas.
     * @return Lista de clientes.
     */
    public ArrayList<Persona> obtenerClientes(ArrayList<Persona> personas) {
        ArrayList<Persona> clientes = new ArrayList<>();
        for (Persona persona : personas) {
            if(persona instanceof Cliente) {
                clientes.add(persona);
            }
        }
        return clientes;
    }
    /**
     * Obtiene todos los guias.
     *
     * @param personas Colección de personas.
     * @return Lista de guias.
     */
    public ArrayList<Persona> obtenerGuias(ArrayList<Persona> personas) {
        ArrayList<Persona> guias = new ArrayList<>();
        for (Persona persona : personas) {
            if(persona instanceof GuiaTuristico) {
                guias.add(persona);
            }
        }
        return  guias;
    }
    /**
     * Obtiene todos los operadores turísticos.
     *
     * @param personas Colección de personas.
     * @return Lista de operadores turísticos.
     */
    public ArrayList<Persona> obtenerOperadores(ArrayList<Persona> personas) {
        ArrayList<Persona> operadores = new ArrayList<>();
        for (Persona persona : personas) {
            if(persona instanceof OperadorTuristico) {
                operadores.add(persona);
            }
        }
        return operadores;
    }
    /**
     * Obtiene todos los proveedores.
     *
     * @param personas Colección de personas.
     * @return Lista de proveedores.
     */
    public ArrayList<Persona> obtenerProveedores(ArrayList<Persona> personas) {
        ArrayList<Persona> proveedores = new ArrayList<>();
        for (Persona persona : personas) {
            if(persona instanceof Proveedor) {
                proveedores.add(persona);
            }
        }
        return proveedores;
    }
    /**
     * Obtiene todos los empleados.
     *
     * @param personas Colección de personas.
     * @return Lista de empleados.
     */
    public ArrayList<Persona> obtenerEmpleados(ArrayList<Persona> personas) {
        ArrayList<Persona> empleados = new ArrayList<>();

        for (Persona persona : personas) {
            if(persona instanceof Empleado) {
                empleados.add(persona);
            }
        }
        return empleados;
    }
}
