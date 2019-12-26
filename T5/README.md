- Introducción a la orientación a objetos
    - Principios básicos de la orientación a objetos.
    - Clases. Atributos, métodos y visibilidad
    - Objetos. Estado, comportamiento e identidad. Mensajes.
    - Encapsulado. Visibilidad.
    - Relaciones entre clases.

### Introducción a la programación orientada a objetos

La programación orientada se trata de un paradigma que permite el desarrollo de programas informáticos de manteniendo un código ordenado y manejable, de forma que sea mucho más sencillo el desarrollo. Este tipo de programación acerca mucho más los conceptos de la vida real a la forma en la que un programador lo debe trasmitir al ordenador la información. Hasta este punto toda la programación que se ha hecho ha sido una programación estructurada, donde las líneas de código se ejecutaban una tras otra tan solo saltando entre ellas cuando algún bloque de ejecución lo decía (if, while, switch). Con este tipo de programación nos podemos encontrar muchas limitaciones, como por ejemplo intentar ejecutar códigos completos para diferentes objetos primitivos.  Para poder entender el concepto de programación orientada a objetos se puede pensar en un videojuego, donde cada uno de los componentes que forman la pantalla es un objeto que tiene unas características diferentes y son capaces de interactuar entre ellos.

Para poder entender mejor el concepto, antes es necesario conocer los elementos que forma la programación orientada a objetos:

- **Paquetes**

Los paquetes son los contenedores que permiten organizar cada una de las clases que se crean en un programa. Normalmente se suelen utilizar para hacer agrupaciones lógicas, donde cada una de las clases que pertenecen al mismo paquete tendrán una similitud en funcionamiento. Además la pertenencia o no al mismo paquete podrá marcar el acceso a la clase, dependiendo de la visibilidad que sea configurada

- **Clases**

Se trata de archivos .java que representa una funcionalidad completa, un modelo para poder crear un tipo de datos completo. Hasta ahora se han utilizado datos primitivos (int, double, boolean) y algunos complejos (String, Object) pero estos son elementos que ya están creados en el lenguaje. En el caso de que nosotros necesitemos un tipo de dato concreto, se crea una clase que representará dicho tipo (en concreto representará un objeto). Pensad en la necesidad de tener un coche en código de programación, por lo que se necesitará crear un tipo *Coche* el cual podrá ser creado

````
// archivo coche.java

public class Coche {
    
}
````

- **Propiedades**

Las propiedades son todas aquellas características que los tipos que un programador crea (las clases). En el ejemplo anterior, el tipo *Coche* tendrá propiedades como *velocidad*, *bastidos*, *modelo*, etc...

````
public class Coche {

    int velocidad;
    String bastidor, modelo, marca;
}
````


- **Métodos**

Los métodos son todas las funcionalidades que los tipos que un programador crea (las clases) tienen. Estos métodos actúan sobre las propiedades de los mismos. En el ejemplo anterior, imaginad que el tipo *Coche* creado en el punto anterior necesita tener una acción que sea acelerar. Para ello se creará un método con el nombre *acelerarCoche* donde se define el comportamiento del *Coche* cuando se acelera

````
public class Coche {

    int velocidad;
    String bastidor, modelo, marca;

    public void acelerar(int velocidadAcelerar){
        velocidad = velocidad +velocidadAcelerar;
    }
    
    public void frenar(int velocidadFrenar){
        velocidad = velocidad -velocidadFrenar;
    }
    
}
````


- **Visibilidad**

La visibilidad de una clase, métodos y propiedades el el acceso que cada uno de los elementos tiene, desde donde podrán ser vistos. Más adelante se verá con detalle pero cada uno de los elementos podrán tener una visibilidad *public*, *protected*, *private*

- **Objetos**

Cuando se desarrolla una clase se dice que en realidad lo que se está haciendo es un modelo que puede ser utilizado en cualquier parte del código de programación. Para poder utilizar estas clases (con toda la funcionalidad que se define en su interior) es necesario implementar o crear un objeto de la propia clase. Digamos que la clase representa el molde y el objeto representa la clase llevada a la realizada (el concepto es instancia). Para poder crear un objeto (ya hemos utilizado simples y complejos) se utiliza la palabra ***new***

````
// crea un objeto de tipo teclado (por lo tanto existe una clase de tipo teclado)
Scanner teclado = new Scanner(System.in)
// crea un objeto de tipo String array
String[] arrayPalabras = new String[]
````

