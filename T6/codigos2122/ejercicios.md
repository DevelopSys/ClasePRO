# Ejercicio 
1. (ListaMultimedia) 

Desarrollar una aplicación para la gestión de una colección multimedia. Todo elemento multimedia tiene 4 características; identificador, titulo, autor, tamaño, formato. Adicionalmente cada uno de los elementos tendrán:
a. Libro (ISBN, número de páginas)
b. Video (director, actores)
c. Audio (duración, soporte)
La aplicación deberá poder manejar cualquier tipo de objeto, dando la posibilidad de:
1. Añadir a la colección (preguntara que tipo de objeto y los elementos correspondientes)
a. Los datos serán pedidos por consola
b. Una vez añadido el programa mostrará una confirmación de que el elemento
está bien añadido
2. Eliminar de la colección
a. Se pedirá el identificador del elemento a eliminar
b. Una vez eliminado el programa mostrará una confirmación de que el elemento
está bien eliminado
3. Listar elementos
a. Imagen
b. Video
c. Audio
d. Todos
4. Salir

Los listados mostrarán información completa de los elementos en cuestión.
La restricción que se pone a la colección es que no se pueden añadir elementos con el mismo id. Crea tres clases: Entrada (donde se sitúa el main), Elemento (la base del objeto que será abstracta), Video (la cual extenderá de Elemento), Audio (la cual extenderá de Elemento) e Imagen (la cual extenderá de Elemento) y Colección (donde se sitúa la lista y los métodos). Cada una de las clases tendrá los métodos y atributos que consideres necesarios


2. (TrabajadoresHerencia)

Realizar una aplicación para la gestión de trabajadores. La aplicación podrá registrar trabajadores (asalariados, autónomos y/o jefes). Cada uno de los anteriores tiene las siguientes características:
- Jefes: nombre, apellido, din, acciones, beneficio. Los jefes tendrán la capacidad de despedir un trabajador. 
- Asalariados: nombre, apellido, dni, sueldo, número de pagas, contratado (booleano)
- Autónomo: nombre, apellido, dni, sueldo, contratado (booleano)


Adicionalmente existirá una clase Empresa que tendrá una lista de trabajadores, donde se podrán registrar todos los trabajadores de la empresa

La aplicación tendrá la capacidad de:

- Registrar un trabajador. Para ello preguntará si se quiere registrar un asalariado, autónomo o jefe y pedirá los datos del trabajador
- Listar trabajadores. Para ello preguntará si se quiere listar los asalariados, los autónomos o todos
- Mostrar datos de trabajador. Para ello pedirá el DNI y mostrará el siguiente formato:

Si es jefe:

Nombre: XXX Apellido: XXX DNI: XXX  Acciones: XXX Beneficio: XXX

Si es asalariado:

Nombre: XXX Apellido: XXX DNI: XXX Salario Anual: XXX Salario Mensual: XXX Número de Pagas: XX

Si es autónomo

Nombre: XXX Apellido: XXX DNI: XXX Salario Anual: XXX

Realizar un menú para gestionar todos los casos anteriores, teniendo en cuenta las siguientes restricciones:
- En una empresa no pueden existir dos trabajadores con el mismo DNI
- En una empresa no puede haber registrado más que un jefe
- Para poder despedir un trabajador, solo lo puede hacer un jefe

Utilizar la herencia y el polimorfismo para juntar el máximo de propiedades y métodos .

3. (TrigonometríaHerencia)

Desarrollar una clase llamada Círculo que:
- Tenga un constructor con un parámetro double que el radio
- Tenga un método calcularArea que no recibe ningún parámetro y devuelve un double. (Pi *R2)
- Tenga un método calcularDiametro que no recibe ningún parámetro y devuelve un double. (2*r)

Desarrollar una clase llamada Rectangulo que:
- Tenga un constructor con dos parámetros de double que inicialice base y altura.
- Tenga un método calcularArea que no recibe ningún parámetro y devuelve un double. (base *altura)
- Tenga un método calcularPerimetro que no recibe ningún parámetro y devuelve un double. (2*(b+h))

Desarrollar una clase llamada Triangulo que:
- Tenga un constructor con 2 parámetros de tipo double que inicialice base y altura.
- Tenga un método calcularArea que no recibe ningún parámetro y devuelve un double. (b*a)/2

Desarrollar una Figura que tenga todos los elementos comunes a las clases mencionadas en las clases anteriores

Desarrolla una clase Entrada que permita registrar figuras y operar con figuras (pidiendo datos mediante un menú de la misma forma que en el ejercicio de temas anteriores)


4. (LlamadasHerencia)

Desarrollar una aplicación de control de llamadas realizadas en una centralita telefónica.

La centralita mostrará por pantalla todas las llamadas según las vaya registrando.
Existen tres tipos de llamadas:

