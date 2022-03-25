package com.spring.ecommerece.ecommproject;

import com.spring.ecommerece.ecommproject.entity.Address;
import com.spring.ecommerece.ecommproject.entity.Customer;
import com.spring.ecommerece.ecommproject.entity.Seller;
import com.spring.ecommerece.ecommproject.repository.CustomerRepo;
import com.spring.ecommerece.ecommproject.repository.SellerRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class EcommprojectApplicationTests {

	@Autowired
	SellerRepo repo1;

	@Autowired
	CustomerRepo repo2;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void testDataSeller(){
		Seller s1 = new Seller();
		s1.setEmail("someshgupta.lbsim@gmail.com");
		s1.setFirstName("somesh");
		s1.setMiddleName("kumar");
		s1.setLastName("gupta");
		s1.setPassword("12345678");
		s1.setDeleted(false);
		s1.setExpired(false);
		s1.setActive(true);
		s1.setLocked(false);
		s1.setCompanyContact("9087654321");
		s1.setGST("USD454376");
		s1.setCompanyName("Pepsi");
		Address address1 = new Address();
		address1.setCity("muzaffarpur");
		address1.setState("bihar");
		address1.setCountry("india");
		address1.setZipcode("842001");
		address1.setAddressline("bhahwanpur chatti rewa road");
		address1.setLabel("home");
		s1.setAddress(address1);
		repo1.save(s1);
	}


	@Test
	public void testDataCustomer(){
		Customer c1 = new Customer();
		c1.setEmail("yashmaharaj@gmail.com");
		c1.setFirstName("yash");
		c1.setMiddleName("kumar");
		c1.setLastName("maharaj");
		c1.setPassword("12345679");
		c1.setDeleted(false);
		c1.setExpired(false);
		c1.setActive(true);
		c1.setLocked(false);
		c1.setContactNumber("9987654908");
		Date d1 = new Date();
		c1.setPasswordUpdateDate(d1);

		Address address1 = new Address();
		address1.setCity("muzaffarpur");
		address1.setState("bihar");
		address1.setCountry("india");
		address1.setZipcode("842001");
		address1.setAddressline("bhahwanpur chatti rewa road");
		address1.setLabel("home");

		Address address2 = new Address();
		address2.setCity("dasrathpuri");
		address2.setState("new delhi");
		address2.setCountry("india");
		address2.setZipcode("110045");
		address2.setAddressline("kaali baag new delhi");
		address2.setLabel("home");

		c1.getAddress().add(address1);
		c1.getAddress().add(address2);

		repo2.save(c1);

	}





}
