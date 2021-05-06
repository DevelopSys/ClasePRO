1. (DatosBásicos) Realiza un programa que pida por pantalla los datos de un usuario y lo añada a una lista (ArrayList) Los datos que se pedirán son: nombre, apellido, dni, teléfono y edad. Al terminar de pedir todos los datos de un usuario la aplicación deberá preguntar si se quieren seguir introduciendo datos:
	2. En caso de contestar si, se volverán a pedir los mismos datos, crear el usuario y meterlo en la lista
	3. En caso de contestar no se deberá volcar a un fichero llamado usuarios.txt todos los datos de usuarios del ArrayList con el siguiente formato

Usuario 1
- Nombre:XXX
- Apellido:XXX
- Teléfono:XXX
- DNI:XXX
- Edad:XXX

Usuario 2
- Nombre:XXX
- Apellido:XXX
- Teléfono:XXX
- DNI:XXX
- Edad:XXX

Tener en cuenta que el programa no se pude detener ante cualquier error capturable, como por ejemplo que se introduzca una edad como String

2. (LecturaBásica) Sea un fichero llamado texto.txt localizado en un paquete llamado documentos con el siguiente contenido

*Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.**

Crea una aplicación que lea el contenido del fichero y lo muestre por consola.

3 (PalabrasOraciones) Modifica el ejercicio anterior para que:
- Una vez muestra el contenido del fichero por consola aparezcan los siguientes mensajes:
	- El número de letras es de: X
	- El número de oraciones es de: X
	- El número de oraciones es de: X

4. (TextoASCII) Modifica el ejercicio 3 para que una vez leído el contenido del fichero aparezca por consola el texto pero traducido a códigos ascii

5. (ASCIIFichero) Modifica el ejercicio anterior para que al mismo tiempo que se lee el contenido del fichero del ejercicio3 se cree un nuevo documento donde se guarden los códigos ASCII de cada una de las lecturas 

6. (ASCIITexto) Sea un fichero llamado código.txt localizado en un paquete llamado documentos con el siguiente contenido:

*69 115 116 111 32 101 115 32 117 110 32 101 106 101 109 112 108 111 32 100 101 32 101 115 99 114 105 116 117 114 97 32 100 101 32 102 105 99 104 101 114 111 32 109 101 100 105 97 110 116 101 32 99 243 100 105 103 111 115 32 97 115 99 105 105 46 32 10 80 97 114 97 32 112 111 100 101 114 32 114 101 99 117 112 101 114 97 114 32 101 108 32 99 111 110 116 101 110 105 100 111 32 100 101 108 32 102 105 99 104 101 114 111 32 115 105 109 112 108 101 109 101 110 116 101 32 104 97 121 32 113 117 101 32 108 101 101 114 32 101 108 32 99 243 100 105 103 111 32 121 32 116 114 97 100 117 99 105 114 108 111 32 97 32 115 117 32 99 97 114 97 99 116 101 114 32 97 115 111 99 105 97 100 111 46 32 10 72 97 121 32 113 117 101 32 110 111 32 116 111 100 111 115 32 108 111 115 32 99 97 114 225 99 116 101 114 101 115 32 100 101 32 101 115 116 101 32 102 105 99 104 101 114 111 32 115 111 110 32 110 250 109 101 114 111 115*

7. (JuegoAdivinar) Crea una aplicación de adivinación. Para ello nada más empezar se pedirá el nombre del jugados y se generará un número aleatorio entre 0 y 20. El sistema irá pidiendo números por teclado hasta que se acierte el número. Cuando se adivine se deben producir las siguientes acciones: 
	- Se escribe en un fichero llamado juego.txt el nombre del  usuario y el número de intentos realizados con el siguiente formato: nombre, intentos (Borja,6)
	- Se preguntará si se quieren seguir introduciendo datos:
		- En caso de contestar si se volverán a pedir los mismos datos, crear el usuario y meterlo en la lista
		- En caso de contestar no se deberá pedir el nombre del siguiente concursante
