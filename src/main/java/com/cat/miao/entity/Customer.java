package com.cat.miao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private Long id;
    private String name;
    private int age;
    private String birthday;
    private String birthplace;

    public Customer(String name, int age, String birthday, String birthplace) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.birthplace = birthplace;
    }
}
