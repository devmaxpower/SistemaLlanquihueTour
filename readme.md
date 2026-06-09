![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Evaluación Sumativa 1 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Maximiliano Villalobos
- **Carrera:** Analista Programador Computacional
- **Sede:** Campus Virtual

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la Actividad Sumativa I de la asignatura Desarrollo Orientado a Objetos I.

El sistema modela las principales entidades relacionadas con una agencia de turismo llamada Llanquihue Tour, aplicando conceptos fundamentales de la Programación Orientada a Objetos (POO) mediante el lenguaje Java.

La solución implementa clases organizadas en paquetes, utilizando principios como encapsulamiento, composición, herencia, constructores, validación de atributos y reutilización de código. Para ello, se representan distintos actores vinculados a la agencia, tales como empleados, clientes, proveedores, guías turísticos y operadores turísticos, permitiendo gestionar su información de manera estructurada y modular.

El proyecto incluye además una clase principal encargada de crear instancias de los objetos y demostrar el funcionamiento del modelo mediante la salida de información por consola.

El proyecto fue desarrollado a partir de un caso contextualizado, abordando problemáticas reales y proponiendo una solución estructurada, modular y reutilizable.

---

## 🧱 Estructura general del proyecto


```plaintext
src
├── app
├── model
└── util
```

### 📂 Paquete `app`

Contiene la clase principal del sistema:

* `Main.java`: punto de entrada de la aplicación. Permite crear y visualizar los distintos objetos del sistema mediante la consola.

### 📂 Paquete `model`

Contiene las clases que representan las entidades del dominio de la agencia de turismo:

* `Persona`
* `Direccion`
* `Empleado`
* `Cliente`
* `Proveedor`
* `GuiaTuristico`
* `OperadorTuristico`

### 📂 Paquete `util`

Contiene clases de apoyo reutilizables:

* `Utilidades`: métodos auxiliares para validaciones y formateo de salida por consola.

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




## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/devmaxpower/SistemaLlanquihueTour.git
```

2. Abre el proyecto en IntelliJ IDEA.

3. Ejecuta el archivo `Main.java` desde el paquete `app`.

4. Sigue las instrucciones en consola o en la interfaz gráfica (si corresponde).


---

**Repositorio GitHub:** \https://github.com/devmaxpower/SistemaLlanquihueTour.git
**Fecha de entrega:** \08/06/2026

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Evaluación Sumativa I
