package com.company.controller;

import java.util.List;

public interface Repository<T> {
    public List<T> findAll();
    public T findone (int id);



    public void create(T entity);


}
