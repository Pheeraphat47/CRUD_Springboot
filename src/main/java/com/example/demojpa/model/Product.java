package com.example.demojpa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "product")
@Getter
@Setter

public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;
    @Column(name = "productName")
    private String productName;
    @Column(name = "price")
    private double price;
    @Column(name = "category")
    private String category;


}
