# Proyecto Tarea POO

## Objetivos y propósito del proyecto
Este proyecto tiene como objetivo crear un programa que permita revisar información de ciertos contenidos audiovisuales, facilitando la gestión y manipulación de datos relacionados con películas, series, documentales y otros formatos de medios.

## Clases y funcionalidades nuevas
- **ContenidoAudiovisual**: Clase abstracta que define la estructura básica para los contenidos audiovisuales, incluyendo atributos como título, duración y género.
- **Actor**: Clase que representa a los actores involucrados en los contenidos audiovisuales.
- **Temporada**: Clase que gestiona la información sobre las temporadas de las series de televisión.
- **Episodio**: Clase que representa episodios individuales dentro de una temporada.
- **Investigador**: Clase que maneja los datos de los investigadores relacionados con los contenidos.
- **VideoYouTube**: Clase que gestiona información específica sobre videos de YouTube.
- **Cortometraje**: Clase que representa cortometrajes y su información relevante.
- **PruebaConCambios**: Clase que se utiliza para probar cambios en la implementación del sistema.
- **PruebaConCambiosB**: Nueva clase creada para probar funcionalidades adicionales.


## Instrucciones para clonar y ejecutar el proyecto

1. **Clonar el repositorio**:
   - Abre una terminal (símbolo del sistema o PowerShell en Windows).
   - Navega a la carpeta donde deseas clonar el repositorio.
   - Ejecuta el siguiente comando:
     ```bash
     git clone https://github.com/JeilsD/tu_repositorio.git
     ```
    

2. **Abrir el proyecto en Eclipse**:
   - Inicia Eclipse.
   - Selecciona `File` > `Import`.
   - En el cuadro de diálogo, elige `Existing Projects into Workspace` y haz clic en `Next`.
   - Haz clic en `Browse` y selecciona la carpeta del proyecto que clonaste.
   - Asegúrate de que el proyecto esté seleccionado y haz clic en `Finish`.

3. **Ejecutar el proyecto**:
   - En el `Package Explorer`, localiza la clase principal de tu proyecto.
   - Haz clic derecho sobre la clase principal (que contiene el método `main`) y selecciona `Run As` > `Java Application`.

4. **Verificar el funcionamiento**:
   - Observa la consola de Eclipse para verificar que el programa se ejecute correctamente y muestra la información de los contenidos audiovisuales como se esperaba.


## Mejora Adicional

Se han implementado tres pruebas diferentes para verificar la funcionalidad del código. Estas pruebas están diseñadas para asegurar que las clases y métodos desarrollados se comporten como se espera. 

### Detalles de las pruebas:
1. **PruebaConCambios.java**: 
   - Una prueba extra para ver que el código no tenga errores.

2. **PruebaConCambiosB.java**: 
   - Realiza pruebas adicionales en el código.

3. **PruebaCompleta.java**: 
   - Verifica el correcto funcionamiento de la clase `ContenidoAudiovisual` y sus subclases, asegurando que los métodos de acceso (getters y setters) funcionan correctamente.

Estas pruebas son fundamentales para mantener la calidad del código y facilitar futuras modificaciones.
