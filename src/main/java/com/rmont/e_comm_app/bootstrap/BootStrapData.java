package com.rmont.e_comm_app.bootstrap;

import com.rmont.e_comm_app.entity.Customer;
import com.rmont.e_comm_app.entity.Product;
import com.rmont.e_comm_app.repository.CustomerRepository;
import com.rmont.e_comm_app.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {


    private final ProductRepository productRepository;
    private final CustomerRepository customerRepository;

    public BootStrapData(ProductRepository productRepository, CustomerRepository customerRepository) {
        this.productRepository = productRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        System.out.println("Starting BootstrapData...");
        System.out.println("Product count: " + productRepository.count());

        if (productRepository.count() < 4) {
            System.out.println("Adding products...");
            Product product = new Product("Sample Product", "This is a sample product.", 19.99, "Sample", "/product-images/socks.jpg");
            productRepository.save(product);
            System.out.println("Products saved successfully!");
        }

        System.out.println("Customer count: " + customerRepository.count());

        if (customerRepository.count() < 2) {
            System.out.println("Adding customers...");
            Customer customer = new Customer("Sample Customer", "sample@email.com", "Sample");
            customerRepository.save(customer);
            System.out.println("Customers saved successfully!");
        }



        System.out.println("BootstrapData complete.");

    }


}
