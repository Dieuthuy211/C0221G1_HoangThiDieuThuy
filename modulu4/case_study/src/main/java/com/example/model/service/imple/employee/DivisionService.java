package com.example.model.service.imple.employee;

import com.example.model.entity.employee.Division;
import com.example.model.repository.employee.DivisionRepository;
import com.example.model.service.IDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionService implements IDivisionService {
    @Autowired
    DivisionRepository divisionRepository;
    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }

    @Override
    public Division findById(Integer id) {
        return null;
    }

    @Override
    public void save(Division division) {

    }

    @Override
    public void remove(Integer id) {

    }
}
