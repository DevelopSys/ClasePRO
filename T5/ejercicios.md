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

3. (Cajero Base)

Realizar una aplicación que permita manejar el funcionamiento de un cajero. Para ello los requisitos que se marcan son los siguientes:

- El programa tiene la capacidad de manejar las cuentas de dos bancos (BBVA y Santander). Cada banco tiene un nombre, un cif y un conjunto de cuentas
- En cada banco los clientes pueden hacer la siguiente funcionalidad: abrir una cuenta (para lo que necesitan un dni, un pin y un saldo inicial. El ISBN será un numero aleatorio entre 1 y 10000) y cancelar una cuenta (para lo que necesitarán indicar su dni y el pin de la cuenta -la cuenta quedará eliminada del banco-)
- Una cuenta siempre tendrá asociado un dni, un pin con el que poder operar y un saldo. Las operaciones que se pueden hacer sobre esta cuenta son: ingresar dinero (el sistema no deberá permitir ingresar un saldo negativo), sacar dinero (el sistema no deberá permitir sacar dinero si la cuenta se va a quedar en números rojos), ver un resumen de los datos de la cuelta. Para todas las operaciones a realizar sobre la cuenta el sistema pediná dni del titular - pin asociado, permitiendo la operacion si ambos son correctos.

Antes de empezar a programar indica cuales son las clases, métodos, constructores y variables que tiene que tener el programa, justificando la existencia de cada una de ellas

El sistema estará compuesto por un menú inicial que tendrá el siguiente aspecto

````
1 Introduce el banco con el que quieres operar
	1. BBVA
	2. Santander
	
--Seleccionado BBVA--
1. Crear una cuenta
2. Ingresar dinero
3. Sacar dinero
4. Ver cuentas de un cliente
5. Ver todas las cuentas
Que quieres hacer:


-- Seleccionado crear cuenta
Introduce DNI de titular
Introduce pin asociado 
Introduce saldo inicial
--- Cuenta creada correctamente ---

-- Seleccionado ingresar dinero
Introduce DNI de titular
Introduce pin asociado 
Introduce saldo a ingresar
--- Dinero ingresado correctamente ---

-- Seleccionado sacar dinero
Introduce DNI de titular
Introduce pin asociado 
Introduce saldo a sacar
--- Dinero sacado correctamente ---

-- Seleccionado ver cuentas cliente
Introduce DNI de titular
Las cuentas asociadas del cuente con DNI XXXXXXXX son:
ISBN: xxxxxxx
Saldo: xxxxxxx
ISBN: xxxxxxx
Saldo: xxxxxxx
ISBN: xxxxxxx
Saldo: xxxxxxx
--- Listadas cuentas cliente correctamente ---

-- Seleccionado ver cuentas del banco

Las cuentas que tiene el banco son:
ISBN: xxxxxxx
Saldo: xxxxxxx
ISBN: xxxxxxx
Saldo: xxxxxxx
ISBN: xxxxxxx
Saldo: xxxxxxx
--- Listadas cuentas correctamente ---
````


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
	- La velocidad mínima del coche es 0, en el caso de superarla se pondrá el valor 0 y se mostrará un mensaje por pantalla
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
- Modifica los datos del CocheA y por
	- Modelo, Matricula y CV
- Modifica la velocidad del CocheA en un número aleatorio entre 10 y 30
- Modifica la velocidad del CocheB en un número aleatorio entre 10 y 30
- Muestra por pantalla los datos de los dos coches
- Imprime por pantalla el siguiente mensaje, teniendo en cuenta que el coche ganador será el que más km haya recorrido
	- El ganador es modelo matricula con km recorridos

5. (CarreraCompleta)

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
- Un constructor que pida por parámetros un storing (nombre) y tres enteros (niveles de ataque medio y defensa) y que tenga la siguiente funcionalidad:
	- Inicialice el nombre al pasado por parámetros	
	- Inicialice el nivel de ataque al número pasado
	- Inicialice el nivel de centro al número pasado
	- Inicialice el nivel de defensa al número pasado
- Un método atacar que no reciba nada por parámetros y retorne un booleano. La funcionalidad será la siguiente
	- Retornará true (se ha metido gol) si el resultado de la operación de (nivelAtaque * (aleatorio entre 0-1) + (nivelCentro * aleatorio entre 0-1)/2) es superior a 90. Además sumará uno a la variable goles
	- Retornará false en el resto de los casos

Desarrollar una clase Entrada que tenga la siguiente funcionalidad:

- Crear dos equipos:
	- (EquipoA) construido con el constructor que pide un nombre
	- (EquipoB) construido con el constructor que pide un nombre y tres int
- Realizar un ataques sucesivos del EquipoA y el EquipoB. Tras cada uno de los ataques mostrar el siguiente mensaje "El resultado es EqupoA X - EqiuipoB X)

- Tras realizar 3 ataques de cada equipo y mostrar el resultado definitivo

**MODIFICACIÓN**

Desarrollar una clase Jugador que tenga las siguientes características:

