public class Repaso {

    public static void main(String[] args) {
        new Repaso().getLetrasPalabrasArray();
    }

    public void moverArray(){
        int[] aleatorios = new int[10];
        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = (int) (Math.random()*101);
        }

        // 1,2,3,4,5,6,7,6,5,4,3;
        for (int i = 0; i < aleatorios.length; i++) {
            int aux = aleatorios[i];
            aleatorios[i]= aleatorios[i+1];
            if (aleatorios[i] >= aleatorios[aleatorios.length-1-i]){

            }
        }
    }

    public void rellenarArray(){
        int[] aleatorios = new int[10];
        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = (int) (Math.random()*101);
        }
    }

    public void getPosicionesArray(){
        int[] aleatorios = new int[10];
        for (int i = 0; i < aleatorios.length; i++) {
            System.out.println(aleatorios[i]);
        }
    }

    public void modificarArray(){
        int[] aleatorios = new int[10];
        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = (int) (Math.random()*101);
        }

        for (int i = 0; i < aleatorios.length ; i++) {
            aleatorios[i] = aleatorios[i]*2;
        }
    }

    public void saberAlgoArray(){
        int[] aleatorios = new int[10];
        int contador=0;
        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = (int) (Math.random()*101);
        }

        for (int i = 0; i < aleatorios.length; i++) {
            if (aleatorios[i] >=50 && aleatorios[i]<=60){
                contador++;
            }
        }

        System.out.println(contador);
    }

    public void getPalabrasArray(){
        String[] palabras = {"Hola","prueba","programacion","sistemas"};
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
    }

    public void getAlgoPalabrasArray(){
        String[] palabras = {"Hola","prueba","programacion","sistemas"};
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length()%2 == 0){
                System.out.println(palabras[i]);
            }
        }
    }

    public void getLetrasPalabrasArray(){
        String[] palabras = {"Hola","prueba","programacion","sistemas"};
        for (int i = 0; i < palabras.length; i++) {
            //System.out.println(palabras[i]);
            String palabraEvaluar = palabras[i];
            System.out.printf("La palabra a evaluar es: %s y sus letras son %n",palabraEvaluar);
            for (int j = 0; j < palabraEvaluar.length() ; j++) {
                System.out.println(palabraEvaluar.charAt(j));
            }
        }


    }

    public void getLetrasPalabrasArraySplit(){
        String[] palabras = {"Hola","prueba","programacion","sistemas"};
        for (int i = 0; i < palabras.length; i++) {
            //System.out.println(palabras[i]);
            String palabraEvaluar = palabras[i];
            String[] letras = palabraEvaluar.split("");
            System.out.printf("La palabra a evaluar es: %s y sus " +
                    "letras son %n",palabraEvaluar);
            for (int j = 0; j < letras.length ; j++) {
                System.out.println(letras[j]);
            }
        }


    }
}
