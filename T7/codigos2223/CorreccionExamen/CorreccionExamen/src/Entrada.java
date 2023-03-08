import model.Bicicleta;
import model.Tamanio;
import model.Tienda;
import model.Tipo;

public class Entrada {

    public static void main(String[] args) {
        Tienda tiendaBicis = new Tienda();
        tiendaBicis.construirAlmacen(2);
        tiendaBicis.agregarBicicleta(new Bicicleta(Tipo.MTB, Tamanio.M,27,29,true,1000) {
            @Override
            public int reparar() {
                System.out.println("Esta bici se repara así");
                return 100;
            }
        });
        tiendaBicis.agregarBicicleta(new Bicicleta(Tipo.Paseo, Tamanio.M,16,21,true,100) {
            @Override
            public int reparar() {
                System.out.println("Esta bici se repara de forma diferente");
                return 200;
            }
        });
        tiendaBicis.agregarBicicleta(new Bicicleta(Tipo.Carretera, Tamanio.L,27,29,true,500) {
            @Override
            public int reparar() {
                System.out.println("Esta bici se repara de forma diferente");
                return 300;
            }
        });
        tiendaBicis.agregarBicicleta(new Bicicleta(Tipo.MTB, Tamanio.M,20,10,true,2000) {
            @Override
            public int reparar() {
                System.out.println("Esta bici se repara totalemente diferente");
                return 500;
            }
        });
        try {
            tiendaBicis.agregarBicicletaReapar(new Bicicleta(Tipo.MTB, Tamanio.L, 27, 29, false, 700) {
                @Override
                public int reparar() {
                    setEstado(!isEstado());
                    setVelocidades(getVelocidades()+2);

                    return (int) (Math.random()*101 +100);
                }
            });

            tiendaBicis.agregarBicicletaReapar(new Bicicleta(Tipo.Paseo, Tamanio.M, 27, 29, false, 700) {
                @Override
                public int reparar() {
                    setEstado(!isEstado());
                    setVelocidades(getVelocidades()+1);
                    setPulgadas(getPulgadas()+2);
                    return (int) (Math.random()*51 +50);
                }
            });

            tiendaBicis.agregarBicicletaReapar(new Bicicleta(Tipo.Paseo, Tamanio.M, 27, 29, false, 700) {
                @Override
                public int reparar() {
                    setEstado(!isEstado());
                    setVelocidades(getVelocidades()+1);
                    setPulgadas(getPulgadas()+2);
                    return (int) (Math.random()*51 +50);
                }
            });

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //tiendaBicis.verDatosStock();
        tiendaBicis.repararBicis();
        tiendaBicis.venderBicicleta((int) (Math.random()*20+1));
    }
}
