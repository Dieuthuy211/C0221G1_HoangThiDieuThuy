package model.service.impl;


import model.bean.Service;
import model.bean.ServiceType;
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
    public List<Service> findAll() {
        return null;
    }

    @Override
    public void save(Service service) {
serviceRepository.insertService(service);
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

