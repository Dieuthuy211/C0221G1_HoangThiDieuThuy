package com.example.model.service.imple.employee;

import com.example.model.entity.employee.EductionDegree;
import com.example.model.repository.employee.EducationDegreeRepository;
import com.example.model.service.IEducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeService implements IEducationDegreeService {
    @Autowired
    EducationDegreeRepository educationDegreeRepository;
    @Override
    public List<EductionDegree> findAll() {
        return educationDegreeRepository.findAll();
    }

    @Override
    public EductionDegree findById(Integer id) {
        return null;
    }

    @Override
    public void save(EductionDegree eductionDegree) {

    }

    @Override
    public void remove(Integer id) {

    }
}
