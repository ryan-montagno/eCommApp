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
    private Long id;
    private String name;
    private String description;
    private double price;

    public Product() {}
    public Product(String name, String description, double price)
    {

        this.name = name;
        this.description = description;
        this.price = price;

    }





}
