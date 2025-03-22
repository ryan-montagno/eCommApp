package com.rmont.e_comm_app.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

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
    @NotBlank(message = "Product name cannot be blank")
    @Size(min = 2, max = 100, message = "Product name must be between 2 and 100 characters")
    private String product_name;


    @Column(name = "product_desc")
    @NotBlank(message = "Description cannot be blank")
    @Size(min = 10, message = "Description must be at least 10 characters long")
    private String product_desc;


    @Column(name = "product_price")
    @Min(value = 0, message = "Price must be greater than or equal to zero")
    private double product_price;


    @Column(name = "product_tag")
    @NotBlank(message = "Tag is required")
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
