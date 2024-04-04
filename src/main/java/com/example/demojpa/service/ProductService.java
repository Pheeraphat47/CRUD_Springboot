package com.example.demojpa.service;

import com.example.demojpa.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product create(Product product);
    void delete(long id);



}
