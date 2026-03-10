
package model;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {
    private static final Long serialVersionUID = 123L;
    private long id;
    private String title;
    private String description;
    private String category;
    private double price;
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
}


