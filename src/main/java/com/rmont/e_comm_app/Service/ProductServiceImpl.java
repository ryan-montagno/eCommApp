package com.rmont.e_comm_app.Service;

import com.rmont.e_comm_app.entity.Product;
import com.rmont.e_comm_app.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public Product findById(int id) {

        Long theId = (long) id;

        Optional<Product> result = productRepository.findById(theId);

        if (result.isPresent()) {
            return result.get();
        } else {
            throw new RuntimeException("Could not find product with id " + id);
        }


    }

    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

}
