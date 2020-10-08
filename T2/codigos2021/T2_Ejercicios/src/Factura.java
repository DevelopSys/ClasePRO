public class Factura {

    public static void main(String[] args) {

        final double IVA = 0.21;

        // sin IVA
        double precioZapatillas = 120;
        double precioCoche= 25000.13;
        double refresco = 2.5;
        double precioMenu = 8.5;

        double precioConIvaZapatillas = precioZapatillas + (precioZapatillas*IVA);
        double precioCocheIVa = precioCoche + (precioCoche * IVA);
        double refrescoIVA = refresco + (refresco *IVA);
        double precioMenuIVA = precioMenu + (precioMenu * IVA);

        System.out.println("Zapatillas con IVA "+precioConIvaZapatillas+" precio sin IVA "+precioZapatillas);
        System.out.println("Coche con IVA "+precioCocheIVa+" precio sin IVA "+precioCoche);
        System.out.println("Menu con IVA "+precioMenuIVA+" precio sin IVA "+precioMenu);
        System.out.println("Refresco con IVA "+refrescoIVA+" precio sin IVA "+refresco);

        double sumaTotalIVA = precioCocheIVa+precioConIvaZapatillas+refrescoIVA+precioMenuIVA;
        double sumaTotal = precioCoche+precioZapatillas+refresco+precioMenu;

        System.out.println("Total con IVA "+sumaTotalIVA+" sin iva "+sumaTotal);

       // Las zapatillas con sin IVA: XX con IVA: XX
        // El coche con sin IVA: XX con IVA: XX
        // El refresco sin sin IVA: XX con IVA: XX
        // El menu con sin IVA: XX con IVA: XX

        // La factura total sin IVA XX con IVA XX
        // sueldo bruto anual: 30000 e/a
        // 10 pagas
        // 15%

        // su bruto anual: 30000
        // su neto anual: 30000 - (30000 * 0.15)
        // su bruto mensual: 30000 / 10
        // su neto anual: (30000 - (30000 * 0.15)) / 10


    }
}
