
# Ejemplos de Maven y Gradle en Java

## Maven

Maven es una herramienta de automatización de compilación y gestión de proyectos. Se utiliza principalmente para gestionar dependencias y la construcción del proyecto.

### Archivo `pom.xml` para Maven
Este archivo se encuentra en la raíz de tu proyecto y es utilizado para definir la configuración de tu proyecto, las dependencias y los plugins.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.ejemplo</groupId>
    <artifactId>mi-aplicacion</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>jar</packaging>

    <name>MiAplicacion</name>
    <url>http://maven.apache.org</url>

    <dependencies>
        <!-- Dependencia para el uso de log4j -->
        <dependency>
            <groupId>log4j</groupId>
            <artifactId>log4j</artifactId>
            <version>1.2.17</version>
        </dependency>
        
        <!-- Dependencia para pruebas con JUnit -->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <!-- Plugin para compilar y empaquetar el proyecto -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.1</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
```

### Comandos Básicos de Maven:
1. **Compilar el proyecto**:
   ```bash
   mvn compile
   ```

2. **Ejecutar pruebas**:
   ```bash
   mvn test
   ```

3. **Crear el archivo JAR**:
   ```bash
   mvn package
   ```

4. **Instalar en el repositorio local**:
   ```bash
   mvn install
   ```

---

## Gradle

Gradle es una herramienta moderna de construcción que se utiliza para construir proyectos, gestionar dependencias y automatizar tareas. Gradle se utiliza especialmente en proyectos grandes debido a su rendimiento y flexibilidad.

### Archivo `build.gradle` para Gradle
El archivo de configuración de Gradle se encuentra en la raíz del proyecto. A continuación se muestra un archivo `build.gradle` básico:

```groovy
plugins {
    id 'java'
}

group = 'com.ejemplo'
version = '1.0-SNAPSHOT'

repositories {
    mavenCentral()
}

dependencies {
    // Dependencia para el uso de log4j
    implementation 'log4j:log4j:1.2.17'
    
    // Dependencia para pruebas con JUnit
    testImplementation 'junit:junit:4.13.2'
}

tasks.test {
    useJUnitPlatform()
}
```

### Comandos Básicos de Gradle:
1. **Compilar el proyecto**:
   ```bash
   gradle build
   ```

2. **Ejecutar pruebas**:
   ```bash
   gradle test
   ```

3. **Crear el archivo JAR**:
   ```bash
   gradle jar
   ```

4. **Instalar en el repositorio local**:
   ```bash
   gradle publishToMavenLocal
   ```

---

## Comparación entre Maven y Gradle:
- **Maven** es más tradicional y tiene una estructura de archivos muy establecida, lo que lo hace más fácil de aprender para principiantes. Sin embargo, puede ser más lento en proyectos grandes debido a su naturaleza basada en XML.
  
- **Gradle** es más flexible y generalmente más rápido debido a su uso de un enfoque basado en Groovy para su configuración. Es especialmente popular en proyectos grandes y en el ecosistema Android.
