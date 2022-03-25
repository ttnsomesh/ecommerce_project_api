package com.spring.ecommerece.ecommproject.repository;

import com.spring.ecommerece.ecommproject.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Long> {
}
