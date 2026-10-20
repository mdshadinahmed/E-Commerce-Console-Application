package com.bankmanagementsystem.ServiceLayer;

import com.bankmanagementsystem.CustomException.CustomerAlreadyRegisteredException;
import com.bankmanagementsystem.Models.Customer;
import com.bankmanagementsystem.Repositories.CustomerRepository;

import java.util.List;

public class CustomerService {

    private  CustomerRepository customerRepositories;

    /*
    Default Constructor
     */
    public CustomerService(){
        super();
    }

    /*
    Main Constructor
     */
    public CustomerService(CustomerRepository customerRepository){
        super();
        this.customerRepositories = customerRepository;
    }


    public void registerCustomer(Customer customer)
            throws CustomerAlreadyRegisteredException {
       customerRepositories.registerCustomer(customer);
        System.out.println();
        System.out.println("Login Please.");
    }


    public void login(String email, String pass){

        customerRepositories.findByEmail(email);
        customerRepositories.findByPass(pass);

        System.out.println("Login Successfully!");
    }

}
