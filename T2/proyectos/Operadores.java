/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author Profesor
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*String palabraUno = "HolA";
        String palabraDos = "Hola";
        boolean comparacion = palabraUno.equals(palabraDos);
        int comparacionDos = palabraUno.compareTo(palabraDos);

        boolean comparacionMin = palabraUno.toLowerCase().equals(palabraDos.toLowerCase());
        boolean comapacionDirecta = palabraUno.equalsIgnoreCase(palabraDos);
        
        System.out.println(comparacion);
        System.out.println(comparacionMin);*/
        
        int numeroUno = 10;
        int numeroDos = 100;
        
        boolean comparacion = numeroUno>0 && numeroDos<100; // true y false = false
        boolean comparacionCuatro = numeroUno<0 && numeroDos<101; // false y true = false
        boolean comparacionDos = numeroUno>0 && numeroDos<=100; // true y true = true
        boolean comparacionTres = numeroUno<0 && numeroDos>100; // false y false = false
        System.out.printf("La comparación entre números es: %b %n",comparacionCuatro);
        
        boolean compacionO = numeroUno>0 || numeroDos>100; // true y false = true
        boolean compacionODos = numeroUno<0 || numeroDos==100; // false y true = true
        boolean compacionOTres = numeroUno>0 || numeroDos==100; // true y true = true
        boolean compacionOCuatro = numeroUno<0 || numeroDos>100; // false y false = false

        System.out.printf("La comparación entre números es: %b %n",compacionO);
        
        int numeroCompararUno = 10;
        int numeroCompararDos = 20;
        String palabraUno = "Ejemplo";
        String palabraDos = "Otro Ejemplo";
        boolean comparacionMultiple = numeroCompararUno>numeroCompararDos 
                || palabraUno.equals(palabraDos);
        boolean comparacionMultipleDos = numeroCompararUno<numeroCompararDos 
                || palabraUno.equals(palabraDos) || numeroUno!= numeroDos;
        
        int n1=10,n2=20,n3=10;
        String p1="uno",p2="dos";
        boolean b1=true, b2=false;
        
        boolean salida = (((n1>0)&&(n2<5)&&(n3!=10))|| p1.equals(p2) ||b2 )&& b1;
                           //T   y  //F   y  //F   
                                    //F              o      //F      o  F  
                                                    //F                    y  //T
                                                            //F
        System.out.println(salida);
        
 
    }
    
}
