package com.spring.ecommerece.ecommproject.repository;

import com.spring.ecommerece.ecommproject.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepo extends JpaRepository<Seller,Long> {
}