8. (JuegoAdivinarRecord) Modificar el ejercicio anterior para que al arrancar el programa aparezca un mensaje que ponga: "El record lo tiene Borja con 6 intentos" (para poder realizar esto se lee el fichero y se obtiene el usuario que menos intentos tenga registrados)

9. (ListadoRecursivo) Crear un programa que liste de forma recursiva todas las carpetas, subcarpetas y ficheros de una rura concreta. Por ejemplo sea la siguiente estructura de directorios / ficheros:
	- DirectorioA
		- Fichero1
		- Subdirectorio1
			- Fichero11
		- Subdirectorio2
			- Fichero22
			- Subdirectorio21
				- Fichero 211
				- Fichero 212
			- Subdirectorio22
				- Fichero 221
		- Subdirectorio3
			- Fichero31
			
Se deberá mostrar el siguiente mensaje

Carpeta DirectorioA con contenido
Fichero1
Carpeta Subdirectorio1 con contenido
Fichero11
Carpeta Subdirectorio2 con contenido
Fichero2
Carpeta Subdirectorio21 con contenido
Fichero211
Fichero212
Carpeta Subdirectorio22 con contenido
Fichero221
Carpeta Subdirectorio3 con contenido
Fichero31

9. (Finder) Crear un programa que liste de las carpetas y ficheros de una rura segun selección del usuario. Por ejemplo sea la siguiente estructura de directorios / ficheros:

- DirectorioA
	- Fichero1
	- Subdirectorio1
		- Fichero11
	- Subdirectorio2
		- Fichero22
		- Subdirectorio21
			- Fichero 211
			- Fichero 212
		- Subdirectorio22
			- Fichero 221
		- Subdirectorio3
			- Fichero31
			
Inicialmente se mostrará el mensaje:

Carpeta DirectorioA con contenido
1 - Fichero1
2 - Carpeta Subdirectorio1 
3 - Carpeta Subdirectorio2
4 - Carpeta Subdirectorio3

Que quieres ver: (pedido por teclado)

Se selaccionará un fichero o subcarpeta. En el caso de seleccionar un fichero se mostrará su conenido por consola. En el caso de seleccionar una carpeta se mostrará su contenido

Que quieres ver: 2

Carpeta subdirectorio2 con contenido:
1 - Fichero22
2 - Subdirectorio21
3 - Subdirectorio22
Que quieres ver: (pedido por teclado)

**Opcional: incluir una opción en todos los menús que sea Volver Atrás, la cual mostrará todo el contenido del directorio padre**


10. (lecturajson) Crea un archivo .txt que tenga la siguiente estructura

````
{nombre:"Borja", apellido:"Martin", edad:18, profesion: "profesor", aficciones: ["deporte","cine","musica","tecnología"]}
````
Lee el fichero txt y convierte su contenido en un objeto de tipo json con la librería correspondiente. 
    - Muestra por consola solo el nombre y apellido. Muestra 
    - Muestra por consolo cada una de las profesiones en lineas diferentes

10. (lecturaObjetosJson) Crea un archivo .txt que tenga la siguiente estructura

````
{alumnos:[{nombre:"Sergio", apellido: "Gomez", edad:20}, {nombre:"Daniel", apellido: "Jimenez", edad:24},{nombre: "Jorge", apellido: "Sánchez", edad: 21},{nombre:"Cristina", apellido:"García", edad:25}], curso:"Desarrollo de Aplicacciones Multiplataforma",siglas:"DAM", nivel:1}
````

    - Lee el fichero y conviertelo en un objeto de tipo Json con la librería correspondiente
    - Muestra por pantalla todos los datos de los alumnos uno a uno
    - Muestra por pantalla solo los alumnos que tengan al menos 20 años

10. (lecturaCompletaJSON) Coge el contenido del siguiente link y pégalo en un txt. 

	https://www.thesportsdb.com/api/v1/json/1/eventsseason.php?id=4335&s=2020-2021

    - Lee el fichero y conviertelo en un objeto de tipo Json con la librería correspondiente
    - Muestra todos los partidos del fichero con el siguiente formato:  Equipo1 X - Equipo2 X
    - Crea método que pida por parámetros el nombre de un equipo y que muestre solo los partidos de dicho equipo. También sacará un resumen de cuantos goles a favor y en contra a obtenido
    - Muestra por consola todos los partidos del json con el siguiente formato
