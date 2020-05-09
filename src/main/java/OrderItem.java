/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mason
 */
public class OrderItem {
    private int orderNumber;
    private double price;
    private int productID;
    private int lineNumber;
    private int quantity;
    private String productdescription;

    public OrderItem(int orderNumber, double price, String productdescription, int productID, int quantity, int lineNumber) {
        this.orderNumber = orderNumber;
        this.price = price;
        this.productdescription = productdescription;
        this.productID = productID;
        this.lineNumber = lineNumber;
        this.quantity= quantity;
    }

    public int getorderNumber() {
        return orderNumber;
    }

    public void setorderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }


    public double getprice() {
        return price;
    }

    public void setprice(double price) {
        this.price = price;
    }

    public String getproductDescription() {
        return productdescription;
    }

    public void setproductDescription(String productdescription) {
        this.productdescription = productdescription;
    }

    public int getproductID() {
        return productID;
    }

    public void setproductID(int productID) {
        this.productID = productID;
    }
    
    public int getquantity(){
        return quantity;
    }
    
    public void setquantity(int quantity) {
        this.quantity = quantity;
    }
    
    public int getlineNumber() {
        return lineNumber;
    }
    
    public void setlineNumber (int lineNumber) {
        this.lineNumber = lineNumber;
    }

    @Override
    public String toString() {
        return "OrderItem{" + "orderNumber=" + orderNumber +  ", price=" + price + ", productdescription=" + productdescription + ", lineNumber=" + lineNumber + ", productId=" + productID, ", quantity=" + quantity}';
    }

