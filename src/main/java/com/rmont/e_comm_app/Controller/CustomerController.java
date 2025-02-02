package com.rmont.e_comm_app.Controller;


import com.rmont.e_comm_app.Service.CustomerService;
import com.rmont.e_comm_app.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/customers")
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public List<Customer> getCustomers() {

        System.out.println("Fetching...");
        List<Customer> customers = customerService.findAll();
        System.out.println(customers);
        return customers;
    }
}
