## Ejercicios Objetos
1. (Trigonometría) 

Desarrollar una clase Triangulo que:


-	Tenga un constructor vacío y un constructor con base y altura
-	Tenga dos atributos tipo int, base y altura
-	Tenga un método que calcule su área (A=(b*al)/2)

Desarrollar una clase Círculo

-	Tenga un constructor vacío y un constructor con radio
-	Tenga tres atributo de tipo double radio, diámetro y área
-	Tenga un método donde se calcule el área (A=Pi*r2)
-	Tenga un método donde se calcule el diámetro (D = 2*r)

Desarrollar una clase Cuadrado

-	Tenga un constructor vacío y un constructor con base y altura
-	Tenga dos atributos int base y altura
-	Tenga dos atributos de tipo double área y perímetro
-	Tenga un método que calcule su área (A=b*a)
-	Tenga un método que calcule su perímetro (2*a+2*b)

Desarrollar una clase entrada donde: se mostrará un menú por el cual se podrán seleccionar opciones a ejecutar (operaciones con triangulo, con circulo y con cuadrado) una vez seleccionada la figura a trabajar se pedirá los datos necesarios (base, altura o radio) y la operación a realizar (calcular area, diámetro y/o perímetro)- El menú será el siguiente:
- 1 Trabajar con triángulos
	- Introduce base
	- Introduce altura
	- Que operación quieres hacer
		- Calcular área
		- Mostrar datos
	- Pulsa enter para continuar (teclado.next())
- 2 Trabajar con círculos
	- Introduce radio
	- Que operación quieres hacer
		- Calcular área
		- Calcular diámetro
		- Mostrar datos
	- Pulsa enter para continuar (teclado.next())
- 3 Trabajar con cuadrados
	- Introduce base
	- Introduce altura
	- Que operación quieres hacer
		- Calcular área
		- Calcular perímetro
		- Mostrar datos
	- Pulsa enter para continuar (teclado.next())

2. (Asignaturas) 

Desarrollar una clase llamada Asignatura que:
- Tenga dos atributos private de tipo int (identificador) y de tipo double (calificación).
- Tenga un constructor con un parámetro de tipo int.
- Tenga un getter para cada uno de los atributos.
- Tenga un setter para la calificación.

Desarrollar una clase llamada Alumno que:
- Tenga tres atributos private de tipo Asignatura.
- Tenga un constructor con tres parámetros de tipo Asignatura que inicialice los tres atributos.
- Tenga un constructor con tres parámetrosde tipo int que inicialice los tres atributos.
- Tenga un getter para cada uno de los atributos.

Desarrollar una clase llamada Profesor que:
- Tenga un método ponerNotas que recibe un parámetro de tipo Alumno y que no devuelve nada. Pondrá una calificación aleatoria a cada una de las asignaturas del alumno.
- Tenga un método calcularMedia que recibe un parámetro de tipo Alumno y devuelve
un double.

Desarrollar una clase llamada Entrada que en su método main:
- Registrar asignatura. Cree e inicialice tres Asignaturas (a mano).
- Cree un Alumno con las tres Asignaturas (a mano).
- Cree un Profesor que le ponga calificaciones al Alumno y muestre por pantalla la media del Alumno (a mano).
- Comprueba mediante impresiones por pantalla las notas de cada alumno

3. Desarrollar una práctica que maneje el funcionamiento de una agenda. La agenda debe guardar los datos de una persona física (Nombre, Teléfono y DNI). El programa deberá permitir:

- 1: Agregar persona a la agenda
- 2: Borrar persona (según el DNI introducido)
- 3: Editar persona (según el DNI introducido)
- 4: Buscar persona (recupera la persona que tenga un DNI introducido)
- 5: Listar agenda (lista todos los contactos de la agenda con sus datos)

**Es muy parecido al ejercicio de arraylist que guardaba array de Object. En este caso se guardan en el arraylist o hashtable objetos de tipo persona**

4. (Carrera)

Desarrollar una clase Coche que tenga las siguientes características:

- Atributo de tipo int que represente los caballos 
- Atributo de tipo int que represente la velocidad
- Atributo de tipo String que represente la matricula
- Atributo de tipo String que represente el modelo
- Atributo de tipo double que represente los kilómetros recorridos
- Un constructor vacío que inicialice los cv a 0, la velocidad a 0, la matricula a 0000AAA, el modelo a "sin especificar" y los km a 0.0
- Un constructor con los siguientes parámetros: modelo, matrícula y cv. Se iniciarán los atributos a los parámetros pasados y el resto lo hará a los valores por defecto
- Un método acelerar que reciba como parámetros un argumento de tipo int, que no retorne nada y realice la siguiente funcionalidad:
	- Incrementa la velocidad en la cantidad pasada por parámetros
	- Incrementa los kilómetros en: velocidad * ((caballos)*número aleatorio entre 1 y 10)
	- La velocidad máxima del coche es 180, en el caso de superarla se pondrá el valor 180 y se mostrará un mensaje por pantalla
