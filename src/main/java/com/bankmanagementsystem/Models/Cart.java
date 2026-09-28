package com.bankmanagementsystem.Models;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private int userId;
    private List<Product> products;

    /*
    Default Constructor to ignore constructor
    miss match Exception in child class
     */

    public Cart(){
        super();
    }

    /*
    Main Constructor
     */
    public Cart(int userId){

        this.userId = userId;
        products    = new ArrayList<>();

    }





}