````
Partido 1 Equipo1 vs Equipo2
	Resultado: Equipo1 X Equipo2 X
	Alineación Local : 
		Jugador1 
		Jugador2 Jugador3 Jugador4 Jugador5  
		Jugador6 Jugador7 Jugador8
		Jugador9 Jugador10 Jugador11
	Cambios: Jugador1 Jugador2 Jugador3

	Alineación visitante : 
		Jugador1 
		Jugador2 Jugador3 Jugador4 Jugador5  
		Jugador6 Jugador7 Jugador8
		Jugador9 Jugador10 Jugador11
	Cambios: Jugador1 Jugador2 Jugador3

````
10. (ListaObjetos) Crea un programa de gestión de usuarios que tendrán nombre, apellido y teléfono. Para ellos mediante un menú se podrá:

	a. Agregar usuarios --> se pedirán por teclado
	b. Listar usuario --> mostrará los datos por consola de todos los usuarios que se han registrado
	c. Salir --> saldrá del sistema
	
**Cuando se pulse la opción de salir se preguntará al usuario si quiere exportar la lista de usuarios registrados. En caso de decir SI se generará un archivo .obj **

12. (ObjetoLista) Modifica el ejercicio anterior para que nada más arrancar el programa se escriban todos los objetos que están en un fichero .obj en la lista

13. (ExcelLista) Sea el archivo de excel que se adjunta en classroom, exportar un todos los elementos que están en el Excel a una lista. Esta lista constará de usuarios que tienen las siguientes características: tratamiento (string), nombre (string), apellidos (string), país (string), email (string), movil (int)

14. (ListaExcel) Crea un programa de gestión de usuarios que tendrán nombre, apellido y teléfono. Para ellos mediante un menú se podrá:

	12. Agregar usuarios --> se pedirán por teclado
	13. Listar usuario --> mostrará los datos por consola de todos los usuarios que se han registrado
	14. Salir --> saldrá del sistema
	
**Cuando se pulse la opción de salir se preguntará al usuario si quiere exportar la lista de usuarios registrados. En caso de decir SI se generará un xl **

(superliga) Crear la aplicación que gestione la superliga de Florentino. Para ello es necesario que tengas las siguientes clases

-	Equipo
	- presupuesto
	- nombre
	- nacionalidad
	- golesFavor
	- golesContra
-	Superliga
	- Arraylist fundadores
	- Arraylist invitados
	- Arraylist partidos
	- int bote: se sumarán 300000 por cada participante
	- Persona presidente
	La superliga podrá
	- Realizar sorteo
	- Jugar torneo completo: la mecánica será la misma de los ejercicios de los realizados a lo largo del curso
	- Repartir premios: Una vez jugados todos los partidos, se repartirán los premios mediante la siguiente lógica:
	- El ganador se llevará el 50% del bote
	    - El subcampeón se llevará el 20% del bote
	    - El resto de participantes se repartirán el resto del bote a partes iguales
	- Clase anidad Partido
	    - equipoLocal
	    - equipoVisitante
	    - golesLocal
	    - golesVisitante
-	Persona
	- nombre
	- nivelCorrupción
	- sueldo
-	Uefa
	- Persona presidente
	- Tendrá la posibilidad de cancelar la superliga. Para poder cancelar la superliga el nivel de corrupción del presidente de la uefa debe ser mayor que el de la superliga. En el caso de ser igual se incrementará un 20% el sueldo al presundente de la uefa y un 40% el sueldo del presidente de la superliga.

La funcionalidad de la aplicación se realizará mediante un menú con las siguientes opciones.

1.	Crear superliga: creará la superliga con los 12 equipos fundadores
2.	Invitar equipos: pedirá un número de equipo a los que se quiere invitar y los sacará del DataSet
3.	Realizar sorteo
4.	Jugar partidos: cada vez que se juegue un partido se escribirá en un fichero llamado partidos.txt
5.	Exportar clasificación
6.	Importar clasificación
7.	Boicotear superliga
8.	Salir

