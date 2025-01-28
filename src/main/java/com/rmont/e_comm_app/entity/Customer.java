package com.rmont.e_comm_app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table (name="customers")
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;

    @Column(name="customer_name")
    private String customerName;

    @Column(name="customer_email")
    private String customerEmail;

    @Column(name="customer_pass")
    private String customerPass;

    public Customer() {};

    public Customer(String name, String email, String pass) {

        this.customerName = name;
        this.customerEmail = email;
        this.customerPass = pass;

    }


}
