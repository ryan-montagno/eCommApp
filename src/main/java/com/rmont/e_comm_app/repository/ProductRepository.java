package com.rmont.e_comm_app.repository;

import com.rmont.e_comm_app.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository  extends JpaRepository<Product, Long> {
}
