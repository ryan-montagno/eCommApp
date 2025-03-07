package com.rmont.e_comm_app.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long product_id;


    @Column(name = "product_name")
    private String product_name;


    @Column(name = "product_desc")
    private String product_desc;


    @Column(name = "product_price")
    private double product_price;


    @Column(name = "product_tag")
    private String product_tag;

    @Column(name = "image_url")
    private String image_url;

    public Product() {}
    public Product(String name, String description, double price, String tag, String imageUrl)
    {

        this.product_name = name;
        this.product_desc = description;
        this.product_price = price;
        this.product_tag = tag;
        this.image_url = imageUrl;

    }







}
