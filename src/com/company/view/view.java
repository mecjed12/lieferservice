package com.company.view;

import com.company.model.Customer;
import com.company.controller.CustomerRepository;
import com.company.model.Restaurant;
import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.Scanner;

public class view {
    Scanner scanner = new Scanner(System.in);
    CustomerRepository customerRepository = new CustomerRepository();
    List<Customer> customer2 = customerRepository.findAll();





}

