package com.mytests.spring.data.springjpaone2many;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaOne2manyApplication implements CommandLineRunner {

    @Autowired
    private CustomerService customerService;

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaOne2manyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       customerService.displayAll();
    }
}
