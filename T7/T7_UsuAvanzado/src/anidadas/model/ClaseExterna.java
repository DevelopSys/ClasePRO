package anidadas.model;

public class ClaseExterna {

    private String datoUno;
    private int datoDos;

    private ClaseInterna claseInterna;

    public ClaseExterna(String datoUno, int datoDos) {
        this.datoUno = datoUno;
        this.datoDos = datoDos;
    }


    public void metodo(){
        // ClaseInterna.this.mostrarDatosInterno();
        if (claseInterna!=null){
            claseInterna.mostrarDatosInterno();
        } else {
            System.out.println("no tienes hijo asignado");
        }
    }

    public void mostrarDatosExterno() {
        System.out.println("Dato 1 " + datoUno);
        System.out.println("Dato 2 " + datoDos);
    }


    public void setClaseInterna(ClaseInterna claseInterna) {
        this.claseInterna = claseInterna;
    }

    public ClaseInterna getClaseInterna() {
        return claseInterna;
    }

    public String getDatoUno() {
        return datoUno;
    }

    public void setDatoUno(String datoUno) {
        this.datoUno = datoUno;
    }

    public int getDatoDos() {
        return datoDos;
    }

    public void setDatoDos(int datoDos) {
        this.datoDos = datoDos;
    }

    public class ClaseInterna {

        private String datoUnoInterno;
        private int datoDosInterno;
        private ClaseExterna claseExterna;

        public ClaseInterna(String datoUnoInterno, int datoDosInterno, ClaseExterna claseExterna) {
            this.datoUnoInterno = datoUnoInterno;
            this.datoDosInterno = datoDosInterno;
            this.claseExterna = claseExterna;
            claseExterna.setClaseInterna(this);
        }

        public void metodo() {
            ClaseExterna
                    .this.mostrarDatosExterno();
            claseExterna.mostrarDatosExterno();
        }

        public void mostrarDatosInterno() {
            System.out.println("datoUnoInterno:" + datoUnoInterno);
            System.out.println("datoDosInterno:" + datoDosInterno);
        }

        public String getDatoUnoInterno() {
            return datoUnoInterno;
        }

        public void setDatoUnoInterno(String datoUnoInterno) {
            this.datoUnoInterno = datoUnoInterno;
        }

        public int getDatoDosInterno() {
            return datoDosInterno;
        }

        public void setDatoDosInterno(int datoDosInterno) {
            this.datoDosInterno = datoDosInterno;
        }
    }
}


