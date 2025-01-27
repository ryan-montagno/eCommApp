package com.rmont.e_comm_app.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "products")
@Data
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column(name = "product_name")
    private String name;

    @Column(name = "product_desc")
    private String description;

    @Column(name = "product_price")
    private double price;

    @Column(name = "product_tag")
    private String tag;

    public Product() {}
    public Product(String name, String description, double price, String tag)
    {

        this.name = name;
        this.description = description;
        this.price = price;
        this.tag = tag;

    }





}
