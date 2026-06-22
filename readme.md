![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🧠 Evaluación Sumativa 2 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto

- **Nombre completo:** Maximiliano Villalobos
- **Carrera:** Analista Programador Computacional
- **Sede:** Campus Virtual

---

## 📘 Descripción general del sistema

Este proyecto corresponde a la Evaluación Sumativa II de la asignatura Desarrollo Orientado a Objetos I.

El sistema modela las principales entidades relacionadas con una agencia de turismo llamada Llanquihue Tour, aplicando conceptos fundamentales de la Programación Orientada a Objetos (POO) mediante el lenguaje Java.

La solución implementa clases organizadas en paquetes, utilizando principios como encapsulamiento, composición, herencia, constructores, validación de atributos y reutilización de código. Para ello, se representan distintos actores vinculados a la agencia, tales como empleados, clientes, proveedores, guías turísticos y operadores turísticos, permitiendo gestionar su información de manera estructurada y modular.

Además, el sistema incorpora lectura de datos desde un archivo externo de texto, permitiendo cargar información de personas asociadas a la agencia en una colección dinámica de tipo `ArrayList`. Posteriormente, la información es procesada mediante servicios que permiten realizar búsquedas y filtros específicos según el tipo de persona o su RUT.

El proyecto fue desarrollado a partir de un caso contextualizado, abordando problemáticas reales y proponiendo una solución estructurada, modular, reutilizable y escalable.

---

## 🧱 Estructura general del proyecto

```plaintext
src
├── app
├── data
├── model
├── service
└── util

resources
└── personas.txt
```

### 📂 Paquete `app`

Contiene la clase principal del sistema:

- `Main.java`: punto de entrada de la aplicación. Permite cargar los datos desde el archivo externo, ejecutar búsquedas, aplicar filtros y visualizar los resultados por consola.

### 📂 Paquete `model`

Contiene las clases que representan las entidades del dominio de la agencia de turismo:

- `Persona`
- `Direccion`
- `Empleado`
- `Cliente`
- `Proveedor`
- `GuiaTuristico`
- `OperadorTuristico`

### 📂 Paquete `data`

Contiene las clases encargadas de la lectura y carga de información desde archivos externos:

- `GestorPersonas`: lee el archivo `personas.txt`, procesa cada línea y crea los objetos correspondientes para almacenarlos en una colección dinámica.

### 📂 Paquete `service`

Contiene la lógica de negocio de la aplicación:

- `PersonaService`: permite realizar búsquedas por RUT y aplicar filtros sobre las colecciones de personas según su tipo.

### 📂 Paquete `util`

Contiene clases de apoyo reutilizables:

- `Utilidades`: métodos auxiliares para validaciones, formato de salida por consola y funciones reutilizables del sistema.

### 🔗 Relación entre clases

```plaintext
Persona
├── Cliente
├── Proveedor
└── Empleado
    ├── GuiaTuristico
    └── OperadorTuristico

Persona
└── Direccion (Composición)
```

Esta estructura permite aplicar los principios de encapsulamiento, composición y herencia, facilitando la reutilización de código y la organización modular del proyecto.

### 🔗 Flujo de funcionamiento

```plaintext
personas.txt
      │
      ▼
GestorPersonas
      │
      ▼
ArrayList<Persona>
      │
      ▼
PersonaService
      │
      ▼
Main
```

La aplicación carga información desde un archivo externo, transforma cada registro en objetos Java, almacena los datos en una colección dinámica y posteriormente aplica búsquedas y filtros mediante servicios especializados.

---

## ⚙️ Funcionalidades implementadas

- Lectura de datos desde archivo externo (`personas.txt`).
- Uso de colecciones dinámicas mediante `ArrayList`.
- Creación de objetos a partir de registros de texto.
- Aplicación de herencia y composición.
- Validación de atributos mediante setters.
- Búsqueda de personas por RUT.
- Filtrado de personas por categoría.
- Manejo básico de excepciones mediante bloques `try-catch`.
- Organización modular utilizando paquetes.
- Documentación mediante JavaDoc.

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/devmaxpower/LlanquihueTourApp.git
```

2. Abre el proyecto en IntelliJ IDEA.

3. Verifica que el archivo `personas.txt` se encuentre dentro de la carpeta `resources`.

4. Ejecuta el archivo `Main.java` desde el paquete `app`.

5. Observa los resultados en consola, incluyendo:
    - Listado completo de personas.
    - Filtro de empleados.
    - Filtro de guías turísticos.
    - Filtro de operadores turísticos.
    - Filtro de clientes.
    - Filtro de proveedores.
    - Búsqueda por RUT.

---

**Repositorio GitHub:** https://github.com/devmaxpower/SistemaLlanquihueTour.git

**Fecha de entrega:** 22/06/2026

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluación Sumativa II