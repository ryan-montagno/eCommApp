package com.rmont.e_comm_app.repository;

import com.rmont.e_comm_app.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository <Customer, Long>{
}
