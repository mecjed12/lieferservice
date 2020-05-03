package com.company.model;

public class Restaurant {
    String hotelname = "Graf";


    public Restaurant(String hotelname) {
        this.hotelname = hotelname;
    }

    public void getWelcomeMessage() {
        System.out.println("Willkomen bei Hotel" + hotelname);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }



    }



