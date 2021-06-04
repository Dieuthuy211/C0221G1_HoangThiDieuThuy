package model.service.impl;

import model.bean.Customer;
import model.bean.ServiceType;
import model.repository.CustomerRepository;
import model.service.IService;

import java.util.List;

public class CustomerServiceImp implements IService<Customer> {
    CustomerRepository customerRepository = new CustomerRepository();

    @Override
    public List<Customer> findAll() {
        return customerRepository.listCustomer();
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.selectCustomer(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.insertCustomer(customer);

    }


    @Override
    public boolean update( Customer customer) {
        return customerRepository.update(customer);
    }

    @Override
    public boolean remove(int id) {
        return customerRepository.delete(id);
    }

    @Override
    public List<Customer> search(String search) {
        return customerRepository.search(search);
    }

    @Override
    public List<ServiceType> select() {
        return null;
    }


}
