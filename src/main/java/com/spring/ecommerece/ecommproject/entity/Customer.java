package com.spring.ecommerece.ecommproject.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "customer")
@PrimaryKeyJoinColumn(name = "id")
public class Customer extends User{
    @Id
    private Long id;

    @Column(name = "contact_number")
    private String contactNumber;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(name = "customer_address_table" , joinColumns = {@JoinColumn(name = "customer_id")},inverseJoinColumns = {@JoinColumn(name = "add_id")})
    private Set<Address> address = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Set<Address> getAddress() {
        return address;
    }

    public void setAddress(Set<Address> address) {
        this.address = address;
    }
}
