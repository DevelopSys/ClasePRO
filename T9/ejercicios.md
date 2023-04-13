1. (CreacionBD) Crea una base de datos con la siguiente estructura:
	
	-. Tabla usuario:
		
		1. Id numérico (PK)
		2. Nombre texto 
		3. Apellido texto
		4. Telfefono numérico
		5. Sueldo numérico
		6. Pais texto
		7. Perfil numérico 
	
	-. Tabla Perfiles
		
		1. Id numérico (PK)
		2. Nombre texto

Realiza una conexión con un programa donde la conexión esté separada en una clase adicional llamada GestionBD

2. Crea un método en la clase GestionBD donde se realicen las siguiente operaciones

	- Inserta 3 perfiles de forma manual (mediante un statemet) en la tabla perfiles con los siguientes nombres: trabajador, director, gerente

	- Inserta 4 usuarios de forma manual  (mediante un prepare statement). Cada usuario tendrá solo nombre, apellido, teléfono y país. Los usuarios serán:
	
		1. Heide-Marie, Rausch, 2145024, Holanda
		2. Liam, Montgomery, 016977, España
		3. Ioanna, Van der Gaag, 978229, Belgica
		4. Eloane, Bourgeois, 0595439, Francia
		5. Mina, Rieger, 8154354, Alemania
		6. Celesta, Langenhuizen, 2399626, España
		7. Leah, Lee, 312333, Alemania
		8. Armand, Lucas, 423445, Holanda
		9. Leah, Jim, 312333, Francia


 	
5. Crea un método en la clase GestiónBD donde se realicen las siguientes operaciones

	-. (Mediante un statement)Actualiza aquellos sueldos de los usuarios que son de España y pongo a 10000
	
	-. (Mediante un statement)Actualiza aquellos sueldos de los usuarios que son de Alemania y su nombre es  Leah y pongo a 5000
	-. (Mediante un prepare statement)Actualiza los sueldos de todos aquellos usuariosque no cumplen los requisitos anteriores y pongo a 500
	
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
	
7. Modifica la estructura de la base de datos para que la tabla usuarios y la tabla perfiles tenga una relación uno a uno

8. Modifica la estructura de la tabla usuarios añadiéndole las siguientes columnas:
		
		- correo: varchar de 50
		- password: varchar de 50
		
9. Realiza operaciones de actualización sobre todos los usuarios de la tabla usuarios donde se pida lo siguiente:

````
Introduce el id del usuario a actualizar
Id: 1 // metido por teclado
// en el caso de no encontrar el id saltará un mensaje de error
Usuario Borja recuperado
Introduce su correo electrónico
Correo: Borja.martin@cesjuanpablosegundo.es // introducido por teclado
Introduce su password
Correo: Ejemplo1@ // introducido por teclado
````

Realiza esta operación con todos los usuarios

10. Crea una tabla llamada productos con la siguiente estructura:

- id (pk)
- nombre
- descripción
- precio
- categoria

Dicha tabla será rellenada desde el siguiente enlace de forma automática nada más comenzar el programa. En el caso de que la tabla ya esté rellena no será necesario hacer inserciones.

```html
https://dummyjson.com/products
```


11.  Realiza la simulación de un login. Para ello nada más inicial el programa se pedirá usuario (utilizar el correo) y contraseña:

	-  Si el login ha sido correcto mostrar el mensaje de iniciado sesionando con éxito. 
	-  Si el login es incorrecto mostrar el mensaje de volver a intentarlo, pidiendo de nuevo usuario y contraseña

12. Una vez el usuario esté logeado aparecerá el siguiente menú:

- Ver productos
- Ver productos por categoria
- Comprar productos
- Ver información perfil
- Cambiar información perfil
- Cambiar contraseña

Cada una de las opciones hará lo siguiente:

- Ver productos: Mostrará una lista con el id y nombre de cada uno de los productos de la tabla
- Ver productos por categoria: Pedirá una categoría y mostrará los productos de dicha categoria
- Comprar productos: Pedirá el id del producto que se quiere comprar y mostrará el precio de producto
- Ver información perfil: mostrará la información personal del usuario
- Cambiar informacion peril: pedira cual es el dato que se quiere cambiar y procederá al cambio
- Cambiar contraseña: pedirá la confirmación de la contraseña antigua y la nueva. En caso de ser correcto, realizará el cambio

** Se puede hacer una tabla adicional llamada compras donde se asocien las compras que van haciendo los usuarios. En este caso se incorporará una opción en el menu de Ver compras (el cual mostrará los productos comprados por el usuario)**

