package com.example.demojpa.service;

import com.example.demojpa.model.Product;
import com.example.demojpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceimpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public Product create(Product product) {
        return repository.save(product);
    }
    // delete ใส่เป็น void เพราะว่าไม่มี return ค่าออกมา
    @Override
    public void delete(long id) {
        repository.deleteById(id);
    }



}