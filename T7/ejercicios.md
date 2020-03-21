1. (idiomas) Crear una clase Idioma con los siguientes atributos:

- string nombre
- int numeroHablantes
- ArrayList<String> palabras

Que tenga un constructor que pida el nombre y el número de hablantes

Y que tenga los siguientes métodos

- saludar(): abstracto
- despedir(): abstracto
- ingresarPalabra(string palabra): agregará una palabra al diccionario
- listarPalabras(): mostrará todas las palabras del diccionario, poniendo antes el mensaje "Las palabras en XXX son"
- getter y setter correspondientes

Crear una clase Entrada con un main con la siguiente funcionalidad


- Crea un objeto de tipo Idioma que sea castellano
- Crea un objeto de tipo Idioma que sea ingles
- Crea un objeto de tipo Idioma que sea aleman
- Crea un ArrayList de idiomas donde se metan los tres definidos anteriormente


- Añade unas cuantas palabras a la lista del idioma castellano
- Añade unas cuantas palabras a la lista del idioma inglés
- Añade unas cuantas palabras a la lista del idioma alemán

- Saca por pantalla el saludo en los tres idiomas con el siguiente formato. El saludo en XXX es: XXX
- Saca por pantalla la despedida en los tres idiomas con el siguiente formato. La despedida en XXX es: XXX

- Lista por pantalla las palabras de todos los idiomas


2. (dialectos) Al ejercicio anterior añádele la siguiente funcionalidad.

Crea una interfaz con el nombre Cuantificable la cual tenga el siguiente método

- void cuantificarHablantes(int n)

Crea una clase Dialecto que extienda de Lenguaje con la siguiente funcionalidad

- un atributo de tipo Idioma y un atributo de tipo un que sea numeroHablantes
- Un con constructor que pida por parámetros ambos datos
- getter y setter asociados
- implemente la interfaz Cuantificable, donde su método tendrá la siguiente funcionalidad:
	- el número de hablantes será el porcentaje que se indique en el parámetro del método del Idioma que tenga asociado

En la clase Entrada:

- Crear un dialecto del castellano llamado catalan
- Ejecuta el método cuantificarHablantes pasando por parámetro 2
- Mostrar por pantalla el número de hablantes del dialecto catalan

3. (partido)

Crea una clase Partido con las siguientes características:
- equipoLocal y equipo visitante de tipo Equipo (clase anidada interna)
- jugado booleano.
- numeroGoles int

Y los siguientes métodos
- setter y getter
- agregarGolesLocal(): sumará un número aleatorio de goles entre 0 - 2 al equipo local
- agregarGolgesVisitante(): sumará un número aleatorio de goles entre 0 - 2 al equipo visitante
- mostrarResultado(): mostrará por pantalla un mensaje con el resultado actual del partido NombreVisitante: X - NombreLocal: X

Crea una clase anidad Equipo con las siguientes características:
- int golesEncuentro
- int puntos
- String nombre

Y los siguientes métodos
- constructor que pida por parámetros la clasificación y el nombre
- setter y getter

Una clase entrada que tenga los siguiente

- Creación de un partido
- Creación de dos equipos y asignados al partido
	- Barcelona, posición1, equipo local
	- Real Madrid, posición1, equipo visitante
- Simular el comportamiento de un parido:
	- En cada parte se podrán hacer 3 ataques por parte de cada equipo
	- Un partido consta de dos partes
	- En cada parte se deberá mostrar el resultado.
	- El equipo que se le sumarán tres puntos. Si hay empate se sumará un punto a cada uno
- Imprime la clasificación con el siguiente formato: 1º Barcelona 3 puntos, 2º Real Madrid 0 puntos
- Repite unas cuantas veces el mismo partido y comprueba si la clasificación ha cambiado 

4. (Torneo)

Con la base del ejercicio anterior realiza lo siguiente:

Una clase Torneo que tenga los siguientes atributos:

- ArrayLists de objetos de tipo partido (clase anidada)
- String nombre

Y los siguientes métodos
- constructor que pida por parámetros un nombre y que inicialice el ArrayList de partidos
- getter y setter
- realizarSorteo(ArrayListEquipos): se configurarán todos los partidos entre los equipos del ArrayList
- jugarPartido(Partido): se jugará el partido con la misma mecánica que en el ejercicio anterior

Crea una clase anidada Partido con las siguientes características:
- equipoLocal y equipo visitante de tipo Equipo (clase anidada interna)
- jugado booleano.
- numeroGoles int

Y los siguientes métodos
- setter y getter
- agregarGolesLocal(): sumará un número aleatorio de goles entre 0 - 2 al equipo local
- agregarGolgesVisitante(): sumará un número aleatorio de goles entre 0 - 2 al equipo visitante
- mostrarResultado(): mostrará por pantalla un mensaje con el resultado actual del partido NombreVisitante: X - NombreLocal: X

Crea una clase anidada estática Equipo con las siguientes características:
- int golesEncuentro
- int puntos
- String nombre

Y los siguientes métodos
- constructor que pida por parámetros la clasificación y el nombre
- setter y getter

Crear una clase entrada con las siguientes características

- Crea un torneo con un nombre
- Crea un arraylist de equipos
- Crea tantos partidos como equipos haya y asignarlos al torneo. Es decir si hay 4 equipos deberán generar 6 partidos y asignarlos al torneo
- Simula el disputa de todos los partidos
- Imprime por pantalla los resultados de todos los partidos
- Imprime por pantalla la clasificación definitiva

Si consideras necesario la creación de más métodos en alguna de las clases se puede hacer

