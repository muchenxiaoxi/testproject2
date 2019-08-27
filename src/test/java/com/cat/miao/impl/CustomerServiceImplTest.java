package com.cat.miao.impl;

import com.cat.miao.Application;
import com.cat.miao.entity.Customer;
import com.cat.miao.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class CustomerServiceImplTest {
    @Autowired
    private CustomerService customerService;

    @Test
    public void insert() {
        System.out.println("Say it");
        customerService.insert(new Customer("honghong",1,"1999-02-06","南方"));
    }
}