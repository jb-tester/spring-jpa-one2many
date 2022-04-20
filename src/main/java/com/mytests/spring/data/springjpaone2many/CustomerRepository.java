package com.mytests.spring.data.springjpaone2many;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * *
 * <p>Created by irina on 12/14/2021.</p>
 * <p>Project: spring-jpa-one2many</p>
 * *
 */
public interface CustomerRepository extends CrudRepository<Customer,Long> {

    // no completion for collection properties
    List<Customer> findByAddresses_ZipCode(String addresses_zipCode);

    List<Customer> findByAddresses_City(String addresses_city);
    // errors reported for singular type parameter instead of collection
    boolean existsByAddresses(Address address);
    List<Customer> findByAddresses(Address address);
}
