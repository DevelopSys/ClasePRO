## if - else

1. Hágase un programa que lea dos enteros y compruebe si el primero es o no mayor que el segundo. En la salida se mostrará “El primero es mayor que el segundo” o “El primero no es mayor que el segundo”.

2. Hágase un programa que lea tres enteros positivos, y compruebe si alguno es suma de los otros dos. En la salida se mostrará “Ninguno es suma de los otros dos” o “8 = 2 + 6” (en este último caso se introdujeron los números 2, 8 y 6). SumaTres.java

3. Léase un número entero. Se comprobará si dicho número es o no múltiplo de 20, y también se comprobará si está o no entre -100 y 100. En la salida se mostrará uno de los siguientes menasajes:

   1. “Es múltiplo de 20 y está entre -100 y 100”.
   2. “Es múltiplo de 20 y no está entre -100 y 100”.
   3. “No es múltiplo de 20 y está entre -100 y 100”-
   4. “No es múltiplo de 20 y no está entre -100 y 100”.

   ** Un número es múltiplo de otro cuando su resto es igual a 0 **

4. Hágase un programa que compruebe si un año pedido por teclado es bisiesto. En la salida se mostrará o “Es bisiesto” o “No es bisiesto”,)

   El algoritmo para obtener si un año es bisiesto es el siguiente: un año es bisiesto si es múltiplo de 4.

5. Determinar si un número natural de 4 dígitos (entre 1000 y 9999) es capicúa. Se comprobará previamente que el número introducido tiene 4 dígitos. En la salida se mostrará uno de los siguientes mensajes:

   1. “El número no tiene 4 dígitos”;
   2. “Es capicúa”
   3. “No es capicúa”.

   ** Un número es capicúa cuando se lee igual de izquierda a derecha que de derecha a izquierda **

6. Introducir tres enteros entre -100 y 100. De cumplir los tres números la condición del rango, se obtendrá la suma de sus inversos (1/número ). En el caso de no estar alguno de los numeros en el rango se mostrará el mensaje “Alguno de los números no está entre -100 y 100”. No se sumará el inverso de aquellos valores que sean 0. Por ejemplo, se introducen los enteros 20, -4 y 100, y se muestra el valor 1/20 + 1/-4 + 1/100 = -0.19000.

7. Un número de 3 cifras es un número de Armstrong si la suma de sus dígitos elevado a 3 coincide con dicho número. Por ejemplo, 153 = 1+125+27. Dado un número de 3 cifras determinar si es o no un número Armstrong. Se comprobará previamente que el número introducido tiene 3 dígitos. En la salida se mostrará uno de los siguientes mensajes:

   1. “El número no tiene 3 dígitos”
   2. “Es un número Armstrong”
   3. “No es un número Armstrong”.

8. Leer tres enteros y mostrarlos ordenados.

9. Se leen tres enteros y se comprobará si son o no consecutivos. Se mostrará en la salida
   “Son consecutivos” o “No son consecutivos”.

10. Se lee un número entero. Dicho número se incrementará en una unidad si es par, y se decrementará en una unidad si es impar. Se muestra por consola el nuevo valor del número.

11. Se leen tres enteros y un valor booleano para ordenarlos ascendentemente o descendentemente. Se mostrarán los valores leídos ordenados.

12. Leer un número entero, se realizarán las siguientes acciones:

    - incrementará en 2 unidades si es par
    - en 3 unidades si es múltiplo de 3
    - en 5 unidades si es múltiplo de 5
    - en el caso de no cumplirse ninguna de las anteiores, se incrementará en una unidad.

Sólo se realiza un incremento.

Mostrar por consola el valor del número obtenido

13. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Con meses de 28, 30 y 31 días. Sin años bisiestos.

14. Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. suponer que todos los meses tienen 30 días excepto febrero que tiene 28.

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

7. Realizar un menú de 4 opciones, donde se mostrará por pantalla el siguiente formato - Bienvenido a la aplicación del menú - 1. Opción1 - 2. Opción2 - 3. Opción3 - 4. Opción4 - 5. Salir - Introduce la opción seleccionada
   Una vez mostrado la última línea, el sistema esperará a que el usuario introduzca un dato. Dependiendo de la opción seleccionada aparecerá un mensaje por pantalla que ponga "La opción seleccionada es X". En el caso de meter una diferente pondrá "opción no contemplada". El programa se repetiría hasta que introduzca el 5 (MenuSimple)
