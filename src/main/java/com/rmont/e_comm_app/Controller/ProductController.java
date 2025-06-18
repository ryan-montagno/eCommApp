package com.rmont.e_comm_app.Controller;

import java.util.List;

import com.rmont.e_comm_app.Service.ProductService;
import com.rmont.e_comm_app.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public void addProduct(@RequestBody Product product) {
        productService.save(product);
    }

    @RequestMapping(value = "/api/products/{id}", method = RequestMethod.OPTIONS)
    public ResponseEntity<Void> handleOptionsRequest() {
        return ResponseEntity.ok().build(); // This will respond to the preflight OPTIONS request
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id) {
        productService.deleteById(id);
    }


    @GetMapping ("/id")
    public Product getProductById(String id) {

        try {

            int idInt = Integer.parseInt(id);
            return productService.findById(idInt);

        } catch (NumberFormatException e) {

            System.out.println("ID must be a number.");
            return null;

        }
    }

    @GetMapping("/search")
    public List<Product> getProductByTag(String searchTerm) {

        return productService.findByTag(searchTerm);

    }

}