- Atributo de tipo String (nombre)
- Atributo de tipo String (posicion)
- Atributo de tipo boolean (estrella)
- Atributo de tipo int (calidad)
- Crear un constructor que pida por parámetro un nombre,  una posición,  y una calidad. Se iniciará los atributos a los parámetros pasados. El atributo estrella será true si la calidad es superior a 90, sino será false.
- Un método mostrarDatos que imprima por pantalla los datos del jugador

Modificar la clase Equipo para que tenga:
- Un atributo de tipo Arraylist que se inicialice a vacío en todos los constructores
- Un método que no devuelva nada y que pida por parámetros un objeto de tipo jugador. El método agregará a la lista de jugadores el pasado por parámetros
- Un método que sea listarDelateros que no devuelva nada y muestre por consola los datos de los delantros

Crear una clase partido que tenga los siguientes atributos;
- Dos atributos de tipo equipo
- un atibuto de tipo boolean. Representa si el partido se esta jugando o está terminado
- un atributo de tipo int. Representa en que parte está
- Un constructor con los dos equipos pasados por parámetros
- Un método iniciarPartido: realiza tres ataques por cada parte
- Un método mostrarResultado: muestra el resultado final del partido: EquipoA  XX - Equipo B XX 

Implementar una funcionalidad para:

- Cuando un equipo ataca marcará gol cuando su método atacar sea true y su niven de ataque sea mayor que el nivel de defensa del contrario
	
7. (ConsumicionAplicacion) 

Créese una clase de nombre “Cuenta” que permita realizar pedidos que tenga los siguientes métodos y atributos:

- Tendrá un atributo de tipo int "Identificador"
- Tendrá un atributo de tipo boolean "Estado"
- Tendrá un atributo de tipo "ArrayList" donde se guardarán Artículos
- Crear un constructor que pida el identificador.
- Crear un método que permita agregar un artículo a la lista
- Crear un método que retorne el número de artículos que tiene la cuenta 
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

8. (Cajero)