8. Modifica el ejercicio anterior para hacer una calculadora. Nada más ejecutar se mostrarán las opciones disponibles - Bienvenido a la aplicación de calculos - Introduce operando uno: - Introduce operando dos: - 1. Sumar - 2. Restar - 3. Multiplicar - 4. Dividir - 5. Módulo - 6. Salir - Selecciona la operacion que quieres realizar.
   Al seleccionar una de las opciones el sistema realizará la operación correspondiente y mostrará el resultado por pantalla de la siguiente forma "El resultado de la operación es:". Una vez terminada la operación volverá a mostrar el menú y pedir dos números nuevos. (MenuCalculo)
9. Modifica el ejercicio 9 para hacer una calculadora de cambios de base. Nada más ejecutar se mostrarán las opciones disponibles - Bienvenido a la aplicación de cambios de base
   - Introduce el número que quieres cambiar de base:
   - 1. Pasar a base2
   - 2. Pasar a base8
   - 3. Pasar a base16
   - 6. Salir
   - Selecciona la base a la que quieres pasar

Al introducir un número el sistema comprobará que es mayor que 0. En caso de no serlo mostrará el mensaje "No válido, introduce otro", esperando una nueva introducción de datos. Una vez introducido, al seleccionar una de las opciones el sistema realizará la conversión correspondiente y mostrará el resultado por pantalla de la siguiente forma "El número XX en base10 es igual que XX en baseXX". Una vez terminada la operación volverá a mostrar el menú y pedir un número. (MenuBases)

## instrucción for

1. Se leerá el número de temperaturas a introducir (de ser 0 o negativo se establecerá a 10). Obténgase la media con dos decimales de las temperaturas inroducidas por consola. (TemperaturasIntroducidas)

2. Leer un número entre 0 y 10. Se mostrará la tabla de multiplicar de dicho número con el formato: 5 x 3 = 15 (desde 0 hasta 10 en líneas distintas). (TablaDeMultiplicar)

3. Modificar el ejercicio anterios para calcular la tabla de multiplicar de todos los números (TablaTodos)

4. Modificar el ejercicio anteriore para calcular la tabla de multiplicar de los numeros comprendidos en un rango de números pedidos. Por ejemplo, las tablas de los números comprendidos entre el 3 y el 7 (3,4,5,6,7)

5. Calcular el factorial de un número entre 0 y 20. El factorial de un número se define del siguiente modo: F(0) = 1; F(1) = 1; F(n) = n(n-1)(n-2) ... 1 siendo n>1. (Factorial)

6. Dado dos enteros entre 0 y 5 (la base y el exponente), obtener la potencia del primero elevado al segundo sin utilizar el método “pow”. Por ejemplo, base = 3 y exponente = 5, 35=3x3x3x3x3=243. Casos particulares: 00 = Error y n0 = 1.(BaseExponente)

7. Mostrar todos los números pares comprendidos entre dos dados. (ParesEntreDosDados)

8. Simúlese el lanzamiento de un dado. Se introducirá el número de veces que se lanza el dado (de no ser positivo, se establecerá a 100). (Dado)

9. Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros (NumerosTipos)

10. Pedir 10 sueldos. Mostrar su suma, media y cuantos hay mayores de 1000€.(Sueldos)

11. Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.(NotasTipos)

12. Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo. Donde N es un número pedido por teclado (Sueldos)

13. Dibujar por consola un Cuadrado de + . Para ello se pedirá por consola el tamaño del lado y se imprimirá el cuadrado con el siguiente formato (CuadradoFor)

14. Modificar el ejercicio anterior para dibujar un cuadrado donde las aristas exteriores tengan el caracter - y la parte inteirior del cuadrado tenga el caracter +. (CuadradoFormato)

15. Pedir una palabra por teclado y mostrar su contraria. Por ejemplo se introducirá la palabra programacion y se mostrará por consola la palara noicamargorp (InversaPalabra)

16. Pedir una palabra por teclado y comprobar si es o con capicua. Una palabra es palíndromo cuando se lee igual de izquieda a derecha que de derecha a izquierda. Por ejemplo ana, oro, radar. Para poder hacer la comprobacion no se tendrán en cuenta mayusculas ni acentos (CapicuaPalabra)

17. Modifica el ejercicio anterior para comprobar si una frase introducida es palíndromo. Para ello se deben eliminar todos los espacios y comprobar si la frase se lee igual de izquierda a derecha que de derecha a izquierda. Por ejemplo: Allí ves Sevilla. Para poder hacer la comprobacion no se tendrán en cuenta mayusculas ni acentos (PalindromoFrase)

18. Crear un programa que permita realizar un juego de adivinación. Para ello el sistema nada más empezar generará un número aleatorio entre 1 y 30. Tras la generación de este número el usuario contará con 10 intentos para poder adivinarlo. Para lo cual se irá pidiendo un números y en el caso de aceptarlo terminará el proceso con el mensaje "Has adivinado el número en X intentos". En el caso de agotar los intentos aparecerá el menaje "Lo siento, has agotado todos los intentos"