Hasta este punto hemos utilizado objetos de tipo primitivo como los int, float, etc... que no necesitan palabra new al ser datos muy simples, pero también en algunos casos se ha utilizado la palabra new para poder crear aquellos tipos complejos que nos permiten una funcionalidad un poco más avanzada (uso de sus métodos).

````
Scanner teclado = new Scanner(System.in);
teclado.nextInt();
````

Todos los datos complejos que hemos utilizado son tipos que ha están creados en el sistema, pero gracias al uso de las clases que se han definido al principio, nosotros podemos crear nuestros propios tipos para crear objetos. Imaginad que en el programa se necesita utilizar un tipo especial que represente un coche:

````
// archivo coche.java
public class Coche {

    String bastidor;
    int caballos, velocidad;
    
    public void acelerar(int v){
        this.velocidad = this.velocidad + v;
    }
    
    public void deceledad(int v){
        this.velocidad = this.velocidad - v;
    }
    
    public void reprogramar(int cv) {
        this.caballos = cv;
    }
}
````

Mediante esta clase ya se tiene la posibilidad de crear un objeto de tipo Coche desde partes del programa con el acceso a todas sus funcionalidades. Para poder utilizarlo hay que utilizar la palabra reservada new

````
public class Entrada {

    public static void main(String[] args) {
        Coche cocheUno = new Coche();
        cocheUno.acelerar(100);
        
        Coche cocheDos = new Coche();
        cocheDos.acelerar(50);
    }
}

````
Lo interesante de esto es que una vez se ha creado la clase (el molde para poder generar objetos), se podrán crear tantos objetos como se quiera teniendo la posibilidad de personalizarlos

--------

Esta metodología de programación no es exclusivo del ámbito informático, ya que si pensamos en cualquier aspecto de una cadena de montaje o proceso de producción nos encontramos con una forma muy similar de ejecutar las cosas. Suponer el ejemplo de un coche, donde cada elemento está compuesto por multitud de piezas que todas juntas hacen que el coche funcione correctamente. Es imposible tener un plano o diseño donde aparezcan todas y cada una de las piezas, sino que cada parte del coche tiene su propio plano donde a su vez se divide en muy pequeñas funcionalidades: motor, chasis, cableado, etc...

Una vez se han comprendido la funcionalidad de la orientación a objetos y los elementos que la hacen posible en java, es importante tener en cuenta los principales conceptos que hacen de la orientación a objetos un mecanismo muy potente a la hora de realizar un programa informático:  encapsulación, herencia y polimorfismo

### Encapsulación

Consiste en ocultar aquellos elementos que no se quieren mostrar cuando un objeto es utilizado, pero son necesarios para el funcionamiento de este. Si volvemos al ejemplo de la fabricación de un coche, un conductor no necesita saber como funciona la caja de cambio o el motor, simplemente lo utiliza sin necesidad de conocer su funcionamiento al detalle. En informática pasa exactamente lo mismo; en un programa informático se utilizarán objetos que no es necesario que quién lo esté utilizando sepa con exactitud su funcionamiento. 

### Herencia

En el lenguaje de programación Java se permite la creación de clases a través de clases ya existentes, cogiendo todos sus métodos - variables y haciéndolas propias de la clase. Este concepto es muy importante ya que de esta forma se puede realizar clases con muy poco código, siempre especializando clases superiores. Además esta característica del lenguaje permite utilizar el concepto de *polimorfismo*. Para poder utilizar la herencia se usa la palabra reservada extends

````
// archivo Coche.java
public class Coche {

    String bastidor;
    int caballos, velocidad;
    
    public void acelerar(int v){
        this.velocidad = this.velocidad + v;
    }
    
    public void deceledad(int v){
        this.velocidad = this.velocidad - v;
    }
    
    public void reprogramar(int cv) {
        this.caballos = cv;
    }
}
````
````
// archivo Deportivo.java
public class Deportivo extends Coche{
    
    int par;
    int cilindros;
    
    public void calcularParMotor(){
        par = (velocidad * cilindros)/2;
    }
}
````

Por defecto la clase Deportivo no tiene ninguna variable llamada velocidad, pero al haber extendido de Coche que si lo tiene, está disponible para la clase. 
Se suele decir que las clases que extienden de otras son especializaciones. En Java, todas las clases son subclases de la superase Object

### Polimorfismo

