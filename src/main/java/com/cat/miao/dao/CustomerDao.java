package com.cat.miao.dao;

import com.cat.miao.entity.Customer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerDao {
    void insert(Customer customer);
//    void update(Customer customer);
//    List<Customer> get(String name, String birthplace);
}
