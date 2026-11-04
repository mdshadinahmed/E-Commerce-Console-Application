package com.bankmanagementsystem.Repositories;

import com.bankmanagementsystem.CustomException.DuplicateProductFoundException;
import com.bankmanagementsystem.CustomException.ProductNotFoundException;
import com.bankmanagementsystem.Models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    List<Product> products;

    /*
     Product Constructor
     */

    public ProductRepository() {
        products = new ArrayList<>();
    }


    public void saveProduct(Product product)
            throws DuplicateProductFoundException {

        for (Product product1 : products) {
            if (product1.getProductId() == product.getProductId()) {
                throw new DuplicateProductFoundException("Product Already Available!\nPlease Insert New Product.");
            }
        }
        products.add(product);
        System.out.println("Product Successfully Added...");

    }

    /**
     * Find All Product by ID
     */
    public List<Product> findAllProducts()
            throws ProductNotFoundException {

        if (products.isEmpty()) {
            throw new ProductNotFoundException("Product Not Available!");
        }
        return products;
    }

    /**
     * Find Product By ID
     */
    public Product searchProductByID(int productID)
            throws ProductNotFoundException {

        Product getProduct = null;

        if (!products.isEmpty()) {

            for (Product product : products) {

                if (product.getProductId() == productID) {
                    getProduct = product;
                    break;
                }

            }
        }

        if (products == null) {
            throw new ProductNotFoundException("Product Not Found Exception!");
        }
        return getProduct;

    }
}
