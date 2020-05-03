package com.company.controller;

import com.company.controller.Databaseconnector;
import com.company.controller.Repository;
import com.company.model.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerRepository implements Repository<Customer> {

    private Databaseconnector connector;
    public CustomerRepository() {
        connector = Databaseconnector.getInstance();
    }
    Scanner scanner = new Scanner(System.in);


    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<Customer>();
        ResultSet result = connector.fetchData("SELECT * FROM customer");
        if (result == null) {
            System.out.println("could not fetch cars");
            return null;
        }

        try {
            while (result.next()) {
                int id = result.getInt("customerId");
                String name = result.getString("name");
                String surname = result.getString("surname");
                String adress = result.getString("adress");
                int citylocationId = result.getInt("citylocationId");

                customers.add(new Customer(id, name, surname, adress, citylocationId));
            }
        } catch (SQLException e) {
            System.out.println("error while parsing cars");
            System.out.println(e.getMessage());
        } finally {
            // Unfortunately I have to close the connection here. Preferred would have been in the
            // dbConnector.fetchData() function. But I have to use the ResultSet here to create the
            // car objects. I couldn't use the ResultSet when the connections were closed already.
            connector.closeConnection();
            return customers;
        }
    }

    @Override
    public Customer findone(int id) {
        return null;
    }





    @Override
    public void create(Customer entity) {



        //String sql = "INSERT INTO 'customer'('name','surname',adress','citylocationId') VALUES ('"entity.getname()

    }
}

