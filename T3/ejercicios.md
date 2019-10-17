
## if - else

1. (MayorQue) Hágase un programa que lea dos enteros y compruebe si el primero es o no mayor que el segundo. En la salida se mostrará “El primero es mayor que el segundo” o “El primero no es mayor que el segundo”.  
2. (SumaTres) Hágase un programa que lea tres enteros positivos, y compruebe si alguno es suma de los otros dos. En la salida se mostrará “Ninguno es suma de los otros dos” o “8 = 2 + 6” (en este último caso se introdujeron los números 2, 8 y 6). SumaTres.java
3. (Condiciones) Léase un número entero. Se comprobará si dicho número es o no múltiplo de 20, y también se comprobará si está o no entre -100 y 100. En la salida se mostrará uno de los siguientes menasajes: 
	1. “Es múltiplo de 20 y está entre -100 y 100”.
	2. “Es múltiplo de 20 y no está entre -100 y 100”.
	3. “No es múltiplo de 20 y está entre -100 y 100”-
	4. “No es múltiplo de 20 y no está entre -100 y 100”. 
4. (Bisiesto) Hágase un programa que compruebe si un año pedido por teclado es bisiesto. En la salida se mostrará o “Es bisiesto” o “No es bisiesto”,)
El algoritmo para obtener si un año es bisiesto es el siguiente: Inicialmente se almacena en una variable de salida que no es bisiesto; si es múltiplo de 4, se almacena en dicha variable que es bisiesto; si es múltiplo de 100 se almacena en dicha variable que no es bisiesto y si es múltiplo de 400, se almacena en dicha variable que es bisiesto. Por último, se muestra el valor de la variable de salida.
5. (Capicua) Determinar si un número natural de 4 dígitos (entre 1000 y 9999) es capicúa. Se comprobará previamente que el número introducido tiene 4 dígitos. En la salida se mostrará uno de los siguientes mensajes:
	1.  “El número no tiene 4 dígitos”;
	2.   “Es capicúa”
	3.   “No es capicúa”.

6. (Inversos) Introducir tres enteros entre -100 y 100. De cumplir los tres números la condición anterior, se obtendrá la suma de sus inversos redondeado a 5 decimales; si no se mostrará el mensaje “Alguno de los números no está entre -100 y 100”. No se sumará el inverso de aquellos valores que sean 0. Por ejemplo, se introducen los enteros 20, -4 y 100, y se muestra el valor 1/20 + 1/-4 + 1/100 = -0.19000.
7. (Armstrong) Un número de 3 cifras es un número de Armstrong si la suma de sus dígitos elevado a 3 coincide con dicho número. Por ejemplo, 153 = 1+125+27. Dado un número de 3 cifras determinar si es o no un número Armstrong. Se comprobará previamente que el número introducido tiene 3 dígitos. En la salida se mostrará uno de los siguientes mensajes:
	1. “El número no tiene 3 dígitos”
	2. “Es un número Armstrong”
	3. “No es un número Armstrong”.
8. (Ordenados) Leer tres enteros y mostrarlos ordenados. 
9. (Consecutivos) Se leen tres enteros y se comprobará si son o no consecutivos. Se mostrará en la salida
“Son consecutivos” o “No son consecutivos”. 
10. (IncrementarDecrementar) Se lee un número entero. Dicho número se incrementará en una unidad si es par, y se decrementará en una unidad si es impar. Se muestra por consola el nuevo valor del número. 
11. (OrdenarAD) Se leen tres enteros y un valor booleano para ordenarlos ascendentemente o descendentemente. Se mostrarán los valores leídos ordenados. 
12. (UnIncremento) Dado un número entero, se incrementará en 2 unidades si es par, en 3 unidades si es múltiplo de 3, en 5 unidades si es múltiplo de 5, y si no, se incrementará en una unidad. Sólo se realiza un incremento. 
13. (Fecha) Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. Sin años bisiestos.
14. (FechaSiguiente) Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. suponer que todos los meses tienen 30 días excepto febrero que tiene 28.

