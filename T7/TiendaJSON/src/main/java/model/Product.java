
package model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private long id;
    private String title;
    private double price;
    private String description;
    private String category;
    private double discountPercentage;
    private double rating;
    private long stock;
    private String[] tags;
    private String brand;
    private String sku;
    private long weight;
    private String warrantyInformation;
    private String shippingInformation;
    private String availabilityStatus;
    private String returnPolicy;
    private long minimumOrderQuantity;
    private String[] images;
    private String thumbnail;

    public Product(long id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public void mostrarDatos(){

        System.out.println("Código = "+id+" Nombre = "+title+" Precio= "+price);
        System.out.println();
    }
    public void comprarObjetos(long id){

    }
}


