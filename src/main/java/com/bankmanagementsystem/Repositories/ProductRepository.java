package com.bankmanagementsystem.Repositories;

import com.bankmanagementsystem.CustomException.DuplicateProductFoundException;
import com.bankmanagementsystem.Models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    List<Product> products ;

    /*
     Product Constructor
     */

    public ProductRepository(){
        products = new ArrayList<>();
    }


    public void saveProduct(Product product) throws DuplicateProductFoundException {

        for (Product product1 : products){
            if (product1.getProductId() == product.getProductId()){
                throw new DuplicateProductFoundException("Product Already Available!\nPlease Insert New Product.");
            }
        }
        products.add(product);
        System.out.println("Product Successfully Added...");

    }

}
