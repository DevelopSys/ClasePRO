public class Ejercicio12 {

    public static void main(String[] args) {


        // 125

        int numero = 25;
        /*
        * incrementará en 2 unidades si es par
            en 3 unidades si es múltiplo de 3
            en 5 unidades si es múltiplo de 5
            en el caso de no cumplirse ninguna de las
            anteiores, se incrementará en una unidad.
        * */

        if (numero%2==0){
            numero+=2;
        } else if (numero%3==0) {
            numero+=3;
        } else if (numero%5==0) {
            numero+=5;
        } else {
            numero++;
        }

        System.out.println(numero);
    }
}
