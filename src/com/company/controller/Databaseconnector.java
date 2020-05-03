package com.company.controller;

import java.sql.*;


public class Databaseconnector {
    private static final String DBURL = "jdbc:mysql://localhost:3306/lieferservice?user=root";
    private Connection connection = null;
    private Statement statement = null;

    private static Databaseconnector instance;

    public static Databaseconnector getInstance() {
        if (instance == null) {
            instance = new Databaseconnector();
        }
        return instance;
    }

    Databaseconnector() {

    }

    private void buildConnection() {
        try {
            String databaseUrl = DBURL;
            connection = DriverManager.getConnection(databaseUrl);
            statement = connection.createStatement();
        } catch (SQLException ex) {
            System.out.println("can not build a connection");
            ex.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException ex) {
            System.out.println("can not close the connection");
            ex.printStackTrace();
        }
    }


    public ResultSet fetchData(String sql) {
        buildConnection();
        try {
            return statement.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println("can not fetch data");
            ex.printStackTrace();
            closeConnection();
        }
        return  null;
    }

    public  boolean delete (String sql) {
        buildConnection();
        try {
            int result = statement.executeUpdate(sql);
            if (result == 0) {
                System.out.println("no matching entry found");
                return  false;
            } else  {
                System.out.println("delete successful , update your data");
                return  true;
            }
        } catch (SQLException ex) {
            System.out.println("can not delete data");
            ex.printStackTrace();
            return false;
        } finally {
            closeConnection();
        }
    }

    public void insert(String sql) {

        buildConnection();
        try{
            Statement st = connection.createStatement();
            st.executeQuery(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



    }


