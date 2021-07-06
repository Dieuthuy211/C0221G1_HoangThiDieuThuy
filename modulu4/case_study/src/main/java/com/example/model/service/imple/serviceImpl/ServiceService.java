package com.example.model.service.imple.serviceImpl;

import com.example.model.repository.service.ServiceRepository;
import com.example.model.service.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService implements IServiceService {
    @Autowired
    ServiceRepository serviceRepository;

    @Override
    public List<com.example.model.entity.service.Service> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public com.example.model.entity.service.Service findById(Integer id) {
        return null;
    }

    @Override
    public void save(com.example.model.entity.service.Service service) {
        serviceRepository.save(service);
    }

    @Override
    public void remove(Integer id) {

    }
}
