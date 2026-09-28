package com.bankmanagementsystem.Models;

public class Payment {

    private int paymentId;
    private int orderId;
    private double amount;
    private String paymentMethod;
    private String status;

    /*
    Default Constructor for constructor miss match exception
     */
    public Payment(){
        super();
    }

    /*
     Main Constructor
     */

    public Payment(int paymentId, int orderId, double amount, String paymentMethod){
        super();

        this.paymentId = paymentId;
        this.orderId = orderId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;

        this.status = "Pendding";

    }

    /*
    Getter
     */

    public int getPaymentId() {
        return paymentId;
    }

    public String getStatus() {
        return status;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public int getOrderId() {
        return orderId;
    }

    /*
    Setter
     */

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    /*
    Display Payment Information
     */

    public void displayPaymentInfo() {

        System.out.println("Payment ID     : " + paymentId);
        System.out.println("Order ID       : " + orderId);
        System.out.println("Amount         : " + amount);
        System.out.println("Payment Method : " + paymentMethod);
        System.out.println("Status         : " + status);
    }
}
