package com.rmont.e_comm_app.Service;

import com.rmont.e_comm_app.entity.Product;

import java.util.List;

public interface ProductService {

    public List<Product> findAll();

    public Product findById(int id);

    public List<Product> findByTag(String tag);

    public void save(Product product);

}
