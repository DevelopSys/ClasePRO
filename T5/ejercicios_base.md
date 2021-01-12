1. Crea una clase llamada persona con los siguientes elementos
	- Propiedades: nombre (string) apellido (string) dni (string) edad (int) peso (double) altura (int)
	- Métodos: 
		- mostrarDatos: sacará por pantalla los datos de la persona formateados
		- Métodos getters y setters asociados
		- Constructores:
			- un constructor que permita crear una persona con todos los datos
			- un constructor que permita crear una persona sin peso ni altura
			- un constructor que permita crear una persona con nombre y apellidos, el resto de datos los pondrá a 0, excepto el dni que lo pondrá a 111111111X
			- un constructor que permita crear una persona sin datos de entrada. Los inicializará todos a "datos por defecto", 1111111111X y 0 respectivamente
12. Crear una clase llamada entrada que tenga un método main el cual:
	- Mediante un scanner pida nombre, apellido, dni edad peso y altura de una persona
	- Cree la persona asociada a los datos leídos por teclado (p1)
	- Cree una persona con un nombre y un apellido que se introduzca a mano (sin scanner)
	- Crear una persona sin datos asociados
	- Mostrar los datos de todas las personas
	- Modificar la edad de todas las personas a 20
19. En la clase creada en el ejercicio 1 crear los siguientes métodos con la funcionalidad que se indica:
	- Un método que recibe por parámetros un número e incrementa la edad de la persona en el parámetro pasado por argumentos
	- Un método que calcule y devuelva el IMC. Para calcular el imc se aplica la siguiente formula IMC = peso / (altura * altura)
22. En la clase entrada creada en el ejercicio 2 crear los siguiente
	- La persona que tiene todos los datos (p1) muestra por pantalla su IMC
	- Según el IMC mostrado por pantalla, también se tendrá que mostrar por consola el estado físico de la persona. Para ello hay que tener en cuenta lo siguiente
````
- Peso inferior al normal		Menos de 18.5
- Normal		18.5 – 24.9
- Peso superior al normal		25.0 – 29.9
- Obesidad		Más de 30.0
````

	
