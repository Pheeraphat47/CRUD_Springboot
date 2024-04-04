package com.example.demojpa.controller;

import com.example.demojpa.model.Product;
import com.example.demojpa.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductService productService;

    // Read
    @GetMapping(value = "/find-all")
    public ResponseEntity<List<Product>> findAll(){

        List<Product> list = productService.findAll();
                return new ResponseEntity<>(list, HttpStatus.OK);
    }

    // Create
    @PostMapping("/create")
    public Product create(@RequestBody Product product){
       return productService.create(product);
    }

    // Update
    @PutMapping("/update/{id}")
    public Product update(@PathVariable("id") Long id, @RequestBody Product product){
        product.setId(id);
        return productService.create(product);
    }

    // Delete
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id){
        productService.delete(id);
    }
}
