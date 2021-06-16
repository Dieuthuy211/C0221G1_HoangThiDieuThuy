package com.example.model.repository.impl;

import com.example.model.bean.Customer;
import com.example.model.repository.ICustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Repository
public class CustomerRepository implements ICustomerRepository {

    private  static Map<Integer,Customer> customerMap;
    static {
        customerMap=new TreeMap<>();
        customerMap.put(1,new Customer(1,"Hoang Thi Dieu Thuy","diuthuyy1212@gmai.com","Quang Binh"));
        customerMap.put(2,new Customer(2,"Tran Thanh Nga","nga@gmai.com","Quang Binh"));
        customerMap.put(3,new Customer(3,"Nguyen Thuy Linh","thuylinh@gmai.com","Hue"));
        customerMap.put(4,new Customer(4,"Pham Khanh Huyen","huyen123@gmai.com","Da Nang"));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public Customer findById(int id) {
        return customerMap.get(id);
    }
}
