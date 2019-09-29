<a name="indice"></a>
- [Identificación de los elementos de un programa informático:](#tema3)
    - Estructura y bloques fundamentales.
    - Identificadores.
    - Palabras reservadas.
    - Variables. Declaración, inicialización y utilización. Almacenamiento en memoria.
    - Tipos de datos.
    - Literales.
    - Constantes.
    - Operadores y expresiones. Precedencia de operadores
    - Conversiones de tipo. Implícitas y explicitas (casting).
    - Comentarios.

#### [Volver al índice](#indice)

Antes de empezar y aunque se explicará más adelante en detalle es necesario saber que para poder leer datos por teclado se hará utilizando la clase Scanner que se encuentra en la librería o paquete “java.útil”.
Se definirá una constante global de tipo Scanner con el valor inicial de fichero de entrada el de la consola: final Scanner in = new Scanner(System.in);

Para poder definir una variable de tipo Scanner en una aplicación se tendrá que importar dicha clase en la aplicación de la siguiente manera:
````
Scanner in = new Scanner(System.in);
````
Existen métodos específicos para cada uno de los datos los cuales son los siguientes:

````
a = in.next();  //a es de tipo String
a = in.nextByte();  //a es de tipo byte
a = in.nextShort();  //a es de tipo short
a = in.nextInt();  //a es de tipo int
a = in.nextLong();  //a es de tipo long
a = in.nextFloat();  //a es de tipo float introducido con ,
a = in.nextDouble();  //a es de tipo double introducido con ,
a = in.nextBoolean();  //a es de tipo boolean
a = in.next().charAt(0);  //a es de tipo char
a = in.nextLine();  //a es de tipo String
// la ejecución de in.nextLine() vacía el buffer de lectura	
````


#### Estructuras y bloques fundamentales
****
Los bloques fundamentales dentro de un programa son:

- Clases
- Variables
- Métodos
- Bloques

Existen más elementos que se explicarán más adelante pero los fundamentales son los comentados.

##### Clases
****

Representan el "molde" desde el cual se pueden "hacer" realidad cada uno de los elementos que formarán parte del programa informático. Para su creación se utiliza la palabra reservada class. La sentencia correcta para su creación es 
````
modificador_acceso nombre_clase {

}
````
````
public class Ejemplo{

}
````

Lo normal es la existencia de una clase por cada archivo, el cual debe tener el mismo nombre de la clase.


##### Variables
****

Serán explicadas más adelante y tienen como objetivo guardar datos que serán utilizados durante la ejecución del programa. Su estructura básica es la siguiente:

````
tipo nombre = valor
String palabra = "Hola"
````

##### Métodos
****

Son las funcionalidades individuales que pueden ser llamadas desde cualquier parte del código. Para poder ejecutar todo el interior del mismo simplemente hay que llamarlo por su nombre, con los parámetros que se indiquen. Su estructura o firma es la siguiente

````
modificador_acceso valor_retorno nombre_método(parámetro nombre) {
````

En el caso de tener un valor de retorno es obligatorio que tenga la palabra reservada return

````
public int sumarNumeros(int op1, int op2){
    int suma = op1+op2;
    return suma;
}

sumarNumeros(5,8);
````

````
public void mostrarMensaje(){
    System.out.println("Sacar mensaje por consola");
}
mostrarMensaje();
````

Existen también métodos estáticos, los cuales pueden ser llamados simplemente con el nombre de la clase.nombre_metodo

Su sintaxis es la siguiente:

````

static retorno nombre_método (parámetros)
{
}
````

Ejemplos: 

1. Crea un nuevo programa que muestre ¡Hola mundo!, para la salida por consola se haga en un método sin datos de entrada ni salida de nombre “saludar”. 
2. Crea un método que se llame saludarPerso el cual admita un parámetro de tipo string y muestre por consola el mensaje "Hola NombreIntroducido".
3. Crea un programa en el se defina una constante global con el valor del número pi (3,1416) y se muestre por consola. Se definirá un método de nombre “mostrarPI” sin datos de entrada ni salida. (mostrarPI)
4. Crea un método que admita como parámetros dos números y muestre por consola su suma. 

##### Bloques
Los bloques de código son partes del programa que tienen una ejecución específica. Dentro de los bloques encontramos los estamentos que se encargan de realizar por ejemplo repeticiones, toma de decisiones, etc...
****

#### Identificadores
****
Un identificador es una palabra que representa elementos de un lenguaje de programación.

En java un identficador se define del siguiente modo:
- Comienza con una letra, un subrayado (_) o un símbolo de dólar ($). Los siguientes caracteres pueden ser letras, dígitos y subrayado.
- Se distinguen las mayúsculas de las minúsculas.
- No hay una longitud máxima establecida para el identificador

#### Palabras reservadas
****

Las palabras reservadas son aquellas que tienen un significado específico y no pueden ser utilizadas para definir elementos como variables, métodos y/o clases. Las palabras reservadas en java son:

||||||||
|-|-|-|-|-|-|-|
|abstract|assert|boolean|break|byte|case|catch|
|char|class|const|continue|default|do|double|
|else|enum|extends|final|finally|float|for|
|goto|ifv|implements|import|instanceof|int|interface|
|long|native|new|package|private|protected|public|
|return|short|static|strictfp|super|switch|synchronized|
|this|throw|throws|transient|try|void|volatile|
|while|||||||

#### Variables
****

Se define variable como cualquier elemento que guarde datos que serán utilizados en código algún momento. Para su uso se defie el tipo, su nombre y su valor
````
tipo nombre = valor
String nombre = "variable";
int edad = 20;
boolean experiencia = false;
````
Hay que tener en cuenta las siguientes cosas a la hora de trabajar con varianles: 

- Nombres descriptivos
- No utilizar palabras reservadas
- Comienzan en minúsculas o _, nunca con números
- Cada palabra con mayúsculas excepto la primera

Según su lugar de declaración pueden existir:

- Variables gobales: aquellas declaradas al comienzo de la clase. Su utilización puede ser en toda la clase
- Variables de método: aquellas declaradas dentro de un bloque (como por ejemplo un método). Su utilización se restringe al método donde han sido declaradas
- Variables estáticas: aquellas que son declaradas con la palabra reservada static y pueden ser accedidas sin necesidad de crear un objeto de la clase. 
- Variables finales o constantes: aquellas que no pueden cambiar su valor. Su nombre debe ir el mayúsculas.

````
public class Introduccion {
    // variables globales
    String nombre = "Develop";
    int edad = 19;
    boolean experiencia = false;
    // variable estática
    static String nombreAccesible = "Elemento";
    // variable final
    final static double PI = Math.PI;



    protected void metodoInicial(){
        // variables de método
        String nombre= "Luis";
        char letra = 'a';
        System.out.println(nombre);
        System.out.println(this.nombre);
    }
    
    protected void metodoInicialDos(){
        // variable de método no accesible
        System.out.println(letra);
    }
    
}
````

#### Tipos de datos
****

Los tipos de datos utilizados en programación son:

|Tipo| Tamaño y formato |Rango|
|--|--|--|
|  | Enteros |	|
| byte |8 bits - complemento a 2  |$$ -2^7 al 2^7 -1 $$	|
| short | 16 bits - complemento a 2 |	$$ -2^15 a 2^15 -1 $$|
| int| 32 bits - complemento a 2 |$$ -2^31 al 2^31 -1 $$	|
| long | 64 bits - complemento a 2 |	$$ -2^63 al 2^63 -1 $$|
|  |Reales  |	|
|  float| 32 bits - IEEE 754 |	|
|  double| 64 bits - IEEE 754 |	|
|  | Resto |	|
|  char| 16 bits - caracteres UNICODE |	|
|  boolean| 1bit |	|
|  |  |	|


#### Literales
****
Los valores literales son aquellos que podemos asignar a las variables. Dependiendo del tipo de variable podremos asignar unos valores u otros, tal y como se ha visto en los puntos anteriores. Además de todos los tipos literales vistos en la tabla anterior, también se pueden utilizar elementos especiales, siempre y cuando comiencen con la barra invertida :

|carácter|acción|
|--|--|
|b|retroceso|
|t|tabular la cadena|
|n|salto de línea|
|f|form feed|
|r|retorno de carro|
|'|comilla simple|
|"|comilla doble|

#### Constantes
****
Como ya se comentó en el bloque de las variables una constante es un valor de un tipo con un nombre que no se puede modificar durante la ejecución del programa. En su definición se acompañan con la palabra reservada final. Existen multitud de constantes creadas en el lenguaje. Un claro ejemplo son los valores máximos y mínimos de cada uno de los tipos de datos primitivos númericos y de carácter se almacenan en las siguientes constantes globales:

1. Byte.MIN_VALUE || Byte.MAX_VALUE
2.  Short.MIN_VALUE || Short.MAX_VALUE
3.  Integer.MIN_VALUE || Integer.MAX_VALUE
4.  Long.MIN_VALUE || Long.MAX_VALUE
5.  Float.MIN_NORMAL || Float.MAX_VALUE
6.  Double.MIN_NORMAL || Double.MAX_VALUE
7.  (int) Character.MIN_VALUE || (int) Character.MAX_VALUE

Como se puede ver, todas las constantes por definición se definen con nombres en mayúsculas. Del mismo modo, para que estas sean accesibles desde fuera de la clase de forma directa, suelen ir acompañadas del modificador static

````
final static double VALOR = 9.5;

````

#### Salida por consola

Para poder sacar un mensaje por consola se puede utilizar el método println de la librería System.out. Del mismo modo los valores de tipos primitivos y cadenas se pueden mostrar por consola formateados utilizando el método format o printf de la clase System.out. con la siguiente sintaxis 
````
System.out.format(“Cadena de formato”, v1, ... , vn);
System.out.printf(“Cadena de formato”, v1, ... , vn);
````

Donde la cadena de formato está compuesta por textos y elementos. Para cada elemento de la cadena de formato habrá un valor a mostrar con el formato indicado en dicho elemento. Así, v1 será el valor que se mostrará con el formato del primer elemento que aparece en la cadena de formato, y así sucesivamente. El valor puede ser un literal, constante, variable o expresión de tipo el indicado en su correspondiente elemento de formato. Un ejemplo sería:

````
System.out.printf("Me llamo %-10s y tengo %04d años", "Pedro", 22);
````

En la cadena de formato hay dos elementos . El valor "Pedro" se asocia con el elemento %-10s y el valor 22 se asocia con el elemento %04d. El primer elemento indica que se va a mostrar una cadena ocupando 10 espacios y ajustando el valor de la cadena a la izquierda. El segundo elemento indica que se va a mostrar un un valor entero ocupando 4 espacios, ajustado por la derecha y rellenando con 0 por la izquierda hasta completar el espacio que ocupa el entero.

Cada uno de los valores que le acompañan al símbolo de % se sustituirán por los argumentos que le son pasados al método. El formato siempre será el siguiente:
````
%[Banderas][Tamaño]Conversor
````

Donde las posibles banderas a utilizar son las siguientes:

- 0 Rellenar con 0 por la izquierda hasta completar el tamaño. Sólo válido para tipos primitivos numéricos.
- + Se mostrará el signo + para los positivos. Sólo válido para tipos primitivos numéricos.
- ( Los valores negativos se pondrán entre paréntesis y no se mostrará el signo ‘- ‘. Sólo válido para tipos primitivos numéricos.
- , Se mostrará el carácter decimal correspondiente a la zona geográfica. Sólo válido para tipos primitivos numéricos reales.
- - Se ajustará el valor a la izquierda (por defecto se ajusta a la derecha)

Donde los posibles tamaños son 

- n El valor ocupará un total de n espacios (si el valor ocupase más espacios, se mostraría en su totalidad).
- n.m El valor ocupará n espacios y se mostrará con m decimales. Puede ser que n sea menor que m. El valor real se muestra redondeado a “m” decimales. Sólo válido para tipos primitivos numéricos reales.

Donde los posibles conversores son:

- o El valor entero se muestra en octal.
- h El valor entero se muestra en hexadecimal (no permite la bandera 0)
- x El valor entero se muestra en hexadecimal
- d El valor entero se muestra en base 10.
- b Conversor para el tipo primitivo boolean.
- c Conversor para el tipo primitivo char
- s Conversor para cadenas
- n Salto de línea (no admite banderas ni tamaño, y no tiene asociado ningún valor)
- % Muestra el ‘%’ (no admite banderas ni tamaño, y no tiene asociado ningún valor)
- a El valor real se muestra en hexadecimal
- e El valor real se muestra en notación científica
- f El valor real se muestra con notación decimal

#### Operadores y expresiones
****

Existen varios tipos de operadores: 

- Aritméticos
- De Asignación
- Relacionales 
- Lógicos

##### Aritméticos
***

![operadores aritméticos](./images/aritmeticos.png)

Para los siguientes ejemplos tomase como referencia las siguientes variables:

- byte a = 34;
- int b = 11;
- long c = 9;
- float d = 34.7F;

Los ejemplos de operadores serían:

- a++;  // “a” vale 35
-   b--;  // “b” vale 10
-   --c;  // “c” vale 8
-   ++d; // “d” vale 35.7
- n1 = 3 * n1; // “n1” vale 36 (3 * n1→3*12→36) 
- b=b+5; //“b”vale15(b+5→10+5→15)
- n1 = n1 / b ; // “n1” vale 1 (n1 / b → 12/10 → 1) 
- b = b % 3; // “b” vale 1 (b % 3 → 10 % 3 → 1)
- b = -b; // “b” vale -1 (-b→-10)
- d = d / c; // “d” vale 4.4625 (d / c → 35.7 / 8 → 4.4625) 
- d = a / c; // “d” vale 4 (a / c → 35 / 8 → 4)
- e = e / 5; // “e” vale -4 (e / 5 → -23 / 5 → -4)
- e = e % 5; // “e” vale -3 (e % 5 → -23 % 5 → -3)
- c = c / -5; // “c” vale -1 (c / -5 → 8 / -5 → -1)
- c = c % -5; // “c” vale 3 (c % -5 → 8 % -5 → 3)
- e = e / -5; // “e” vale 4 (e / -5 → -23 / -5 → 4)
- e = e % -5; // “e” vale -3 (e % -5 → -23 % -5 → -3)

El orden de aplicación es el siguiente:

![operadores aritméticos](./images/aritorden.png)



##### Asignación
***

![operadores de asignación](./images/asignacion.png)



##### Relacionales o de comparación
***

![operadores de comparación](./images/comparacion.png)

Sean las siguientes variables:
- int a = 20, b = 2,c = 7;
- char d = 'b';
- float e = 20.5F;

Los ejemplos serían los siguientes:

- a+1==3*c → 20+1==3*7 → 21==3*7→ 21==21 → true 
- d+3>'h' → 98+3>104 → 101>104 → false
- e-b<=a → 20.5-2<=20 → 18.5<=20.0 → true

Este tipo de sentencias, al devolver una variable booleana se utiliza mucho en bloques if como se verá en el siguiente tema

##### Lógicos
***
Son aquellos utilizados para evaluar expresiones booleanas. Al igual que los operadores de comparación, son muy utilizados para aplicarlos en estructuras de control

![operadores lógicos](./images/operadoreslogicos.png)


El orden de aplicación de los operadores es:

![operadores lógicos](./images/logicos.png)


##### Comparación de cadenas	

Cuando se intenta comparar una cadena de texto, no es suficiente con el uso de operadores de comparación, sino que es necesario del uso de métodos que nos ofrece la propia clase String como son equal compareTo(). Para ello tan solo es necesario llamar a los métodos desde la propia palabra.
````
String palabraUno = "Hola";
String palabraDos = "Adios";
String palabraTres = "Adios";


boolean comparacion = palabraUno.equals(palabraDos);
boolean comparacionDos = palabraDos.equals(palabraTres);
System.out.printf("La comparación es %b %n",comparacion);
System.out.printf("La comparación es %b %n",comparacionDos);
````

En el caso del uso del método compareTo, la salida del método será 0 si las dos palabras son iguales

````
String palabraUno = "Hola";
String palabraDos = "Adios";
String palabraTres = "Adios";

boolean comparacion = palabraUno.compareTo(palabraDos)==0;
System.out.printf("La comparación es %b %n",comparacionDos)


````


#### Conversiones
****
En algunos casos nos interesará asignar a una variable el valor de otra variable de tipo “superior”. En tal caso, se tendrán que convertir el valor a asignar al tipo de la variable destino con el operador de conversión de tipos.

Sean las siguientes variables:
- int numero = 0; 
- float valor = 0; 
- char letra = 'a'; 
- double peso = 64.7;

Para convertir una variable de un tipo en otro tipo se utiliza el casteo directo siempre y cuando el tipo al que se quiera pasar sea mayor que el del origen. Para ello se pone entre paréntesis el tipo al que se quiere pasar.

- numero = (int) peso; // int < double 
- letra = (char) peso; // char < double 
- valor = (float) peso; // float < double

De no ser así, se utilizará el parseo, método propio de cada uno de los tipos.

#### Comentarios
****

Los comentarios son una de los elementos principales dentro del código de programación. Ayudan al entendimiento del mismo y al mantenimiento del mismo. Existen dos tipos de comentarios en java:

- Comentarios de linea: aquellos que comentan una línea específica del programa
````
// se utilizan estos carácteres para poder crear un comentario de línea
````
- Comentarios de bloque: aquellos que se utilizan para comentar varias líneas en un mismo sitio:
/* Todo aquello encerrado entre estos carácteres forma parte de un comentario de bloque */

**Uso de comentarios especiales**

Los comentarios son tan importantes que existe una herramienta propia de java que genera documentación a partir de comentarios creados. Esta herramienta se conoce como javadoc. Para que un comentario sea interpretado por javadoc debe tener la siguiente estructura /**Comentarios*/. Además, para que se genere una documentación adecuada debe incluir los siguientes epígrafes:

|||
|-|-|
| @author | Autor del elemento a documentar | 
| @version	| Versión del elemento de la clase | 
| @return	| Indica los parámetros de salida | 
| @exception	| Indica la excepción que puede generar | 
| @param	| Código para documentar cada uno de los parámetros | 
| @see	| Una referencia a otra clase o utilidad | 
| @deprecated	| El método ha sido reemplazado por otro | 

````
/**
* Frase corta descriptiva
* Descripción de la clase
* @author Nombre Apellido / Empresa
* @version 0.1
*/
````
````
/**
* Frase corta descriptiva
* Descripción del método.
* @param param1 descripción del parámetro.
* @return qué devuelve el método.
* @exception tipo de excepción que lanza el método y en qué caso
* @see paquete.Clase#metodo Código al que se hace referencia
* @throws IllegalArgumentException el param1 no tiene el formato deseado
*/
````


