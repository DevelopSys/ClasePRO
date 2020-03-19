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

