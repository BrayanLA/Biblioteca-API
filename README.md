## Descripción de la API de CRUD de Libros

Esta API es una aplicación básica de CRUD (Crear, Leer, Actualizar, Eliminar) para libros. Los datos del libro incluyen el ID, el nombre, la fecha de creación y la fecha de publicación. Con esta API, puedes realizar las siguientes acciones:

- Consultar todos los libros almacenados en la base de datos.
- Consultar un libro específico por su ID.
- Crear un nuevo libro y agregarlo a la base de datos.
- Actualizar la información de un libro existente por su ID.
- Eliminar un libro existente por su ID.

La API está construida en Java y utiliza Spring Framework como herramienta de desarrollo. Los endpoints de la API están disponibles públicamente y no requieren autenticación.

### Endpoints

- `GET /getAllBooks`: devuelve todos los libros almacenados en la base de datos.
- `GET /getBookById/{id}`: devuelve la información de un libro específico por su ID.
- `POST /createNewBook`: crea un nuevo libro con la información proporcionada.
- `DELETE /deleteBook/{id}`: elimina un libro existente por su ID.
- `PUT /updateBook/{id}`: actualiza la información de un libro existente por su ID.

### Colección de Postman

En la carpeta "postman" se encuentra una colección de Postman que incluye todas las request mencionadas anteriormente. La colección de Postman es de acceso público y se puede utilizar para probar los diferentes endpoints de la API.

### Base de datos

En la carpeta "database" se encuentra una copia de la base de datos utilizada por la API. Se proporciona una copia de la base de datos para facilitar la instalación y configuración de la API.

### Archivo .jar

En la carpeta "jar" se encuentra una copia del archivo .jar compilado de la aplicación. Para utilizarlo, se debe instalar primero todas las dependencias necesarias.

### Cómo utilizar la API

Para utilizar la API, se debe clonar el repositorio, instalar las dependencias necesarias y compilar la aplicación. Después, se puede utilizar la colección de Postman para probar los diferentes endpoints de la API.
