package com.example.model.service.imple.serviceImpl;

import com.example.model.entity.service.RentType;
import com.example.model.repository.service.RentTypeRepository;
import com.example.model.service.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeService implements IRentTypeService {
@Autowired
    RentTypeRepository rentTypeRepository;
    @Override
    public List<RentType> findAll() {
        return rentTypeRepository.findAll();
    }

    @Override
    public RentType findById(Integer id) {
        return null;
    }

    @Override
    public void save(RentType rentType) {

    }

    @Override
    public void remove(Integer id) {

    }
}
