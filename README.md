# JAVA

Java es un lenguaje de programación de alto nivel, orientado a objetos, y de propósito general, que fue creado para ser portable, escalable y de fácil mantenimiento. Java se ejecuta sobre la Java Virtual Machine (JVM), lo que le permite ser multiplataforma, ya que el mismo código puede ejecutarse en diferentes sistemas operativos sin necesidad de modificaciones.

# En que contexto nació JAVA

Java fue desarrollado por Sun Microsystems en 1995 bajo el nombre original de "Oak". El objetivo era crear un lenguaje que pudiera ejecutarse en cualquier dispositivo, sin importar la plataforma. En su evolución, Java se convirtió en uno de los lenguajes más populares debido a su filosofía "write once, run anywhere", que significa que el mismo código puede ser ejecutado en cualquier dispositivo que tenga instalada la JVM.

## Características Principales

### 1. Lenguaje de Alto Nivel
Java es un lenguaje de alto nivel que abstrae muchos detalles del hardware, permitiendo que los desarrolladores se concentren en la lógica de negocio sin tener que preocuparse por detalles de la gestión de memoria o el acceso directo al hardware.

### 2. Uso de Punteros
En Java, no se permite el uso directo de punteros como en otros lenguajes como C o C++. Esto mejora la seguridad del lenguaje, evitando errores como punteros nulos o colgantes.

### 3. Paradigma y Explicación del Paradigma
Java es un lenguaje orientado a objetos, lo que significa que organiza el código alrededor de objetos y clases. Además, soporta conceptos de la programación funcional, pero su enfoque principal es la programación orientada a objetos, facilitando la modularidad y reutilización del código.

### 4. Tipo de Tipado
Java es un lenguaje de tipado estático y fuerte, lo que significa que los tipos de las variables deben ser especificados en el momento de la declaración y no pueden cambiar en tiempo de ejecución. Esto ayuda a detectar errores en tiempo de compilación, antes de que el código sea ejecutado.

### 5. Compilado
Java es un lenguaje compilado, pero su compilación se realiza en dos etapas. Primero, el código fuente es compilado a bytecode, y luego este bytecode es interpretado o compilado justo a tiempo (JIT) por la JVM para ser ejecutado en el sistema operativo objetivo.

### 6. Manejo de Memoria
El manejo de memoria en Java es automatizado a través de la recolección de basura (garbage collection). Esto significa que el programador no tiene que preocuparse por liberar memoria manualmente, ya que la JVM se encarga de gestionar la memoria de manera eficiente.

### 7. Manejo de Errores
Java utiliza un sistema de excepciones para el manejo de errores. Las excepciones son objetos que representan errores o condiciones especiales durante la ejecución del programa. Esto permite manejar los errores de manera estructurada y predecible.

### 8. Concurrencia
Java soporta la concurrencia a través de hilos (threads). El modelo de concurrencia de Java permite la ejecución simultánea de varias tareas dentro de un mismo programa, aprovechando los recursos de los sistemas multi-core.

### 9. La Java Virtual Machine (JVM)
La JVM es el componente encargado de ejecutar el bytecode generado a partir del código fuente en Java. La JVM es responsable de la portabilidad de Java, ya que el mismo bytecode puede ser ejecutado en cualquier plataforma que tenga instalada la JVM.

### 10. JRE (Java Runtime Environment)
El JRE es un conjunto de bibliotecas y herramientas que permiten ejecutar aplicaciones Java. Incluye la JVM y otras librerías necesarias para ejecutar el bytecode, pero no proporciona herramientas para desarrollar aplicaciones.

### 11. JDK (Java Development Kit)
El JDK es el conjunto de herramientas necesarias para desarrollar aplicaciones Java. Incluye el JRE, además de herramientas adicionales como el compilador `javac`, el depurador y otras utilidades que facilitan el desarrollo de software en Java.

### 12. Anotaciones
Las anotaciones en Java son metadatos que se utilizan para proporcionar información adicional sobre el código. Aunque las anotaciones no afectan directamente el comportamiento del programa, pueden ser procesadas por herramientas externas o el compilador para generar código adicional o realizar validaciones.

### 13. ORM (Object-Relational Mapping)
Java soporta el concepto de ORM, que permite mapear objetos de la aplicación a tablas en bases de datos relacionales. Herramientas como Hibernate permiten simplificar la interacción entre Java y las bases de datos, mejorando la eficiencia en el manejo de datos.

### 14. JDBC (Java Database Connectivity)
JDBC es una API que permite a las aplicaciones Java interactuar con bases de datos. Proporciona un conjunto de interfaces y clases para conectarse, ejecutar consultas y manejar los resultados de las bases de datos de manera eficiente y estandarizada.

## Conceptos adicionales de Java

### 1. Multithreading
Java permite el uso de múltiples hilos de ejecución de manera sencilla, lo que facilita la creación de aplicaciones concurrentes. Los hilos pueden ejecutarse de manera independiente, aprovechando múltiples procesadores en sistemas multi-core.

### 2. Reflection
La reflexión en Java permite examinar y modificar la estructura de clases y objetos en tiempo de ejecución. Esto puede ser útil para la creación de bibliotecas genéricas y la implementación de patrones de diseño como el patrón Factory.

### 3. Generics
Java soporta generics, lo que permite crear clases, interfaces y métodos con tipos de datos parametrizados. Esto proporciona una mayor flexibilidad y seguridad en el código, al permitir trabajar con tipos específicos sin perder la seguridad del tipo en tiempo de compilación.

### 4. Colecciones y Librerías
Java tiene una rica colección de bibliotecas estándar que abarcan desde estructuras de datos hasta herramientas para la manipulación de entradas y salidas. Algunas de las librerías más comunes son:
- **Java Collections Framework**: Proporciona estructuras de datos como listas, conjuntos, mapas y colas, con implementaciones optimizadas.
- **JavaFX**: Para la creación de interfaces gráficas de usuario.
- **Apache Commons**: Una colección de utilidades que simplifican tareas comunes en programación, como el manejo de cadenas, colecciones y archivos.
- **Guava**: Una librería de Google que agrega funcionalidades adicionales sobre las colecciones estándar de Java, incluyendo operaciones en paralelo y mejoras en la manipulación de datos.
- **Jackson y Gson**: Librerías para trabajar con JSON de manera eficiente.

### 5. Streams y Lambdas
Introducido en Java 8, el API de Streams permite trabajar con colecciones de manera funcional, facilitando la realización de operaciones como filtrado, mapeo y reducción de datos. Las expresiones lambda permiten crear funciones anónimas que pueden ser utilizadas en el contexto de los Streams y otras interfaces funcionales.

### 6. Seguridad
Java tiene un enfoque integral de seguridad que incluye desde la verificación de bytecode hasta el control de acceso a recursos mediante el uso de políticas de seguridad y claves criptográficas, lo que hace que las aplicaciones Java sean seguras y confiables.
