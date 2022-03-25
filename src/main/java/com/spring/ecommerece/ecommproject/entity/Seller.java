package com.spring.ecommerece.ecommproject.entity;


import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "seller")
public class Seller extends User{

    @Id
    private Long id;

    private String GST;
    private String companyContact;
    private String companyName;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinTable(name = "seller_address_table" , joinColumns = {@JoinColumn(name = "seller_id")},inverseJoinColumns = {@JoinColumn(name = "add_id")})
    private Address address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGST() {
        return GST;
    }

    public void setGST(String GST) {
        this.GST = GST;
    }

    public String getCompanyContact() {
        return companyContact;
    }

    public void setCompanyContact(String companyContact) {
        this.companyContact = companyContact;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

