package com.bankmanagementsystem.ServiceLayer;

import com.bankmanagementsystem.CustomException.DuplicateProductFoundException;
import com.bankmanagementsystem.Models.Product;
import com.bankmanagementsystem.Repositories.ProductRepository;

public class ProductService {

    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }


    public void addProduct (Product product){


        try{
            productRepository.saveProduct(product);
        }catch (DuplicateProductFoundException e){
            System.out.println("Error : " + e.getMessage());
        }

    }
}
