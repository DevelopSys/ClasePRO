1. Realiza una aplicación que conste de una ventana en la cual aparezca un formulario para introducir usuarios, los cuales tienen como propiedades nombre, apellido y teléfono. En cada uno de los campos solo se podrán meter los siguientes elementos:

	-. Nombre: textos con una longitud máxima de 10 letras
	
	-. Apellidos: textos con una longitud máxima de 30 letras y mínimo de 2 palabras

	-. Teléfono: solo números con una longitud máxima de 9

El formulario constará de un botón agregar, el cual introducirá en un arraylist el usuario introducido y un botón ver que mostrará por consola todos los usuarios introducidos

2. Realizar una aplicación que muestre el aspecto gráfico y funcional de una calculadora, teniendo en cuenta que solo se pueden hacer las operaciones matemáticas básicas. 

3. Realiza una aplicación que simule el login de una aplicación. Para ello la aplicación tendrá una conexión a base de datos con la siguiente estructura:

	-. Tabla usuarios: 

		-. ID
		-. Nombre
		-. Apellido
		-. Correo
		-. Contraseña

La aplicación de entrada mostrará un formulario donde se podrá meter un usuario y una contraseña y realizar un click en un botón. En caso de meter un usuario correcto mostrará un mensaje por consola diciendo "login realizado con éxito". En caso contrario mostrará el mensaje "usuario o contraseña incorrecto"
4. Modifica el ejercicio anterior con las siguientes funcionalidades:

	-. La base de datos se le añadirá:

		-. una tabla perfiles
			6. ID
			7. tipo
			8. Agregar dos perfiles: administrador y usuario
		-. Una tabla asignaturas
			8. ID
			9. nombre
			10. siglas
			11. ciclo
			12. Descripción
			13. Agrega algunas asignaturas del ciclo de DAM
		-. Una columna en la tabla usuarios que relacione esta con la tabla perfiles

	-.  Al realiza el login, si este es correcto que arranque una nueva ventana dependiendo del tipo de perfil del usuario

		-.  En el caso de se un perfil administrador:
			-.  Que muestre una ventana con un formulario de inserción de usuarios con perfil normal
		-.  En el caso de ser un perfil usuario
			-.  Que muestre una ventana con una lista donde se muestran todas las asignaturas que están guardadas en la base de datos. La forma de mostrarla será "Nombre - Siglas", p.e Programación - PRO
			14.  Si se pulsa alguna de las asignaturas se mostrará por consola la descripción de la asignatura seleccionada