## do while

1. Leer números enteros hasta introducir un 0. El programa obtendrá la suma de todos
los números positivos. (SumarPositivos)
2. Calcúlese el mínimo común múltiplo de dos números entre 1 y 100. Para obtener el mcm se tomará uno de los valores introducidos y se irá multiplicando por 1, 2, 3, etc, hasta que el valor obtenido sea múltiplo del otro número, que sería el valor buscado. (MinimoComunMultiplo)
3. Generar números enteros aleatorios entre 0 y 100 hasta obtener el 0. El programa mostrará cada uno de los datos generados y obtendrá el mayor de los números generados. (MayorNumero)
4. Introducir un entero no negativo, y convertirlo a binario, octal y hexadecimal. (BinarioOctalHexadecimal)
5. Crea un programa que genere un número aleatorio (entre 0 y 20) de entrada y lo guarde en una variable. El sistema irá pidiendo números al usuario hasta que coincida con el aleatorio generado (en caso de no coincidir mostrará el mensaje "Lo siento, intentalo de nuevo"). Cuando coincida el sistema deberá mostar el mensaje "Enhorabuena, has acertado el número en 5 intentos" (Adivina)
6. Modifica el ejercicio anterior para que una vez adivinado el número el sistema muestre el siguiente mensaje: "Quieres volver a jugar (S/N)":
- En caso de introducir N la aplicación se detendrá
- En caso de introducir S la aplicación empezará de nuevo (generando un aleatorio, pidiendo números hasta acertar el generado, etc...) Cuando el usuario acierte el número generado se mostrará un mensaje diciendo si ha superado el record de intentos (si ha hecho menos intentos que las veces anteriores) (AdivinaRecord)
7. Realizar un menú de 4 opciones, donde se mostrará por pantalla el siguiente formato
	- Bienvenido a la aplicación del menú
	- 1. Opción1
	- 2. Opción2
	- 3. Opción3
	- 4. Opción4
	- 5. Salir
	- Introduce la opción seleccionada
Una vez mostrado la última línea, el sistema esperará a que el usuario introduzca un dato. Dependiendo de la opción seleccionada aparecerá un mensaje por pantalla que ponga "La opción seleccionada es X". En el caso de meter una diferente pondrá "opción no contemplada". El programa se repetiría hasta que introduzca el 5 (MenuSimple)
8. Modifica el ejercicio anterior para hacer una calculadora. Nada más ejecutar se mostrarán las opciones disponibles
        - Bienvenido a la aplicación de calculos
	- Introduce operando uno:
	- Introduce operando dos:
	- 1. Sumar
	- 2. Restar
	- 3. Multiplicar
	- 4. Dividir
	- 5. Módulo
	- 6. Salir
	- Selecciona la operacion que quieres realizar.
Al seleccionar una de las opciones el sistema realizará la operación correspondiente y mostrará el resultado por pantalla de la siguiente forma "El resultado de la operación es:". Una vez terminada la operación volverá a mostrar el menú y pedir dos números nuevos. (MenuCalculo)
9. Modifica el ejercicio 9 para hacer una calculadora de cambios de base. Nada más ejecutar se mostrarán las opciones disponibles
        - Bienvenido a la aplicación de cambios de base
	- Introduce el número que quieres cambiar de base:
	- 1. Pasar a base2
	- 2. Pasar a base8
	- 3. Pasar a base16
	- 6. Salir
	- Selecciona la base a la que quieres pasar
Al introducir un número el sistema comprobará que es mayor que 0. En caso de no serlo mostrará el mensaje "No válido, introduce otro", esperando una nueva introducción de datos. Una vez introducido, al seleccionar una de las opciones el sistema realizará la conversión correspondiente y mostrará el resultado por pantalla de la siguiente forma "El número XX en base10 es igual que XX en baseXX". Una vez terminada la operación volverá a mostrar el menú y pedir un número. (MenuBases)

