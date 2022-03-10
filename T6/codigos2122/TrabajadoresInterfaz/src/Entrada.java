public class Entrada {

    public static void main(String[] args) {
        Empresa empresa = new Empresa("CES JPII",10000);
        empresa.addPersona(new Asalariado("123A","Borja", "Martin",1000,Departamento.Comercial,12));
        empresa.addPersona(new Asalariado("123B","Jesus", "Niño",1000,Departamento.Finanzas,12));
        empresa.addPersona(new Jefe("123C","Isaac", "Sampedro",2000,Departamento.IT,14));
        empresa.addPersona(new Autonomo("123D","Eduardo", "Del Olmo",1000,Departamento.Ventas,14));
        empresa.addPersona(new Accionista("123E","Gema", "Cordoba",50));
        empresa.addPersona(new Directivo("123G","MArta", "Valdeita",100));
        //empresa.listarPersonas();

        //empresa.registraVotacion( (Comision)empresa.getPersonas().get(2));
        //empresa.registraVotacion( (Comision)empresa.getPersonas().get(4));
        //empresa.registraVotacion( (Comision)empresa.getPersonas().get(5));

        //System.out.println("Los votos registrados son: "+empresa.getVotos());
        empresa.repartirBeneficios();

    }
}
