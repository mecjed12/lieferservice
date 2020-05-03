package com.company.model;

public class Customer {
    public Object getname;
    private int customerID;
    private String name;
    private String surname;
    private String adress;
    private int citylocationID;


    public Customer (int customerID,String name,String surname,String adress,int citylocationID){
        this.customerID = customerID;
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.citylocationID = citylocationID;
    }

    public String getName() {
        return name;
    }

    public int getCitylocationID() {
        return citylocationID;
    }

    public String getAdress() {
        return adress;
    }

    public String getSurname() {
        return surname;
    }
}


