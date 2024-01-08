## CHALLENGE BACKEND - Java Spring Boot (API) 🚀
#### Situación Inicial📍
Una empresa te contrata a tí y a tu equipo de developers para desarrollar una aplicación
que le permita a niños y niñas hispanohablantes explorar el mundo de Disney. Para hacer
esto, el cliente te solicita que en la aplicación se puedan conocer y modificar los characters
que lo componen y entender en qué películas participaron cada uno de esos characters.
Objetivo 🎯
Para lograr la solicitud del cliente, deberás desarrollar una API que permita navegar por
estos characters y sus películas y se deberá exponer la información para que cualquier
frontend pueda consumirla. Algunos elementos que debes tener en cuenta:
```
- 👉 Utilizar Spring Boot.
- 👉 No es necesario armar el Frontend.
- 👉 Las rutas deberán seguir el patrón REST.
- 👉 Utilizar la librería Spring Security.

- ⚠️ ¡No es indispensable hacer todo!
```
Mientras más completes, mayor puntaje obtendrás, pero puedes enviar la app hasta el
estadío que la tengas en base a tu cono
Requerimientos técnicos 💻

#### 1. Modelado de Base de Datos
   - Personaje: deberá tener:
     - Imagen
     - Nombre
     - Edad
     - Peso
     - Historia
     - Películas o series asociadas 
     ######

   - Película o Serie: deberá contener 
     - Imagen
     - Título
     - Fecha de creación
     - Calificación (del 1 al 5)
     - Personajes asociados 
     ######

   - Género: deberá tener:
     - Nombre
     - Imagen
     - Películas o series asociadas

##### 2. Creación, Edición y Eliminación de Personajes (CRUD)
- Deberán existir las operaciones básicas de creación, edición y eliminación de characters.
- Al guardar/actualizar un character, se deberá devolver esta entidad completa, es decir, con sus películas o
series relacionadas.
- Al momento del Update, es importante solo actualizar la Entidad Personaje y no su listado de películas

##### 3. Creación de Géneros
Deberá existir la operación de creación de Genero . 

##### 4. Detalle de Personaje
En el detalle deberán listarse todos los atributos del character, como así también sus
películas o series relacionadas.

##### 5. Búsqueda de Personajes
Deberá permitir buscar por nombre, y filtrar por edad, peso o películas/series en las que
participó.
Para especificar el término de búsqueda o filtros se deberán enviar como parámetros de
   query:
   - GET /characters?name=nombre
   - GET /characters?age=edad
   - GET /characters?movies=idMovie
#####
   El listado deberá mostrar:
   - Imagen.
   - Nombre.
#####
   El endpoint deberá ser:
   - /characters

Recordar que si ningún filtro es enviado, se deben devolver todas las entidades.

##### 6. Detalle de Película / Serie con sus characters
Devolverá todos los campos de la película o serie junto a los characters asociados a la
misma

##### 7. Creación, Edición y Eliminación de Película / Serie.
Deberán existir las operaciones básicas de creación, edición y eliminación de películas o
series.

- Al crear una Película, crearla con sus characters asociados
- Al guardar/actualizar una película, se deberá devolver esta entidad completa, es decir, con sus characters asociados.
- Al momento del Update, es importante solo actualizar la Entidad Película y no su listado de characters

##### 8. Búsqueda de Películas o Series
Deberá permitir buscar por título, y filtrar por género. Además, permitir ordenar los
resultados por fecha de creación de forma ascendiente o descendiente.
   
   El término de búsqueda, filtro u ordenación se deberán especificar como parámetros de
   query:
   - /movies?name=nombre
   - /movies?genre=idGenero
   - /movies?order=ASC | DESC

   El listado deberá mostrar:
   - Imagen.
   - Título
   - Fecha de Creación.

   El endpoint deberá ser:
   - GET /movies

Recordar que si ningún filtro es enviado, se deben devolver todas las entidades.

