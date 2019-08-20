- [Lectura y escritura de información:](#tema4)
    - Flujos (streams):
        - Tipos de flujos. Flujos de bytes y de caracteres.
            - Clases relativas a flujos. Jerarquías de clases.
        - Utilización de flujos.
    - Entrada/salida estándar:
        - Entrada desde teclado.
        - Salida a pantalla.
    - Almacenamiento de información en ficheros:
        - Ficheros de datos. Registros.
        - Apertura y cierre de ficheros. Modos de acceso.
        - Escritura y lectura de información en ficheros.
        - Almacenamiento de objetos en ficheros. Persistencia. 
        -  Serialización. 􏰀 Utilización de los sistemas de ficheros.
        - Creación y eliminación de ficheros y directorios.

### Flujos 
****

Un stream o flujo es el proceso mediante el cual se realiza una comunicación con el exterior del programa. De manera genérica existen tres tipos de flujos controlados por las siguientes clases:

#### Flujos de bytes

Son utilizados para leer y escribir información que esta almacenada en forma binaria, como por ejemplo archivos.

- System.in implementa la entrada estándar. Se trata de una instancia de la clase InputStream la cual realiza un flujo de bytes de entrada
- System.in implementa la entrada estándar. Se trata de una instancia de la clase OutputStream la cual realiza un flujo de bytes de salida
- System.err implementa la salida de error, similar a la anterior pero utilizada para mostrar mensajes de error con las excepciones 


#### Flujos de carácteres

Son utilizados para leer y escribir información que esta almacenada en forma de texto, como por ejemplo archivos.

- Manejados con la clase Reader y Writer

#### Jerarquía de clases

![jerarquía clases](./images/javaio.png)


### Entrada y salida por teclado
****

**Para la entrada de datos se utilizan las clases de Scanner y BufferedReades**

#### Scanner

El uso de la clase Scanner es una de las mejores maneras de ingresar datos por teclado en Java.

Scanner es una clase en el paquete java.util utilizada para obtener la entrada de los tipos primitivos como int, double etc. y también String. Es la forma más fácil de leer datos en un programa Java

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
// la ejecución de in.nextLine() vacía el buffer de lectura recomendado tras la última lectura
````

#### BufferedReader

Clase similar a la anterior con la diferencia que ofrece menos métodos con los que poder trabajar, ya que todas las lecturas que realiza las convierte a String

````
BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String nombre = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
````

**Para la salida de datos se utiliza la clase System.out.print**

#### Salida común

Para realiza una salida de datos común se utilizan las siguientes clases
````
System.out.println(valor); 
System.out.print(valor);
````
En el caso de querer concatenar valores que se imprimen por pantalla, basta con utiliza el carácter + para realizar la tarea

````
System.out.println(valor+" "+valor); 

````

#### Salida formateada

En muchos casos la utilización del carácter + para concatenar valores puede resultar muy poco útil. Para ello se puede utiliza la salida formateada. Para ello se utilizan las clases System.out.printf o String.format.

Para poder utilizarlas, primero se define un patrón que representa la base del mensaje. Dentro de este patrón se incluyen los símbolos que se sustituirán en el formato del mensaje. Los símbolos son los siguientes:

- %b Booleano
- %h Hashcode
- %s Cadena
- %c Caracter unicode
- %d Entero decimal
- %o Entero octal
- %x Entero hexadecimal
- %f  Real decimal
- %e Real notación científica
- %g Real notación científica o decimal
- %a Real hexadecimal con mantisa y exponente
- %t Fecha u hora

La sintaxis completa del formato sería la siguiente:
````
String frase = String.format("Curso de %s %.1f", "Java",1.9);
System.out.println(frase);
````

### Almacenamiento de información en ficheros
****
#### La clase File

La clase File hace referencia a una dirección expresada en String donde se apunta al fichero – directorio con el que se quiere trabajar. 

````
File f = new File ("src/documentos/ejemplo.txt");
````

Algunas de las acciones que permite esta clase son:

````
// obtiene la ruta del padre
f.getParent()
// evalúa si es un directorio
f.isDirectory()
// evalúa si es n fichero
f.isFile();
// crea el directorio correspondiente
f.mkdir();
// crea todos los directorios si no están creados hasta llegar al indicado
f.mkdirs();
// comprueba si existe
f.exist();
// crea el fichero indicado
f.create();
// borra el fichero indicado
f.delete();
// lista los archivos del directorio indicado 
f.list();
// indica si se puede leer
f.canRead();
// indica si se puede escribir
f.canWrite();
// renombre el fichero indicado a un nombre dado
f.renameTo();
````

Ejemplos a realizar (realizarlo con las comprobaciones de existencia):

1. Comprobar si no existe el directorio de un determinado fichero
2. Comprobar si un determinado fichero no existe
3. Borrar un fichero
4. Renombrar un fichero
5. Crear un fichero en un directorio conocido.

**Modifica todos los ejemplos para pedir los nombres por consola**

#### Lectura y escritura en ficheros

##### Lectura

Para poder leer de un fichero lo primero que se necesita es un objeto de tipo FileReader, a la cual se le asigna un objeto de tipo file

````
File f = new File("ejemplo.txt");
FileReader fileReader = new FileReader(f);
}
````

Antes de explicar el resto de elementos de este objeto es necesario saber que lo que obligatoriamente hay que hacer al terminar de leer un fichero es cerrar el flujo de datos.
````
fileReader.close();
````


Una vez creado el objeto bufferedreader se puede leer el contenido del fichero en formato carácter con el método readLine()
````
FileReader fileReader = new FileReader(f);
BufferedReader bufferedReader= new BufferedReader(fileReader);
bufferedReader.readLine();
````

Para la lectura completa de todas las lineas de un fichero:
````
String cadena;
try {
	BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("src/ejemplo.txt")));
	while((cadena = bufferedReader.readLine())!=null) {
		System.out.println(cadena);
	}
	bufferedReader.close();
} catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
}
````


##### Escritura

Para trabajar con la escritura el proceso es tremendamente similar, con la diferencia del cambio de clases.
````
File f = new File ("src/documentos/ejemplo.txt);
FileWriter fr = new FileWriter(f);
BufferedWriter bw = new BufferedWriter (fr);
````
Los métodos más utilizados son
````
// escribe los datos en el fichero
bw.write();
// escribe un salto de linea en el fichero
bw.newLine();
````

Ejemplos:
1. Crea un programa que pida por consola los siguientes datos: nombre, apellido, edad. Tras pedir el último dato lo escribirá en un fichero llamado usuarios.txt (se creara si no existe en la raíz del proyecto). El programa seguirá pidiendo datos hasta que no se pare la ejecución