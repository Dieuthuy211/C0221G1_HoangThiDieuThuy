package com.example.model.service.imple.serviceImpl;

import com.example.model.entity.service.ServiceType;
import com.example.model.repository.service.ServiceTypeRepository;
import com.example.model.service.IServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeService implements IServiceTypeService {
    @Autowired
    ServiceTypeRepository serviceTypeRepository;

    @Override
    public List<ServiceType> findAll() {
        return serviceTypeRepository.findAll();
    }

    @Override
    public ServiceType findById(Integer id) {
        return null;
    }

    @Override
    public void save(ServiceType serviceType) {

    }

    @Override
    public void remove(Integer id) {

    }
}
