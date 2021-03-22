# Desarrollo de Aplicación Android para Búsqueda de Productos con la API de MercadoLibre

## Descripción
Este proyecto representa un desarrollo para la búsqueda de productos presentes en la API que provee MercadoLibre a distintos desarrolladores. La aplicación consiste en 3 pantallas, las cuales se relacionan con:
  1) Búsqueda de un producto
  2) Exposición de productos coincidentes con la búsqueda
  3) Detalle del producto seleccionado.
  
  A continuación se exponen capturas de pantallas referidas a esta secuencia.
  
  ![image](https://user-images.githubusercontent.com/19366481/111952067-4f61d700-8ac3-11eb-9ab5-662f7890a0c6.png)

## Instalación de la APP
Para realizar la instalación de la misma, será necesario realizar algunas configuraciones previas en el dispositivo móvil. Esto se debe a que el mismo posee herramientas de proyección que bloquean la instalación de aplicaciones de origen desconocido. Es por ello que para desactivar dicha opción, se recomienda seguir los siguientes pasos:
1) Abrir la Configuración. 
2) Seleccionar Seguridad y privacidad.
3) Tocar el interruptor junto a Aplicaciones de fuentes desconocidas para habilitar la descarga.

### Opcional
Dada la cantidad de dispositivos y las diferentes versiones de android se recomienda ir a la configuración del movil y utilizar el buscador incorporado a la misma. Se sugiere colocar palabras como: 
* Aplicaciones de origen desconocido
* Aplicaciones de fuentes desconocidas
En caso de encontrar la opción procederemos a desactivarla. En caso de que el problema persista, se recomienda buscar las especificaciones del móvil para así encontrar dicha sección.

### Link de Descarga de la apk
Una vez realiza
Para poder realizar la descarga del APK haga click en el siguiente [enlace](https://drive.google.com/file/d/130UZ6qgElWa3_1576h1FPa4VX7eqyg6Y/view?usp=sharing)


## Adquisición del proyectoClonación / Descarga del proyecto
Para poder descargar el proyecto existen 2 opciones posibles, las cuales son:
* Clonar el proyecto
* Descargar el proyecto
A continuación, se detalla cada una de ellas en las siguientes sub-secciones.

### Clonación del proyecto
Para clonar dicho proyecto, será necesario que tenga instalado en su computadora un cliente GIT que le permita realizar esta operación. En caso de no tenerlo, no olvide que puede descargar el mismo de la siguiente  [página](https://git-scm.com/downloads)

Una vez instalado y configurado el mismo, debemos realizar la siguiente operación en la consola /bash

```bash
$ git clone https://github.com/libgit2/libgit2
```
Una vez finalizado el proceso, podremos acceder al proyecto con normalidad.

### Descarga del proyecto
Se encuentra disponible la opción de descarga del proyecto, dentro de este repositorio. La misma se encuentra en el margen superior derecho.

## Características Generales

### Características de la aplicación
La aplicación fue desarrollada con las siguientes características:
*  Versión Android Minima(Android 8.1- API nivel 27)
*  Versión Objetivo (Android 11 - API nivel 30)
*  Mantención del estado de la vista al girar la pantalla
*  Implementación de feedbacks al usuario

### Caracteristicas del desarrollo
*  Utilización un patrón de diseño MVP (Modelo - Vista - Presentador)
*  Utilización de LeakCanary para la detección de pérdidas de memoria.
*  Utilización de test unitarios para garantizar la correcta funcionalidad de los métodos (Mockito y JUnit 4)
*  Generación de documentación con la herramienta JavaDoc

### Dependencias externas utilizadas
Se utilizaron las siguientes dependencias:
* Retrofit 2
* Picasso
* Mockito
* LeakCanary

Aquí debajo se muestran las versiones utilizadas de cada uno de ellos

```java
    implementation 'com.squareup.retrofit2:retrofit:2.4.0'
    implementation 'com.squareup.retrofit2:converter-gson:2.4.0'
    implementation 'com.squareup.picasso:picasso:2.71828'
    testImplementation "org.mockito:mockito-core:1.+"
    debugImplementation 'com.squareup.leakcanary:leakcanary-android:2.6'
```

## Esquema de organización
El proyecto se encuentra organizado en 4 carpetas principales, las cuales son:
* "adapters" : Este directorio almacena las clases asociadas a los adaptadores utilizados.
* "api" : Este directorio almacena la clase ApiClient junto a la Interfaz en donde se declaran los métodos a consumir por la aplicación
* "models": Este directorio almacena todos las clases java (exclusivas) generadas para su utilización dentro de la aplicación.
* "mvp": Este directorio se encuentra dividido en otros 4 sub-directorios que se asocian con las 3 capas del modelo MVP, junto a una última que se corresponde con las interfaces utilizadas por cada una de las capas.

Para un mayor entendimiento, se adjunta una imagen representativa del mismo.
    
![image](https://user-images.githubusercontent.com/19366481/111949508-9d74db80-8abf-11eb-87a8-700c9699caf1.png)

## Pruebas unitarias
Las pruebas unitarias fueron realizadas sobre la capa de presentación, debido a que la misma conecta a las capas de modelo y vista. Dichos test, pueden encontrarse en la siguiente carpeta, como ilustra la siguiente figura.

![image](https://user-images.githubusercontent.com/19366481/111950620-4c65e700-8ac1-11eb-9251-06a1244ba79f.png)

Para la ejecución de las mismas deberá realizarse los siguientes pasos:
1) Acceder a alguno de los archivos de test vinculados a los presentadores. 
2) Situarse sobre el nombre de la función (la cual se corresponde con un test).
3) Click derecho sobre la misma, y selección de la opción " Run'nombreDelTest(..)' "


## Documentación
La documentación del proyecto se encuentra en la carpeta "documentation", la cual se encuentra en la raíz de este repositorio.


