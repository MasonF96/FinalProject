/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mason
 */
public class Product {
    private int productId;
    private String description;
    private int quantityOnHand;
    private double price;

    public Product(int productId, String description, int quantityOnHand, int price) {
        this.productId = productId;
        this.description = description;
        this.quantityOnHand = quantityOnHand;
        this.price = price;
    }
    
    public int getproductId() {
        return productId;
    }

    public void setproductId(int productId) {
        this.productId = productId;
    }

    public String getdescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    public int getquantityOnHand() {
        return quantityOnHand;
    }

    public void setquantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public double getprice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "prodcutId=" + productId + ", description=" + description + ", quantityOnHand=" + quantityOnHand + ", price=" + price +'}';
    }
}
