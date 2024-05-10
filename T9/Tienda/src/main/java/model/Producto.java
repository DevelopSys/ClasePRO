package model;



public class Producto {
    private long id;
    private String title;
    private String description;
    private int price;
    private double discountPercentage;
    private double rating;
    private long stock;
    private String brand;
    private String category;
    private String thumbnail;
    private String[] images;


    public Producto() {
    }

    public Producto(long id, String title, String description, int price, double discountPercentage, double rating, long stock, String brand, String category, String thumbnail, String[] images) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.discountPercentage = discountPercentage;
        this.rating = rating;
        this.stock = stock;
        this.brand = brand;
        this.category = category;
        this.thumbnail = thumbnail;
        this.images = images;
    }

    public long getID() { return id; }
    public void setID(long value) { this.id = value; }

    public String getTitle() { return title; }
    public void setTitle(String value) { this.title = value; }

    public String getDescription() { return description; }
    public void setDescription(String value) { this.description = value; }

    public int getPrice() { return price; }
    public void setPrice(int value) { this.price = value; }

    public double getDiscountPercentage() { return discountPercentage; }
    public void setDiscountPercentage(double value) { this.discountPercentage = value; }

    public double getRating() { return rating; }
    public void setRating(double value) { this.rating = value; }

    public long getStock() { return stock; }
    public void setStock(long value) { this.stock = value; }

    public String getBrand() { return brand; }
    public void setBrand(String value) { this.brand = value; }

    public String getCategory() { return category; }
    public void setCategory(String value) { this.category = value; }

    public String getThumbnail() { return thumbnail; }
    public void setThumbnail(String value) { this.thumbnail = value; }

    public String[] getImages() { return images; }
    public void setImages(String[] value) { this.images = value; }
}

