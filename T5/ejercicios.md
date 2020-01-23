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


4. (ConsumicionAplicacion) 

Créese una clase de nombre “Cuenta” que permita realizar pedidos. Para eso crea una clase consumición que tenga los siguientes métodos y atributos:

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

- Registrar una cuenta
- Agregar artículos a la cuenta
- Obtener el valor de una cuenta


**Repetir el ejercicio con un menú que permita realizar consumiciones en diferentes cuentas**