public class EntradaEjercicio1 {

    public static void main(String[] args) {
        // la factura ya tiene IVA
        int facturaBase = 2500;
        final int IVA = 21;
        double ivaFactura = (facturaBase * IVA)/100;
        double facturaSinIva = facturaBase - ivaFactura;


        System.out.printf("El total de la factura con IVA es: %d%n",facturaBase);
        System.out.printf("El total de la factura sin IVA es: %.2f%n",facturaSinIva);
        System.out.printf("El IVA de la factura es: %.2f%n",ivaFactura);

    }

}
