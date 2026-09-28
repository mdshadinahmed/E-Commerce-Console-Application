package com.bankmanagementsystem.Model;

public class Product {

    private int productId;
    private String productName;
    private double productPrice;
    private int stock;


    /*
    Default Constructor so that we can ignore constructor mismatch
    in child class
     */

    public Product(){
      super();
    }

    /*
    Main  Constructor
     */

    public Product(int productId, String productName,
                   double productPrice, int stock){
        super();

        this.productId    = productId;
        this.productName  = productName;
        this.productPrice = productPrice;
        this.stock        = stock;

    }

    /*
    Getter
     */

    public int getProductId() {
        return productId;
    }

    public int getStock() {
        return stock;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getProductName() {
        return productName;
    }

    /*
    Setter
     */

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }


    /*
     Display specific product Information
     */


    public void displayProductInfo() {

        System.out.println("Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", stock=" + stock +
                '}');

    }
}
