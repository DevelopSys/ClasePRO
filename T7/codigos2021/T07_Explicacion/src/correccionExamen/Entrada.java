package correccionExamen;

public class Entrada {

    public static void main(String[] args) {
        /*Bicicleta<Integer> bicicletaInt = new Bicicleta<Integer>() {
            @Override
            public Integer reparar() {
                return null;
            }
        };*/

        Tienda tienda = new Tienda();
        tienda.construirAlmacen(2);
        tienda.agregarBicicleta(new Bicicleta("MTB", 28, 29, "M", true) {
            @Override
            public Double reparar() {
                return Math.random() * 800;
            }
        });
        tienda.agregarBicicleta(new Bicicleta("Carretera", 4, 67, "L", true) {
            @Override
            public Integer reparar() {
                return (int)Math.random() * 800;
            }
        });
        tienda.agregarBicicleta(new Bicicleta("Paseo", 28, 29, "S", true) {
            @Override
            public Double reparar() {
                return Math.random() * 800;
            }
        });
        tienda.agregarBicicleta(new Bicicleta("Carrera", 28, 29, "XL", true) {
            @Override
            public Double reparar() {
                return Math.random() * 800;
            }
        });
        tienda.repararBicicleta(new Bicicleta("MTB",27,29,"L",false) {
            @Override
            public Double reparar() {
                this.setEstado(true);
                this.setVelocidades(this.getVelocidades()+2);
                double reparacion = (((int)Math.random()*101) +100) *2 ;
                return reparacion;
            }
        });
        tienda.repararBicicleta(new Bicicleta("Paseo",2,27,"M",false) {
            @Override
            public Integer reparar() {
                this.setEstado(true);
                this.setVelocidades(this.getVelocidades()+1);
                this.setPulgadas(this.getPulgadas()+2);
                int reparacion = ((int)Math.random()*51) +50;
                return reparacion;
            }
        });
        tienda.repararBicicleta(new Bicicleta("Carretera",8,24,"S",false) {
            @Override
            public Integer reparar() {
                this.setEstado(true);
                this.setVelocidades(this.getVelocidades()+4);
                this.setPulgadas(this.getPulgadas()+5);
                int reparacion = ((int)Math.random()*151) +100 ;
                return reparacion;
            }
        });
        //tienda.listarBicisReparar();
        //tienda.listarBicisReparar();
        //tienda.repararTodasBicis();
        //tienda.listarBicisReparar();
        tienda.venderBicicleta((int)(Math.random()*7+1));



    }
}