Desarrollar una aplicación que simule el funcionamiento de un cajero automático. Este cajero debe manejar cuentas que estén definidas por un identificador único, un pin con el cual poder operar y un titular (la versión fácil de la práctica declarará esta variable como String, pero la versión difícil declara esta variable como Persona (que a su vez tiene nombre y apellidos). Hay que tener en cuenta que una misma persona puede tener varias cuentas. Las operaciones que se pueden realizar sobre las cuentas son:

- Ingresar un saldo determinado
- Sacar dinero: solo si el saldo restante no es negativo
- Consultar el estado de la cuenta: donde nos dice el saldo actual

9. (Gasolinera)

Crear una clase Surtidor que tenga los siguientes elementos:
- Atributo int (capacidadTotal) que represente los litros máximos de gasolina que admite
- Atributo int (capacidadActual) que represente los litros que tiene de gasolina cargados
- Atributo string que represente el tipo de gasolina que tiene
- Atributo boleado que represente si está o no funcionando el surtidor
- Constructor que pida por parámetros la capacidadTotal y el tipo de gasolina e inicialice los atributos.El atributo funcionamiento se iniciará funcionando a true y el atributo capacidadActual será igual que la capacidadTotal.
- Constructor que pida por parámetros el tipo de gasolina (y lo inicialice) y el resto de elementos los inicie por defeco.
- Un método arreglar que no pida parámetros, no retorne nada y modifique el valor de atributo funcionamiento a true
- Un método que rellenar que no devuelva nada y que admita por parámetros un int. El método agregará a la capacidadActual lo pasado por parámetros
- Un método quitarGasolina que reciba por parámetros un int. El método quitará del atributo capacidadTotal lo pasado por parámetros
- Los getter y setter correpondientes

Crear una clase Gasolinera que tenga los siguientes elementos:
- Un atributo de tipo string (nombre)
- Un atributo de tipo ArrayLista donde se guardarán los surtidores (lista)
- Un atributo de tipo int (ganancias)
- Un constructor que pida por parámetros un nombre y lo inicialice. El resto de atributos los inicializará por defecto.
- Un método que sea obtenerGanancias que no reciba nada y que devuelva un int. El método retornará la variable ganancias
- Los getter y setter

Crear una clase Coche que tenga los siguientes elementos:
- Un atributo de tipo string (tipo de gasolina)
- Un atributo de tipo int (litrosDeposito)
- Un constructor que admita un argumento de tipo string y lo inicialice. Los litrosDeposito los iniciará a 0
- Un método que sea ponerGasolina que no devuelva nada y que admita por parámetros un objeto de tipo surtidor y un int con la cantidad de litros a repostar. La funcionalidad será la siguiente:
	- El coche ejecutará el método quitarGasolina del surtidor
		- Si el surtidor está vacío o intentas poner más gasolina de la que tiene el surtidor saltará un aviso
		- Si el surtidor está averiado saltará un aviso
		- Si el tipo de gasolina del coche es diferente al tipo de gasolina del surtidor saltará un aviso
		- Si no se sumará a litrosDeposito lo que se ha reportado, y al surtidor  se le restarán los litros


Crear una clase entrada que tenga:

- Crear tres surtidores. Dos con capacidad total y tipo de gasolina y uno con tipo de gasolina
- Crear una gasolinera. 
- Agregar los tres surtidores a la gasolinera   
- Crear un coche con tipo de gasolina 
- Ejecutar el método ponerGasolina del coche (respotando una cantidad concreta). 
	- Prueba todas las combinación para comprobar los posibles fallos del método.

10. (IMC)

Crear una clase Persona que tenga las siguientes características:

- Tres atributos de tipo String nombre, DNI, sexo (H hombre, M mujer)
- Dos atributos de tipo double peso y altura. 
- Un atributo de tipo int edad
- Un constructor por defecto, que inicialice todos los valores por defecto (aquellos que sean Complejos pondrá "defecto").
- Un constructor con el nombre, edad y sexo, el resto por defecto.
- Un constructor con todos los atributos como parámetro.
- Un método calcularIMC que no pida nada por parámetros y que devuelva un int. La funcionalidad del método será la siguiente
	- calculará si la persona esta en su peso ideal (peso/(altura^2))
		- si esta fórmula devuelve un valor menor que 20, la función devuelve un -1
		- si devuelve un número entre 20 y 25 (incluidos), significa que esta por debajo de su peso ideal la función devuelve un 0
		- si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1. 
- Un método esMayorDeEdad que no admita parámetros y retorne un booleano. Si la persona es mayor igual que 18 retornará true, sino false
- toString: devuelve toda la información del objeto forrajeada en json
- getter y setter correpondientes

Crear una clase Entrada que tenga las siguientes características

- Pide por teclado el nombre, la edad, sexo, peso y altura.
- Crea 3 objetos de tipo persona
	- el primer objeto obtendrá las anteriores variables pedidas por teclado
	- el segundo objeto obtendrá todos los anteriores menos el peso y la altura
	- el último por defecto, para este último utiliza los métodos set para darle a los atributos un valor.
- Para cada objeto, comprobar el imc mostrando un aviso para cada caso
	- Estas en peso ideal, estas en sobrepeso o estás por debajo de peso
- Por último, mostrar la información de cada objeto.

11. (Llamadas)

Crear una clase LlamadaLocal que tenga las siguientes características:
- Dos atributos de tipo long (numeroOrigen y numeroDestino)
- Atributo de tipo double (coste)
- Atributo de tipo double (duración). Expresado en segundos
- Constructor que pida por parámetros dos parámetros de tipo double (nOrigen y nDestino) y un parámetro de tipo double (duración). Se calculará automáticamente el coste teniendo en cuenta que el coste de cada segundo es de 0,15 más un establecimiento de llamada de 0,50
- Un método mostrar datos que mostrará todos los datos de la llamada
- Los getter y setter correspondientes

Crear una clase LlamadaNacional que tenga las siguientes características:
- Dos atributos de tipo long (numeroOrigen y numeroDestino)
- Atributo de tipo double (coste)
- Atributo de tipo int (destino). Podrá ser A, B o C
- Atributo de tipo double (duración). Expresado en segundos
- Constructor que pida por parámetros dos parámetros de tipo double (nOrigen y nDestino) y un parámetro de tipo double (duración). Se calculará automáticamente el coste teniendo en cuenta que:
	-  el coste de cada segundo es de 0,40 si el destino es A
	-  el coste de cada segundo es de 0,50 si el destino es B
	-  el coste de cada segundo es de 0,60 si el destino es A
	-  más un establecimiento de llamada de 0,70
- Un método mostrar datos que mostrará todos los datos de la llamada
- Los getter y setter correspondientes

Crear una clase Centralita con las siguientes características: 

- Atributo Arraylist con lista de llamadas locales
- Atributo Arraylist con lista de llamadas nacional
- Atributo de tipo int con el coste acumulado
- Un constructor que inicialice los valores por defecto
- Un método agregarLocal que no devuelva nada y que admita por parámetros una llamada local. La funcionalidad del método agregará la llamada local a la lista de llamadas local
- Un método agregarNacional que no devuelva nada y que admita por parámetros una llamada nacional. La funcionalidad del método agregará la llamada nacional a la lista de llamadas nacionales
- Un método listarLocales que no admita parámetros y que no devuelva nada. Mostrará por pantalla los datos de todas las llamadas locales
- Un método listarNacionalesque no admita parámetros y que no devuelva nada. Mostrará por pantalla los datos de todas las llamadas nacionales
- Un método mostrarCostes que no admita parámetros y que no devuelva nada. Mostrará por pantalla el coste acumulado de la centralita
- Los métodos getter y setter correspondientes

Crear una clase Entrada con las siguientes características:

- Un atributo de tipo Centralita

Se creará un menú con la siguiente disposición:
	- Agregar llamada local
	- Agregar llamada nacional
	- Mostrar datos de llamadas locales
	- Mostrar datos de llamadas nacionales
	- Mostrar coste acumulados 
