package com.bankmanagementsystem.Repositories;

import com.bankmanagementsystem.CustomException.CustomerAlreadyRegisteredException;
import com.bankmanagementsystem.CustomException.CustomerNotFoundException;
import com.bankmanagementsystem.CustomException.DuplicateCustomerFoundException;
import com.bankmanagementsystem.CustomException.EmailNotMatchException;
import com.bankmanagementsystem.Models.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * User Repository Class
 * By using this Class we can store a new Customer
 * @author Shadin Ahmed
 * @version 1.0
 * @see Customer model Class
 * @see com.bankmanagementsystem.Console.Main
 *
 */


/*
  Constructor
 */
public class CustomerRepository {

    List<Customer> customers;

    public CustomerRepository(){
        super();
        customers = new ArrayList<>();
    }


    public List<Customer> getCustomers() {
        return customers;
    }

    public void registerCustomer(Customer customer) throws CustomerAlreadyRegisteredException {

        int presentCusID = customer.getCustomerID();

        for(Customer customer1 : customers){
            if (presentCusID == customer1.getCustomerID()){
                throw  new CustomerAlreadyRegisteredException("Customer Already Registered!");
            }
        }

        customers.add(customer);
        System.out.println("Customer Successfully Registered...");

    }


    public void findAllCustomer() throws CustomerNotFoundException {

        if (!customers.isEmpty()){

            for (Customer customer : customers){
                customer.displayUserInfo();
            }

        }else {
            throw new CustomerNotFoundException("Customer Not Found!");
        }

    }


    public Customer findCustomerById(int customerId){

        Customer customer1 = null;

        if (!customers.isEmpty()){

            for (Customer customer : customers) {
                if (customerId == customer.getCustomerID()) {
                    customer.displayUserInfo();
                    customer1 = customer;
                    break;
                }
            }

        }else {
            throw new CustomerNotFoundException("Customer Not Found!");
        }

        return customer1;

    }


    public Customer findByEmail(String email) throws
            CustomerNotFoundException, EmailNotMatchException {

        Customer customer = null;

        if (!customers.isEmpty()) {

            for (Customer customer1 : customers){

                if (customer1.getEmail().equals(email)){
                    customer = customer1;
                    break;
                }

            }

        }else {
            throw  new CustomerNotFoundException("Customer Not Found!");
        }

        if (customer == null){
            throw new EmailNotMatchException("Email Not Match Exception!!");

        }
        return customer;

    }


    public Customer findByPass(String pass)throws  CustomerNotFoundException, EmailNotMatchException{

        Customer customer = null;

        if (!customers.isEmpty()){

            for (Customer customer1 : customers){

                if (customer1.getPass().equals(pass)){
                    customer = customer1;
                    break;
                }

            }

        }else {
            throw  new CustomerNotFoundException("Customer Not Found!");
        }

        if (customer ==null){
            throw new EmailNotMatchException("Email Not Match Exception!!");
        }

        return customer;

    }


    // What is
    // Advantages and Disadvantages
    // How internally works
    // 

    }

