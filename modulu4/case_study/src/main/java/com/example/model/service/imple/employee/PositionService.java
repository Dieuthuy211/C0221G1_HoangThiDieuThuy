package com.example.model.service.imple.employee;

import com.example.model.entity.employee.Position;
import com.example.model.repository.employee.PositionRepository;
import com.example.model.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService implements IPositionService {
@Autowired
    PositionRepository positionRepository;
    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }

    @Override
    public Position findById(Integer id) {
        return null;
    }

    @Override
    public void save(Position position) {

    }

    @Override
    public void remove(Integer id) {

    }
}
