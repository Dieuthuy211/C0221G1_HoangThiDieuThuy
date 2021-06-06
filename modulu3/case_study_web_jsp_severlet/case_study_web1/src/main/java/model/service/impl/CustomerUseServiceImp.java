package model.service.impl;

import model.bean.contract.AmountOfServicesIncluded;
import model.bean.contract.AttachService;
import model.bean.customer.CustomerType;
import model.bean.customer.CustomerUseService;
import model.bean.employee.Division;
import model.bean.employee.EducationDegree;
import model.bean.employee.Position;
import model.bean.service.RentType;
import model.bean.service.ServiceType;
import model.repository.CustomerUseServiceRepository;
import model.service.IService;

import java.util.List;

public class CustomerUseServiceImp implements IService<CustomerUseService> {
    CustomerUseServiceRepository customerUseServiceRepository=new CustomerUseServiceRepository();

    @Override
    public List<CustomerUseService> findAll() {
        return customerUseServiceRepository.listCustomerUseService();
    }
    @Override
    public List<AmountOfServicesIncluded> selectAmount() {
        return customerUseServiceRepository.listAmount();

    }
    @Override
    public List<CustomerUseService> search(String search) {
        return customerUseServiceRepository.search(search);
    }
    @Override
    public boolean remove(int id) {
        return customerUseServiceRepository.delete(id);
    }
    @Override
    public void save(CustomerUseService customerUseService) {

    }

    @Override
    public CustomerUseService findById(int id) {
        return null;
    }

    @Override
    public boolean update(CustomerUseService customerUseService) {
        return false;
    }





    @Override
    public List<ServiceType> select() {
        return null;
    }

    @Override
    public List<CustomerType> selectCustomerType() {
        return null;
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


}