Este concepto va de la mano del visto en el punto anterior. Gracias a esta característica una clase puede ser utilizada con un tipo diferente dependiendo de las necesidades del programa. En el ejemplo anterior si se quería instancia un objeto de los tipos coche y deportivo se hacía de la siguiente forma 

````
Coche c = new Coche()
Deportivo d = new Deportivo()
````

Gracias a que la clase Deportivo ha extendido de coche, también podría valer la siguiente instancia
````
Coche d = new Deportivo
````

## Clases

Hasta ahora se han resuelto ejercicios en los que se han almacenado datos en variables de tipos básicos (o complejos si hablamos de String), y se han modificado dichos datos con métodos. Todas estas variables han sido llamadas desde una misma clase donde encontrábamos el método main. Por ejemplo, para leer un contacto se almacenaba en una variable de tipo cadena el nombre y en una de tipo entero, el teléfono. También necesitábamos métodos para leer nombres y teléfonos válidos, modificarlos y mostrarlos por consola. Si se quiere trabajar de esta forma se podrían solucionar muchos problemas, pero en el 100% de los casos nos encontraríamos con muchísimo código para hacer tareas demasiado simples. Para ello se utiliza el concepto de clase, que lo definimos como el tipo que un programador crea para poder utilizarlo en diferentes partes del programa. Estas clases son creadas en archivos separados y utilizadas en cualquier parte  (bien sea otras clases que representen otros tipos o directamente en la clase que tiene el método main). Por ejemplo, una clase sería un coche donde este tiene características (variables que cualifican) como color, marca, modelo ó cv y funcionalidades (métodos que dan funcionalidades) como acelerar, girar, frenar. 

![Clase coche UML](./images/cocheuml.jpg)

Para poder crear una clase se puede hacer directamente desde el la carpeta src, pero para mantener el código organizado (y así poder utilizar los modificadores de acceso que se explicarán) se utilizan los paquetes. Estos se crean organizando clases por funcionalidades por ejemplo. Una vez se ha creado un paquete, al inicio de todas las clases que pertenezcan al mismo aparecerá la palabra package 

````
package introduccion;

public class Coche {

    String bastidor;
    int caballos, velocidad;

    public void acelerar(int v){
        this.velocidad = this.velocidad + v;
    }

    public void deceledad(int v){
        this.velocidad = this.velocidad - v;
    }

    public void reprogramar(int cv) {
        this.caballos = cv;
    }
}

````

Una vez se crea un paquete, se puede crear una clase dentro. A la hora de declarar una clase se tienen los siguiente elementos:
````
Package nombre.paquete

public class NombreClase{

	// variables de clase: existirán en todo el cuerpo de la clase
	public nombreVariable;
	private otraVariable;
	protected otraVariableMas

	// métodos: funcionalidades que tendrá un objeto de la clase
	public void miMetodoUno(){
		// variable de método
	}
	private void miMetodoDos(){
		// variable de método
	}
	protected void miMetodoTres(){
		// variable de método
	}
	
}

````

Los modificadores de acceso de los elementos de la clase son:
- private → Sólo se puede acceder a ese miembro en clase donde se define. Es decir, el atributo “otraVariable” sólo puede ser referenciado en la clase donde ha sido creado
- protected → Sólo se puede acceder a ese miembro en la clase donde se define y en las clases que deriven de dicha clase (es decir aquellas que hayan extendido de la misma) o estén en el mismo paquete.
- public → Se puede acceder a ese miembro desde cualquier clase. Por ejemplo, los métodos “metodoUno()” y  la variable “nombreVariable” puede ser accedidos desde cualquier clase una vez que se haya creado un objeto de la clase.
- package → En caso de no poner nada sólo se puede acceder a ese miembro en la clase donde se define, y en las clases de su mismo paquete

Hay que tener en cuenta que las variables casi siempre debería ser *privadas*  de forma que no puedan ser accedidas de forma directa, tan solo mediante métodos que sean públicos (son los llamados getters y setters)

Ejercicio: crea una clase con la siguiente definición UML

![Clase persona UML](./images/personauml.jpg)

**Los métodos setter son aquellos que modifican el valor de la variable**. Para la definición de estos métodos se pide como argumento en el método el valor que se quiere asignar a la variable en cuestión

**Los métodos getter son aquellos que obtienen el valor de la variable**. Para la definición de estos métodos no se piden argumentos en el método y se retorna el valor que tiene asignado la variable en cuestión.