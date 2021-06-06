package model.service.impl;

import model.bean.contract.AmountOfServicesIncluded;
import model.bean.contract.AttachService;
import model.bean.customer.Customer;
import model.bean.customer.CustomerType;
import model.bean.employee.Division;
import model.bean.employee.EducationDegree;
import model.bean.employee.Position;
import model.bean.service.RentType;
import model.bean.service.ServiceType;
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

    @Override
    public List<CustomerType> selectCustomerType() {
        return customerRepository.selectCustomerTyPe();
    }

    @Override
    public List<Position> selectPosition() {
        return null;
    }

    @Override
    public List<Division> selectDivision() {
        return null;
    }

    @Override
    public List<EducationDegree> selectEducationDegree() {
        return null;
    }


    @Override
    public List<RentType> selectRentType() {
        return null;
    }

    @Override
    public List<AttachService> selectAttachService() {
        return null;
    }

    @Override
    public List<AmountOfServicesIncluded> selectAmount() {
        return null;
    }


}
