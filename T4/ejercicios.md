## Ejercicios Arrays unidimensionales
1. (LlenarArrays) Crear un array de int que tenga 5 posiciones y rellenarla con números aleatorios del 10 al 50. Mostrar por pantalla todos los números generados.
2. (Temario) Crear un array de Strings llamado temario que tendrá de forma inicial los siguientes valores: 

"Tema 1: Introducción","Tema 2: Identificadores","Tema 3: Estructuras","Tema 4: Colecciones","Tema 5: Orientación a objetos", "Tema 6: Clases y Objetos", "Tema 7; Abstracción, Herencia y Polimorfismo", "Tema 8: Ficheros y Excepciones", "Tema 9: Bases de datos", "Tema 10: Interfaces". La salida del programa deberá ser la siguiente

Se deberá mostrar por pantalla la siguiente salida

	SALIDA
	````
	Número de temas: 10
	Tema 1: Introducción
	Tema 2: Estructuras de datos
	Tema 3: Estructuras
	Tema 4: Colecciones
	Tema 5: Orientación a objetos
	Tema 6: Clases y Objetos
	Tema 7; Abstracción, Herencia y Polimorfismo
	Tema 8: Ficheros y Excepciones
	Tema 9: Bases de datos
	Tema 10: Interfaces
	````

3.  (MultiplicarArray) Crear un array de 5 posiciones:
	- se le pedirá al usuario que introduzca cada unos de los elementos del array
	- Multiplica cada elemento del array * 2 y vuelve a guardar su valor
	- Saca por consola la suma de todos los números
	-  Saca la media de todos los elementos

4. (MayorArray) Crea una aplicación que realice lo siguiente:
	- pida por pantalla la longitud del array de enteros
	- crea el array de enteros con la longitud introducida
	- pida al usuario que introduzca todos los datos del array
	- saque por pantalla el elemento mayor y el elemento menor

5. (SumaArrays) Crear una aplicación que:
	- pida la longitud de dos arrays de enteros
	- crea los array de enteros con las longitudes introducidas
	- crea un tercer array de la misma longitud que los dos anteriores
	- rellena el tercer array con la suma de las posiciones (Array1.posicion1 + array2.posicion = array3.posicion)

6. (PosicionesArray) Crea una aplicación que:
	- pida por teclado la longitud de un array
	- cree el array de enteros de la longitud introducida
	- pida al usuario que introduzca todos los datos del array
	- mueva una posición todos los elementos. el elemento de la posición 0 pasa a la posición 1 y así sucesivamente. El elemento que está en la última posición pasa a la primera
	- realizar la tarea anterior pero al contrario. El elemento que está en la primera posición pasa a la última y así sucesivamente

7. (OperacionesArray) Crear un array con 10 posiciones y asígnale números enteros entre 0 y 9, ambos inclusive (de forma automática). Se mostrarán los datos separados por una coma y un espacio. Una vez hecho esto se modificará el array del de la manera indicada en cada apartado, y se mostrará de nuevo.
	- Incrementar en 1 los valores pares y en -1 los impares.
	- Duplicar los valores positivos menores que 5	
	- Sumar a cada valor un valor entero aleatorio entre -5 y 5.
	- Mover los datos una posición hacia la derecha (el primero pasa al segundo, el
segundo al tercero, ..., y el último al primero).
	- Intercambiar el primero con el segundo, el tercero con el cuarto, ..., el penúltimo con el último.
	- Invertir el array
	- Mostrar la posición del primer par y del último impar.
	

**hay que hacer todo de golpe, pero opcionalmente se puede hacer un menú que indique cada una de las opciones**

8. (FraseArray) Crear un programa que lea por teclado una frase. Con la frase leída crear un array de String con cada una de las palabras que forman parte de la frase. Una vez introducida el programa mostrará:
	- La palabra más larga
	- La palabra más corta
	- La palabra o palabras que tienen exactamente 4 caracteres
9. (GeneradorPalabras) Crea un programa que cumpla los siguientes requisitos:
	- Crear un de chars con todas las letras del abecedario.
	- Crear un array de String con una longitud pedida por teclado 
	- Pedir la longitud de cada una de las palabras que formarán parte del array del apartado 2. Tras pedir la longitud se creará una palabra de forma aleatoria con la longitud deseada (cada letra será una posición del array del apartado 1) y se guardará en el array del apartado 2
	- Imprimir por pantalla las palabras generadas

````
ENTRADA/SALIDA
Cuantas palabras quieres guardar: 3
Cual es la longitud de la palabra 1: 4
Cual es la longitud de la palabra 2: 6
Cual es la longitud de la palabra 1: 3
Las palabras generadas son:
1. hero
2. hasdgh
3. rio
````

10. (Loteria) Desarrollar un programa que permita concursar a la lotería. Para ello se pedirán 7 números por teclado entre el 0 y el 10 y se guardarán en un array de int. El programa generará automáticamente otros 7 números que guardará en un array de int. El programa generará deberá indicar si se ha ganado la lotería (si se han acertado todos los números)
11. (AhorcadoArray) Crear un array de String donde se guarden 20 palabras. El sistema deberá de seleccionar una de las palabras pertenecientes al array. Una vez seleccionada se jugará al juego del ahorcado donde la palabra a acertar será la seleccionada. Para ello las normas son las siguientes:
	- Nada mas arrancar se mostrarán por consola tantos _ como letras tenga la palabra a acertar
	- Se pedirá por pantalla la letra con la que se quiere probar
	- En el caso de acertar se mostrará la letra en la posición correspondiente
	- En el caso de falla se restará una vida
	- El programa continuará hasta que:
	- Acierte la palabra
	- Me quede sin vidas
	