##### 9. Agregar/Remover characters a una película
Deberá existir un endpoint que nos permita agregar/remover characters a una película.
Los endpoint deberán ser:

   - POST /movies/{idMovie}/characters/{idCharacter}
   - DELETE /movies/{idMovie}/characters/{idCharacter}

##### 10.Autenticación de Usuarios
Para realizar peticiones a los endpoints subsiguientes el usuario deberá contar con un
token que obtendrá al autenticarse. Para ello, deberán desarrollar los endpoints de
registro y login, que permitan obtener el token.
Los endpoints encargados de la autenticación deberán ser:
   - /auth/login
   - /auth/register

##### 11. Envío de emails
Al registrarse en el sitio, el usuario deberá recibir un email de bienvenida. Es recomendable,
la utilización de algún servicio de terceros como SendGrid.


# Organizacion interna de las carpetas

#### La idea es que se organicen las capas internas, de manera que queden lo mas desacopladas para darle una mayor mantenibilidad
#### Para esto se siguio la teoria de arquitectura hexagonal, con el fin de seguir una buena practica de programacion y codigo limpio

- [Arquitectura hexagonal Spring Boot](https://pandemoniodigital.es/arquitectura/2020/12/21/arquitectura-hexagonal-spring-boot.html)
- [Spring Hexagonal](https://reflectoring.io/spring-hexagonal/)
- [Introduccion a DDD y Arquitectura Hexagonal con un Ejemplo de Aplicacion en Java](https://picodotdev.github.io/blog-bitix/2021/02/introduccion-a-ddd-y-arquitectura-hexagonal-con-un-ejemplo-de-aplicacion-en-java/)

```
    src/
        application/     #Capa encargada unicamente de la logica de negocio
            service/          # Clases que sean las encargadas de resolver la logica de negocio 
            port/
                in/           # Clases que sean las encargadas de procesar/transformar la informacion proveniente de (infraestructure/in/controller/) y (infraestructure/in/consumer/)
                out/          # Clases que sean las encargadas de procesar/transformar la informacion para enviar a  (infraestructure/in/controller/) y (infraestructure/out/producer/) 
            exception/        # Excepciones concretas de este paquete/modulo
    
        domain/          #Capa encargada unicamente del modelo de dominio
            repository/       # Interfaces que seran implementadas por (infraestructure/out/repository/) con el fin de mantener un contrato obligatorio y que en caso de cambiar la forma de consumir la db siempre se respete el mismo contrato          
            model/            # Modelo de negocio (Entitades que corresponden a tablas y atributos de la DB)
            exception/        # Excepciones concretas de este paquete/modulo
    
        infrastructure/  #Capa encargada unicamente de la logica de entrada/salida al servicio
            in/
                controller/   # Clases encargadas de exponer funcionalidades mediante REST
                consumer/     # Clases encargadas de consumir mensajes provenientes de colas/topicos
                exception/    # Excepciones concretas de este paquete/modulo
                dto/          # Clases de contrato con otras aplicaciones
                   request/   # Clases de contrato que ingresan a la aplicacion
            out/
                dto/          # Clases de contrato con otras aplicaciones
                   response/  # Clases de contrato que salen de la aplicacion
                producer/     # Clases encargadas del envio de mensajes a colas/topicos
                bus/          # Clases encargadas de conectarse mediante WSDL con otros componentes
                rest/         # Clases encargadas de conectarse mediante HTTP con otros componentes
                repository/   # Implementación de la interfaz repository para los distintos repositorios (hibernate/jpaRepository/JDBC Template).
                exception/    # Excepciones concretas de este paquete/modulo
            configuration/    # La configuración de las distintas bases de datos, swagger, colas, etc. 

        JavaMainClass.java

    resources/
        apidoc/               # Folder que contendra los contratos swagger generados (.json / .yaml)
        How to run it/        # Folder que contendra la informacion necesaria para correr el microservicio localmente (collection de postman, variables de ambiente, etc)
        scripts/              # Folder que contendra los scripts de DB
        wsdl/                 # Folder que contendra los WSDL