- Un método frenar que reciba como parámetros un argumento de tipo int, que no retorne nada y realice la siguiente funcionalidad:
	- Decrementa la velocidad en la cantidad pasada por parámetros
	- La velocidad mínima del coche es 0, en el caso de superarla se pondrá el valor 180 y se mostrará un mensaje por pantalla
- Un método parar que no recibirá nada por parámetros y que no devuelva nada. Su funcionalidad será la siguiente:
	- Pondrá la velocidad del cocha a 0
- Un método resetear que no reciba nada por parámetros y no devuelva nada. Su funcionalidad será la siguiente:
	- Pondrá la velocidad del coche a 0 y los kilómetros a 0
- Un método mostrar datos que muestre por pantalla los datos del coche con el siguiente formato:
	- Matrícula: XXX Modelo: XXX CV: XXX Velocidad: XXX Kilómetros: XXX
- Un método setter para cada uno de los atributos
- Un método getter para cada uno de los atributos

Desarrollar una clase Entrada que represente el punto de entrada de la aplicación. La funcionalidad de la aplicación será la siguiente

- Crear dos coches:
	- (CocheA) Uno con el constructor por defectoç
	- (CocheB) Uno pasando modelo, matricula y caballos
- Muestra por pantalla los datos de los dos coches
- Modifica la velocidad del CocheA en un número aleatorio entre 10 y 30
- Modifica los datos del CocheB y por
	- Modelo, Matricula y CV
- Modifica la velocidad del CocheB en un número aleatorio entre 10 y 30
- Muestra por pantalla los datos de los dos coches
- Imprime por pantalla el siguiente mensaje, teniendo en cuenta que el coche ganador será el que más km haya recorrido
	- El ganador es modelo matricula con km recorridos

5. (Carrera)

Modifica el ejercicio anterior para que en la clase entrada:

- Exista un atributo de tipo int que sea kilometrosEtapa iniciado a 10000
- El programa deberá realizar aceleraciones de los dos coches de forma sucesiva, mientras que ninguno de los dos haya llegado al valor de kilometrosEtapa (do while)
- Cuando uno de los dos coches haya llegado a los mostrará por pantalla el siguiente mensaje, teniendo en cuenta que el coche ganador será el que más km haya recorrido
	- El ganador es modelo matricula con km recorridos

6. (Equipo)	

Desarrollar una clase Equipo que tenga las siguientes características:

- Un atributo de tipo String que sea el nombre
- Tres atributos de tipo int que sean el nivelAtaque, nivelCentro y nivelDefensa
- Un atributo int que sean los goles
- Un constructor que pida por parámetros un nombre y que tenga la siguiente funcionalidad:
	- Inicialice el nombre al pasado por parámetros
	- Inicialice el nivel de ataque a un número aleatorio entre 0 y 100
	- Inicialice el nivel de centro a un número aleatorio entre 0 y 100
	- Inicialice el nivel de defensa a un número alaatorio entre 0 y 100
	- Inicialice los goles a 0
- Un constructor que pida por parámetros un nombre y que tenga la siguiente funcionalidad:
	- Inicialice el nombre al pasado por parámetros	
	- Inicialice el nivel de ataque al número pasado
	- Inicialice el nivel de centro al número pasado
	- Inicialice el nivel de defensa al número pasado
- Un método atacar que no reciba nada por parámetros y retorne un booleano. La funcionalidad será la siguiente
	- Retornará true (se ha metido gol) si el resultado de la operación de (nivelAtaque * (aleatorio entre 0-1) + (nivelCentro * aleatorio entre 0-1)/2) es superior a 90. Además sumará uno a la variable goles
	- Retornará false en el resto de los casos

Desarrollar una clase Entrada que tenga la siguiente funcionalidad:

- Crear dos equipos:
	


	
7. (ConsumicionAplicacion) 

Créese una clase de nombre “Cuenta” que permita realizar pedidos. Para eso crea una clase "consumición "Cuenta"" que tenga los siguientes métodos y atributos:

- Tendrá un atributo de tipo int "Identificador"
- Tendrá un atributo de tipo boolean "Estado"
- Tendrá un atributo de tipo "ArrayList" donde se guardarán Artículos
- Crear un método que permita agregar un artículo a la lista
- Crear un método que retorne el número de artículos que tiene la consumición 
- Crear un método que retorne el coste total de la consumición.
- Crear un setter para el atributo estado

Crear una clase de tipo Articulo que tenga;

- Un atributo de tipo String (nombre) double (coste)
- Un constructor que pida nombre y coste. Inicializará el artículo con los valores dados
- Un método que ponga el precio del artículo

Crear una clase Entrada que permita:

- Una colección (arraylist o hashtable) que permita registrar consumiciones
- Registrar una cuenta en la coleccion
- Agregar artículos a una cuenta existente en la colección
- Obtener el valor de una cuenta existente en la colección
- Cambiar el estado de una cuenta existente en la colección.


**Repetir el ejercicio con un menú que permita realizar consumiciones en diferentes cuentas**