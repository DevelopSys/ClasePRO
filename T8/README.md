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
        - Serialización. 􏰀 Utilización de los sistemas de ficheros.
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

**Para la entrada de datos se utilizan las clases de Scanner y BufferedReader**

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

### Almacenamiento de información en ficheros
****
#### La clase File

La clase File hace referencia a una dirección expresada en String donde se apunta al fichero – directorio con el que se quiere trabajar. Es importante tener en cuenta que esta ruta puede apuntar a una ruta absoluta o ruta relativa, siempre siendo recomendable utilizar la ruta relativa

````
File f = new File ("src/documentos/ejemplo.txt");
````

Otra cosa a tener en cuenta de un objeto de tipo file es que puede ser tanto un fichero final como un directorio.

````
public class EntradaIntro {

    public static void main(String[] args) {
        File f = new File("src/github/flujodatos/documentos");
        System.out.println(f.isDirectory());
    }
}
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
// lista los archivos del directorio indicado (en formato file)
f.listFiles();
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
6. Comprobar cuales son todos los discos conectados al sistema

**Modifica todos los ejemplos para pedir los nombres por consola**

#### Lectura y escritura de caracteres en ficheros

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

El objeto FileReader por si solo no permite una lectura "comprensible" sino que lo hace en formato de bytes. Para poder trabajar de forma comprensible se utiliza un objeto de tipo BufferedReader a partir de un FileReader

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

En el bloque while lo que se hace es leer cada una de las lineas siempre y cuando la lectura devuelva un valor diferente de null. El fichero parará de leerse cuando se encuentre con un EOF

Cuando se lee una palabra se puede aplicar multitud de métodos sobre esta todos ellos pertenecientes a la clase String que ya vimos en los primeros temas. Alguno de los ejemplos son:
````
// retorna un String[] con todas las palabras una vez se quita el carácter indicado
linea.split(",");
// retorna la posición del carácter indicado
linea.indexOf("a");
// retorna el carácter de la posición indicada
linea.charAt(0);
// retorna la última posición encontrada del carácter indicado
linea.lastIndexOf('a');
// retorna la palabra ubicada entre las posiciones indicadas
linea.substring(0,4);
// elimina los espacios vacíos al principio y final de la línea
linea.trim();
````

En el caso de utilizar el método read() se obtiene un int, el cual es el número asociado al carácter (tabla ASCII), pudiendo convertirlo de la siguiente forma

