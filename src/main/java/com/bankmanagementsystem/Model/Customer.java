package com.bankmanagementsystem.Model;

public class Customer {

    private int customerID;
    private String customerName;
    private String phone;
    private String address;
    private String email;
    private String pass;

    /*
    The main reason default constructor to ignore constructor miss match
              in the child class
     */
    public Customer(){
        super();
    }

    /*
    Main Constructor
     */
    public Customer(int customerID, String customerName, String phone,
                    String address, String email, String pass){
        super();

        this.customerID   = customerID;
        this.customerName = customerName;
        this.phone        = phone;
        this.email        = email;
        this.pass         = pass;

    }


    /*
    Getter
     */

    public int getCustomerID() {
        return customerID;
    }

    public String getPass() {
        return pass;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getCustomerName() {
        return customerName;
    }

    /*
    Setter
     */

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }



    /*
        Display User Info
     */
    public void displayUserInfo() {

        System.out.println("Customer{" +
                "customerID=" + customerID +
                ", customerName='" + customerName + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                '}');
    }
}
