package com.bankmanagementsystem.Model;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private int orderId;
    private int userId;

    private List<Product> products;

    private double totalAmount;
    private String status;

    /*
    Default Constructor so that we can ignore constructor mismatch Exception
    in child Class
     */
    public Order(){
        super();
    }

    /*
    Main Constructor
     */

    public Order(int orderId, int userId, List<Product> products,
                 double totalAmount){
        super();

        this.orderId     = orderId;
        this.userId      = userId;
        this.products    = new ArrayList<>(products);
        this.totalAmount = totalAmount;
        this.status      = "Pending....";

    }

    /*
      Getter
     */

    public int getOrderId() {
        return orderId;
    }

    public int getUserId() {
        return userId;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    /*
      Setter
     */

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    /*
    Show Display
     */

    public void displayOrderInfo() {

        System.out.println("\n======================");
        System.out.println("Order ID     : " + orderId);
        System.out.println("User ID      : " + userId);
        System.out.println("Total Amount : " + totalAmount);
        System.out.println("Status       : " + status);
        System.out.println("======================");

        System.out.println("Products:");

        for (Product product : products) {
            System.out.println("- " + product.getProductName());
        }
    }

}