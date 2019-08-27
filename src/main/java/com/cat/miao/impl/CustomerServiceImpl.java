package com.cat.miao.impl;

import com.cat.miao.dao.CustomerDao;
import com.cat.miao.entity.Customer;
import com.cat.miao.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;

    @Override
    public void insert(Customer customer) {
        customerDao.insert(customer);
    }
}
