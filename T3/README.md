<a name="indice"></a>
- Uso de estructuras de control:
    - Estructuras de selección.
    - Estructuras de repetición
    - Estructuras de salto.

#### Estructuras de selección
****

Cuando un programa llega a una parte de ejecución donde hay dos o mas alternativas de acción y solo una de estas tendrá lugar, se ejecuta mediante una estructura de selección. En java existen principalmente dos estructuras de selección: if y switch

##### if
***

Estructura que ejecutará el bloque de código que cumpla con la condición a evaluar. La sintaxis de la estructura es la siguiente.

````
if (condición){
    //sentencias a ejecutar
}
else{
    //sentencias a ejecutar si no se cumple la condición anterior
}
````

````
public class ControlDeFlujo {
    
    int nota;
    public void estructuraIfBasica(){
        nota = 7;
        if (nota <5){
            System.out.println("El examen está suspenso");
        }
        else{
            System.out.println("El examen está aprobado");
        }
    }
    
    public static void main(String[]args){
        ControlDeFlujo control = new ControlDeFlujo();
        control.estructuraIfBasica();
    }  
}
````
Adicionalmente se puede construid un bloque if con condiciones alternativas, donde se evaluará cada condición si la anterior no se ha cumplido. Si ninguna de las anteriores se ha cumplido se ejecutará las sentencias escritas en el bloque del else. Modificando el ejemplo anterior una posibilidad sería

````
public class ControlDeFlujo {
    
    int nota;
      
    public void estructuraIfAlternativa(){
        nota = 7;
        if (nota <5){
            System.out.println("El examen está suspenso");
        }
        else if (nota == 5){
            System.out.println("El examen se ha aprobado justo");
        }
        else if (nota <9){
            System.out.println("El examen se ha aprobado con buena nota");
        }
        else if (nota ==9){
            System.out.println("El examen se ha aprobado con muy buena nota");
        }
        else{
            System.out.println("El examen está perfecto");
        }
    }
    
    public static void main(String[]args){
        ControlDeFlujo control = new ControlDeFlujo();
        control.estructuraIfAlternativa();
    } 
}
````

##### switch
***

La sentencias switch evalúa un valor de entrada para ejecutar un caso concreto. De la misma forma que la sentencia anterior, también hay una salida en el caso de no cumplirse ninguna de los valores expuestos. Es recomendable utilizar este tipo de estructura si se deben poner más de dos casos alternativos en la estructura if else. La sintaxis de la estructura es la siguiente:

````
switch(evaluar){
   case opcion1:
   break

   case opcion2:
   break

   default:
   break
}
````
````
public class ControlDeFlujo {

    int nota;

    public void estructuraSwitch() {
        nota = 8;
        switch (nota) {
            case 1:
                System.out.println("La note obtenida es un 1");
                break;
            case 5:
                System.out.println("La nota obtenida es un 5");
                break;
            case 10:
                System.out.println("La nota obtenida es un 10");
                break;
            default:
                System.out.println("La nota obtenida no está contemplada en este bloque");
                break;
        }
    }

    public static void main(String[] args) {
        ControlDeFlujo control = new ControlDeFlujo();
        control.estructuraSwitch();
    }
}
````

En el estamento switch no es obligatorio el caso default, pero si recomendable para que se ejecute una parte de código siempre y cuando la entrada no esté contemplada en el bloque

#### Estructuras de repetición
****