````
public void conversionASCIILetra(File file){
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int linea;
            while ((linea = bufferedReader.read())>-1){
            	// este ese en código ASCII
                System.out.println(linea);
                // Esta es la conversión a letra
                System.out.println(Character.toChars(linea));

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
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

Del mismo modo que pasaba con la lectura, es obligatorio cerrar el flujo al terminar cualquier operación

Ejemplos:
1. Crea un programa que pida por consola los siguientes datos: nombre, apellido, edad. Tras pedir el último dato lo escribirá en un fichero llamado usuarios.txt (se creara si no existe en la raíz del proyecto). El programa seguirá pidiendo datos hasta que no se pare la ejecución


#### Lectura y escritura de bytes en ficheros

Para la lectura y escritura de bytes el proceso es muy parecido. Una de las primeras diferencias que encontramos es la necesidad de tener un objeto de tipo FileStream, que depende de un objeto de tipo File

````
File f = new File ("src/documentos/ejemplo.txt);
FileInputStream fis = new FileInputStream(f);
````

Este flujo deberá ser cerrado cada vez que se termine la acción que se lleva a cabo

````
fis.close();
````

##### Lectura
Para la lectura se utiliza el objeto de tipo FileInputStream y el método read
````
FileInputStream fis = new FileInputStream(f);
int caracteres;
byte[] caracterByte = new byte[1];
while ((caracteres = fis.read(caracterByte)) != -1) {
	//devolución byte combertido a coódigo ASCII
	System.out.println((char) caracteres);
	System.out.println(new String(caracterByte));
}
fis.close();
````

Hay que tener en cuenta que este método me devuelve el valor numérico correspondiente, el cual hay que pasar a byte y a String consecutivamente para poder leer el contenido de forma comprensible

##### Escritura

Para la escritura se utiliza el objeto de tipo FileOutputStream y el método write. Para poder utilizar este método hay que pasarle una cadena de bytes, por lo que habrá que convertir el objeto a guardar en bytes

````
FileOutputStream fos = new FileOutputStream(f);
String texto = "ejemplo de texto a guardar codificado en bytes";
byte[] caracterByte = texto.getBytes();
System.out.println(caracterByte);
fos.write(caracterByte);
fos.close();

````

**Al trabajar todo el rato en bytes y tener que convertir de forma manual los datos, este proceso resulta bastante tedioso. Para poder mejorar el flujo de datos se utiliza la clase DataStream, la cual escribe bytes y lee el byte traduciéndolo a su tipo correspondiente**

#### Lectura y escritura con flujo de datos

Del mismo modo que se ha utilizado antes las clase de FileWriter / Reader BufferedWriter / Reader para poder trabajar con un fichero leyendo y/o escribiendo caracteres en texto plano, también existe la posibilidad de escribir y/o leer datos en tipos primitivos concretos. En los casos anteriores si se quería escribir el número 1 se escribía como un carácter, del mismo modo que si se recuperaba. En el segundo caso si se quería tratar como un número había que realizar un casteo al dato al que se quería pasar.
````
FileWriter writer = new FileWriter(f);
BufferedWriter bufferedWriter = new BufferedWriter(writer);
bufferedWriter.write(boolean);
````
````
FileReader reader = new FileReader(f);
BufferedReader bufferedReader = new BufferedReader(reader);
int numero  = Integer.parseInt(bufferedReader.readLine());
````

En muchas ocasiones esto no es muy práctico, ya que se necesita tanto guardad datos en un tipo concreto como recuperarlos en su tipo correspondiente. Para poder hacer esto se utiliza un flujo de streams que utiliza bytes tanto los fileinputstream (output) como los data input que se explican a continuación.


#### DataInput y DataOutput

Las clases DataInputStream y DataOutputStream permiten procesar ficheros binarios secuenciales de tipos básicos.Tanto la entrada como la salida tienen dependencias de los explicado en los puntos anteriores (FileStream y FileInput / FileOutput). Este tipo de flujos permiten guardad datos primitivos como tal, al mismo tiempo que recuperarlos de la misma forma.

##### DataInput

La clase DataInputStream permite leer registros, campo a campo, de ficheros binarios de tipos básicos.

````
DataInputStream fe = new DataInputStream(new FileInputStream(new File("src/ejemplo.bin")));
````

Los métodos que se pueden utilizar para la lectura son:
````
a = fe.readUTF();
a = fe.readChar();
a = fe.readBoolean();
a = fe.readByte();
a = fe.readShort();
a = fe.readInt();
a = fe.readLong();
a = fe.readFloat();
a = fe.readDouble();
a = fe.readLine();
````

##### DataOutput

La clase DataOutputStream permite escribir registros de ficheros binarios de tipos básicos.

````
DataOutputStream fs = new DataOutputStream(new FileOutputStream(new File("src/ejemplo.bin")));
````

Los métodos más utilizados para la escritura son:

````
DataOutputStream dos = new DataOutputStream(new FileOutputStream(f));
dos.writeChars("Ejemplo de escritura");
dos.writeChar('\n');
dos.writeInt(100);
````

Del mismo modo que se han escrito char o int se puede escribir cualquier tipo indicándolo en el método writeXXX();

**En todos los casos expuestos en el trabajo con ficheros, es necesario la captura de excepciones por la posibilidad de no existencia de los ficheros, errores de I/O, etc...**

#### Trabajando con objetos: ObjectStream

Las clases ObjectInputStream y ObjectOutputStream permiten procesar ficheros binarios secuenciales de objetos. La extensión del fichero deberá ser .obj

Antes de poder realizar la escritura y la lectura de elementos de tipo objeto, hay que tener en cuenta que los objetos leídos y/o escritos deben de ser de tipo Serializable. Para poder cumplir esto simplemente hay que implementar dicha interfaz, lo que permite utilizar el polimorfismo.

La implementación sería de la siguiente forma. Para un objeto de tipo Usuario que tiene varios atributos y que se quiere guardar en un fichero sería de la siguiente forma: 

````
import java.io.Serializable;

public class Usuario implements Serializable {

    private String nombre, apellido;
    private int telefono;

    public Usuario(String nombre, String apellido, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
````


##### ObjectInput
La clase ObjectInputStream permite leer registros de tipo un objeto. Hay que tener en cuenta que para poder guardar / leer un objeto este debe ser serializado (implementar la interfaz serializable) de forma que sea procesado por partes.

````
ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
Object o = ois.readObject();
for (Producto p: (ArrayList<Producto>)o
) {
	System.out.println(p.getNombre());
}
ois.close();
````

##### ObjectOutput

Para la escritura se utiliza un objeto de tipo ObjectOutStream con el método writeXXX y el tipo concreto. En este caso existe la posibilidad de ejecutar el método writeObject(), teniendo en cuenta que el objeto que se quiera escribir haya implementado la interfaz serializable

````
ArrayList<Producto> listaProductos = new ArrayList<Producto>();
listaProductos.add(new Producto("Nombre1", "Descripcion1", 12));
listaProductos.add(new Producto("Nombre2", "Descripcion2", 23));
listaProductos.add(new Producto("Nombre3", "Descripcion3", 43));
listaProductos.add(new Producto("Nombre4", "Descripcion4", 62));
listaProductos.add(new Producto("Nombre5", "Descripcion5", 145));
try {
	ObjectOutputStream oos = new ObjectOutputStream(new 	FileOutputStream(f));
	oos.writeObject(listaProductos);
	oos.close();
} catch (IOException e) {
	e.printStackTrace();
}
````

Cuando se intentan escribir objetos de tipo lista que apunta a otros objetos, estos también necesitan implementar la interfaz serializable: Por ejemplo si se tiene una clase que representa un Usuario:

````
import java.io.Serializable;

public class Usuario implements Serializable {

    private String nombre, apellido, dni;
    private int telefono;


    public Usuario(String nombre, String apellido, String dni, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String mostrarDatos(){
        return String.format("nombre: %s, apellidos: %s, teléfono: %d %n", getNombre(), getApellido(), getTelefono());
    }
}
````
 
Y un fichero que representa el conjunto de todos los usuarios, guardados en un ArrayList

````
package github.flujodatos.utils;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String nombre, apellido, dni;
    private int telefono;


    public Usuario(String nombre, String apellido, String dni, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String mostrarDatos(){
        return String.format("nombre: %s, apellidos: %s, teléfono: %d %n", getNombre(), getApellido(), getTelefono());
    }
}
````

Y un fichero entrada donde se esciben los datos

````
package github.flujodatos.utils;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Agenda implements Serializable {

    private ArrayList<Usuario> usuarios;

    public Agenda() {
        usuarios = new ArrayList();
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void agregarUsuario(Usuario usuario) {

        Object[] existe = existeUsuario(usuario.getDni());
        if ((boolean) existe[0]) {
            System.out.println("el usuario ya existe");
        } else {
            usuarios.add(usuario);
        }
    }

    public void borrarUsuario(String dni) {
        Object[] existe = existeUsuario(dni);
        if ((boolean) existe[0]) {
            System.out.println("el usuario ya existe");
            usuarios.remove((int) existe[1]);
        } else {
            System.out.println("este usuario no existe");
        }
    }

    public void listarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.print(usuario.mostrarDatos());
        }
    }

    private Object[] existeUsuario(String dni) {

        int i = 0;


        for (Usuario usuario : usuarios) {
            if (usuario.getDni().equals(dni)) {
                return new Object[]{true, i};
            }
            i++;
        }

        return new Object[]{false, i};

    }

    public void exportarAgenda(File f) {
        ObjectOutputStream oos;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(f));
            oos.writeObject(usuarios);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void importarAgenda(File f) {
        ObjectInputStream ois;
        try {
            ois = new ObjectInputStream(new FileInputStream(f));
            usuarios = (ArrayList<Usuario>) ois.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

````

Este fichero representa todos los mecanismos para poder agregar/eliminar elementos al arraylist así como cualquier manipulación de los datos, como por ejemplo escribirlos/leerlos a un fichero

Por último el fichero que representa la entrada. En este ejemplo se cumprueba si el fichero de los datos existe, y en caso de ser positivo los importa al sistema para que se pueda funcionar con datos desde el inicio. Del mismo modo, cuando se termina la ejecución del programa se exportan todos los datos del sistema

````
import java.io.*;

public class Entrada {

    public static void main(String[] args) {

        File f = new File("src/github/flujodatos/documentos/agenda.obj");
        Agenda a = new Agenda();

        if (f.exists()){
            a.importarAgenda(f);
        }

        if (a.getUsuarios().size()>0){
            a.listarUsuarios();
        }else{
            System.out.println("la agenda está vacía");
        }

        a.agregarUsuario(new Usuario("Jose","Martin Perez","000000A",1111111));
        a.agregarUsuario(new Usuario("Pedro","Lopez Merino","000000B",2222222));
        a.agregarUsuario(new Usuario("Luis","Herrera Gomez","000000B",2222222));
        a.borrarUsuario("000000C");
        a.borrarUsuario("000000B");
        a.listarUsuarios();
        a.exportarAgenda(f);
    }
}
````


#### Ficheros aleatorios

Hasta este punto se ha trabajado con ficheros secuenciales (aquellos que deben ser leídos en orden). Java permite la creación de ficheros de acceso aleatorio que permite el acceso para escritura o lectura en un punto determinado. 

#### RandomAccessFile

La clase RandomAccessFile permite procesar ficheros binarios con acceso directo de tipos básicos u objetos. La extensión del fichero deberá ser .raf

````
RandomAccessFile f = new RandomAccessFile(new File(src/ejemplo.raf),"r");
````

La r del constructor hace referencia al tipo de apertura (lectura). Las posibilidades son rw

Los métodos más utilizados son:
````
// Cerrar un fichero abierto en modo lectura o escritura:
f.close();
// Obtener la posición actual del fichero:
pos = f.getFilePointer();  //pos es de tipo long
// Obtener la longitud del fichero:
lon = f.length();  //lon es de tipo long
// Posicionarse al principio del fichero:
f.seek(0);
// Posicionarse al final del fichero:
f.seek(f.length());
// Posicionarse a “pos” bytes del principio:
f.seek(pos);
//Leer el siguiente campo del registro (“a” sería de tipo “String”, 
//“char”, “boolean”, “byte”, “short”, “int”, “long”, “float”,
//“double” y de nuevo un “String”):
a = f.readUTF().trim();
a = f.readChar();
a = f.readBoolean();
a = f.readByte();
a = f.readShort();
a = f.readInt();
a = f.readLong();
a = f.readFloat();
a = f.readDouble();
a = f.readLine();
// Grabar el siguiente campo del registro (“a” sería de tipo
//“String”, “char”, “boolean”, “byte”, “short”, “int”, “long”, 
//“float” y “double”):
f.writeUTF(a);
f.writeChar(a);
f.writeBoolean(a);
f.writeByte(a);
f.writeShort(a);
f.writeInt(a);
f.writeLong(a);
f.writeFloat(a);
f.writeDouble(a);
````

### Apache POI

Apache POI representa una librería para el trabajo con documentos del paquete office. Se trata de una librería oficial, por lo cual tiene soporte por parte de apache al igual que un API donde se pueden consultar los usos de cada uno de sus elementos. Para poder descargarlo se puede hacer directamente desde este link, seleccionado los binarios. Dentro de la carpeta que se descarga se encuentra el fichero poi-4.1.2.jar el cual representa la librería que se va a utilizar, para lo cual se necesita importarla dentro del proyecto, siguiendo los pasos:

1. Seleccionar Mení File --> Project Structure
2. Seleccionar la opción Libraries
3. Seleccionar el icono del + --> New Java Library --> seleccionar la ubicación del fichero  poi-4.1.2.jar
4. Pulsar en Apply y aceptar. 

Se debe realizar el mismo proceso con los siguientes archivos, ya que existen dependencias entre ellos: common-compress, common-collections, common-math, xmlbeans cuyos links de adjuntan

- https://commons.apache.org/proper/commons-compress/download_compress.cgi
- http://commons.apache.org/proper/commons-collections/download_collections.cgi
- https://mvnrepository.com/artifact/org.apache.commons/commons-math3/3.6.1
- https://xmlbeans.apache.org/download/

Para comprobar que todo ha funcionado de forma correcta, se puede seleccionar en la carpeta External Libraries del proyecto y debería de aparecer. Con esto el proyecto queda preparado para poder trabajar con ficheros office. Todo lo visto anteriormente es la base del uso de los ficheros office, ya que todo parte de un objeto de tipo File y un objeto de tipo FileInputStream o FileOutputStream, ya que se forma un flujo de datos de entrada o salida

#### Ficheros xls

Para poder trabajar con ficheros de tipo excel lo que hay que tener en cuenta es el uso de los siguientes objetos teniendo en cuenta que la dependencia es en vertical, es decir el siguiente depende de la existencia del anterior:

````
File archivo = new File("/src/archivos/fichero.xls")
FileInputStream fileInputStream =  new FileInputStream(f);
````

- HSSFWorkbook / XSSFWorkbook (xls / xls): representa el fichero xls con el que se quiere trabajar

````
HSSFWorkbook archivoExcel = new HSSFWorkbook(fileInputStream);
````


- HSSFSheet / XSSFSheet: representa cada una de las hojas que forman el fichero excel

````
XSSFSheet hojaFichero = archivoExcel.getSheetAt(0);
````

- HSSFRow / XSSFRow: representa cada una de las filas que forman las hojas del fichero excel

````
XSSFRow filaFichero = hojaFichero.getRow(0);
````

- HSSFCell / XSSFCell: representa cada una de las celdas que forman cada una de las filas de un fichero excel

````
XSSFCell celdaFichero = filaFichero.getCell(0);
````

Con estos conceptos generales se pueden hacer diferentes cosas. Para este ejemplo se creará una clase adicional que tendrá un método por acción:

##### Lectura de ficheros

1. Para poder leer un fichero se necesita primero el objeto de tipo FileInputStream y el XSSFWorkbook asociado.

````
public class TrabajoExcel {

    public void leerFicheroExcel(File f){
        FileInputStream fileInputStream = null;
        XSSFWorkbook archivoExcel = null;
        
        try {
            fileInputStream= new FileInputStream(f);
            archivoExcel = new XSSFWorkbook(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
````

*Dentro de este objeto, un método bastante útil es getNumberOfSheets()(), el cual devuelve el número de la hojas en un fichero. Con ella se podría recorrer todas las hojas*
2. Ua vez se tiene esto lo que se crea es un objeto de tipo XSSFSheet, la cual representa de una de las horas del archivo de excel. Para poder crear el objeto se apunta a la hoja mediante una posición (la cual empieza en 0) o mediante el nombre de la misma

````
XSSFSheet hojaExcel = archivoExcel.getSheetAt(0);
XSSFSheet hojaExcel = archivoExcel.getSheet("usuarios");
````

En el ejemplo se utilizará la creación mediante la posición

````
public class TrabajoExcel {

    public void leerFicheroExcel(File f){
        FileInputStream fileInputStream = null;
        XSSFWorkbook archivoExcel = null;
        XSSFSheet hojaExcel = null;

        try {
            fileInputStream= new FileInputStream(f);
            archivoExcel = new XSSFWorkbook(fileInputStream);
            hojaExcel = archivoExcel.getSheetAt(0);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
````

*Dentro de este objeto, un método bastante útil es getLastRowNum(), el cual devuelve el número de la última fila escrita. Con ella se podría recorrer todas las filas.*


3. Con la hoja creada se obtiene una fila. Para ello se utiliza un objeto de tipo XSSFRow

````
XSSFRow filaExcel = hojaExcel.getRow(0);
````

En el ejemplo sería

````
public class TrabajoExcel {

    public void leerFicheroExcel(File f){
        FileInputStream fileInputStream = null;
        XSSFWorkbook archivoExcel = null;
        XSSFSheet hojaExcel = null;
        XSSFRow filaExcel = null;

        try {
            fileInputStream= new FileInputStream(f);
            archivoExcel = new XSSFWorkbook(fileInputStream);
            hojaExcel = archivoExcel.getSheetAt(0);
            filaExcel = hojaExcel.getRow(0);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
````

4. Por último para poder leer el contenido de la fila se necesita un objeto de tipo XSSFCell, pasa lo cual se utiliza

````
XSSFCell celda = filaExcel.getCell(0);
````
Y leer su contenido

````
celda.getStringCellValue()
````
Hay que tener en cuenta que dependiendo de contenido de la celda se leerá con un método u otro
````
celda.getNumericCellValue();
````

Por ello es importante antes de hacer la lectura evaluar el tipo de dato

````
if (celda.getCellType() == CellType.STRING) {
	System.out.println(celda.getStringCellValue());
}
````

En el ejemplo

````
package github.office;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;

public class TrabajoExcel {

    public void leerFicheroExcel(File f) {
        FileInputStream fileInputStream = null;
        XSSFWorkbook archivoExcel = null;
        XSSFSheet hojaExcel = null;
        XSSFRow filaExcel = null;
        XSSFCell celda = null;

        try {
            fileInputStream = new FileInputStream(f);
            archivoExcel = new XSSFWorkbook(fileInputStream);
            hojaExcel = archivoExcel.getSheetAt(0);
            filaExcel = hojaExcel.getRow(0);
            celda = filaExcel.getCell(0);
            if (celda.getCellType() == CellType.STRING) {
                System.out.println(celda.getStringCellValue());
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void leerContenidoCompleto(File file) {
        FileInputStream ficheroInput = null;
        XSSFWorkbook ficheroExcel = null;
        XSSFSheet hojaExcel = null;
        XSSFRow fileExcel = null;
        XSSFCell celadaExcel = null;

        try {
            ficheroInput = new FileInputStream(file);
            ficheroExcel = new XSSFWorkbook(ficheroInput);

            Iterator<Sheet> hojaIterator = ficheroExcel.iterator();
            while (hojaIterator.hasNext()) {
                Sheet hoja = hojaIterator.next();
                Iterator<Row> filaIterator = hoja.iterator();
                while (filaIterator.hasNext()) {
                    Row fila = filaIterator.next();
                    Iterator<Cell> celdaIterator = fila.cellIterator();
                    while (celdaIterator.hasNext()) {
                        Cell celda = celdaIterator.next();
                        if (celda.getCellType() == CellType.NUMERIC) {
                            System.out.println(celda.getNumericCellValue());
                        } else if (celda.getCellType() == CellType.STRING) {
                            System.out.println(celda.getStringCellValue());
                        }
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
````


**Leer todo el contenido de un fichero**

Para poder leer el contenido completo de un fichero no es válido el método de antes, ya que habría que ir uno a uno modificando los elementos, o bien utilizando un for con los valores que obtienen los métodos getNumberOfSheets() y getLastRowNum(). La forma más correcta de hacerlo es mediante un objeto de tipo Iterator (igual que se recorría un HastTable). Para ello se utilizan objetos de tipo Sheet, Row y Cell que representan cada uno de los objetos antes vistos

Al mismo tiempo, cuando se evalúa el contenido de una celda hay que tener en cuenta el tipo de dato que tiene en su interior para poder obtenerlo de forma correcta

````
package github.office;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Iterator;

public class TrabajoExcel {

    public void leerFicheroExcel(File f) {
        FileInputStream fileInputStream = null;
        XSSFWorkbook archivoExcel = null;
        XSSFSheet hojaExcel = null;
        XSSFRow filaExcel = null;
        XSSFCell celda = null;

        try {
            fileInputStream = new FileInputStream(f);
            archivoExcel = new XSSFWorkbook(fileInputStream);
            hojaExcel = archivoExcel.getSheetAt(0);
            filaExcel = hojaExcel.getRow(0);
            celda = filaExcel.getCell(0);
            if (celda.getCellType() == CellType.STRING) {
                System.out.println(celda.getStringCellValue());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                archivoExcel.close();
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void leerContenidoCompleto(File file) {
        FileInputStream ficheroInput = null;
        XSSFWorkbook ficheroExcel = null;
        XSSFSheet hojaExcel = null;
        XSSFRow fileExcel = null;
        XSSFCell celadaExcel = null;

        try {
            ficheroInput = new FileInputStream(file);
            ficheroExcel = new XSSFWorkbook(ficheroInput);

            Iterator<Sheet> hojaIterator = ficheroExcel.iterator();
            while (hojaIterator.hasNext()) {
                Sheet hoja = hojaIterator.next();
                Iterator<Row> filaIterator = hoja.iterator();
                while (filaIterator.hasNext()) {
                    Row fila = filaIterator.next();
                    Iterator<Cell> celdaIterator = fila.cellIterator();
                    while (celdaIterator.hasNext()) {
                        Cell celda = celdaIterator.next();
                        if (celda.getCellType() == CellType.NUMERIC) {
                            System.out.println(celda.getNumericCellValue());
                        } else if (celda.getCellType() == CellType.STRING) {
                            System.out.println(celda.getStringCellValue());
                        }
                    }
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ficheroExcel.close();
                ficheroInput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
````

##### Escritura de ficheros

La forma de trabajar es la misma que en el caso anterior, con la diferencia que en vez de obtener los objetos de tipo sheet, row y cell estos se crean mediante código. Para el ejemplo se contará con un fichero xlsx

1. Crear el fichero 
````
    public void escribirFichero(){
        XSSFWorkbook ficheroExcel = null;
        ficheroExcel = new XSSFWorkbook();
    }

````


2. Crear la hoja

````
// también existe la posibilidad de crear la hoja con un nombre en el constructor
HSSFSheet hoja = ficheroExcel.createSheet();
````

En el ejemplo

````
    public void escribirFichero(){
        XSSFWorkbook ficheroExcel = null;
        ficheroExcel = new XSSFWorkbook();
        XSSFSheet hoja = ficheroExcel.createSheet();
    }
````

3. Crear la fila indicando la posición 

````
XSSFRow fila = hoja.createRow(0);

````

En el ejemplo 
````
    public void escribirFichero(){
        XSSFWorkbook ficheroExcel = null;
        ficheroExcel = new XSSFWorkbook();
        XSSFSheet hoja = ficheroExcel.createSheet();
        XSSFRow fila = hoja.createRow(0);
    }
````


4. Crear la celda  indicando la posición de la columna y escribirla   

````
XSSFCell celda = fila.createCell(0);
// también se puede indicar el tipo de dato que va a guardar
XSSFCell celdaTipo = fila.createCell(1, CellType.NUMERIC);
````

Para poder escribirla se utiliza el método setCellValue(), por lo que es necesario un objeto del tipo correspondiente

````
celda.setCellValue("Ejemplo");
celdaTipo.setCellValue(1);
````

En el ejemplo

````
    public void escribirFichero(){
        XSSFWorkbook ficheroExcel = null;
        ficheroExcel = new XSSFWorkbook();
        XSSFSheet hoja = ficheroExcel.createSheet();
        XSSFRow fila = hoja.createRow(0);
        XSSFCell celda = fila.createCell(0);
        XSSFCell celdaTipo = fila.createCell(1, CellType.NUMERIC);
        celda.setCellValue("Ejemplo");
        celdaTipo.setCellValue(1);
    }
````



5. Escribir el archivo excel en la ruta indicada
````
FileOutputStream fileOutput = new FileOutputStream("src/github/office/documentos/archivo_creado.xlsx");
ficheroExcell.write(fileOutput);
````

En el ejemplo 
````
 public void escribirFichero(){

        XSSFWorkbook ficheroExcel = null;
        ficheroExcel = new XSSFWorkbook();
        XSSFSheet hoja = ficheroExcel.createSheet();
        XSSFRow fila = hoja.createRow(0);
        XSSFCell celda = fila.createCell(0);
        Cell celdaTipo = fila.createCell(1, CellType.NUMERIC);
        celda.setCellValue("Ejemplo");
        celdaTipo.setCellValue(1);
        try {
            FileOutputStream fileOutput = new FileOutputStream("src/github/office/documentos/archivo_creado.xlsx");
            ficheroExcel.write(fileOut);
            fileOutput.close();
            ficheroExcel.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
````

**Escribir todo el contenido de una lista**

Para poder escribir el contenido de una lista completa en un fichero lo necesario es recorrer la lista y por cada recorrido crear una fila nueva. PAra el ejemplo se utilizará un objeto de tipo usuario

````
public class Usuario {
    
    private String nombre, apellido, telefono;

    public Usuario(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}

````

````
    public void escribirListaCompleta(){

        XSSFWorkbook ficheroExcel = new XSSFWorkbook();
        XSSFSheet hoja = ficheroExcel.createSheet("usuarios");
        XSSFRow fila = hoja.createRow(0);
        XSSFCell celda;
        int numFilas=0;
        ArrayList<Usuario> lista = getUsuarios();
        String[]cabeceras = new String[]{"Nombre","Apellido","Télefono"};

        for (int i=0;i<cabeceras.length;i++){
            celda = fila.createCell(i);
            celda.setCellValue(cabeceras[i]);
        }
        numFilas++;

        for (Usuario u:lista) {
            int numPosicionCelda = 1;
            fila = hoja.createRow(numFilas);
            celda = fila.createCell(numPosicionCelda);
            celda.setCellValue(u.getNombre());
            celda = fila.createCell(numPosicionCelda++);
            celda.setCellValue(u.getApellido());
            celda = fila.createCell(numPosicionCelda++, CellType.NUMERIC);
            celda.setCellValue(u.getTelefono());
            numFilas++;
        }

        try {
            FileOutputStream fileOutput = new FileOutputStream("src/github/office/documentos/archivo_listado.xlsx");
            ficheroExcel.write(fileOutput);
            fileOutput.close();
            ficheroExcel.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
````

#### Ficheros docx

El trabajo con archivos word es muy similar al proceso anterior, con la única diferencia que los objetos con los que trabaja cambian de definición. Para este caso los objetos que se utilizarán son:

- XWPFDocument: representa el documento de tipo word con el que se quiere trabajar


````
XWPFDocument documento = new XWPFDocument();
````


- XWPFParagraph: representa el párrafo del documento con el que se quiere trabajar. Un párrafo se diferencia del siguiente cuando hay un salto de linea

````
XWPFParagraph parrafo_doc = documento.createParagraph();
````

- XWPFRun: representa el objeto final con el que se escribe en el párrafo

````
XWPFRun run = parrafo_doc.createRun();
````

##### Lectura de ficheros

1. Para poder leer un fichero se necesita primero el objeto de tipo FileInputStream y el XWPFDocument asociado.

````
public class TrabajoWord {


    public void leerWord(File f){
        FileInputStream fis = null;
        XWPFDocument documentoWord = null;
        try {
            fis = new FileInputStream(f);
            documentoWord = new XWPFDocument(fis);
           
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
````

2. Ua vez se tiene esto lo que se crea es un objeto de tipo XWPFParagraph. Lo mas sencillo es leer todos los párrafos de golpe e ir leyéndolos uno a uno mediante un foreach

````
    public void leerWord(File f){
        FileInputStream fis = null;
        XWPFDocument documentoWord = null;
        try {
            fis = new FileInputStream(f);
            documentoWord = new XWPFDocument(fis);
            List<XWPFParagraph> parrafos = documentoWord.getParagraphs();
            for (XWPFParagraph paragraph :parrafos) {
                System.out.println(paragraph.getText());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
````

*Dentro de este objeto, un método bastante útil es getLastRowNum(), el cual devuelve el número de la última fila escrita. Con ella se podría recorrer todas las filas.*


3. Una vez se han leído todos los párrafos se procede a cerrar el fichero y el flujo de los datos

````

    public void leerWord(File f){
        FileInputStream fis = null;
        XWPFDocument documentoWord = null;
        try {
            fis = new FileInputStream(f);
            documentoWord = new XWPFDocument(fis);
            List<XWPFParagraph> parrafos = documentoWord.getParagraphs();
            for (XWPFParagraph paragraph :parrafos) {
                System.out.println(paragraph.getText());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fis.close();
                documentoWord.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

````

##### Escritura del fichero

1. Se crea un objeto de tipo XWPFDocument

````
    public void escribirWord(File f) throws IOException {
        XWPFDocument documento  = null;
        try {
            documento = new XWPFDocument();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        
    }
````

2. Se crea un objeto de tipo XWPFParagraph partiendo del documento creado anteriormente
````
    public void escribirWord(File f) throws IOException {
        XWPFDocument documento  = null;
        try {
            documento = new XWPFDocument();
            XWPFParagraph titulo_doc = documento.createParagraph();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
````

3. Se crea un objeto de tipo partiendo del párrafo creado anteriormente
````
    public void escribirWord(File f) throws IOException {
        XWPFDocument documento  = null;
        try {
            documento = new XWPFDocument();
            XWPFParagraph titulo_doc = documento.createParagraph();
            XWPFRun run = titulo_doc.createRun();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
````

4. Se escribe el texto y las propiedades partiendo del objeto de tipo XWPFRun mediante el método setXXX()
````
    public void escribirWord(File f) throws IOException {
        XWPFDocument documento  = null;
        try {
            documento = new XWPFDocument();
            XWPFParagraph titulo_doc = documento.createParagraph();
            XWPFRun run = titulo_doc.createRun();
            run.setText("Ejemplo de escritura en word")
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
````
 5. Como último paso se procede a crear un flujo de salida, escribir el documento en el flujo creado y cerrar los elementos
````
    public void escribirWord(File f) throws IOException {
        XWPFDocument documento = null;
        FileOutputStream fos = null;
        try {
            documento = new XWPFDocument();
            XWPFParagraph titulo_doc = documento.createParagraph();
            XWPFRun run = titulo_doc.createRun();
            run.setText("Ejemplo de escritura en word");

            fos = new FileOutputStream(f);
            documento.write(fos);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
                documento.close();
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }
````
