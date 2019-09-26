- Factura.java 

Escribe un programa que calcule el total de una factura a partir un precio base. Todos los elementos deberán ser guardados en variables. Se deberá mostrar tanto el precio con IVA y el precio sin IVA

- Nomina.java

Realiza la impresión por pantalla de la nómina de un trabajador. Para ello deberás pedir por pantalla el sueldo bruto de un trabajador y el número de pagas (ambos deberán ser guardados en variables). Mostrar por pantalla: 
	- su salario bruto anual
	- su salario neto anual (con una retención del 15%)
	- su salario bruto mensual
	- su salario neto mensual
	
- Conversor.java

Crea un conversor entre euros, dolares, libras y yens. Para ello crea una variable para cada convesión y muesta por pantalla el valor pedido de euros en todas las monedas con el siguiente formado:
23 euros son 25,63 dolares

- FormatoPersonas.java

Hágase un programa que lea el nombre de dos personas, su altura, su edad, si tienen carnet o no de conducir y la letra de su dni. Se mostrarán los datos como se indica en la salida. 

````
ENTRADA
Nombre y apellidos: Juan Gómez 
Edad: 23
Altura: 1,79
Carnet de conducir: false
Letra dni: a
Nombre y apellidos: María Lombardi Edad: 45
Altura: 1,53

SALIDA

NOMBRE           EDAD  ALTURA CARNET LETRA
================ ===== ====== ====== =====
Juan Gómez       00023   1,79 FALSE      A
Maria Lombardi   00045   1,53 TRUE       X
-------------------------------------------
````

- Bar.java

Unos amigos entra en un bar que ofrece las bebidas a 1,25€ y los bocadillos a 2,05€. El camarero les pregunta cuántas bébidas y bocadillos quieren. Calcula el coste de la consumición, mostrando primero el coste de las bebidas y de los bocadillos. 
````
ENTRADA
Número de bebidas: 3 
Número de bocadillos: 5 

SALIDA
Coste de las bebidas: 3.75 
Coste de los bocadillos: 10.25 
Coste consumición: 14.0
````

- ConversorTiempo.java

Hágase un programa que convierta segundos en horas, minutos y segundos.

````
ENTRADA
Número de segundos: 24973 

SALIDA
Horas: 6
Minutos: 56
Segundos: 13
````

- Compra.java

Permítase introducir el valor con IVA de una compra con dos decimales (la compra no puede ser superior a 500€ ni inferior a 0€) y el valor del IVA de dicha compra (valor entero entre 0 y 25%).¿Cuánto costó la compra sin IVA? ¿Cuánto fue el IVA? Muéstrese los resultados redondeados a dos decimales.

````
ENTRADA
Valor de la compra (entre 0.00 y 500.00):298,45 
IVA (entre 0 y 25%):12

SALIDA
Compra: 	266.47
IVA: 	31.98
	======
	298.45
````

- Circunferencia.java

Permítase introducir el valor del radio de una circuferencia con valores entre 0 y 100. Obténgase la longitud de la circunferencia (2π r) y el área del circulo (π r 2) .

````
ENTRADA
Escribe un radio entero: 15

SALIDA
Longitud de la circunferencia: 94.24777960769379
Area de circulo: 706.8583470577034
````

- BarAvanzado.java

Hágase una aplicación que permita introducir el número de bebidas y bocadillos comprados (valores entre 0 y 20). Además se podrá introducir el precio de cada bebida (valor entre 0.00 € y 3.00 €) y de cada bocadillo (valor entre 0.00 € y 5.00 €). También se podrá introducir el número de alumnos que realizaron la compra (valor entre 0 y 10). Se mostrará el total de la compra (con el subtotal de las bebidas y de los bocadillos) y la cantidad que debe pagar cada alumno redondeada a 2 decimales.

````
ENTRADA
Número de bebidas (entre 0 y 20): 3
Número de bocadillos (entre 0 y 20): 5
Precio de cada bebida (entre 0,00 y 3,00): 1,20 
Precio de cada bocadillo (entre 0,00 y 3,00): 2,05 
Número de alumnos (entre 1 y 10): 5

SALIDA
ARTICULO     CANTIDAD PRECIO  COSTE
============ ======== ======= ======
Bebida		    3    1,20   3,60 
Bocadillo		    5 	 2,05  10,25 
				  ===== 
TOTAL				  13,85 
------------------------------------

Cantidad a poner por cada alumno: 2.77
````

- CompararPar.java

Hágase una aplicación que lea un entero entre 0 y 100. Compruébese (mostrándose verdadero o falso) las siguientes condiciones:
1. Es par
2. Es mayor que 50

````
ENTRADA
Escribe un entero entre 0 y 100: 55 

SALIDA
Par: false
Mayor que 50: true
````

- ComparNumeros.java

Permítase introducir tres números reales de dos decimales. Compruébese (mostrándose verdadero o falso) si la suma de los dos primeros valores es igual al tercero.

````
ENTRADA
Escribe un número real: 45,2
Escribe un número real: 23,11
Escribe un número real: 68,31

SALIDA
La suma de los dos primeros es el tercero: true
````


- CompararLogica.java

Lea dos números entre 0 y 9, ambos inclusive. Compruébese (mostrándose verdadero o falso) las siguientes condiciones e indíquese cómo se evalúan:
1. El primero es par y el segundo impar
2. El primero es superior al doble del segundo e inferior a 8
3. Son iguales o la diferencia entre el primero y el segundo es menor que 2

````
ENTRADA
Escribe un número entre 0 y 9: 4
Escribe un número entre 0 y 9: 7

SALIDA
El primero es par y el segundo impar: true
El primero es superior al doble del segundo e inferior a 8: false
Son iguales o la diferencia entre el primero y el segundo es menor que 2: true
````
