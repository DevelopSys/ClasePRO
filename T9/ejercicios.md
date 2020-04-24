1. (CreacionBD) Crea una base de datos con la siguiente estructura:
	2. Tabla usuario:
		3. Id numérico (PK)
		4. Nombre texto 
		5. Apellido texto
		6. Telfefono numérico
		7. Sueldo numérico
		8. Pais texto
		7. Perfil numérico 
	8. Tabla Perfiles
		9. Id numérico (PK)
		10. Nombre texto

Realiza una conexión con un programa donde la conexión esté separada en una clase adicional llamada GestionBD

2. Crea un método en la clase GestionBD donde se realicen las siguiente operaciones
	- Inserta 3 perfiles de forma manual (mediante un statemet) en la tabla perfiles con los siguientes nombres: trabajador, director, gerente

	- Inserta 4 usuarios de forma manual  (mediante un prepare statement). Cada usuario tendrá solo nombre, apellido, teléfono y país. Los usuarios serán
		-. Heide-Marie, Rausch, 2145024, Holanda
		-. Liam, Montgomery, 016977, España
		-. Ioanna, Van der Gaag, 978229, Belgica
		-. Eloane, Bourgeois, 0595439, Francia
		-. Mina, Rieger, 8154354, Alemania
		-. Celesta, Langenhuizen, 2399626, España
		-. Leah, Lee, 312333, Alemania
		-. Armand, Lucas, 423445, Holanda
		-. Leah, Jim, 312333, Francia


 	
5. Crea un método en la clase GestiónBD donde se realicen las siguientes operaciones
	6. (Mediante un statement)Actualiza aquellos sueldos de los usuarios que son de España y pongo a 10000
	7. (Mediante un statement)Actualiza aquellos sueldos de los usuarios que son de Alemania y su nombre es  Leah y pongo a 5000
	8. (Mediante un prepare statement)Actualiza los sueldos de todos aquellos usuariosque no cumplen los requisitos anteriores y pongo a 500
9. Crea un método en la clase GestiónBD donde se realicen las siguientes operaciones
	1. Muestra todos los usuarios que son de España
	2. Muestra todos los usuarios ordenados por sueldo
	3. Muestra todos los usuarios por pais
4. Crea un método en la clase GestiónBD donde se realicen las siguientes operaciones
	1. Crea un ArrayList de tipo usuario (clase que debes crear)
	2. Guarda todos los usuarios de la base de datos en el ArrayList creado
5. Crea un método en la clase GestiónBD donde se realicen las siguientes operaciones
	6. Elimina todos los usuarios de la base de datos
	7. Exporta a un fichero .obj el ArrayList que ha guardado todos los los usuarios

6. Modifica todo el programa de los ejercicios anteriores para que realice los siguientes pasos
	7. Al abrir, si la base de datos no tiene registros, se lea el fichero generado en el ejercicio anterior y guarde en la base de datos todos los usuarios que están en el arraylist

