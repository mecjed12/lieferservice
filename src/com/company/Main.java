package com.company;


import com.company.controller.CreateCustomer;
import com.company.model.Customer;
import com.company.model.Restaurant;




public class Main {

    public static void main(String[] args) {
        Restaurant hotel1 = new Restaurant("Graf");
        CreateCustomer customer1 = new CreateCustomer();
        hotel1.getWelcomeMessage();
        customer1.getcreatemessage();
        customer1.getcreateaccount();





        }



    }




