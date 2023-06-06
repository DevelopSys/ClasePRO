# Tema 6 - Arraylist

1. Se te pide desarrollar un programa en Java para gestionar una lista de estudiantes utilizando la clase ArrayList. El programa debe permitir realizar las siguientes acciones:

- Creación de la lista de estudiantes: El programa debe crear un ArrayList para almacenar objetos de tipo "Estudiante". La clase "Estudiante" debe tener los siguientes atributos:
  - Nombre: nombre del estudiante (cadena de caracteres).
  - Edad: edad del estudiante (entero).
  - Nota: nota del estudiante (decimal).
- Inserción de estudiantes: El programa debe permitir al usuario ingresar los datos de un nuevo estudiante (nombre, edad y nota) y agregarlo a la lista.
- Listado de estudiantes: El programa debe mostrar por pantalla todos los estudiantes almacenados en la lista, mostrando su nombre, edad y nota.
- Búsqueda de estudiantes por nombre: El programa debe permitir al usuario ingresar un nombre de estudiante y buscarlo en la lista. Si se encuentra, se debe mostrar por pantalla su nombre, edad y nota.
- Actualización de notas de estudiantes: El programa debe permitir al usuario ingresar un nombre de estudiante y una nueva nota. El programa debe actualizar la nota del estudiante correspondiente en la lista.
- Cálculo del promedio de notas: El programa debe calcular y mostrar por pantalla el promedio de notas de todos los estudiantes en la lista.

# Tema 7 - POO

1. Se te pide desarrollar un programa en Java para gestionar una biblioteca utilizando programación orientada a objetos. El programa debe permitir realizar las siguientes acciones:

- Creación de la clase Libro: Define una clase llamada "Libro" que represente un libro de la biblioteca. La clase debe tener los siguientes atributos:
  - Título: título del libro (cadena de caracteres).
  - Autor: autor del libro (cadena de caracteres).
  - Año de publicación: año en que se publicó el libro (entero).
- Creación de la clase Biblioteca: Define una clase llamada "Biblioteca" que represente la biblioteca en sí. La clase debe tener un atributo que sea una lista (ArrayList) de libros y debe tener los siguientes métodos:
- Agregar libro: permite agregar un libro a la biblioteca.
- Mostrar libros: muestra por pantalla todos los libros de la biblioteca, mostrando su título, autor y año de publicación.
- Buscar libro por título: permite buscar un libro en la biblioteca por su título. Si se encuentra, se debe mostrar por pantalla su título, autor y año de publicación.
- Eliminar libro: permite eliminar un libro de la biblioteca.

Interacción con el usuario: El programa debe permitir al usuario realizar las siguientes acciones:

- Agregar un libro a la biblioteca, ingresando el título, autor y año de publicación.
- Mostrar todos los libros de la biblioteca.
- Buscar un libro por su título.
- Eliminar un libro de la biblioteca, ingresando su título.

# Tema 8 - Ficheros

1. Escribe un programa que lea un fichero de texto y muestre su contenido por pantalla.

2. Escribe un programa que solicite al usuario que ingrese una serie de líneas de texto y las guarde en un fichero de texto.

3. Escribe un programa que solicite al usuario que ingrese una palabra y busque esa palabra en un fichero de texto. El programa debe mostrar la cantidad de veces que aparece la palabra en el fichero.

# Tema 9 - Base de datos

1. En este ejercicio, se te pide desarrollar un programa en Java para gestionar una base de datos de productos. El programa debe permitir realizar las siguientes acciones:

- Conexión a la base de datos: El programa debe establecer una conexión con una base de datos utilizando JDBC.
- Creación de la tabla de productos: Si la tabla de productos no existe en la base de datos, el programa debe crearla. La tabla debe contener los siguientes campos:

  - ID: identificador único del producto (entero).
  - Nombre: nombre del producto (cadena de caracteres).
  - Precio: precio del producto (decimal).

- Inserción de un producto: El programa debe permitir al usuario ingresar los datos de un nuevo producto (nombre y precio) y agregarlo a la base de datos. El ID del producto debe generarse automáticamente.
- Listado de productos: El programa debe mostrar por pantalla todos los productos almacenados en la base de datos, mostrando su ID, nombre y precio.
  Búsqueda de productos por ID: El programa debe permitir al usuario ingresar un ID de producto y buscarlo en la base de datos. Si se encuentra, se debe mostrar por pantalla el nombre y el precio del producto.
- Actualización de precios de productos: El programa debe permitir al usuario ingresar un ID de producto y un nuevo precio. El programa debe actualizar el precio del producto correspondiente en la base de datos.

2. Modifica el ejercicio anterior para incluir hibernate como orm de conexión entre la base de datos y el programa

3. Utilizando el driver de conexión de mongo

- Creación de la colección de usuarios: Si la colección de usuarios no existe en la base de datos, el programa debe crearla. La colección debe contener los siguientes campos:
  - ID: identificador único del usuario (cadena de caracteres).
  - Nombre: nombre del usuario (cadena de caracteres).
  - Edad: edad del usuario (entero).
  - Email: dirección de correo electrónico del usuario (cadena de caracteres).
- Inserción de un usuario: El programa debe permitir al usuario ingresar los datos de un nuevo usuario (nombre, edad y email) y agregarlo a la base de datos. El ID del usuario debe generarse automáticamente.
- Listado de usuarios: El programa debe mostrar por pantalla todos los usuarios almacenados en la base de datos, mostrando su ID, nombre, edad y email.
- Búsqueda de usuarios por ID: El programa debe permitir al usuario ingresar un ID de usuario y buscarlo en la base de datos. Si se encuentra, se debe mostrar por pantalla el nombre, la edad y el email del usuario.
- Actualización de datos de usuarios: El programa debe permitir al usuario ingresar un ID de usuario y actualizar alguno de sus campos (nombre, edad o email) en la base de datos.
