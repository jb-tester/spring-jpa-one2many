package com.mytests.spring.data.springjpaone2many;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 12/14/2021.</p>
 * <p>Project: spring-jpa-one2many</p>
 * *
 */
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void displayAll() {
        System.out.println("all: ");
        for (Customer customer : customerRepository.findAll()) {
            System.out.println(customer);
        }
        System.out.println("by zipcode: ");
        for (Customer customer : customerRepository.findByAddresses_ZipCode("15000")) {
            System.out.println(customer);
        }
        System.out.println("by city: ");
        for (Customer customer : customerRepository.findByAddresses_City("Prague")) {
            System.out.println(customer);
        }
        System.out.println("exists by address: ");
        System.out.println(customerRepository.existsByAddresses(new Address(1, "Sankt-Petersburg", "Gavanskaya", "10/100", "197197", 101)));
        System.out.println("find by address: ");
        System.out.println(customerRepository.findByAddresses(new Address(1, "Sankt-Petersburg", "Gavanskaya", "10/100", "197197", 101)));

    }
}
