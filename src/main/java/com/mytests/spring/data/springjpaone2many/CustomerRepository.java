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

    // no completion for collection properties: https://youtrack.jetbrains.com/issue/IDEA-180093
    List<Customer> findByAddresses_ZipCode(String addresses_zipCode);

    List<Customer> findByAddresses_City(String addresses_city);

    // errors reported for singular type parameter instead of collection: https://youtrack.jetbrains.com/issue/IDEA-292618
    boolean existsByAddresses(Address address);
    List<Customer> findByAddresses(Address address);
}
