package com.company.controller;


import com.company.model.Customer;

import java.util.Scanner;

public class CreateCustomer {

    Scanner scanner = new Scanner(System.in);


    public void getcreatemessage() {
        System.out.println("Bitte erstellen Sie erstmals ein Konto");
        System.out.println("");
    }

    public void getcreateaccount() {


        System.out.println("bitte geben Sie denn namen ein");
        String name = scanner.nextLine();
        System.out.println("bitte geben Sie ihren nachnamen ein");
        String surname = scanner.nextLine();
        System.out.println("bitte geben Sie Ihre adresse ein");
        String adress = scanner.nextLine();
        System.out.println("bitte geben Sie ihre Stadt ein");
        System.out.println("Frastanz = 1\n" + "feldkirch = 2\n" + "Rankweil = 3\n" + "Eschen = 4\n");
        int citylocation = scanner.nextInt();

        Customer newaccount =new Customer(1,name,surname,adress,citylocation);



    }


}

