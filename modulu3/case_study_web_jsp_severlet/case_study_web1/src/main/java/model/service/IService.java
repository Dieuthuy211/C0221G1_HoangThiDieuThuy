package model.service;

import model.bean.Customer;

import java.util.List;

public interface IService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

   boolean update(Customer customer);

    boolean remove(int id);
    List<Customer> search(String search);

}