11. (ChampionArray) Desarrolla un programa que simule los cruzes del sorteo de la champion. Para ello debes saber que eisten dos bombos:
	- bombo1:  Barcelona, PSG, Bayern, Manchester City, Juventus, RB Leizpzig, Valencia, Liverpool
	- bombo2:  Real Madrid, Tottenham, Nápoles, B. Dortmund, O. Lyon, Chelsea, Atalanta, Atético de Madrid
El programa debe empajerar un equipo del bombo1 con un equipo del bombo2 sin repetir posibilidades y mostrarlo por pantalla con el siguiente formato:
````
*** Partido Barcelona - Atalata ***
*** Partido Real Madrid Juventus ***
*** Partido Atlético de Madrid - RB Leizpzig ***
````

12. (InvisibleArray) Desarrolla un programa que simule el sorteo de un amigo invisible. Para ello el programadebe:
	- pedir el número de participantes (de ser impar saltará un fallo)
	- pedir el nombre de cada uno de los participantes
	- sacar por pantalla el orden de las parejas resultantes
	
13. (MenuArray)Crear un programa que mediante un menú permita:
	- Crear un array de números enteros con n posiciones pedidas.
	- Rellenar el array creado con números aleatorios.
	- Rellenar el array creado con números pedidos por consola.
	- Ordenar el array de mayor a menor
	- Clonar el array con una una mayor longitud. Para ello pedir al usuario la nueva longitud (si esta es inferior a la que la existe continuar pidiendo)
	- Mover todas las posiciones (pedir al usuario que seleccione la orientación)
	- Mostrar por pantalla el array según está

## Ejercicios Arrays multidimensionales

14. (MultidimensionalAutomático) Crear un programa que:
	- pida por consola el número de filas y el número de coumnas (de ser inferior a 1 continuará pidiendo)
	- Rellene de forma automática todas las celdas con números aleaotrios entre 0 y 100
	- Muestre por pantalla el array relleno con * entre cada fila

15. (MultidimensionalAlumno) Crear un programa guarde en un array multidimensional un número determinado de alumnos. Cada alumno tendrá un nombre y tres notas. El programa deberá sacar un menú con la siguiente estructura:
- Definir el número de alumnos a registrar: si ya hay definido un número de alumnos saltará un error o si el numero es menor que uno
- Registrar alumnos: si no hay número de alumnos definido o si ya hay alumnos registrados saldrá un mensaje de error (deberá ser diferente)
- Ver datos de alumnos con nota media: se mostrará en cada línea la información del alumno con el siguiente formato. Si no hay alumnos registrados saltará un mensaje de error
- Ver datos de un alumno concreto: pedirá un nombre, lo buscará y mostrará sus datos. Si no hay alumnos registrados o no existe mostrará un mensaje que muestre el aviso (deberá ser diferente)
- Ver medias de la asignatura 1: Se mostrará la media de la asignatura 1. Si no hay alumnos se mostrará un aviso
- Ver medias de la asignatura 2: Se mostrará la media de la asignatura 2. Si no hay alumnos se mostrará un aviso
- Ver medias de la asignatura 3: Se mostrará la media de la asignatura 3. Si no hay alumnos se mostrará un aviso
- Salir 

````
El formato de salida será el siguiente
****Alumno suNombre****
Nota1: 6
Note2: 5
Nota3: 7
Nota media: 6
````

## Ejercicios ArrayList / HashTable

16. (Garaje) Desarrollar una aplicación para el control de un garaje. El funcionamiento de la aplicación será desde consola mediante un menú que permita acceder a las diferentes opciones. Para la aplicación tendremos que tener en cuenta las siguientes cosas:
- Un coche está formado por los siguientes atributos: marca (string) modelo (string), coste (int), matricula (string).
Las opciones de la aplicación serán las siguientes:
- Añadirá un coche al taller, pidiéndome todos los datos necesarios 
- Listar coches
- Buscar coches: Se pedirá una matrícula y se mostrarán los datos del coche.
- Mostrar costes: Se mostrará el coste acumulado de todos los coches de la lista.
- Eliminar coche: Se pedirá una matrícula y se eliminará el coche de la lista
- Vaciar garaje: Eliminará todos los coches de la lista
 
17. (Agenda) Realizar una aplicación que gestione usuarios mediante arrays,  donde los cuales constan de nombre (string), apellido (string), teléfono (int) y dni (string): La funcionalidad de la aplicación se guiará por un menú
con las siguientes opciones:
- Agregar persona: Pedirá los daos de nombre, apellido, teléfono y dni. Una vez pedidos agregará la persona en la lista.
- Buscar persona: Pedirá un dni y sacará por pantalla todos los datos de la persona
asociada con el formato Nombre: XXX, Apellido: XXX, Teléfono: XXX
- Borrar persona: Pedirá un dni y la eliminará de la lista
- Listar personas: Listará todo los elementos existentes en la lista con el formato Nombre: XXX, Apellido: XXX, Teléfono: XXX
- En todos los casos se deberá de dar confirmación al usuario tanto del éxito de la operación como de la ejecución incorrecta de la opción