- Las llamadas locales que no tienen coste
- Las llamadas provinciales que cuestan 15 céntimos el segundo.
- Las llamadas nacionales que dependiendo de la franja horaria en la que se realicen cuestan: 20 céntimos en franja 1, 25 céntimos en franja 2 y 30 céntimos en franja 3, cada segundo.

Todas las llamadas tienen como datos el número origen de la llamada, el número destino y su duración en segundos.

Con la centralita se podrá

- Registrar llamadas, mostrar llamadas realizadas (número origen, número destino, duración y coste)
- Mostrar Costes totales
- Mostrar llamadas realizadas

Para la realización de la práctica se desarrollarán las siguientes clases:

- Llamada (Abstracta): nOrigen, nDestino, coste
- LlamadaProvincial
- LlamadaLocal
- LlamadaNacional: franja
- Centralita: arraylist
- Entrada: main

Decide cuales son los métodos que se deberían de poner en herencia

5. (InterfazInicial)

Crea una interfaz llamada Ejecutable que tenga los siguientes métodos:
- variable constante nombre que tenga el valor de EJECUCIÓN
- ejecutar que no reciba nada y devuelva un booleano
- parar que recibe nada y no devuelva nada
- reiniciar que no recibe nada y no devuelva nada. 

Crea una clase Elemento abstracta que tenga las siguientes características
-  identificador, titulo, autor, tamaño, formato,

Crea final una clase Imagen que tenga las siguientes características y que extienda de Elemento
- ISBN

Crea final una clase Audio que tenga las siguientes características y que extienda de Elemento
- duración, soporte

Ambas clases implementarán la interfaz Ejecutable

6. (Biblioteca)

Crea una aplicación para la gestión de una biblioteca. Para ello realiza las siguientes clases

- Trabajador: 
	- Atributos: nombre, apellido, dni
	- Constructor: todos los datos
	- Métodos: mostrarDatos, getter y setter
- Socio:
	- Atributos: nombre, apellido, dni, numero socio y arraylist prestamos
	- Métodos: mostrarDatos, getter y setter
	- Constructores: se pedirá nombre, apellido y dni. El número de socio se generará automáticamente. 
- Libro: 
	- Atributos: id, sección, ISBN, Titulo, Autor, Páginas, Editorial, estado (boolean)
	- Métodos: mostrarDatos, getter y setter
	- Constructor: todos los parámetros
- Revista: 
	-Atributos:  id, sección, ISBN, Titulo, estado (boolean)
	- Constructor: todos los parámetros
- DVD:
	-Atributos:  id, sección, Titulo, Año de edición, director, actores, tipo (enum con col valores intriga, terror, comedia y drama) y estado (boolean)
	- Constructor: todos los parámetros
- CD:
	- Atributos:  id, sección,Titulo, Año edición, tipo (enum con los valores musical, monologo y educativo) y estado (boolean)
	- Constructor: todos los parámetros

**Realiza la linea de herencia que creas necesaria**

Realiza una interfaz Prestar con los siguientes métodos:

- prestar() que devuelva un booleano
- devolver() que devuelva un booleano

Dicha interfaz será implementado en todos los elementos que sean prestables y modificará el atributo estado 

- Biblioteca: 
	- Atributos: 
		- Arraylist de trabajadores y socios
		- Arraylist de libros, revistas, dvds y cd
	- Métodos
		- Registrar una persona (socio o trabajador) pide como parámetros un elemento de tipo persona
		- Registrar un elemento alquilable (cd, dvd, libro, revista) pide como parámetros un elemento de tipo alquilable (o la clase de la herencia)
		- Realizar préstamo. Pide como parámetro un socio y un elemento alquilable. Si el elemento no está prestado se le prestará al socio y se le asociará a su lista. De no ser así se mostrará un mensaje
		- Realizar devolución. Pide como parámetro un socio y un elemento alquilable.
		- Mostrar elementos prestados: No pide nada por parámetros y mostrará los datos de los elementos prestados
		- Mostrar elementos disponibles: No pide nada por parámetros y mostrará los datos de los elementos que están disponibles
		- Mostrar elementos de un socio. Se pide por consola un dni y se mostrarán los datos de los elementos prestados a ese socio.


Realizar una entrada con dos posibilidades

Crear tanto Empresa, trabajadores, socios, revistas, cd, dvd e ir haciendo registros
Comprobar la funcionalidad de todos los mñetodos

Ó

Realizar un menú que tenga las opciones
- 1. Dar de alta un socio
- 2. Dar de alta un elemento
	- 2.1 CD
	- 2.2 DVD
	- 2.3 Revista
	- 2.4 Libro
- 3. Prestar un elemento
- 4. Devolver un elemento
- 5. Ver elementos prestados a un socio concreto
- 6. Mostrar elementos disponibles
- 7. Mostrar elementos prestados-  


