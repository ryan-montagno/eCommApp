package com.rmont.e_comm_app.Controller;

import java.util.List;

import com.rmont.e_comm_app.Service.ProductService;
import com.rmont.e_comm_app.entity.Product;
import com.rmont.e_comm_app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/products")
public class ProductController {


    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getProducts() {

        System.out.println("Fetching...");
        List<Product> products = productService.findAll();
        System.out.println(products);
        return products;

    }

}
