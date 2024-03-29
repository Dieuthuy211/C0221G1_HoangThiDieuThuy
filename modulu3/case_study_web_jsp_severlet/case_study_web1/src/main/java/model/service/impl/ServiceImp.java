package model.service.impl;


import model.bean.contract.AmountOfServicesIncluded;
import model.bean.contract.AttachService;
import model.bean.customer.CustomerType;
import model.bean.employee.Division;
import model.bean.employee.EducationDegree;
import model.bean.employee.Position;
import model.bean.service.RentType;
import model.bean.service.Service;
import model.bean.service.ServiceType;
import model.repository.ServiceRepository;
import model.service.IService;

import java.util.List;

public class ServiceImp implements IService<Service> {
ServiceRepository serviceRepository=new ServiceRepository();
    @Override
    public List<ServiceType> select() {
        return serviceRepository.selectServiceType();
    }
    @Override
    public List<RentType> selectRentType() {
        return serviceRepository.selectRentType();
    }

    @Override
    public List<AttachService> selectAttachService() {
        return null;
    }

    @Override
    public List<AmountOfServicesIncluded> selectAmount() {
        return null;
    }

    @Override
    public List<Service> findAll() {
        return serviceRepository.listService();
    }

    @Override
    public void save(Service service) {
        serviceRepository.insertService(service);
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
    public Service findById(int id) {
        return null;
    }

    @Override
    public boolean update(Service service) {
        return false;
    }

    @Override
    public boolean remove(int id) {
        return false;
    }

    @Override
    public List<Service> search(String search) {
        return null;
    }


}

