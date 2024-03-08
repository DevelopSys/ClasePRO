package tiendanidada;

import tiendanidada.model.Bicicleta;
import tiendanidada.utils.EspacioException;
import tiendanidada.utils.Tamanio;
import tiendanidada.model.Tienda;
import tiendanidada.utils.Tipo;

public class Entrada {

    public static void main(String[] args) {
        /*Bicicleta<Integer> bicicletaInt = new Bicicleta<Integer>() {
            @Override
            public Integer reparar() {
                if (this.getTamanio().getPrecioReparacion()>0){
                    System.out.println("Reparacion con un conste adicional ");
                }
                return 10;
            }
        };

        Bicicleta<Integer> bicicletaInt1 = new Bicicleta<Integer>() {
            @Override
            public Integer reparar() {
                System.out.println("Reparo esta bici sin tener nada en cuenta");
                return 1;
            }
        };*/
        Tienda tienda = new Tienda();
        tienda.agregarBici(new Bicicleta<Integer>(Tipo.mtb, Tamanio.l,27,30,true) {
            @Override
            public Integer reparar() {
                return 0;
            }
        });
        tienda.agregarBici(new Bicicleta<Integer>(Tipo.carretera, Tamanio.m,30,27,true) {
            @Override
            public Integer reparar() {
                return 0;
            }
        });
        tienda.agregarBici(new Bicicleta<Integer>(Tipo.paseo, Tamanio.s,24,18,true) {
            @Override
            public Integer reparar() {
                return 0;
            }
        });

        tienda.construirAlmacen(3);
        //tienda.mostrarBicisStock();
        try {
            tienda.agregarRepararBicicleta(new Bicicleta<Double>(Tipo.paseo, Tamanio.s,24,18
                    ,false) {
                @Override
                public Double reparar() {
                    return 15.0;
                }
            });
            tienda.agregarRepararBicicleta(new Bicicleta<Double>(Tipo.paseo, Tamanio.s,24,18
                    ,false) {
                @Override
                public Double reparar() {
                    return (Math.random()*101)+150;
                }
            });
            tienda.agregarRepararBicicleta(new Bicicleta<Double>(Tipo.paseo, Tamanio.s,24,18
                    ,false) {
                @Override
                public Double reparar() {
                    return (Math.random()*101)+100;
                }
            });
            tienda.agregarRepararBicicleta(new Bicicleta<Double>(Tipo.paseo, Tamanio.s,24,18
                    ,false) {
                @Override
                public Double reparar() {
                    setVelocidades(getVelocidades()+2);
                    setEstado(true);
                    return (Math.random()*51)+50;
                }
            });

        } catch (NullPointerException e){
            System.out.println("El almacen no existe");
        } catch (EspacioException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Proceso terminao");
            tienda.repararBicis();
        }


        //Tienda.Almacen almacen = tienda.new Almacen(2);
    }
}
