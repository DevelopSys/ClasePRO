package ejercicios.ejercicioConsumicion;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        ArrayList<Cuenta> cuentasTotales = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        int opcionMain = 0, opcionCuenta = 0;
        int contadorIDs = 0;
        int id = 0;
        boolean existe = false;

        do {

            System.out.println("1. Registrar cliente (cuenta)");
            // solo se puede agregar cuando la cuenta no está pagada
            System.out.println("2. Agregar articulo a cliente (cuenta) ");
            System.out.println("3. Ver coste de la cuenta ");
            System.out.println("4. Pagar una cuenta ");
            System.out.println("5. Ver coste acumulado cuentas cerradas (pagadas)");
            System.out.println("6. Ver coste acumulado cuentas abierta (no pagadas)");
            System.out.println("¿Que quieres hacer?");
            opcionMain = teclado.nextInt();
            switch (opcionMain) {
                case 1:
                    System.out.println("Registrar una cuenta");
                    Cuenta cuenta = new Cuenta(contadorIDs);
                    cuentasTotales.add(cuenta);
                    contadorIDs++;
                    System.out.println("Cuenta creada correctamente");
                    System.out.printf("Tienes actualente %d cuentas abiertas %n", cuentasTotales.size());
                    break;
                case 2:
                    System.out.println("Que ID de cuenta quiere agregar");
                    id = teclado.nextInt();
                    existe = false;

                    for (int i = 0; i < cuentasTotales.size(); i++) {
                        if (cuentasTotales.get(i).getIdentificador() == id && !cuentasTotales.get(i).isPagado()) {

                            System.out.println("Dime nombre del articulo");
                            String nombreArticulo = teclado.next();
                            System.out.println("Dime coste del articulo");
                            double costeArticulo = teclado.nextDouble();
                            cuentasTotales.get(i).agregarArticulo(new Articulo(nombreArticulo, costeArticulo));
                            existe = true;
                        }
                    }
                    if (!existe) {
                        System.out.println("La cuenta especificada no existe // o está pagada");
                    }
                    break;
                case 3:
                    System.out.println("Que ID de cuenta quiere ver su coste");
                    id = teclado.nextInt();
                    existe = false;

                    for (int i = 0; i < cuentasTotales.size(); i++) {

                        if(cuentasTotales.get(i).coincideCuenta(cuentasTotales,cuentasTotales.get(i).getIdentificador())){

                        }else {

                        }

                    }



                    for (int i = 0; i < cuentasTotales.size(); i++) {
                        if (cuentasTotales.get(i).getIdentificador() == id) {
                            System.out.println(cuentasTotales.get(i).getCosteTotal());
                            existe = true;
                        }
                    }
                    if (!existe) {
                        System.out.println("La cuenta especificada no existe");
                    }

                    break;
                case 4:

                    System.out.println("Que ID de cuenta quiere pagar");
                    id = teclado.nextInt();

                    existe = false;
                    for (int i = 0; i < cuentasTotales.size(); i++) {
                        if (cuentasTotales.get(i).getIdentificador() == id) {
                            cuentasTotales.get(i).setPagado();
                            existe = true;
                        }
                    }
                    if (!existe) {
                        System.out.println("La cuenta especificada no existe");
                    }

                    break;
            }

        } while (opcionMain != 5);

        /*
        // entra cliente A
        cuentasTotales.add(new Cuenta(1));
        // entra otro cliente B
        cuentasTotales.add(new Cuenta(2));
        // entra otro cliente C
        cuentasTotales.add(new Cuenta(3));

        // el cliente A me pide cafe 1.80 y tostada

        for (int i = 0; i < cuentasTotales.size(); i++) {
            if (cuentasTotales.get(i).getIdentificador() == 1){
                cuentasTotales.get(i).agregarArticulo(new Articulo("cafe",1.80));
                cuentasTotales.get(i).agregarArticulo(new Articulo("tostada",0.80));
            }
        }


        // el cliente B me pide cocacola 2
        cuentasTotales.get(1).agregarArticulo(new Articulo("cocacola",2));

        // el cliente C me pide cocacola y un cafe
        cuentasTotales.get(2).agregarArticulo(new Articulo("cocacola",2));
        cuentasTotales.get(2).agregarArticulo(new Articulo("cafe",2));

        System.out.println(cuentasTotales.get(0).getCosteTotal());
        System.out.println(cuentasTotales.get(1).getCosteTotal());
        System.out.println(cuentasTotales.get(2).getCosteTotal());*/


    }

    public boolean coincideCuenta(ArrayList<Cuenta> listCuentas, int id ){

        for (int i = 0; i < listCuentas.size(); i++) {
            if (listCuentas.get(i).getIdentificador() == id && !listCuentas.get(i).isPagado()) {
                return true;
            }
        }

        return false;
    }
}
