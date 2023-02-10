package constantes;

public enum EnumDVD {

    //intriga +12, terror +18, comedia +0, drama +10
    //String nombre;
    //int edad;

    policiaca("Policia",5),
    musical("Musical",0),
    intriga("Intriga",12),
    terror("Terror",18),
    comedia("Comedia",3,false),
    drama("Drama",10);

    String tipo;
    int edad;

    private EnumDVD(String tipo, int edad){
        this.tipo = tipo;
        this.edad = edad;
    }
    private EnumDVD(String tipo, int edad, boolean cosa){

    }

    public int getEdad(){
        return this.edad;
    }

    public void getCosa(){
        System.out.println("Método llamado desde un enum");
    }


}
