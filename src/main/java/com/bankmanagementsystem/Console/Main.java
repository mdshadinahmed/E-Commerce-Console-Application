package com.bankmanagementsystem.Console;


import com.bankmanagementsystem.CustomException.CustomerAlreadyRegisteredException;
import com.bankmanagementsystem.CustomException.CustomerNotFoundException;
import com.bankmanagementsystem.CustomException.DuplicateCustomerFoundException;
import com.bankmanagementsystem.Models.Customer;
import com.bankmanagementsystem.Repositories.CustomerRepository;
import com.bankmanagementsystem.ServiceLayer.CustomerService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Scanner Class Object
         */

        Scanner input = new Scanner(System.in);

        /*
        Repository Class Object
         */
        CustomerRepository customerRepository =
                new CustomerRepository();


        /*
        Service Class
         */
        CustomerService customerService =
                new CustomerService(customerRepository);




        while (true){
            try{
                System.out.println("\n");
                System.out.println("==============================");
                System.out.println("     E-COMMERCE SYSTEM");
                System.out.println("==============================");

                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("3. Add Product");
                System.out.println("4. Show Products");
                System.out.println("5. Search Product");
                System.out.println("6. Add Product to Cart");
                System.out.println("7. Remove Product from Cart");
                System.out.println("8. View Cart");
                System.out.println("9. Place Order");
                System.out.println("10. Payment");
                System.out.println("11. Order History");
                System.out.println("12. Exit");

                System.out.println("Enter Your Choice : ");
                int choice  = input.nextInt();

                switch (choice){

                    case 1 :

                        System.out.println("Enter Customer ID : ");
                        int cusId = input.nextInt();

                        /*
                        Buffer Clear
                         */

                        input.nextLine();

                        System.out.println("Enter Customer Name : ");
                        String cusName = input.nextLine();
                        System.out.println("Enter Customer Address : ");
                        String cusAddress = input.nextLine();
                        System.out.println("Enter Customer Phone : ");
                        String cusPhone = input.nextLine();
                        System.out.println("Enter Customer Email : ");
                        String cusEmail = input.nextLine();
                        System.out.println("Enter Customer Pass : ");
                        String cusPass = input.nextLine();
                        try {
                            Customer customer  = new Customer(cusId, cusName, cusAddress, cusPhone,
                                    cusEmail, cusPass);
                            customerService.registerCustomer(customer);
                        }catch (CustomerAlreadyRegisteredException e){
                            System.out.println("Error : " + e.getMessage());
                        }





                        break;
                }




            }catch (InputMismatchException e){
                System.out.println("Error : " + e.getMessage());
                input.nextLine();
            }

        }

    }
}