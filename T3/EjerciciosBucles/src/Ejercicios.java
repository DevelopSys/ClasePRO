public class Ejercicios {


    public void ejercicioPotencia(int base, int exponente) {
        // Dado dos enteros entre 0 y 5 (la base y el exponente),
        // obtener la potencia del primero elevado al segundo sin utilizar
        // el método “pow”. Por ejemplo, base = 3 y exponente = 5,
        //  35=3x3x3x3x3=243. Casos particulares: 00 = Error
        //  y n0 = 1.(BaseExponente)
        if (base == 0 && exponente == 0) {
            System.out.println("Error");
        } else if (exponente == 0) {
            System.out.println("El resultado de la potencia es " + 1);
        } else {

            int resultado = 1;
            for (int i = 0; i < exponente; i++) {
                //resultado = resultado*base;
                resultado *= base;
            }
            System.out.println("El resutaldo de la potencia es " + resultado);
        }
    }

    public void ejercicioParesRango(int rango1, int rango2) {
        /*
        Mostrar todos los números pares comprendidos entre dos dados.
        20 40
        */

        if (rango1 > rango2) {
            System.out.println("Rango incorrecto");
        } else {
            for (int i = rango1; i <= rango2; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }

    public void ejercicioDado(int veces) {
        /*
        Simúlese el lanzamiento de un dado.
        Se introducirá el número de veces que se lanza el dado
        (de no ser positivo, se establecerá a 100)
        y se mostrará el resumen de los lanzamientos.
        Se mostraán cuantas veces ha salido cada número. (Dado)
         */
        // 4
        if (veces <= 0) {
            veces = 100;
        }
        int nUno = 0, nDos = 0, nTres = 0, nCuatro = 0, nCinco = 0, nSeis = 0;
        for (int i = 0; i < veces; i++) {
            int tiradaDado = (int) (Math.random() * 6) + 1;
            if (tiradaDado == 1) {
                nUno++;
            } else if (tiradaDado == 2) {
                nDos++;
            } else if (tiradaDado == 3) {
                nTres++;
            } else if (tiradaDado == 4) {
                nCuatro++;
            } else if (tiradaDado == 5) {
                nCinco++;
            } else
                nSeis++;
        }
    }

    public void ejercicioBase() {
        String resultado = "0";
        for (int i = 0; i < 3; i++) {
            resultado = 1 + resultado;
        }
        System.out.println(resultado);
    }

    public void cambiarBase(int numero, int base) {

        String resultadoCambio = "";

        while (numero>= base) {
            numero = numero / base;
            if (base == 16) {
                resultadoCambio = cambioValor(numero % base)+ resultadoCambio;
            } else {
                resultadoCambio = numero % base + resultadoCambio;
            }
        }
        if (base == 16) {
            resultadoCambio = cambioValor(numero / base) + resultadoCambio;
        } else {
            resultadoCambio = numero / base + resultadoCambio;
        }


        System.out.println(resultadoCambio);

    }

    private String cambioValor(int valor) {
        switch (valor) {
            case 10 -> {
                return "A";
            }
            case 11 -> {
                return "B";
            }
            case 12 -> {
                return "C";
            }
            case 13 -> {
                return "D";
            }
            case 14 -> {
                return "E";
            }
            case 15 -> {
                return "F";
            }
            default -> {
                return String.valueOf(valor);
            }
        }
    }

    public void cambiarDecimal(String numeroOriginal, int base) {
        // 123132A
        // casting
        // 5 -> 5.0
        // 5.9 -> 5
        // parseo
        // 123 -> "123"
        // "123" -> 123

        String numeroStr = String.valueOf(numeroOriginal);
        String numero = "123123";
        int numeroStrg = Integer.parseInt(numero);
        
        
        String numeroCompleto = "11110111";
        for (int i = 0; i < numeroCompleto.length(); i++) {
            String numeroIndividual = String.valueOf(numeroCompleto.charAt(i));
            // int numero = Integer.valueOf(numeroIndividual);
        }

    }


    // dada un numero en una base concreta, calcular su decimal
}
