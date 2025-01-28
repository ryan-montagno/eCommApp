package com.rmont.e_comm_app.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "products")
@Data
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_desc")
    private String productDesc;

    @Column(name = "product_price")
    private double productPrice;

    @Column(name = "product_tag")
    private String productTag;

    public Product() {}
    public Product(String name, String description, double price, String tag)
    {

        this.productName = name;
        this.productDesc = description;
        this.productPrice = price;
        this.productTag = tag;

    }





}
