package com.rmont.e_comm_app.bootstrap;

import com.rmont.e_comm_app.entity.Product;
import com.rmont.e_comm_app.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {


    private final ProductRepository productRepository;

    public BootStrapData(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        System.out.println("Starting BootstrapData...");
        System.out.println("Product count: " + productRepository.count());

        if (productRepository.count() == 0) {
            System.out.println("Adding products...");
            Product product = new Product("Sample Product", "This is a sample product.", 19.99, "Sample");
            productRepository.save(product);
            System.out.println("Products saved successfully!");
        }

        System.out.println("BootstrapData complete.");

    }


}
