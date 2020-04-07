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

##### DataInput y DataOutput

Las clases DataInputStream y DataOutputStream permiten procesar ficheros binarios secuenciales de tipos básicos.Tanto la entrada como la salida tienen dependencias de los explicado en los puntos anteriores (FileStream y FileInput / FileOutput). Este tipo de flujos permiten guardad datos primitivos como tal, al mismo tiempo que recuperarlos de la misma forma.

###### DataInput

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

###### DataOutput

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
