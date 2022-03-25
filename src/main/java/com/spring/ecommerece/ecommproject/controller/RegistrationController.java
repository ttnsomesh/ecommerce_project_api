package com.spring.ecommerece.ecommproject.controller;

import com.spring.ecommerece.ecommproject.entity.Address;
import com.spring.ecommerece.ecommproject.entity.Customer;
import com.spring.ecommerece.ecommproject.entity.Seller;
import com.spring.ecommerece.ecommproject.repository.CustomerRepo;
import com.spring.ecommerece.ecommproject.repository.SellerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/register")
public class RegistrationController {

    @Autowired
    SellerRepo sellerRepo;

    @Autowired
    CustomerRepo customerRepo;

    @PostMapping("/seller")
    public Seller registerSeller(@RequestBody Seller seller){
        return sellerRepo.save(seller);
    }

    @GetMapping("/seller")
    public List<Seller> findAllSellerData(){
        return sellerRepo.findAll();
    }

    @GetMapping("/customer")
    public List<Customer> findAllCustomerData(){
        return customerRepo.findAll();
    }

}
